INSERT INTO quarkus_user (id, login) VALUES (1, 'john');

INSERT INTO quarkus_role (name) VALUES ('ROLE_ADMIN');
INSERT INTO quarkus_role (name) VALUES ('ROLE_USER');

INSERT INTO quarkus_user_role (user_id, role_name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO quarkus_user_role (user_id, role_name) VALUES (1, 'ROLE_USER');

