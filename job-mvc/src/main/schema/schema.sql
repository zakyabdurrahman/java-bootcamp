-- Drop tables first (safe order due to FK)
DROP TABLE IF EXISTS job_post_tech_stack;
DROP TABLE IF EXISTS job_post;

-- Main table
CREATE TABLE job_post (
    id SERIAL PRIMARY KEY,
    post_profile TEXT NOT NULL,
    post_desc TEXT,
    req_experience INTEGER NOT NULL
);

-- Tech stack table (1-to-many)
CREATE TABLE job_post_tech_stack (
    id SERIAL PRIMARY KEY,
    job_post_id INTEGER NOT NULL,
    tech_name TEXT NOT NULL,
    FOREIGN KEY (job_post_id) REFERENCES job_post(id) ON DELETE CASCADE
);