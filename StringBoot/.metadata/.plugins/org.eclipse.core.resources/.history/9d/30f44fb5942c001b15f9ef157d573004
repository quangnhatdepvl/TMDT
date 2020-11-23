USE thuongmaidientu;
/*CREATE TABLE*/
CREATE TABLE user (
    idUser NVARCHAR(20) NOT NULL PRIMARY KEY,
    userName NVARCHAR(20) NOT NULL,
    password NVARCHAR(20) NOT NULL,
    level INT NOT NULL,
    status NVARCHAR(10) NOT NULL,
    idUserInfo NVARCHAR(20),
    FOREIGN KEY (idUserInfo)
        REFERENCES userinfo (idUserInfo)
);
CREATE TABLE userinfo (
    idUserInfo NVARCHAR(20) NOT NULL,
    fullName NVARCHAR(50) NOT NULL,
    date DATE NOT NULL,
    sex NVARCHAR(3) NOT NULL,
    avatar NVARCHAR(50) NOT NULL,
    identify NVARCHAR(9) NOT NULL,
    PRIMARY KEY (idUserInfo)
);
CREATE TABLE course (
    idCourse NVARCHAR(20) NOT NULL,
    nameCourse NVARCHAR(20) NOT NULL,
    type NVARCHAR(20) NOT NULL,
    cost INT NOT NULL,
    content NVARCHAR(1000) NOT NULL,
    PRIMARY KEY (idCourse)
);
CREATE TABLE video (
    idVideo NVARCHAR(20) NOT NULL PRIMARY KEY,
    nameVideo NVARCHAR(100) NOT NULL,
    link NVARCHAR(50) NOT NULL,
    idCourse NVARCHAR(20),
    FOREIGN KEY (idCourse)
        REFERENCES course (idCourse),
    idUser NVARCHAR(20),
    FOREIGN KEY (idUser)
        REFERENCES user (idUser)
);
CREATE TABLE shift (
    idShift NVARCHAR(20) NOT NULL PRIMARY KEY,
    nameShift NVARCHAR(20) NOT NULL,
    startTime TIME NOT NULL,
    endTime TIME NOT NULL,
    idSchedule NVARCHAR(20),
    FOREIGN KEY (idSchedule)
        REFERENCES schedule (idSchedule)
);
CREATE TABLE schedule (
    idSchedule NVARCHAR(20) NOT NULL PRIMARY KEY,
    position NVARCHAR(20) NOT NULL,
    daysOfWeek NVARCHAR(20) NOT NULL,
    idUser NVARCHAR(20),
    FOREIGN KEY (idUser)
        REFERENCES user (idUser),
    idCourse NVARCHAR(20),
    FOREIGN KEY (idCourse)
        REFERENCES course (idCourse)
);
CREATE TABLE report (
    idReport NVARCHAR(20) NOT NULL PRIMARY KEY,
    dateReport DATETIME NOT NULL,
    content NVARCHAR(2000) NOT NULL,
    link NVARCHAR(50) NOT NULL,
    money INT NOT NULL,
    idUser NVARCHAR(20),
    CONSTRAINT idTeacher FOREIGN KEY (idUser)
        REFERENCES user (idUser),
    idUserInfo NVARCHAR(20),
    CONSTRAINT infoStudent FOREIGN KEY (idUserInfo)
        REFERENCES userInfo (idUserInfo),
    idIncome NVARCHAR(20),
    FOREIGN KEY (idIncome)
        REFERENCES income (idIncome)
);
CREATE TABLE payment (
    idPayment NVARCHAR(20) NOT NULL PRIMARY KEY,
    datePayment DATE NOT NULL,
    cost INT NOT NULL,
    idUser NVARCHAR(20),
    FOREIGN KEY (idUser)
        REFERENCES user (idUser),
    idCourse NVARCHAR(20),
    FOREIGN KEY (idCourse)
        REFERENCES course (idCourse)
);
CREATE TABLE income (
    idIncome NVARCHAR(20) NOT NULL PRIMARY KEY,
    date DATETIME NOT NULL,
    totalCost INT NOT NULL,
    idUser NVARCHAR(20),
    FOREIGN KEY (idUser)
        REFERENCES user (idUser)
);
CREATE TABLE comment (
    idComment NVARCHAR(20) NOT NULL PRIMARY KEY,
    content NVARCHAR(2000) NOT NULL,
    idUser NVARCHAR(20),
    FOREIGN KEY (idUser)
        REFERENCES user (idUser)
);
CREATE TABLE rate (
    idRate NVARCHAR(20) NOT NULL PRIMARY KEY,
    numStar INT NOT NULL,
    content NVARCHAR(2000) NOT NULL,
    idUser NVARCHAR(20),
    FOREIGN KEY (idUser)
        REFERENCES user (idUser)
);

