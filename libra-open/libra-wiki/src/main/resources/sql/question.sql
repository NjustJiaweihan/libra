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
    `version` int not null default 0 comment '版本',
    ctime datetime not null default current_timestamp comment '创建时间',
    mtime datetime not null default current_timestamp comment '修改时间' on update current_timestamp,
    deleted tinyint not null default 0 comment '删除标志',
    unique index uix_question(question_id)
) engine=InnoDB default charset=utf8mb4 comment '题目信息表';

create table question_relation
(
    id bigint primary key auto_increment comment '主键id',
    question_id int not null default 0 comment '题目id',
    relation_id int not null default 0 comment '属性id',
    relation_type tinyint not null default 0 comment '属性类型',
    relation_value varchar(100) not null default '' comment '属性值id或者知识点id',
    ctime datetime not null default current_timestamp comment '创建时间',
    mtime datetime not null default current_timestamp comment '修改时间' on update current_timestamp,
    deleted tinyint not null default 0 comment '删除标志',
    unique index uix_question_property(question_id, relation_id, relation_type)
) engine=InnoDB default charset=utf8mb4 comment '题目关联属性表';

create table question_option
(
    id bigint primary key auto_increment comment '选项id',
    `option` varchar(400) not null default '' comment '选项内容',
    `right` tinyint not null default 0 comment '是正确答案么？0-不是，1-是',
    symbol char(1) not null default '' comment '选项标记，也是排序标记。 A|B|C|D|E|F|G',
    question_id int not null default 0 comment '所属题目id',
    ctime datetime not null default current_timestamp comment '创建时间',
    mtime datetime not null default current_timestamp comment '修改时间' on update current_timestamp,
    deleted tinyint not null default 0 comment '删除标志',
    unique index uix_question_item(question_id, symbol asc)
) engine=InnoDB default charset=utf8mb4 comment '题目选项表';

create table question_opt_log
(
    id bigint primary key auto_increment comment '选项id',
    question_id int not null default 0 comment '题目id',
    opt_type tinyint not null default 0 comment '操作类型',
    opt_content varchar(256) not null default '' comment '操作内容',
    opt_user varchar(128) not null default '' comment '操作人',
    opt_time datetime not null default current_timestamp comment '操作时间',
    ctime datetime not null default current_timestamp comment '创建时间',
    mtime datetime not null default current_timestamp comment '修改时间' on update current_timestamp,
    unique index uix_question_opt_log(question_id, opt_type)
) engine=InnoDB default charset=utf8mb4 comment '题目操作记录表';