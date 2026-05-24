package com.zaky.job_mvc.mappers;

import com.zaky.job_mvc.models.JobPost;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JobMapper implements RowMapper<JobPost> {

    @Override
    public JobPost mapRow(ResultSet rs, int rowNum) throws SQLException {
        JobPost job = new JobPost();
        job.setPostProfile(rs.getString("post_profile"));
        job.setPostDesc(rs.getString("post_desc"));
        job.setReqExperience(rs.getInt("req_experience"));
        return job;
    }
}
