INSERT INTO developer (id, name, logourl, activity_description) VALUES (1, 'ART DEVELOPER', '1.jpg', 'artystycznie, szybko i tanio');
INSERT INTO developer (id, name, logourl, activity_description) VALUES (2, 'TECHNO DEVELOPER', '2.jpg', 'nowocześnie i na poziomie, a o cenie się nie mówi');

INSERT INTO developer_adress (id, street, no, city, post_code, regon, nip, developer_id) VALUES (1, 'Kołątaja', '5', 'Warszawa', '55-987', 272411267, 7260896632, 1);
INSERT INTO developer_adress (id, street, no, city, post_code, regon, nip, developer_id) VALUES (2, 'Kołątaja', '5', 'Kraków', '55-987', 872462264, 8260896623, 2);

INSERT INTO investment (id, name, description, street, no, city, post_code, developer_id) VALUES (1, 'nowa', 'taka świetna', 'ogórkowa', '23a', 'Wrocław', '09-876', 1);
INSERT INTO investment (id, name, description, street, no, city, post_code, developer_id) VALUES (2, 'kosmos', 'nowoczesny szał', 'lotnicza', '15', 'Poznań', '09-876', 2);

INSERT INTO offer (id, area, description, rooms_no, floor_no, price, promoted, status, investment_id) VALUES (1, 123, 'przestronne mieszkanko', 4, 2, 800000, FALSE, 'FORSALE', 1);
INSERT INTO offer (id, area, description, rooms_no, floor_no, price, promoted, status, investment_id) VALUES (2, 111, 'ładne mieszkanie',4, 2, 700000, TRUE, 'FORSALE', 2);
INSERT INTO offer (id, area, description, rooms_no, floor_no, price, promoted, status, investment_id) VALUES (3, 234, 'wielkie mieszkanie',5, 2, 1200000, TRUE, 'BOOKED', 1);
INSERT INTO offer (id, area, description, rooms_no, floor_no, price, promoted, status, investment_id) VALUES (4, 80, 'kawalerka',2, 2, 500000, FALSE, 'SOLD', 2);
INSERT INTO offer (id, area, description, rooms_no, floor_no, price, promoted, status, investment_id) VALUES (5, 77, 'extra nowe',3, 5, 400000, TRUE , 'FORSALE', 1);

INSERT INTO city (id, name) VALUES (1, 'Bydgoszcz');
INSERT INTO city (id, name) VALUES (2, 'Chorzów');
INSERT INTO city (id, name) VALUES (3, 'Gliwice');
INSERT INTO city (id, name) VALUES (4, 'Gdańsk');
INSERT INTO city (id, name) VALUES (5, 'Kraków');
INSERT INTO city (id, name) VALUES (6, 'Poznań');
INSERT INTO city (id, name) VALUES (7, 'Warszawa');
INSERT INTO city (id, name) VALUES (8, 'Wrocław');
INSERT INTO city (id, name) VALUES (9, 'Szczecin');
