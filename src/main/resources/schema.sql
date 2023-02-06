create table book (
    Id int auto_increment,
    title varchar(255) not null,
    pagesNumber varchar(255) not null
);

insert into book (title,Id,pagesNumber) values ( 'First book',1 , 243 );
insert into book (title,Id,pagesNumber) values ( 'second book',2 , 121 );
insert into book (title,Id,pagesNumber) values ( 'third book',3 , 112 );