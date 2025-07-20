-- Criar Usuarios
INSERT INTO USUARIO (id, nome, email, senha) VALUES
(1, 'Guilherme Baeta', 'guilherme@gbaeta.dev', '123456'),
(2, 'Miguel Baeta', 'miguel@gbaeta.dev', '123456');

-- Jogos de Guilherme (possuídos, todos na Steam, nota 10)
INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam)
VALUES
(1, 'Bully: Scholarship Edition', 'Ação', 'STEAM',DATE '2006-10-17', null, 'Rockstar', null, 12200);
INSERT INTO CATALOGO_USUARIO_JOGO (id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago)
VALUES (1, 1, 1, 'ZERADO', 10,DATE '2022-01-01', 29.90);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam)
VALUES
(2, 'Cyberpunk 2077', 'RPG', 'STEAM',DATE '2020-12-09', null, 'CD Projekt', null, 1091500);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (2, 1, 2, 'ZERADO', 10,DATE '2023-03-10', 89.90);

-- (idem para os demais jogos)
INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (3, 'Grand Theft Auto V Enhanced', 'Ação', 'STEAM',DATE '2013-09-17', null, 'Rockstar', null, 3240220);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (3, 1, 3, 'ZERADO', 10,DATE '2018-01-01', 89.90);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (4, 'Northgard', 'Estratégia', 'STEAM',DATE '2018-03-07', null, 'Shiro Games', null, 466560);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (4, 1, 4, 'ZERADO', 10, DATE'2021-05-01', 55.90);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (5, 'Ori and the Blind Forest: Definitive Edition', 'Plataforma', 'STEAM',DATE '2015-03-11', null, 'Moon Studios', null, 387290);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (5, 1, 5, 'ZERADO', 10,DATE '2017-01-10', 39.90);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (6, 'Ori and the Will of the Wisps', 'Plataforma', 'STEAM',DATE '2020-03-11', null, 'Moon Studios', null, 1057090);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (6, 1, 6, 'ZERADO', 10,DATE '2021-08-01', 49.90);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (7, 'Project Hospital', 'Simulação', 'STEAM',DATE '2018-10-30', null, 'Oxymoron Games', null, 868360);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (7, 1, 7, 'ZERADO', 10,DATE '2020-09-01', 64.90);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (8, 'Project Zomboid', 'Sobrevivência', 'STEAM',DATE '2013-11-08', null, 'The Indie Stone', null, 108600);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (8, 1, 8, 'ZERADO', 10,DATE '2022-07-10', 36.99);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (9, 'Red Dead Redemption 2', 'Ação', 'STEAM',DATE '2018-10-26', null, 'Rockstar', null, 1174180);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (9, 1, 9, 'ZERADO', 10,DATE '2020-10-01', 159.90);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (10, 'Rocket League', 'Esporte', 'STEAM',DATE '2015-07-07', 0.00, 'Psyonix', 0.00, 252950);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (10, 1, 10, 'ZERADO', 10,DATE '2016-02-01', 19.90);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (11, 'The Witcher 3: Wild Hunt', 'RPG', 'STEAM',DATE '2015-05-19', null, 'CD Projekt', null, 292030);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (11, 1, 11, 'ZERADO', 10,DATE '2017-06-01', 59.90);

-- Lista de desejos Miguel
INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (12, 'God of War', 'Ação', 'STEAM',DATE '2022-01-14', null, 'Santa Monica Studio', null, 1593500);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (12, 2, 12, 'DESEJADO', null, null, null);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (13, 'No Man''s Sky', 'Exploração', 'STEAM',DATE '2016-08-12', null, 'Hello Games', null, 275850);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (13, 2, 13, 'DESEJADO', null, null, null);

-- Lista de desejos Guilherme
INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (14, 'Ghost of Tsushima VERSÃO DO DIRETOR', 'Ação', 'STEAM',DATE '2024-05-16', null, 'Sucker Punch', null, 2215430);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (14, 1, 14, 'DESEJADO', null, null, null);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (15, 'Resident Evil Village', 'Terror', 'STEAM',DATE '2021-05-07', null, 'Capcom', null, 1196590);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (15, 1, 15, 'DESEJADO', null, null, null);

INSERT INTO JOGO (id, titulo, genero, plataforma, ano_lancamento, preco_atual, desenvolvedora, preco_mais_baixo_historico, app_id_steam) VALUES (16, 'Mortal Kombat 1', 'Luta', 'STEAM',DATE '2023-09-19', null, 'NetherRealm', null, 1971870);
INSERT INTO CATALOGO_USUARIO_JOGO (
    id, usuario_id, jogo_id, status, nota_pessoal, data_compra, preco_pago
) VALUES (16, 1, 16, 'DESEJADO', null, null, null);