DELETE FROM user;
INSERT INTO user (CREATIONTIME, UPDATETIME, VERSION, FIRSTNAME, LASTNAME, EMAIL, PHONE) VALUES
  (TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'ruiferao', '1234', 'Rui', 'Ferrão', 'mail@gmail.com', '777888'),
  (TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 0, 'sergiogouveia', '1234', 'Sergio', 'Gouveia', 'mail@gmail.com', '777888'),
  (TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 0, 'brunoferreira', '1234', 'Bruno', 'Ferreira', 'mail@gmail.com', '777888'),


DELETE FROM beach;
INSERT INTO beach(name, address) VALUES
  ('Praia da Cova', 'Rua da Esquina mais próxima'),
  ('Praia da Curva', 'Rua da Esquina mais próxima'),
  ('Praia da Velha', 'Rua da Esquina mais próxima'),
  ('Praia da Santa Rita', 'Rua da Esquina mais próxima'),
  ('Praia da Mexelhoa', 'Rua da Esquina mais próxima'),
  ('Praia da Porto Novo', 'Rua da Esquina mais próxima'),
  ('Praia da Santa Helena', 'Rua da Esquina mais próxima'),
  ('Praia da Cova', 'Rua da Esquina mais próxima'),
  ('Praia da Cova', 'Rua da Esquina mais próxima'),
  ('Praia da Cova', 'Rua da Esquina mais próxima');

