insert into user_details(id, birth_date, name)
values (10001, current_date(), 'Amaka');

insert into user_details(id, birth_date, name)
values (10002, current_date(), 'Chidi');

insert into user_details(id, birth_date, name)
values (10003, current_date(), 'Divine');

insert into posts (id, description, user_id)
values (20001, 'I want to learn Java', 10001);

insert into posts (id, description, user_id)
values (20002, 'I want to learn AWS', 10001);

insert into posts (id, description, user_id)
values (20003, 'I want to learn DevOps', 10002);

insert into posts (id, description, user_id)
values (20004, 'I want to learn SQL', 10002);