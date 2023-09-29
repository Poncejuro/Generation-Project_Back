INSERT INTO users(fullname,email,cellphone,password,active) VALUES('John Doe', 'john.doe@email.com', '1234567890', 'password1',TRUE);
INSERT INTO users(fullname,email,cellphone,password,active) VALUES('Jane Smith', 'jane.smith@email.com', '9876543210', 'password2',TRUE);
INSERT INTO users(fullname,email,cellphone,password,active) VALUES('Alice Johnson', 'alice.johnson@email.com', '5551234567', 'password3',TRUE);
INSERT INTO users(fullname,email,cellphone,password,active) VALUES('Bob Wilson', 'bob.wilson@email.com', '9998887777', 'password4',TRUE);
INSERT INTO users(fullname,email,cellphone,password,active) VALUES('Eva Davis', 'eva.davis@email.com', '1112223333', 'password5',TRUE);
INSERT INTO users(fullname,email,cellphone,password,active) VALUES('Michael Lee', 'michael.lee@email.com', '3334445555', 'password6',TRUE);
INSERT INTO users(fullname,email,cellphone,password,active) VALUES('Sara Brown', 'sara.brown@email.com', '7778889999', 'password7',TRUE);
INSERT INTO users(fullname,email,cellphone,password,active) VALUES('David Garcia', 'david.garcia@email.com', '4445556666', 'password8',TRUE);
INSERT INTO users(fullname,email,cellphone,password,active) VALUES('Sophia Martinez', 'sophia.martinez@email.com', '6667778888', 'password9',TRUE);
INSERT INTO users(fullname,email,cellphone,password,active) VALUES('Daniel Wilson', 'daniel.wilson@email.com', '2221110000', 'password10',TRUE);



INSERT INTO profiles(role, biography, photo,user_id) VALUES ('Singer', 'I am a professional singer.', 'singer.jpg', 1);
INSERT INTO profiles(role, biography, photo,user_id) VALUES ('Guitarist', 'I play the guitar in a rock band.', 'guitarist.jpg', 2);
INSERT INTO profiles(role, biography, photo,user_id) VALUES ('Drummer', 'I''m a drummer in a jazz ensemble.', 'drummer.jpg', 3);
INSERT INTO profiles(role, biography, photo,user_id) VALUES ('Pianist', 'I play classical piano music.', 'pianist.jpg', 4);
INSERT INTO profiles(role, biography, photo,user_id) VALUES ('Bassist', 'I''m a bassist in a funk band.', 'bassist.jpg', 5);
INSERT INTO profiles(role, biography, photo,user_id) VALUES ('DJ', 'I''m a DJ and electronic music producer.', 'dj.jpg', 6);
INSERT INTO profiles(role, biography, photo,user_id) VALUES ('Violinist', 'I play the violin in a chamber orchestra.', 'violinist.jpg', 7);
INSERT INTO profiles(role, biography, photo,user_id) VALUES ('Rapper', 'I''m a rapper and lyricist.', 'rapper.jpg', 8);
INSERT INTO profiles(role, biography, photo,user_id) VALUES ('Producer', 'I produce music in my studio.', 'producer.jpg', 9);
INSERT INTO profiles(role, biography, photo,user_id) VALUES ('Musician', 'I''m a versatile musician.', 'musician.jpg', 10);



