# language: pt
     @run
     Funcionalidade: Pesquisa com o QA
                     Como um recrutador
                     Quero colher dados da pesquisa
                     Para fazer análises mais detalhadas do QA

     Esquema do Cenario:Preencher pesquisa com dados obrigatórios válidos

                Dado que eu acesse a página da VV Test
                E acesse o menu  Pesquisa - QA
                Quando eu preencher todos os campos obrigatórios <nome> e <sobreNome> e <email> e <confirmaEmail> e <telefone> e <liguagem> e <planoCarreira>
                Então deve ser direcionado para uma página de sucesso

       Exemplos:
         | nome      |sobreNome |email                |confirmaEmail        |telefone         |liguagem  |planoCarreira                                    |
         | "ricardo" |"Oliveira"|"ricardo@hotmail.com"|"ricardo@hotmail.com"|"(11)22222222222"|"java "   |"cursar pós graduação de engenharia de software."|
