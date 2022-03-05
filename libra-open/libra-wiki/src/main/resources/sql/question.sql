create table question
(
    id bigint primary key auto_increment comment '主键id',
    question_id int not null default 0 comment '题目id',
    stem varchar(1500) not null default '' comment '题干',
    type tinyint not null default 0 comment '题型',
    `explain` varchar(3000) not null default '' comment '题目解析',
    bank_id int not null default 0 comment '所属题库id',
    difficulty tinyint not null default 0 comment '难度，越大越难',
    `state` tinyint not null default 0 comment '题目状态 1-正常 2-异常 3-待更新',
    cuser bigint not null default 0 comment '创建人',
    ctime datetime not null default current_timestamp comment '创建时间',
    muser bigint not null default 0 comment '修改人',
    mtime datetime not null default current_timestamp comment '修改时间' on update current_timestamp,
    unique index (question_id)
) engine=InnoDB default charset=utf8mb4 comment '题目信息表';