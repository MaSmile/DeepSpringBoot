--第五章--
create table t_user(
	id int(12) not null auto_increment,
	user_name varchar(60) not null,
	sex int(3) not null default 1 check (sex in(1,2)),
	note varchar(256) null,
	primary key(id)
);

-- 第六章 --
create table t_user6(
	id int(12) auto_increment,
	user_name varchar(60) not null,
	note varchar(512),
	primary key(id)
);