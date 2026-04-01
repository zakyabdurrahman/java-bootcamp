package com.zaky.job_mvc.services;

import com.zaky.job_mvc.models.JobPost;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class JobPostService {
    //just grab the jdbctemplate its already made by spring
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedJdbcTemplate;


    //how to query jdbc with named params
    public boolean addJob(JobPost jobPost) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("post_profile", jobPost.getPostProfile());
        params.addValue("post_desc", jobPost.getPostDesc());
        params.addValue("req_exp", jobPost.getReqExperience());
        this.namedJdbcTemplate.update("INSERT INTO job_post (post_profile, post_desc, req_experience)  VALUES(:post_profile, :post_desc, :req_exp)", params);
        return true;
    }
}
