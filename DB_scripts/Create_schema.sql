create table client
( id numeric(12),
 name  character(20),
 surname character(20),
 f_bad_rating boolean
);

create table credit
( id numeric(12),
 min_salary  money,
 max_credit_value money,
 persent character(20)
);