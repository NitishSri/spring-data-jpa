insert into CourseDetails(id, courseName, createdDate, updateDate, isDeleted) 
values(10001,'JPA in 50 Steps', sysdate(), sysdate(), false);
insert into CourseDetails(id, courseName, createdDate, updateDate, isDeleted) 
values(10002,'Spring in 50 Steps', sysdate(), sysdate(), false);
insert into CourseDetails(id, courseName, createdDate, updateDate, isDeleted) 
values(10003,'Spring Boot in 100 Steps', sysdate(), sysdate(), false);
insert into CourseDetails(id, courseName, createdDate, updateDate, isDeleted) 
values(10004,'Jenkins in 100 Steps', sysdate(), sysdate(), false);

insert into Passport(id, number, createdDate, updateDate) 
values(30001,'A123456', sysdate(), sysdate());
insert into Passport(id, number, createdDate, updateDate) 
values(30002,'B123456', sysdate(), sysdate());
insert into Passport(id, number, createdDate, updateDate) 
values(30003,'C123456', sysdate(), sysdate());

insert into Student(id, name, passport_id, createdDate, updateDate) 
values(20001,'Nitish', 30001, sysdate(), sysdate());
insert into Student(id, name, passport_id, createdDate, updateDate) 
values(20002,'Shitij', 30002, sysdate(), sysdate());
insert into Student(id, name, passport_id, createdDate, updateDate) 
values(20003,'Pankaj', 30003, sysdate(), sysdate());

insert into Reviews(id, review, Course_id, createdDate, updateDate) 
values(40001,'It is good', 10001, sysdate(), sysdate());
insert into Reviews(id, review, Course_id, createdDate, updateDate) 
values(40002,'Course was nice', 10001, sysdate(), sysdate());
insert into Reviews(id, review, Course_id, createdDate, updateDate) 
values(40003,'Best course ever seen', 10003, sysdate(), sysdate());

insert into Student_Course(studentId,courseId)
values(20001,10001);
insert into Student_Course(studentId,courseId)
values(20001,10002);
insert into Student_Course(studentId,courseId)
values(20002,10003);
insert into Student_Course(studentId,courseId)
values(20003,10003);