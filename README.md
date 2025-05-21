# Simulador de Conta Bancária (Java Console)

Este é um projeto simples em Java que simula operações básicas de uma conta bancária por meio do terminal. O usuário pode consultar o saldo, receber depósitos, realizar transferências e encerrar o programa.

## Funcionalidades

- Exibe dados iniciais do cliente (nome, tipo de conta e saldo).
- Menu interativo com as opções:
  - Consultar saldo
  - Receber valor (depósito)
  - Transferir valor
  - Sair do sistema
- Validação de entrada para garantir que os valores sejam positivos e que a transferência não exceda o saldo disponível.

## 📌 Exemplo de Uso

```
###########################
Dados iniciais do Cliente: 

Nome: Vitória Canon
Tipo de Conta: Corrente
Saldo Inicial: R$ 2200.00
###########################

Operações:
1 - Consultar saldo
2 - Receber valor
3 - Transferir valor
4 - Sair
Digite a opção desejada: 1
Seu saldo é de: R$ 2200.00
```

## Tecnologias Utilizadas

- Java 8 ou superior
- IDE recomendada: IntelliJ IDEA, Eclipse ou VSCode com extensão Java

## Como Executar

1. Clone este repositório:
   ```
   git clone https://github.com/seu-usuario/simulador-conta-bancaria-java.git
   ```

2. Abra o projeto em sua IDE Java favorita.

3. Compile e execute o arquivo Main.java.

Ou, se preferir usar o terminal:

```
javac Main.java
java Main
```
