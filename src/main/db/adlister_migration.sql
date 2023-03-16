USE adlister_db;

DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    id  INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(20),
    email VARCHAR(40),
    password VARCHAR(30),
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS ads;

CREATE TABLE ads
(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED,
    title VARCHAR(30),
    description VARCHAR(100),
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);