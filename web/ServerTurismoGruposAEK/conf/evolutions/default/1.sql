# --- First database schema

# --- !Ups

create table canton (
  id                            bigserial not null,
  nomcanton                     varchar(255),
  constraint pk_canton primary key (id)
);


create table categoria (
  id                            bigserial not null,
  name                          varchar(255),
  constraint pk_categoria primary key (id)
);

create table lugar (
  id                            bigserial not null,
  nomlugar                      varchar(255),
  acontecimiento                varchar(255),
  mes                           varchar(255),
  canton_id                     bigint,
  constraint pk_lugar primary key (id)
);


create table parroquia (
  id                            bigserial not null,
  name                          varchar(255),
  canton_id                     bigint,
  constraint pk_parroquia primary key (id)
);

create table subcategoria (
  id                            bigserial not null,
  name                          varchar(255),
  categoria_id                  bigint,
  constraint pk_subcategoria primary key (id)
);

create table turismo (
  id                            bigserial not null,
  name                          varchar(255),
  description                   text,
  direccion                     text,
  foto                          varchar(255),
  categoria_id                  bigint,
  subcategoria_id               bigint,
  canton_id                     bigint,
  parroquia_id                  bigint,
  constraint pk_turismo primary key (id)
);

alter table lugar add constraint fk_lugar_canton_id foreign key (canton_id) references canton (id) on delete restrict on update restrict;
create index ix_lugar_canton_id on lugar (canton_id);

alter table parroquia add constraint fk_parroquia_canton_id foreign key (canton_id) references canton (id) on delete restrict on update restrict;
create index ix_parroquia_canton_id on parroquia (canton_id);

alter table subcategoria add constraint fk_subcategoria_categoria_id foreign key (categoria_id) references categoria (id) on delete restrict on update restrict;
create index ix_subcategoria_categoria_id on subcategoria (categoria_id);

alter table turismo add constraint fk_turismo_categoria_id foreign key (categoria_id) references categoria (id) on delete restrict on update restrict;
create index ix_turismo_categoria_id on turismo (categoria_id);

alter table turismo add constraint fk_turismo_subcategoria_id foreign key (subcategoria_id) references subcategoria (id) on delete restrict on update restrict;
create index ix_turismo_subcategoria_id on turismo (subcategoria_id);

alter table turismo add constraint fk_turismo_canton_id foreign key (canton_id) references canton (id) on delete restrict on update restrict;
create index ix_turismo_canton_id on turismo (canton_id);

alter table turismo add constraint fk_turismo_parroquia_id foreign key (parroquia_id) references parroquia (id) on delete restrict on update restrict;
create index ix_turismo_parroquia_id on turismo (parroquia_id);


# --- !Downs

alter table if exists lugar drop constraint if exists fk_lugar_canton_id;
drop index if exists ix_lugar_canton_id;

alter table if exists parroquia drop constraint if exists fk_parroquia_canton_id;
drop index if exists ix_parroquia_canton_id;

alter table if exists subcategoria drop constraint if exists fk_subcategoria_categoria_id;
drop index if exists ix_subcategoria_categoria_id;

alter table if exists turismo drop constraint if exists fk_turismo_categoria_id;
drop index if exists ix_turismo_categoria_id;

alter table if exists turismo drop constraint if exists fk_turismo_subcategoria_id;
drop index if exists ix_turismo_subcategoria_id;

alter table if exists turismo drop constraint if exists fk_turismo_canton_id;
drop index if exists ix_turismo_canton_id;

alter table if exists turismo drop constraint if exists fk_turismo_parroquia_id;
drop index if exists ix_turismo_parroquia_id;

drop table if exists canton cascade;

drop table if exists categoria cascade;

drop table if exists lugar cascade;

drop table if exists parroquia cascade;

drop table if exists subcategoria cascade;

drop table if exists turismo cascade;

