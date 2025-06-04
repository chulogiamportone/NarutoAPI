-- Insertar Ninjas
INSERT INTO personage (id, nombre, aldea, nivelDePoder, url_imagen) VALUES
(1, 'Naruto Uzumaki', 'Konoha', 9000, 'https://static.wikia.nocookie.net/naruto/images/d/d6/Naruto_Part_I.png'),
(2, 'Sasuke Uchiha', 'Konoha', 8500, 'https://static.wikia.nocookie.net/naruto/images/2/21/Sasuke_Part_1.png'),
(3, 'Sakura Haruno', 'Konoha', 7000, 'https://static.wikia.nocookie.net/naruto/images/6/64/Sakura_Part_1.png'),
(4, 'Kakashi Hatake', 'Konoha', 8000, 'https://static.wikia.nocookie.net/naruto/images/2/27/Kakashi_Hatake.png'),
(5, 'Itachi Uchiha', 'Akatsuki', 8500, 'https://static.wikia.nocookie.net/naruto/images/b/bb/Itachi.png'),
(6, 'Gaara', 'Sunagakure', 7500, 'https://static.wikia.nocookie.net/naruto/images/2/20/Gaara_in_Part_I.png'),
(7, 'Hinata Hyuga', 'Konoha', 6000, 'https://static.wikia.nocookie.net/naruto/images/9/97/Hinata.png'),
(8, 'Shikamaru Nara', 'Konoha', 6500, 'https://static.wikia.nocookie.net/naruto/images/4/44/Shikamaru_Part_I.png'),
(9, 'Rock Lee', 'Konoha', 7000, 'https://static.wikia.nocookie.net/naruto/images/9/97/Rock_Lee_Part_I.png'),
(10, 'Tsunade', 'Konoha', 8000, 'https://static.wikia.nocookie.net/naruto/images/b/b3/Tsunade_infobox2.png');


-- Insertar Jutsus
INSERT INTO jutsu (nombre, tipo) VALUES
('Rasengan', 'Ninjutsu'),
('Chidori', 'Ninjutsu'),
('Byakugou no Jutsu', 'Ninjutsu'),
('Raikiri', 'Ninjutsu'),
('Sand Coffin', 'Ninjutsu');

-- Insertar Clanes
INSERT INTO clan (nombre, kekkei_genkai) VALUES
('Uzumaki', 'Chakra Vitality'),
('Uchiha', 'Sharingan'),
('Haruno', 'Strength Control'),
('Hatake', 'Copy Ninja Ability'),
('Sabaku', 'Sand Control');