/*INSERT DATABASE*/
-- insert user
insert into user values ('U000', 'Admin', 'admin', 1, 'active', 'UIA000');
-- for teacher
insert into user values ('U001', 'Teacher001', 'teacher001', 2, 'active', 'UIT001');
insert into user values ('U002', 'Teacher002', 'teacher002', 2, 'active', 'UIT002');
insert into user values ('U003', 'Teacher003', 'teacher003', 2, 'active', 'UIT003');
insert into user values ('U004', 'Teacher004', 'teacher004', 2, 'active', 'UIT004');
insert into user values ('U005', 'Teacher005', 'teacher005', 2, 'active', 'UIT005');
insert into user values ('U006', 'Teacher006', 'teacher006', 2, 'active', 'UIT006');
insert into user values ('U007', 'Teacher007', 'teacher007', 2, 'active', 'UIT007');
insert into user values ('U008', 'Teacher008', 'teacher008', 2, 'active', 'UIT008');
insert into user values ('U009', 'Teacher009', 'teacher009', 2, 'active', 'UIT009');
insert into user values ('U010', 'Teacher010', 'teacher010', 2, 'active', 'UIT010');
-- for student
insert into user values ('U011', 'Student001', 'student001', 3, 'active', 'UIS011');
insert into user values ('U012', 'Student002', 'student002', 3, 'active', 'UIS012');
insert into user values ('U013', 'Student003', 'student003', 3, 'active', 'UIS013');
insert into user values ('U014', 'Student004', 'student004', 3, 'active', 'UIS014');
insert into user values ('U015', 'Student005', 'student005', 3, 'active', 'UIS015');
insert into user values ('U016', 'Student006', 'student006', 3, 'active', 'UIS016');
insert into user values ('U017', 'Student007', 'student007', 3, 'active', 'UIS017');
insert into user values ('U018', 'Student008', 'student008', 3, 'active', 'UIS018');
insert into user values ('U019', 'Student009', 'student009', 3, 'active', 'UIS019');
insert into user values ('U020', 'Student010', 'student010', 3, 'active', 'UIS020');
insert into user values ('U021', 'Student011', 'student011', 3, 'active', 'UIS021');
insert into user values ('U022', 'Student012', 'student012', 3, 'active', 'UIS022');
insert into user values ('U023', 'Student013', 'student013', 3, 'active', 'UIS023');
insert into user values ('U024', 'Student014', 'student014', 3, 'active', 'UIS024');
insert into user values ('U025', 'Student015', 'student015', 3, 'active', 'UIS025');
insert into user values ('U026', 'Student016', 'student016', 3, 'active', 'UIS026');
insert into user values ('U027', 'Student017', 'student017', 3, 'active', 'UIS027');
insert into user values ('U028', 'Student018', 'student018', 3, 'active', 'UIS028');
insert into user values ('U029', 'Student019', 'student019', 3, 'active', 'UIS029');
insert into user values ('U030', 'Student020', 'student020', 3, 'active', 'UIS030');
insert into user values ('U031', 'Student021', 'student021', 3, 'active', 'UIS031');
insert into user values ('U032', 'Student022', 'student022', 3, 'active', 'UIS032');
insert into user values ('U033', 'Student023', 'student023', 3, 'active', 'UIS033');
insert into user values ('U034', 'Student024', 'student024', 3, 'active', 'UIS034');
insert into user values ('U035', 'Student025', 'student025', 3, 'active', 'UIS035');
insert into user values ('U036', 'Student026', 'student026', 3, 'active', 'UIS036');
insert into user values ('U037', 'Student027', 'student027', 3, 'active', 'UIS037');
insert into user values ('U038', 'Student028', 'student028', 3, 'active', 'UIS038');
insert into user values ('U039', 'Student029', 'student029', 3, 'active', 'UIS039');
insert into user values ('U040', 'Student030', 'student030', 3, 'active', 'UIS040');
insert into user values ('U041', 'Student031', 'student031', 3, 'active', 'UIS041');
insert into user values ('U042', 'Student032', 'student032', 3, 'active', 'UIS042');
insert into user values ('U043', 'Student033', 'student033', 3, 'active', 'UIS043');
insert into user values ('U044', 'Student034', 'student034', 3, 'active', 'UIS044');
insert into user values ('U045', 'Student035', 'student035', 3, 'active', 'UIS045');
insert into user values ('U046', 'Student036', 'student036', 3, 'active', 'UIS046');
insert into user values ('U047', 'Student037', 'student037', 3, 'active', 'UIS047');
insert into user values ('U048', 'Student038', 'student038', 3, 'active', 'UIS048');
insert into user values ('U049', 'Student039', 'student039', 3, 'active', 'UIS049');
insert into user values ('U050', 'Student040', 'student040', 3, 'active', 'UIS050');
-- insert userInfo
insert into userinfo values ('UIA000', 'Admin', '1999-08-01', 'Nam', '', '312395241');
-- for teacher's infomation
insert into userinfo values ('UIT001', 'Nguyen Ngoc Anh', '1980-02-01', 'Nam', '', '312395547');
insert into userinfo values ('UIT002', 'Tran Thi Kim Anh', '1990-12-05', 'Nu', '', '312367465');
insert into userinfo values ('UIT003', 'Tran Kim Bao', '1995-10-24', 'Nam', '', '312387648');
insert into userinfo values ('UIT004', 'Nguyen Quoc Cuong', '1988-02-02', 'Nam', '', '312364786');
insert into userinfo values ('UIT005', 'Vu Thi My Duyen', '1991-06-03', 'Nu', '', '312377754');
insert into userinfo values ('UIT006', 'Nguyen Cong Danh', '1998-01-25', 'Nam', '', '212389876');
insert into userinfo values ('UIT007', 'Ngo Kim Oanh', '1997-07-10',  'Nu', '', '312376578');
insert into userinfo values ('UIT008', 'Phan Phuong Nam', '1880-10-07', 'Nam', '', '312390989');
insert into userinfo values ('UIT009', 'Nguyen Duc Manh', '1990-07-30', 'Nam', '', '312387865');
insert into userinfo values ('UIT010', 'Le Thi Tuyet', '1997-11-29', 'Nu', '', '312376409');
-- for student's infomation
insert into userinfo values ('UIS011', 'Tran Trong Anh', '1999-02-11', 'Nam', '', '312386944');
insert into userinfo values ('UIS012', 'Nguyen Hong Son', '1999-08-01', 'Nam', '', '312748944');
insert into userinfo values ('UIS013', 'Nguyen Tan Tai', '1995-12-08', 'Nam', '', '312387832');
insert into userinfo values ('UIS014', 'Vo Thanh Quy', '1989-08-12', 'Nu', '', '312375836');
insert into userinfo values ('UIS015', 'Ngo Minh Quang', '1992-04-13', 'Nam', '', '312386944');
insert into userinfo values ('UIS016', 'Nguyen Tan Huy', '2001-07-11', 'Nam', '', '312375867');
insert into userinfo values ('UIS017', 'Nguyen Thi Thuy Hang', '1996-09-02', 'Nu', '', '312354646');
insert into userinfo values ('UIS018', 'Truong Thi My Hao', '1999-12-30', 'Nu', '', '324184763');
insert into userinfo values ('UIS019', 'Phan Kim Anh', '2004-05-28', 'Nu', '', '312397856');
insert into userinfo values ('UIS020', 'Nguyen Tan Hung', '1989-02-12', 'Nam', '', '312376944');
insert into userinfo values ('UIS021', 'Quynh Anh Minh', '2001-12-21', 'Nu', '', '321398675');
insert into userinfo values ('UIS022', 'Nguyen Tan Ninh', '2000-12-28', 'Nam', '', '312395867');
insert into userinfo values ('UIS023', 'Tran Trong Chinh', '1987-02-15', 'Nam', '', '312365746');
insert into userinfo values ('UIS024', 'Phan Van Ba', '2003-07-15', 'Nam', '', '312396874');
insert into userinfo values ('UIS025', 'Ninh Huu Phuoc', '1999-11-17', 'Nam', '', '321295958');
insert into userinfo values ('UIS026', 'Nguyen Ha My', '1998-11-26', 'Nu', '', '312354647');
insert into userinfo values ('UIS027', 'Vo Thi Thanh Thuy', '2001-08-26', 'Nu', '', '132497865');
insert into userinfo values ('UIS028', 'Tran Nguyen Quang Minh', '2000-05-14', 'Nam', '', '324156470');
insert into userinfo values ('UIS029', 'Tuy Van Hau', '1997-05-25', 'Nam', '', '312385903');
insert into userinfo values ('UIS030', 'Le Nhu Huynh', '2000-11-11', 'Nu', '', '312309090');
insert into userinfo values ('UIS031', 'Nguyen Le Ngoc Tuan', '1998-08-30', 'Nam', '', '312342424');
insert into userinfo values ('UIS032', 'Le Hong Hanh', '1996-07-26', 'Nu', '', '312314156');
insert into userinfo values ('UIS033', 'Vo Kieu Loan', '2003-02-22', 'Nu', '', '312376869');
insert into userinfo values ('UIS034', 'Nguyen Truc Dao', '1999-04-26', 'Nu', '', '312365758');
insert into userinfo values ('UIS035', 'Mai Trong Tan', '1998-09-25', 'Nam', '', '312365789');
insert into userinfo values ('UIS036', 'Nguyen Ha Anh', '1999-08-08', 'Nam', '', '312376970');
insert into userinfo values ('UIS037', 'Tran Ngoc Mai', '2002-11-09', 'Nu', '', '312376859');
insert into userinfo values ('UIS038', 'Nguyen Van Binh', '2001-04-23', 'Nam', '', '312386904');
insert into userinfo values ('UIS039', 'Tran Ha Nam Uyen', '1999-02-18', 'Nu', '', '312365758');
insert into userinfo values ('UIS040', 'Le Thuc Quan', '1995-06-13', 'Nam', '', '312398605');
insert into userinfo values ('UIS041', 'Tran Thi Lan Anh', '1994-07-24', 'Nu', '', '312344567');
insert into userinfo values ('UIS042', 'Nguyen Hong Tuan', '1988-12-11', 'Nam', '', '312386954');
insert into userinfo values ('UIS043', 'Huynh Tan Tai', '1994-04-21', 'Nam', '', '312345363');
insert into userinfo values ('UIS044', 'Van Sy Thanh', '2000-03-16', 'Nu', '', '312386868');
insert into userinfo values ('UIS045', 'Van Sy Hung', '1999-12-02', 'Nam', '', '312354678');
insert into userinfo values ('UIS046', 'Tran Trong Tat', '2004-04-22', 'Nam', '', '312342242');
insert into userinfo values ('UIS047', 'Nguyen Van Thanh', '1999-11-21', 'Nam', '', '312303984');
insert into userinfo values ('UIS048', 'Mai Tran Van Tuan', '1999-02-15', 'Nam', '', '312343567');
insert into userinfo values ('UIS049', 'Nguyen Tien Quynh', '1997-06-11', 'Nu', '', '312387402');
insert into userinfo values ('UIS050', 'Tran Phuong Uyen', '1999-05-23', 'Nu', '', '312345266');
-- insert course
insert into course values ('CV1', 'Offline Video Course', 'Video Course', '490000', '');
insert into course values ('CT1', 'Online Tutor Course1', 'Course 1', '1490000', '');
insert into course values ('CT2', 'Online Tutor Course2', 'Course 2', '2990000', ''); 
insert into course values ('CT3', 'Online Tutor Course3', 'Course 3', '3990000', '');
-- insert video
insert into video values ('V01', 'Lesson1_Vowels1', '', 'CV1', 'U001');
insert into video values ('V02', 'Lesson2_Vowels2', '', 'CV1', 'U001');
insert into video values ('V03', 'Lesson3_Dipthongs', '', 'CV1', 'U001');
insert into video values ('V04', 'Lesson4_Consonants2', '', 'CV1', 'U001');
insert into video values ('V05', 'Lesson5_Consonants3', '', 'CV1', 'U001');
insert into video values ('V06', 'Lesson6_Consonants4', '', 'CV1', 'U001');
insert into video values ('V07', 'Lesson7_TobeVerbs&Adverbs', '', 'CV1', 'U001');
insert into video values ('V08', 'Lesson8_Possessive_Adjective', '', 'CV1', 'U001');
insert into video values ('V09', 'Lesson9_NormalVerbs', '', 'CV1', 'U001');
insert into video values ('V10', 'Lesson10_ModalVerbs', '', 'CV1', 'U001');
insert into video values ('V11', 'Lesson11_Objects', '', 'CV1', 'U001');
insert into video values ('V12', 'Lesson12_Review&Practice', '', 'CV1', 'U001');

