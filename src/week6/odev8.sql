--test veritabanınızda employee isimli sütun bilgileri id(INTEGER), 
--name VARCHAR(50), birthday DATE, email VARCHAR(100) 
--olan bir tablo oluşturalım.
CREATE TABLE employee(
	id SERIAL,
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(100)
);

--Oluşturduğumuz employee tablosuna 'Mockaroo' 
--servisini kullanarak 50 adet veri ekleyelim.
insert into employee (name, birthday, email) values ('Judie', '1981-07-02', 'jatrill0@qq.com');
insert into employee (name, birthday, email) values ('Danielle', '1971-05-31', 'dluckham1@ucla.edu');
insert into employee (name, birthday, email) values ('Klara', '1934-06-14', 'kmoine2@pinterest.com');
insert into employee (name, birthday, email) values ('Allie', null, 'awinpenny3@last.fm');
insert into employee (name, birthday, email) values ('Editha', '1926-08-01', 'egornar4@ibm.com');
insert into employee (name, birthday, email) values ('Ronnica', '1948-09-07', 'rgreson5@xinhuanet.com');
insert into employee (name, birthday, email) values ('Benny', '1949-11-30', 'bobyrne6@ft.com');
insert into employee (name, birthday, email) values ('Sarena', null, 'saspinal7@hugedomains.com');
insert into employee (name, birthday, email) values ('Cacilie', '1992-10-29', 'chaggar8@house.gov');
insert into employee (name, birthday, email) values ('Laurene', '1920-09-06', 'llambrook9@wufoo.com');
insert into employee (name, birthday, email) values ('Dulcia', '1997-02-13', 'dkyngdona@bbb.org');
insert into employee (name, birthday, email) values ('Rowan', '1967-12-02', 'rvasyuchovb@xrea.com');
insert into employee (name, birthday, email) values ('Conny', '1925-03-27', 'cgilhoolyc@cnet.com');
insert into employee (name, birthday, email) values ('Bill', '1906-03-17', 'bbruggend@noaa.gov');
insert into employee (name, birthday, email) values ('Mar', '1977-12-01', 'mfunnelle@wikimedia.org');
insert into employee (name, birthday, email) values ('Edan', '1910-05-25', 'emalamoref@baidu.com');
insert into employee (name, birthday, email) values ('Quinn', '1964-11-26', 'qstrussg@engadget.com');
insert into employee (name, birthday, email) values ('Zola', '1968-11-19', 'zeastcourth@t-online.de');
insert into employee (name, birthday, email) values ('Petronille', '1989-12-29', 'pscarratti@rediff.com');
insert into employee (name, birthday, email) values ('Creighton', '1991-03-20', 'cscriverj@berkeley.edu');
insert into employee (name, birthday, email) values ('Bernie', null, 'bprozesckyk@netlog.com');
insert into employee (name, birthday, email) values ('Elfie', '1909-02-06', 'ecarvillel@mapy.cz');
insert into employee (name, birthday, email) values ('Geri', '2009-09-04', 'ghanmorem@nydailynews.com');
insert into employee (name, birthday, email) values ('Jarrod', '1998-09-20', 'jpeachmentn@comsenz.com');
insert into employee (name, birthday, email) values ('Berkie', '2023-06-15', 'bhuckelo@hostgator.com');
insert into employee (name, birthday, email) values ('Starla', '1946-02-16', 'ssterlingp@ameblo.jp');
insert into employee (name, birthday, email) values ('Rourke', '1923-06-11', 'rcoverdaleq@angelfire.com');
insert into employee (name, birthday, email) values ('Harwell', '1989-02-22', 'hhaddickr@alexa.com');
insert into employee (name, birthday, email) values ('Town', '2015-04-11', 'tkidstouns@flavors.me');
insert into employee (name, birthday, email) values ('Dix', '1920-01-03', 'dthunderchieft@elpais.com');
insert into employee (name, birthday, email) values ('Clayton', '2016-10-20', 'cmaclaughlinu@ucla.edu');
insert into employee (name, birthday, email) values ('Felisha', '1993-07-23', 'fsallerv@smh.com.au');
insert into employee (name, birthday, email) values ('Darlleen', '2023-03-04', 'dbleddonw@bbb.org');
insert into employee (name, birthday, email) values ('Theobald', '1994-03-20', 'tservantx@marketwatch.com');
insert into employee (name, birthday, email) values ('Deena', '1942-01-02', 'dstanfieldy@craigslist.org');
insert into employee (name, birthday, email) values ('Cordelie', '2019-08-17', 'ccraufordz@geocities.com');
insert into employee (name, birthday, email) values ('Giraud', '1992-08-13', 'gryall10@purevolume.com');
insert into employee (name, birthday, email) values ('Adella', null, 'alowndesbrough11@liveinternet.ru');
insert into employee (name, birthday, email) values ('Aluin', '2012-10-26', 'athewys12@princeton.edu');
insert into employee (name, birthday, email) values ('Kevina', '1943-07-25', 'ksasser13@cdbaby.com');
insert into employee (name, birthday, email) values ('Alyce', '1938-11-07', 'afindon14@cornell.edu');
insert into employee (name, birthday, email) values ('Ivy', '2014-02-28', 'icollins15@free.fr');
insert into employee (name, birthday, email) values ('Brook', '2005-01-29', 'bpunshon16@google.co.uk');
insert into employee (name, birthday, email) values ('Pembroke', '1943-01-13', 'plabro17@hatena.ne.jp');
insert into employee (name, birthday, email) values ('Charmane', null, 'chedingham18@tinypic.com');
insert into employee (name, birthday, email) values ('Justinian', '1979-07-18', 'jbritzius19@discuz.net');
insert into employee (name, birthday, email) values ('Ancell', '1917-03-17', 'acatley1a@topsy.com');
insert into employee (name, birthday, email) values ('Angy', '2005-07-30', 'agiercke1b@fda.gov');
insert into employee (name, birthday, email) values ('Alexandros', '1912-03-04', 'abims1c@howstuffworks.com');
insert into employee (name, birthday, email) values ('Eugine', '1990-09-24', 'ebisseker1d@canalblog.com');

--Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET birthday = '1979-01-24'
WHERE name = 'Ancell'
RETURNING *;

UPDATE employee
SET name = 'Amy'
WHERE email = 'dstanfieldy@craigslist.org'
RETURNING *;

UPDATE employee
SET email = 'hello@hello.com.tr'
WHERE name = 'Judie'
RETURNING *;

UPDATE employee
SET birthday = '1965-03-03'
WHERE id = 10
RETURNING *;

UPDATE employee
SET birthday = '2000-01-01'
WHERE name LIKE '%a'
RETURNING *;

--Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE name = 'Clayton'
RETURNING *;

DELETE FROM employee
WHERE birthday = '1910-05-25'
RETURNING *;

DELETE FROM employee
WHERE email = 'qstrussg@engadget.com'
RETURNING *;

DELETE FROM employee
WHERE email LIKE 'r%'
RETURNING *;

DELETE FROM employee
WHERE name = 'Town'
RETURNING *;

SELECT * FROM employee;