INSERT INTO publications(title, footer, img, event_details, profile_id) VALUES('Concert Announcement', 'Join us for an amazing concert!', 'concert.jpg', 'Join us for a night of live music featuring top artists from around the world. Date: September 30, 2023. Venue: Music Hall. Tickets available now.', 1);
INSERT INTO publications(title, footer, img, event_details, profile_id) VALUES('New Album Release', 'Check out our latest music!', 'album.jpg', 'We are excited to announce the release of our new album ''Harmony'' on October 15, 2023. Pre-order now and be the first to listen.', 1);
INSERT INTO publications(title, footer, img, event_details, profile_id) VALUES('Music Festival 2023', 'The biggest music festival of the year!', 'festival.jpg', 'Get ready for MusicFest 2023, featuring a lineup of over 50 artists across various genres. Dates: November 10-12, 2023. Don''t miss it!', 5);
INSERT INTO publications(title, footer, img, event_details, profile_id) VALUES('Artist Spotlight', 'Discover the talent of the month', 'artist.jpg', 'This month, we shine the spotlight on the talented singer-songwriter Sarah Davis. Learn more about her journey and music.', 7);
INSERT INTO publications(title, footer, img, event_details, profile_id) VALUES('Guitar Workshop', 'Master your guitar skills', 'guitar.jpg', 'Join our guitar workshop series and enhance your guitar playing abilities. Learn from experts and jam with fellow musicians.', 9);
INSERT INTO publications(title, footer, img, event_details, profile_id) VALUES('Music History Lecture', 'Exploring the roots of music', 'lecture.jpg', 'Attend our music history lecture series, where we delve into the origins and evolution of music across cultures and eras.', 1);
INSERT INTO publications(title, footer, img, event_details, profile_id) VALUES('Songwriting Contest', 'Showcase your songwriting skills', 'songwriting.jpg', 'Enter our annual songwriting contest for a chance to win prizes and have your music heard by industry professionals.', 4);
INSERT INTO publications(title, footer, img, event_details, profile_id) VALUES('Drumming Masterclass', 'Elevate your drumming technique', 'drumming.jpg', 'Join our drumming masterclass led by renowned percussionist Mike Smith. Improve your rhythm and groove.', 8);
INSERT INTO publications(title, footer, img, event_details, profile_id) VALUES('Jazz Night', 'An evening of jazz classics', 'jazz.jpg', 'Experience an enchanting night of jazz music with our live band. Date: October 5, 2023. Venue: Jazz Lounge. Book your table now.', 10);
INSERT INTO publications(title, footer, img, event_details, profile_id) VALUES('Music Production Workshop', 'Learn the art of music production', 'production.jpg', 'Take part in our music production workshop and explore the world of recording, mixing, and producing music.', 10);


INSERT INTO events(profile_id, publication_id) VALUES(1, 1);
INSERT INTO events(profile_id, publication_id) VALUES(2, 1);
INSERT INTO events(profile_id, publication_id) VALUES(10, 1);
INSERT INTO events(profile_id, publication_id) VALUES(3, 2);
INSERT INTO events(profile_id, publication_id) VALUES(7, 2);
INSERT INTO events(profile_id, publication_id) VALUES(8, 2);
INSERT INTO events(profile_id, publication_id) VALUES(9, 2);
INSERT INTO events(profile_id, publication_id) VALUES(4, 2);
INSERT INTO events(profile_id, publication_id) VALUES(1, 2);
INSERT INTO events(profile_id, publication_id) VALUES(1, 7);
INSERT INTO events(profile_id, publication_id) VALUES(2, 7);
INSERT INTO events(profile_id, publication_id) VALUES(3, 7);
INSERT INTO events(profile_id, publication_id) VALUES(1, 10);
INSERT INTO events(profile_id, publication_id) VALUES(2, 9);
INSERT INTO events(profile_id, publication_id) VALUES(3, 9);
INSERT INTO events(profile_id, publication_id) VALUES(8, 3);
INSERT INTO events(profile_id, publication_id) VALUES(6, 3);
INSERT INTO events(profile_id, publication_id) VALUES(4, 3);
INSERT INTO events(profile_id, publication_id) VALUES(6, 4);
INSERT INTO events(profile_id, publication_id) VALUES(1, 4);



INSERT INTO people(followee_id, follower_id) VALUES(1, 4);
INSERT INTO people(follower_id, followee_id) VALUES (1, 2);
INSERT INTO people(follower_id, followee_id) VALUES (1, 3);
INSERT INTO people(follower_id, followee_id) VALUES (1, 4);
INSERT INTO people(follower_id, followee_id) VALUES (1, 5);
INSERT INTO people(follower_id, followee_id) VALUES (2, 3);
INSERT INTO people(follower_id, followee_id) VALUES (2, 4);
INSERT INTO people(follower_id, followee_id) VALUES (3, 1);
INSERT INTO people(follower_id, followee_id) VALUES (3, 2);
INSERT INTO people(follower_id, followee_id) VALUES (3, 4);
INSERT INTO people(follower_id, followee_id) VALUES (4, 5);
INSERT INTO people(follower_id, followee_id) VALUES (4, 6);
INSERT INTO people(follower_id, followee_id) VALUES (4, 7);
INSERT INTO people(follower_id, followee_id) VALUES (5, 1);
INSERT INTO people(follower_id, followee_id) VALUES (5, 6);
INSERT INTO people(follower_id, followee_id) VALUES (5, 7);
INSERT INTO people(follower_id, followee_id) VALUES (6, 1);
INSERT INTO people(follower_id, followee_id) VALUES (6, 2);
INSERT INTO people(follower_id, followee_id) VALUES (7, 1);
INSERT INTO people(follower_id, followee_id) VALUES (7, 2);