insert into video values ('V13', 'Lesson1_Vowels1', '', 'CV1', 'U002');
insert into video values ('V14', 'Lesson2_Vowels2', '', 'CV1', 'U002');
insert into video values ('V15', 'Lesson3_Dipthongs', '', 'CV1', 'U002');
insert into video values ('V16', 'Lesson4_Consonants2', '', 'CV1', 'U002');
insert into video values ('V17', 'Lesson5_Consonants3', '', 'CV1', 'U002');
insert into video values ('V18', 'Lesson6_Consonants4', '', 'CV1', 'U002');
insert into video values ('V19', 'Lesson7_TobeVerbs&Adverbs', '', 'CV1', 'U002');
insert into video values ('V20', 'Lesson8_Possessive_Adjective', '', 'CV1', 'U002');
insert into video values ('V21', 'Lesson9_NormalVerbs', '', 'CV1', 'U002');
insert into video values ('V22', 'Lesson10_ModalVerbs', '', 'CV1', 'U002');
insert into video values ('V23', 'Lesson11_Objects', '', 'CV1', 'U002');
insert into video values ('V24', 'Lesson12_Review&Practice', '', 'CV1', 'U002');

insert into video values ('V25', 'Lesson1_Vowels1', '', 'CV1', 'U003');
insert into video values ('V26', 'Lesson2_Vowels2', '', 'CV1', 'U003');
insert into video values ('V27', 'Lesson3_Dipthongs', '', 'CV1', 'U003');
insert into video values ('V28', 'Lesson4_Consonants2', '', 'CV1', 'U003');
insert into video values ('V29', 'Lesson5_Consonants3', '', 'CV1', 'U003');
insert into video values ('V30', 'Lesson6_Consonants4', '', 'CV1', 'U003');
insert into video values ('V31', 'Lesson7_TobeVerbs&Adverbs', '', 'CV1', 'U003');
insert into video values ('V32', 'Lesson8_Possessive_Adjective', '', 'CV1', 'U003');
insert into video values ('V33', 'Lesson9_NormalVerbs', '', 'CV1', 'U003');
insert into video values ('V34', 'Lesson10_ModalVerbs', '', 'CV1', 'U003');
insert into video values ('V35', 'Lesson11_Objects', '', 'CV1', 'U003');
insert into video values ('V36', 'Lesson12_Review&Practice', '', 'CV1', 'U003');
-- insert shift
insert into shift values ('S001', 'Shift01_Mon', '07:00:00', '08:00:00', 'SC001');
insert into shift values ('S002', 'Shift01_Wed', '07:00:00', '08:00:00', 'SC001');
insert into shift values ('S003', 'Shift01_Fri', '07:00:00', '08:00:00', 'SC001');
insert into shift values ('S004', 'Shift02_Tue', '08:00:00', '09:00:00', 'SC002');
insert into shift values ('S005', 'Shift02_Thu', '08:00:00', '09:00:00', 'SC002');
insert into shift values ('S006', 'Shift02_Sat', '08:00:00', '09:00:00', 'SC002');
insert into shift values ('S007', 'Shift03_Mon', '09:00:00', '10:00:00', 'SC003');
insert into shift values ('S008', 'Shift03_Wed', '09:00:00', '10:00:00', 'SC003');
insert into shift values ('S009', 'Shift03_Fri', '09:00:00', '10:00:00', 'SC003');
insert into shift values ('S010', 'Shift04_Mon', '10:00:00', '11:00:00', 'SC004');
insert into shift values ('S011', 'Shift04_Wed', '10:00:00', '11:00:00', 'SC004');
insert into shift values ('S012', 'Shift04_Fri', '10:00:00', '11:00:00', 'SC004');
insert into shift values ('S013', 'Shift05_Tue', '11:00:00', '12:00:00', 'SC005');
insert into shift values ('S014', 'Shift05_Thu', '11:00:00', '12:00:00', 'SC005');
insert into shift values ('S015', 'Shift05_Sat', '11:00:00', '12:00:00', 'SC005');
insert into shift values ('S016', 'Shift06_Tue', '12:00:00', '13:00:00', 'SC006');
insert into shift values ('S017', 'Shift06_Thu', '12:00:00', '13:00:00', 'SC006');
insert into shift values ('S018', 'Shift06_Sat', '12:00:00', '13:00:00', 'SC006');
insert into shift values ('S019', 'Shift07_Tue', '13:00:00', '14:00:00', 'SC007');
insert into shift values ('S020', 'Shift07_Thu', '13:00:00', '14:00:00', 'SC007');
insert into shift values ('S021', 'Shift07_Sat', '13:00:00', '14:00:00', 'SC007');
insert into shift values ('S022', 'Shift08_Mon', '14:00:00', '15:00:00', 'SC008');
insert into shift values ('S023', 'Shift08_Wed', '14:00:00', '15:00:00', 'SC008');
insert into shift values ('S024', 'Shift08_Fri', '14:00:00', '15:00:00', 'SC008');
insert into shift values ('S025', 'Shift09_Tue', '15:00:00', '16:00:00', 'SC009');
insert into shift values ('S026', 'Shift09_Thu', '15:00:00', '16:00:00', 'SC009');
insert into shift values ('S027', 'Shift09_Sat', '15:00:00', '16:00:00', 'SC009');
insert into shift values ('S028', 'Shift10_Mon', '16:00:00', '17:00:00', 'SC010');
insert into shift values ('S029', 'Shift10_Wed', '16:00:00', '17:00:00', 'SC010');
insert into shift values ('S030', 'Shift10_Fri', '16:00:00', '17:00:00', 'SC010');
-- insert into shift values ('S031', 'Shift 11', '17:00:00', '18:00:00', 'SC010');
-- insert into shift values ('S032', 'Shift 12', '18:00:00', '19:00:00', 'SC007');
-- insert into shift values ('S033', 'Shift 13', '19:00:00', '20:00:00', 'SC008');
-- insert into shift values ('S034', 'Shift 14', '20:00:00', '21:00:00', 'SC009');
-- insert into shift values ('S035', 'Shift 15', '21:00:00', '22:00:00', 'SC010');
-- insert schedule
-- for teacher's schedule
insert into schedule values ('SC001', 'Teacher', 'Mon-Wed-Fri', 'U001', 'CT1');
insert into schedule values ('SC002', 'Teacher', 'Tue-Thu-Sat', 'U002', 'CT3');
insert into schedule values ('SC003', 'Teacher', 'Mon-Wed-Fri', 'U003', 'CT2');
insert into schedule values ('SC004', 'Teacher', 'Mon-Wed-Fri', 'U004', 'CT2');
insert into schedule values ('SC005', 'Teacher', 'Tue-Thu-Sat', 'U005', 'CT3');
insert into schedule values ('SC006', 'Teacher', 'Tue-Thu-Sat', 'U006', 'CT1');
insert into schedule values ('SC007', 'Teacher', 'Tue-Thu-Sat', 'U007', 'CT2');
insert into schedule values ('SC008', 'Teacher', 'Mon-Wed-Fri', 'U008', 'CT1');
insert into schedule values ('SC009', 'Teacher', 'Tue-Thu-Sat', 'U009', 'CT3');
insert into schedule values ('SC010', 'Teacher', 'Mon-Wed-Fri', 'U010', 'CT1');
-- for student's schedule
-- insert report
insert into report values ('RP001', '2020-11-01', 'Vui vẻ, tập trung, phát âm tốt', '', '100000', 'U002', 'UIS020', 'I002');
insert into report values ('RP002', '2020-11-01', 'Năng lượng, hay nhầm giữa 2 âm "s" và "S"', '', '100000', 'U001', 'UIS021', 'I001');
insert into report values ('RP003', '2020-11-01', 'Ngữ pháp vẫn còn yếu, nhớ được nhiều từ và ứng dụng được nhiều hơn', '', '100000', 'U004', 'UIS019', 'I004');
insert into report values ('RP004', '2020-11-01', 'Mạng hơi yếu do kết nối kém nên ảnh hưởng đến buổi học, nắm bài nhanh', '', '100000', 'U003', 'UIS018', 'I003');
insert into report values ('RP005', '2020-11-01', 'Phát âm còn sai một số lỗi, biết khá khá từ vựng nhưng dùng chưa được linh hoạt, sai một số lỗi np cơ bản', '', '100000', 'U005', 'UIS017', 'I005');
insert into report values ('RP006', '2020-11-02', 'Đã khắc phục được chỗ âm "s" và xì đúng chỗ hơn', '', '100000', 'U007', 'UIS025', 'I007');
insert into report values ('RP007', '2020-11-02', 'Chị nghe cả đoạn dài còn chưa quen, nghe đoán chữ khá tốt, phát âm khá tốt, ít quên âm đuôi, tự diễn đạt câu nói của mình còn yếu nhiều', '', '100000', 'U009', 'UIS030', 'I009');
insert into report values ('RP008', '2020-11-02', 'Vốn từ vựng khá, phát âm tốt và tiếp thu bài nhanh. Một số từ âm còn sai do ảnh hưởng tiếng Đức và khẩu hình miệng chưa đúng.', '', '100000', 'U008', 'UIS028', 'I008');
insert into report values ('RP009', '2020-11-02', 'Từ vựng khá nhưng chưa ứng dụng được nhiều, phát triển cấu trúc nhiều hơn', '', '100000', 'U010', 'UIS011', 'I010');
insert into report values ('RP010', '2020-11-02', 'Từ vựng nhớ được nhiều hơn. ngữ pháp tốt nhưng ứng dụng còn chậm', '', '100000', 'U006', 'UIS016', 'I006');
insert into report values ('RP011', '2020-11-03', 'Chị nắm được bài, áp dụng tốt, một số chỗ khó được GV giái đáp', '', '100000', 'U002', 'UIS020', 'I002');
insert into report values ('RP012', '2020-11-03', 'Có kiến thức khá tốt về modal verbs, tiếp thu nhanh và làm bài tập phần modal verbs rất tốt. Làm phần dịch khá tốt, học từ vựng ngay trên lớp và vận dụng tốt trong phần bài tập', '', '100000', 'U001', 'UIS021', 'I001');
insert into report values ('RP013', '2020-11-03', 'Speaking tốt, sử dụng vocab tốt nhưng hôm nay thỉnh thoảng ngập ngừng một tí. Em phản xạ nhanh, có thể nói 1 đoạn văn ngay lập tức mà không cần chuẩn bị nhiều.  ', '', '100000', 'U004', 'UIS019', 'I004');
insert into report values ('RP014', '2020-11-03', 'Tiếp thu bài về Adverbs nhanh chóng và làm bài tập khá tốt. Vẫn còn nhớ được các kiến thức đã học ở các bài trước nên làm phần ôn tập cuối khóa khá tốt, tuy nhiên vẫn có một số từ anh không nhớ, cần ôn lại', '', '100000', 'U003', 'UIS018', 'I003');
insert into report values ('RP015', '2020-11-03', 'Nhận diện tốt tính từ, nắm được nội dung bài mới nhưng ứng dụng chưa nhanh, có qun tâm đến sửa lỗi phát âm', '', '100000', 'U005', 'UIS017', 'I005');
insert into report values ('RP016', '2020-11-04', 'Bạn hiểu bài nhanh,đặt câu tốt , làm bài tập áp dụng đúng', '', '100000', 'U007', 'UIS025', 'I007');
insert into report values ('RP017', '2020-11-04', 'Chị phát âm khá tốt, có đa dạng các cấu trúc ngữ pháp để diễn đạt câu', '', '100000', 'U009', 'UIS030', 'I009');
insert into report values ('RP018', '2020-11-04', 'Ban nói được ý tưởng bằng tiếng Anh qua chủ đề cooking, đặt câu hỏi tốt, khả năng nghe tốt, chỉ một điểm yếu là thiếu tự tin', '', '100000', 'U008', 'UIS028', 'I008');
insert into report values ('RP019', '2020-11-04', 'Phát âm và từ vựng tốt. Cần luyện nghe nhiều hơn', '', '100000', 'U010', 'UIS011', 'I010');
insert into report values ('RP020', '2020-11-04', 'Có tiến bộ trong việc đặt câu, chịu khó học từ vựng ', '', '100000', 'U006', 'UIS016', 'I006');
insert into report values ('RP021', '2020-11-05', 'Biết nhiều từ vựng nhưng chưa vận dụng nhiều vào phần nói, tuy nhiên vẫn thiếu ý tưởng, cần nhiều sự trợ giúp từ giáo viên', '', '100000', 'U002', 'UIS020', 'I002');
insert into report values ('RP022', '2020-11-05', 'Tiếp thu từ vựng và chủ đề tốt. Đọc hiểu nhanh,giao tiếp tự tin', '', '100000', 'U001', 'UIS021', 'I001');
insert into report values ('RP023', '2020-11-05', 'Biết nhiều từ vựng nhưng chưa vận dụng nhiều vào phần nói, tuy nhiên vẫn thiếu ý tưởng, cần nhiều sự trợ giúp từ giáo viên', '', '100000', 'U004', 'UIS019', 'I004');
insert into report values ('RP024', '2020-11-05', 'Ngữ pháp vẫn còn chưa ổn lắm nhưng đã biết vận dụng nhiều từ vựng vào viết câu và nói', '', '100000', 'U003', 'UIS018', 'I003');
insert into report values ('RP025', '2020-11-05', 'Ngữ pháp vẫn còn bấp bênh, chịu khó học từ vựng', '', '100000', 'U005', 'UIS017', 'I005');
insert into report values ('RP026', '2020-11-06', 'Nghe hiểu tốt hơn đã đặt được nhiều câu hơn', '', '100000', 'U007', 'UIS025', 'I007');
insert into report values ('RP027', '2020-11-06', 'Tốt, cần luyện tập ngữ điệu để có thể nói lưu loát hơn,nhớ nhiều từ vựng hơn', '', '100000', 'U009', 'UIS030', 'I009');
insert into report values ('RP028', '2020-11-06', 'Tốt, cần luyện tập ngữ điệu để có thể nói lưu loát hơn', '', '100000', 'U008', 'UIS028', 'I008');
insert into report values ('RP029', '2020-11-06', 'Thiếu tập trung, quên ngữ pháp hiện tại hoàn thành gần hết, cũng như lượng từ vựng về pp của động từ vẫn còn yếu. ', '', '100000', 'U010', 'UIS011', 'I010');
insert into report values ('RP030', '2020-11-06', 'Vận dụng tốt các từ vựng trung cấp, phát triển ý tốt', '', '100000', 'U006', 'UIS016', 'I006');
-- insert payment
insert into payment values ('P001', '2020-10-02', '2990000', 'U011', 'CT2');
insert into payment values ('P002', '2020-10-04', '1490000', 'U012', 'CT1');
insert into payment values ('P003', '2020-10-08', '1490000', 'U013', 'CT1');
insert into payment values ('P004', '2020-10-10', '490000', 'U014', 'CV1');
insert into payment values ('P005', '2020-10-01', '2990000', 'U015', 'CT2');
insert into payment values ('P006', '2020-10-02', '1490000', 'U016', 'CT1');
insert into payment values ('P007', '2020-10-02', '490000', 'U017', 'CV1');
insert into payment values ('P008', '2020-10-12', '2990000', 'U018', 'CT2');
insert into payment values ('P009', '2020-10-12', '1490000', 'U019', 'CT1');
insert into payment values ('P010', '2020-10-22', '1490000', 'U020', 'CT1');
insert into payment values ('P011', '2020-10-24', '2990000', 'U021', 'CT2');
insert into payment values ('P012', '2020-10-30', '2990000', 'U022', 'CT2');
insert into payment values ('P013', '2020-10-30', '1490000', 'U023', 'CT1');
insert into payment values ('P014', '2020-10-30', '2990000', 'U024', 'CT2');
insert into payment values ('P015', '2020-10-30', '2990000', 'U025', 'CT2');
insert into payment values ('P016', '2020-10-30', '1490000', 'U026', 'CT1');
insert into payment values ('P017', '2020-10-02', '2990000', 'U027', 'CT2');
insert into payment values ('P018', '2020-10-06', '2990000', 'U028', 'CT2');
insert into payment values ('P019', '2020-10-06', '1490000', 'U029', 'CT1');
insert into payment values ('P020', '2020-10-06', '490000', 'U030', 'CV1');
insert into payment values ('P021', '2020-10-08', '2990000', 'U031', 'CT2');
insert into payment values ('P022', '2020-10-08', '2990000', 'U032', 'CT2');
insert into payment values ('P023', '2020-10-09', '2990000', 'U033', 'CT2');
insert into payment values ('P024', '2020-10-09', '2990000', 'U034', 'CT2');
insert into payment values ('P025', '2020-10-10', '1490000', 'U035', 'CT1');
insert into payment values ('P026', '2020-10-15', '1490000', 'U036', 'CT1');
insert into payment values ('P027', '2020-10-15', '2990000', 'U037', 'CT2');
insert into payment values ('P028', '2020-10-19', '2990000', 'U038', 'CT2');
insert into payment values ('P029', '2020-11-01', '2990000', 'U039', 'CT2');
insert into payment values ('P030', '2020-11-01', '490000', 'U040', 'CV1');
insert into payment values ('P031', '2020-11-03', '2990000', 'U041', 'CT2');
insert into payment values ('P032', '2020-11-04', '2990000', 'U042', 'CT2');
insert into payment values ('P033', '2020-11-04', '2990000', 'U043', 'CT2');
insert into payment values ('P034', '2020-11-04', '3990000', 'U044', 'CT3');
insert into payment values ('P035', '2020-11-04', '3990000', 'U045', 'CT3');
insert into payment values ('P036', '2020-11-04', '3990000', 'U046', 'CT3');
insert into payment values ('P037', '2020-11-06', '2990000', 'U047', 'CT2');
insert into payment values ('P038', '2020-11-06', '2990000', 'U048', 'CT2');
insert into payment values ('P039', '2020-11-07', '490000', 'U049', 'CV1');
insert into payment values ('P040', '2020-11-08', '3990000', 'U050', 'CT3');
-- insert income
insert into income values('I001', '2020-11-10', '10000000', 'U001');
insert into income values('I002', '2020-11-10', '12000000', 'U002');
insert into income values('I003', '2020-11-10', '6350000', 'U003');
insert into income values('I004', '2020-11-10', '5800000', 'U004');
insert into income values('I005', '2020-11-10', '8600000', 'U005');
insert into income values('I006', '2020-11-10', '4600000', 'U006');
insert into income values('I007', '2020-11-10', '3000000', 'U007');
insert into income values('I008', '2020-11-10', '12000000', 'U008');
insert into income values('I009', '2020-11-10', '5300000', 'U009');
insert into income values('I010', '2020-11-10', '4600000', 'U010');
-- insert comment
insert into comment values ('CM001', 'Thầy dạy nhiệt tình, hài hước nên em học rất vui và nhanh hiểu bài', 'U001');
insert into comment values ('CM002', 'Cảm ơn thầy đã nhiệt tình hỗ trợ và giúp đỡ em trong thời gian vừa qua', 'U001');
insert into comment values ('CM003', 'Thank you so much. I love you 3000 <3 :)))))', 'U003');
insert into comment values ('CM004', 'Thầy dạy nhiệt tình, hài hước nên em học rất vui và nhanh hiểu bài', 'U003');
insert into comment values ('CM005', 'I really appriciate it! Thầy dạy không những rất hay mà còn đẹp trai nữa, kkk. ', 'U001');
insert into comment values ('CM006', 'Cô rất vui tính ạ! Lần đầu tiên em học tiếng anh mà tiếp thu cả 100% luôn.', 'U010');
insert into comment values ('CM007', 'Cảm ơn sự nhiệt tình của thầy trong thời gian vừa qua ạ', 'U009');
insert into comment values ('CM008', 'Thanks a lot <3 <3 <3 <3 <3 <3 <3 <3 <3 <3! ', 'U002');
insert into comment values ('CM009', 'Thanks for teaching me! Các bạn đăng ký học thử nhé, đăng kí 1 nhận được tận 10', 'U007');
insert into comment values ('CM010', 'Xuất sắc quá thầy ơi. Mới có vài tuần học với thầy mà e đã cảm thấy tự tin hơn hẳn và e cảm thấy tiếng anh của mình có sự thay đổi hehe', 'U008');
insert into comment values ('CM011', 'Thầy ơi cho e hỏi, khóa sau e có được học tiếp với thầy nữa k ạ! Em thích học với thầy lắm', 'U006');
-- insert rate
insert into rate values('R001', '4', '', 'U001');
insert into rate values('R002', '5', '', 'U002');
insert into rate values('R003', '3', '', 'U001');
insert into rate values('R004', '4', '', 'U003');
insert into rate values('R005', '4', '', 'U005');
insert into rate values('R006', '5', '', 'U004');
insert into rate values('R007', '5', '', 'U004');
insert into rate values('R008', '5', '', 'U006');
insert into rate values('R009', '3', '', 'U007');
insert into rate values('R010', '4', '', 'U007');
insert into rate values('R011', '5', '', 'U007');
insert into rate values('R012', '5', '', 'U008');
insert into rate values('R013', '4', '', 'U010');
insert into rate values('R014', '5', '', 'U009');
insert into rate values('R015', '5', '', 'U006');
insert into rate values('R016', '4', '', 'U005');
insert into rate values('R017', '4', '', 'U005');
insert into rate values('R018', '5', '', 'U002');
insert into rate values('R019', '3', '', 'U004');
insert into rate values('R020', '4', '', 'U008');

















