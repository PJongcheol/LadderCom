use shopdb;
create index index_tbl
on
membertbl(memberID);

select * from membertbl where memberID = 'Thomas';

create view uv_tbl
as
	select memberName, memberAddress from membertbl;
select memberName from uv_tbl;