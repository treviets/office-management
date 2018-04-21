DROP TABLE IF EXISTS task;
CREATE TABLE IF NOT EXISTS task (
    id SERIAL PRIMARY KEY,
    name text DEFAULT NULL,
    description text DEFAULT NULL
);


