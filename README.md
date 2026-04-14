# Sistema de Média de Alunos

## 🧠 Como funciona
Este é um projeto simples em Java para registrar alunos, suas notas, calcular as médias e definir se foram aprovados ou reprovados.
---

# 🚀 Funcionalidades
- Cadastro de até 5 alunos
- Inserção de 3 notas por aluno
- Cálculo automático da média
- Exibição da situação:
  - ✅ Aprovado (média ≥ 7)
  - ❌ Reprovado (média < 7)
- Exibe o aluno com a maior média

---

# 🛠️ Tecnologias utilizadas
- Linguagem Java 17
- Lógica de programação

---

# Pilares obrigatórios para a criação do algoritmo

● Vetores: Utilizados para armazenar dados de forma dinâmica, já que a quantidade de alunos pode variar e é definida por quem está usando o programa.
  ○ Usamos vetores simples para guardar os nomes e as médias.
    
● Funções: Foi criada uma função chamada media(n1, n2, n3) que faz o cálculo da média aritmética. Isso ajuda a reaproveitar código e mantém o programa principal mais limpo.

● Laços de Repetição ``(while / for)``: Usados para percorrer a lista de alunos e também para fazer a validação dos dados (garantindo que as notas digitadas estejam sempre entre 0 e 10).

## ▶️ Como executar o projeto

### 📋 Pré-requisitos

Antes de começar, você precisa ter instalado:

### Java JDK 17 ou superior

Para verificar se está instalado, execute:

```bash
java -version
````
###Baixando o projeto

Clone o repositório:
```
git clone https://github.com/silvazZzZ/Exercicio-Algoritmos.git
cd Exercicio-Algoritmos
```
Ou baixe o ZIP diretamente pelo GitHub.

# 📊 Saída do programa
```Quantos alunos deseja cadastrar? (max 5): 2

Aluno 1
Nome: João
Nota 1: 7,5
Nota 2: 6,0
Nota 3: 8,0

Aluno 2
Nome: Maria
Nota 1: 5
Nota 2: 6
Nota 3: 5,5

--- RESULTADO ---

Nome: João
Notas: 7.5, 6.0, 8.0
Média: 7.166666666666667
Situação: Aprovado

Nome: Maria
Notas: 5.0, 6.0, 5.5
Média: 5.5
Situação: Reprovado

Maior média: João (7.166666666666667)
```
