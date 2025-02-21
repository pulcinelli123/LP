![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(("Inicio")) --> input1[\Digite sua nota - valor de 0 a 100\]
      input1 --> input2[\Digite sua nota em frequencia %\]
      input2 --> verification{Nota >=50 \n E \n Frequencia >= 75}
      verification --> |Sim| output1[/Aprovado/]
      verification --> |Não| output2[/Reprovado/]
      output1 -->finish([Final])
      output2 -->finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      A((inicio)) --> B[\Digite N1\]
      B --> C[\Digite N2\]
      C --> D[Resultado = N1 + N2]
      D --> E[/Resultado/] 
      E --> F([Final])
      
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
       start(("Inicio")) --> input[\Digite um número\]
      input --> verification{Número >=0}
      verification --> |Sim| output1[/Positivo/]
      verification --> |Nao| output2[/Negativo/]
      output1 --> fim([Final])
      output2 --> fim
      
      
      
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      A((inicio)) --> B[\Digite sua idade\]
      B --> C{Se o número >=16 \n E \n título de eleitor válido}
      C --> |Nao| D[/Não pode votar/]
      C --> |Sim| E[/Pode votar/]
      E --> F([Final])
      D --> F
      
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input1[\Digite o primeiro número\]
    input1 --> input2[\Digite o segundo número\]
    input2 --> comparison{Primeiro número > Segundo número?}
    comparison --> |Sim| output1[/Primeiro número é maior!/]
    comparison --> |Não| comparison2{Primeiro número < Segundo número?}
    comparison2 --> |Sim| output2[/Segundo número é maior!/]
    comparison2 --> |Não| output3[/Os dois números são iguais!/]
    output1 --> finish([ Fim ])
    output2 --> finish
    output3 --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
       start(( Início )) --> input1[\Digite o primeiro número\]
    input1 --> input2[\Digite o segundo número\]
    input2 --> input3[\Digite o terceiro número\]
    input3 --> comparison1{Primeiro número > Segundo número?}
    comparison1 --> |Sim| comparison2{Primeiro número > Terceiro número?}
    comparison2 --> |Sim| output1[/Primeiro número é o maior!/]
    comparison2 --> |Não| output2[/Terceiro número é o maior!/]
    comparison1 --> |Não| comparison3{Segundo número > Terceiro número?}
    comparison3 --> |Sim| output3[/Segundo número é o maior!/]
    comparison3 --> |Não| output4[/Terceiro número é o maior!/]
    output1 --> finish([ Fim ])
    output2 --> finish
    output3 --> finish
    output4 --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
   
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
     start(( Início )) --> input[\Digite um número inteiro\]
   input --> check{O número % 2 == 0?}
   check --> |Sim| output1[/O número é par!/]
   check --> |Não| output2[/O número é ímpar!/]
   output1 --> finish([ Fim ])
   output2 --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
   
   ```