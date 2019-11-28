create table t_user(
	id int(12) not null auto_increment,
	user_name varchar(60) not null,
	sex int(3) not null default 1 check (sex in(1,2)),
	note varchar(256) null,
	primary key(id)
);