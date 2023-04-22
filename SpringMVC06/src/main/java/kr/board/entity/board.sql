create table myboard (
	idx int not null auto_increment,
	memID varchar(20) not null,
	title varchar(100) not null ,
	content varchar(2000) not null ,
	writer varchar(30) not null,
	indate datetime default now(),
	count int default 0,
	primary key(idx)
);

drop table myboard;

insert into myboard(title, content, writer)
values('게시판 연습', '게시판 연습', '관리자');

insert into myboard(title, content, writer)
values('게시판 연습', '게시판 연습', '관리자');

insert into myboard(title, content, writer)
values('게시판 연습', '게시판 연습', '김민석');

select * 
from myboard
order by idx desc;

-- 스프링 Security(회원테이블) --
create table mem_stbl(
	memIdx int not null,
	memID varchar(20) not null,
	memPassword varchar(68) not null,
	memName varchar(20) not null,
	memAge int,
	memGender varchar(20),
	memEmail varchar(50),
	memProfile varchar(50),
	primary key(memID)
);

select *
from mem_stbl
;

select *
from mem_auth
;

delete from mem_stbl
where memID = 'testjoin2';

-- no int not null auto_increment 자동증강컬럼
-- auth : 권한
create table mem_auth(
	no int not null auto_increment,
	memID varchar(50) not null,
	auth varchar(50) not null,
	primary key(no),
	constraint fk_member_auth foreign key(memID) references mem_stbl(memID)
);

delete from mem_auth
where memID = 'testjoin2';

delete from mem_stbl;
delete from mem_auth;
delete from myboard;
