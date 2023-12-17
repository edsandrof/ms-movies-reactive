INSERT INTO movies.person (birth_date, id, dtype, artistic_name, name) VALUES('1965-06-21', 1, 'director', 'Lana Wachowski', 'Lana Wachowski');
INSERT INTO movies.person (birth_date, id, dtype, artistic_name, name) VALUES('1937-11-30', 2, 'director', 'Ridley Scott', 'Ridley Leighton Scott');
INSERT INTO movies.person (birth_date, id, dtype, artistic_name, name) VALUES('1964-09-02', 3, 'actor', 'Keanu Reeves', 'Keanu Charles Reeves');
INSERT INTO movies.person (birth_date, id, dtype, artistic_name, name) VALUES('1961-07-30', 4, 'actor', 'Laurence Fishburne', 'Laurence John Fishburne III');
INSERT INTO movies.person (birth_date, id, dtype, artistic_name, name) VALUES('1967-08-21', 5, 'actor', 'Carrie-Anne Moss', 'Carrie-Anne Moss');
INSERT INTO movies.person (birth_date, id, dtype, artistic_name, name) VALUES('1949-10-08', 6, 'actor', 'Sigourney Weaver', 'Susan Alexandra Weaver');

INSERT INTO movies.movie (release_date, director_id, id, original_title, synopsis, poster) VALUES('1999-03-31', 1, 1, 'The Matrix', 'When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.', 'https://www.movieposters.com/cdn/shop/products/ed4796ac6feff9d2a6115406f964c928_6b200bda-fe71-4900-ad7f-903cdda50dab_480x.progressive.jpg');
INSERT INTO movies.movie (release_date, director_id, id, original_title, synopsis, poster) VALUES('1979-05-25', 2, 2, 'Alien', 'The crew of a commercial spacecraft encounters a deadly lifeform after investigating an unknown transmission.', 'https://www.movieposters.com/cdn/shop/products/ffd005c1c156c002d6318d24e08c3e60_027e0963-448d-457f-a46b-5db0550dc0c1_480x.progressive.jpg');

INSERT INTO movies.actor_movie (actor_id, movie_id) VALUES(3, 1);
INSERT INTO movies.actor_movie (actor_id, movie_id) VALUES(4, 1);
INSERT INTO movies.actor_movie (actor_id, movie_id) VALUES(5, 1);
INSERT INTO movies.actor_movie (actor_id, movie_id) VALUES(6, 2);


INSERT INTO movies.movie_genres (movie_id, genres) VALUES(1, 'ACTION');
INSERT INTO movies.movie_genres (movie_id, genres) VALUES(1, 'SCI_FI');
INSERT INTO movies.movie_genres (movie_id, genres) VALUES(2, 'SCI_FI');
INSERT INTO movies.movie_genres (movie_id, genres) VALUES(2, 'HORROR');