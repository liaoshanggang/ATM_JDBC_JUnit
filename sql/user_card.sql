-- Create table
create table USER_BANKCARD
(
  user_cardno    VARCHAR2(19) not null,
  user_accountno VARCHAR2(17) not null,
  user_password  NUMBER(6) not null,
  user_cardtype  VARCHAR2(255) not null,
  user_balance   NUMBER(38) not null
)

-- Create sequence 
create sequence USER_CARDNO_SEQ
minvalue 1	   
maxvalue 6228219999999999999
start with 622821
increment by 1
cache 20;
SELECT * FROM USER_BANKCARD;
INSERT INTO USER_BANKCARD VALUES(user_cardno_seq.nextval,'451111222233334444',123456,'Agricultural Bank of China',100000.0);
SELECT * FROM USER_BANKCARD where user_cardno = '6228210000000000000' AND user_password = 123456;

--user_cardno	user_accountno	user_password	user_cardtype	user_balance