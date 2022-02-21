# BEM VINDO AO MEU REPOSITÓRIO DO DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI

Estou participando da terceira etapa do processo de seleção para a Academia Capgemini 2022. Nesta etapa, foram formulados os seguintes desafios:

## Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:

Entrada:

n = 6

Saída:

         *
        **
       ***
      ****
     *****
    ******



____________________________________________

## Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

Exemplo:

Entrada:

Ya3

Saída:

3

Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

____________________________________________

## Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

Exemplo:

1) Exemplo 

Entrada:

ovo

Saída:

2

Explicação:

A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. 


2) Exemplo

Entrada:

ifailuhkqq

Saída:

3

Explicação:

A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].

____________________________________________

### Os algoritmos foram implementados dentro da pasta br.com/src/main.
### Os seus respectivos testes estão na pasta br.com/src/test.

#### Desafio 1

O algoritmo está no arquivo <a href="br.com/src/main/LadderGenerate.java" margin="0 20" borderRadius="10px">LadderGenerate.java</a>.

O respectivo teste está no arquivo <a href="br.com/src/test/LadderGenerateTest.java" margin="0 20" borderRadius="10px">LadderGenerateTest.java</a>.


____________________________________________

#### Desafio 2

O algoritmo está no arquivo <a href="br.com/src/main/CheckStrongPassword.java" margin="0 20" borderRadius="10px">CheckStrongPassword.java</a>.

O respectivo teste está no arquivo <a href="br.com/src/test/CheckStrongPasswordTest.java" margin="0 20" borderRadius="10px">CheckStrongPasswordTest.java</a>.

____________________________________________

#### Desafio 3

O algoritmo está no arquivo <a href="br.com/src/main/AnagramCount.java" margin="0 20" borderRadius="10px">AnagramCount.java</a>.

O respectivo teste está no arquivo <a href="br.com/src/test/AnagramPairCountTest.java" margin="0 20" borderRadius="10px">AnagramPairCountTest.java</a>.

____________________________________________

### Projeto realizado utilizando a IDE IntelliJ.
- _IntelliJ IDEA 2021.3.2 (Community Edition)_

- _Build #IC-213.6777.52, built on January 28, 2022_

- _Runtime version: 11.0.13+7-b1751.25 amd64 VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o._

- _Java versão 1.8.0_

- _Junit 5.8.1_

### Recomenda-se utilizar a IDE IntelliJ para executar os arquivos.
