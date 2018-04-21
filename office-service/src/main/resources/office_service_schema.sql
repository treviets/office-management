DROP TABLE IF EXISTS project;
CREATE TABLE IF NOT EXISTS project (
    id SERIAL PRIMARY KEY,
    code text DEFAULT NULL,
    name text DEFAULT NULL,
    description text DEFAULT NULL
);



DROP TABLE IF EXISTS task;
CREATE TABLE IF NOT EXISTS task (
    id SERIAL PRIMARY KEY,
    project_id INTEGER DEFAULT NULL,
    name text DEFAULT NULL,
    description text DEFAULT NULL
);

DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department (
    id SERIAL PRIMARY KEY,
    code text DEFAULT NULL,
    name text DEFAULT NULL,
    description text DEFAULT NULL
);



DROP TABLE IF EXISTS person;
CREATE TABLE IF NOT EXISTS person (
    id SERIAL PRIMARY KEY,
    department_id INTEGER,
    code text DEFAULT NULL,
    first_name text DEFAULT NULL,
    last_name text DEFAULT NULL,
    email text DEFAULT NULL,
    phone text DEFAULT NULL,
    card_id text DEFAULT NULL,
    address text DEFAULT NULL,
    city text DEFAULT NULL,
    salary text DEFAULT NULL
);



