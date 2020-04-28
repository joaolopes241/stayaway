DELETE FROM user;
INSERT INTO user (USERNAME, PASS, FIRSTNAME, LASTNAME, EMAIL, PHONE) VALUES
  ('ruiferao', '1234', 'Rui', 'Ferrão', 'mail@gmail.com', '777888'),
  ('sergiogouveia', '1234', 'Sergio', 'Gouveia', 'mail@gmail.com', '777888'),
  ('brunoferreira', '1234', 'Bruno', 'Ferreira', 'mail@gmail.com', '777888');


DELETE FROM beach;
INSERT INTO beach (ADDRESS, NAME, IMG, STATUS) VALUES
    ('142343', 'Praia', 'djasn', '14');