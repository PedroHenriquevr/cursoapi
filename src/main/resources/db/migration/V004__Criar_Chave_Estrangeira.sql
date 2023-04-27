ALTER TABLE Aluno add CONSTRAINT FK_Aluno_Curso foreign key(idcurso) references curso(idcurso);
ALTER TABLE Aluno add CONSTRAINT FK_Aluno_Cidade foreign key(idcidade) references cidade(idcidade);


insert into curso(nomecurso) values ('Administração');
insert into curso(nomecurso) values ('Marketing');
insert into curso(nomecurso) values ('Desenvolvimento de Sistemas');
insert into curso(nomecurso) values ('Quimica');
insert into curso(nomecurso) values ('Contabilidade');
insert into curso(nomecurso) values ('Logistica');
insert into curso(nomecurso) values ('Edificações');
insert into curso(nomecurso) values ('Farmacia');

insert into cidade(nomeCidade, uf) values ('Teresina', 'PI');
insert into cidade(nomeCidade, uf) values ('Campo Grande', 'MS');
insert into cidade(nomeCidade, uf) values ('Rio Branco', 'AC');
insert into cidade(nomeCidade, uf) values ('Fortaleza', 'CE');
insert into cidade(nomeCidade, uf) values ('São Paulo', 'SP');
insert into cidade(nomeCidade, uf) values ('Curitiba', 'PR');
insert into cidade(nomeCidade, uf) values ('Rio de Janeiro', 'RJ');
insert into cidade(nomeCidade, uf) values ('Lençóis Paulista', 'SP');


insert into Aluno(nomealuno, idCurso, idCidade) values ('Pedro', 4, 2);
insert into Aluno(nomealuno, idCurso, idCidade) values ('Matheus', 5, 3);
insert into Aluno(nomealuno, idCurso, idCidade) values ('Marcela', 8, 4);
insert into Aluno(nomealuno, idCurso, idCidade) values ('Carol', 1, 5);
insert into Aluno(nomealuno, idCurso, idCidade) values ('Richard', 2, 2);
insert into Aluno(nomealuno, idCurso, idCidade) values ('Vitor', 3, 6);
insert into Aluno(nomealuno, idCurso, idCidade) values ('Victor', 4, 8);
insert into Aluno(nomealuno, idCurso, idCidade) values ('Vinicius', 5, 7);


