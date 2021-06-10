create table members(
    username VARCHAR (50) not null primary key,
    password VARCHAR (500) not null,
    enabled BOOLEAN not null
);

create table authorities (
    username VARCHAR(50) not null,
    authority VARCHAR(50) not null,
    constraint fk_authorities_members foreign key(username) references members(username)
);
create unique index ix_auth_username on authorities (username,authority);
