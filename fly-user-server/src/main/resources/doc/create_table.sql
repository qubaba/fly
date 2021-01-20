/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2021/1/20 16:08:18                           */
/*==============================================================*/


drop table if exists sys_account;

drop table if exists sys_company;

drop index idx_dept_no on sys_dept;

drop table if exists sys_dept;

drop table if exists sys_job;

drop table if exists sys_menu;

drop table if exists sys_role;

drop table if exists sys_role_menu_ref;

drop table if exists sys_user;

drop table if exists sys_user_office_ref;

/*==============================================================*/
/* Table: sys_account                                           */
/*==============================================================*/
create table sys_account
(
   account_id           bigint not null,
   account              varchar(32) not null comment '账号',
   password             varchar(128) not null comment '密码',
   is_expired           tinyint not null comment '是否过期 1是 0否',
   is_delete            tinyint not null comment '是否删除 1是 0否',
   is_invalid           tinyint not null comment '是否无效 1是 0否',
   is_locked            tinyint not null comment '是否锁定 1是 0否',
   gmt_create           datetime not null comment '创建时间',
   gmt_modified         datetime not null comment '最后修改时间',
   create_user_id       bigint not null comment '创建用户',
   modified_user_id     bigint not null comment '最后修改用户',
   primary key (account_id)
);

alter table sys_account comment '系统账户表';

/*==============================================================*/
/* Table: sys_company                                           */
/*==============================================================*/
create table sys_company
(
   company_id           bigint not null,
   company_name         varchar(255) not null comment '公司名称',
   primary key (company_id)
);

alter table sys_company comment '公司信息表';

/*==============================================================*/
/* Table: sys_dept                                              */
/*==============================================================*/
create table sys_dept
(
   dept_id              bigint not null comment '主键',
   dept_name            varchar(255) not null comment '部门名称',
   dept_no              bigint not null comment '部门编号',
   dept_leader          bigint comment '组织负责人',
   status               tinyint not null comment '部门状态 0停用 1启用',
   p_dept_id            bigint comment '上级部门',
   company_id           bigint not null comment '所属公司',
   gmt_create           datetime not null comment '创建时间',
   create_user_id       bigint not null comment '创建用户',
   gmt_modified         datetime not null comment '最后修改时间',
   modified_user_id     bigint not null comment '最后修改用户',
   is_delete            tinyint not null comment '是否删除'
);

alter table sys_dept comment '部门信息表';

/*==============================================================*/
/* Index: idx_dept_no                                           */
/*==============================================================*/
create index idx_dept_no on sys_dept
(
   dept_no
);

/*==============================================================*/
/* Table: sys_job                                               */
/*==============================================================*/
create table sys_job
(
   job_id               bigint not null comment '职务id',
   job_name             varchar(255) not null comment '职务名称',
   company_id           bigint not null comment '所属公司',
   gmt_create           datetime not null comment '创建时间',
   create_user          bigint not null comment '创建用户',
   gmt_modified         datetime not null comment '修改时间',
   modified_user        bigint not null comment '最后修改用户',
   is_available         tinyint not null comment '是否可用 0 不可用 1 可用',
   is_delete            tinyint not null comment '是否删除',
   primary key (job_id)
);

/*==============================================================*/
/* Table: sys_menu                                              */
/*==============================================================*/
create table sys_menu
(
   menu_id              bigint not null comment '菜单id',
   menu_name            varchar(128) not null comment '菜单名称',
   url                  varchar(255) not null comment '菜单url',
   service_name         varchar(255) not null comment '服务名称',
   sort                 tinyint not null comment '菜单顺序',
   type                 tinyint not null comment '菜单类型 10菜单 20目录',
   is_available         tinyint not null comment '是否可用 0 不可用 1 可用',
   icon                 varchar(64) comment '小图标',
   is_delete            tinyint not null comment '是否删除',
   gmt_create           datetime not null comment '创建时间',
   create_user          bigint not null comment '创建用户',
   gmt_modified         datetime not null comment '修改时间',
   modified_user        bigint not null comment '最后修改用户',
   primary key (menu_id)
);

alter table sys_menu comment '系统菜单表';

/*==============================================================*/
/* Table: sys_role                                              */
/*==============================================================*/
create table sys_role
(
   role_id              bigint not null comment '主键',
   role_name            varchar(128) not null comment '角色名称',
   is_available         tinyint not null comment '是否可用 0 不可用 1可用',
   company_id           bigint not null comment '所属公司',
   dept_id              bigint not null comment '所属部门',
   data_status          tinyint not null comment '数据状态 10仅自己 11本部门 12本公司 13总公司内全部可见',
   menu_auth            tinyint not null comment '1添加 2修改 4删除 8查详情 四个值相加为权限',
   gmt_create           datetime not null comment '创建时间',
   create_user          bigint not null comment '创建用户',
   gmt_modified         datetime not null comment '最后修改时间',
   modified             bigint not null comment '最后修改用户',
   is_delete            tinyint not null comment '是否删除',
   primary key (role_id)
);

alter table sys_role comment '系统角色表';

/*==============================================================*/
/* Table: sys_role_menu_ref                                     */
/*==============================================================*/
create table sys_role_menu_ref
(
   role_id              bigint not null comment '角色id',
   menu_id              bigint not null comment '菜单id',
   gmt_create           datetime not null comment '创建时间',
   create_user          bigint not null comment '创建人',
   primary key (role_id, menu_id)
);

alter table sys_role_menu_ref comment '角色菜单表';

/*==============================================================*/
/* Table: sys_user                                              */
/*==============================================================*/
create table sys_user
(
   user_id              bigint not null comment '主键',
   account              bigint not null comment '账户id',
   username             varchar(32) not null comment '姓名',
   sex                  tinyint comment '性别 0女 1男',
   job_number           varchar(32) comment '工号',
   age                  tinyint comment '年龄',
   company_id           bigint not null comment '所属公司',
   gmt_create           datetime not null comment '创建时间',
   create_user_id       bigint not null comment '创建用户id',
   gmt_modified         datetime not null comment '最后修改时间',
   modified_user_id     bigint not null comment '最后修改用户id',
   is_delete            tinyint not null comment '是否删除',
   primary key (user_id)
);

alter table sys_user comment '用户信息表';

/*==============================================================*/
/* Table: sys_user_office_ref                                   */
/*==============================================================*/
create table sys_user_company_ref
(
    user_id          bigint   not null comment '用户id',
    company_id       bigint   not null comment '组织id',
    dept_id          bigint   not null comment '部门id',
    job_id           bigint   not null comment '职务id',
    gmt_create       datetime not null comment '创建时间',
    create_user_id   bigint   not null comment '创建用户',
    gmt_modified     datetime not null comment '最后修改时间',
    modified_user_id bigint   not null comment '最后修改用户',
    is_delete        tinyint  not null comment '是否删除',
    primary key (user_id, company_id, dept_id, job_id)
);

alter table sys_user_company_ref
    comment '用户公司表';

