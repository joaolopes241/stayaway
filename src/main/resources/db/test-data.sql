
DELETE FROM beach;
INSERT INTO beach(ID, NAME, ADDRESS, IMG, STATUS) VALUES
  (1,'Praia da Cova', 'Rua da Esquinxima', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.carvoeirovillas.com%2Fen%2Fexplore%2Fexplore-carvoeiro%2Fitem%2F950-praia-da-cova-redonda&psig=AOvVaw3xoTkJ8SXyZ5Rku8fGkGTP&ust=1588169569262000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMir9Ommi-kCFQAAAAAdAAAAABAI', 0),
  (2,'Praia da Santa Rita', 'Rua da ais próxima', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fjornaldemafra.pt%2F2018%2F08%2F23%2Ftorres-vedras-resgate-d-praticante-de-parapente-na-praia-de-santa-rita%2F&psig=AOvVaw03VVtCjcF2f_e0-4sKH3rX&ust=1588169678864000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCOC06qKni-kCFQAAAAAdAAAAABAD', 0),
  (3,'Praia da Mexelhoa', 'Rua da Esróxima', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fjornaldemafra.pt%2F2018%2F08%2F23%2Ftorres-vedras-resgate-d-praticante-de-parapente-na-praia-de-santa-rita%2F&psig=AOvVaw03VVtCjcF2f_e0-4sKH3rX&ust=1588169678864000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCOC06qKni-kCFQAAAAAdAAAAABAD', 0),
  (4,'Praia da Porto Novo', 'Rua da a', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fjornaldemafra.pt%2F2018%2F08%2F23%2Ftorres-vedras-resgate-d-praticante-de-parapente-na-praia-de-santa-rita%2F&psig=AOvVaw03VVtCjcF2f_e0-4sKH3rX&ust=1588169678864000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCOC06qKni-kCFQAAAAAdAAAAABAD', 0),
  (5,'test');


DELETE FROM user;
INSERT INTO user (USERNAME, PASS, FIRSTNAME, LASTNAME, EMAIL, PHONE) VALUES
  ('ruiferao', '1234', 'Rui', 'Ferrão', 'mail@gmail.com', '777888'),
  ('sergiogouveia', '1234', 'Sergio', 'Gouveia', 'mail@gmail.com', '777888'),
  ('brunoferreira', '1234', 'Bruno', 'Ferreira', 'mail@gmail.com', '777888');
