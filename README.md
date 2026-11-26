# Sistema de Gestão Hospitalar — Java

Sistema desenvolvido em dupla para a disciplina de **Linguagem de Programação II** (3º período de Ciência da Computação — UEPB), com o objetivo de aplicar na prática os pilares da Programação Orientada a Objetos (POO) em Java.

## Sobre o Projeto

A aplicação modela o fluxo básico de atendimento de uma unidade hospitalar via console, permitindo o cadastro e a consulta de pacientes e profissionais de saúde, além do gerenciamento completo do ciclo de vida de consultas e exames (agendamento, realização e cancelamento).

## Arquitetura e Conceitos Aplicados

- **Herança e Classes Abstratas:** A classe abstrata `Profissional` concentra os atributos e comportamentos base, sendo estendida pelas subclasses `Medico` (com CRM e especialidade) e `Enfermeiro` (com COREN e setor).
- **Interfaces e Polimorfismo:** A interface `Agendavel` define o contrato para atendimentos (`agendar`, `realizar` e `cancelar`), implementado pelas classes `Consulta` e `Exame`.
- **Enums:** Uso de `Especialidade` e `StatusAtendimento` para garantir integridade e legibilidade nos estados e categorias do sistema.
- **Estruturas de Dados (Collections):** Utilização de `HashMap` na classe `SistemaHospital` para armazenamento e busca eficiente de pacientes e profissionais por código, e `ArrayList` para controle dos atendimentos.
- **Tratamento de Exceções:** Validação de regras de negócio e dados obrigatórios nos construtores e métodos de operação utilizando exceções.

## Estrutura das Classes

- `Profissional` *(abstrata)*, `Medico` e `Enfermeiro`
- `Paciente`
- `Agendavel` *(interface)*, `Consulta` e `Exame`
- `Especialidade` e `StatusAtendimento` *(enums)*
- `SistemaHospital` *(regras de negócio e gerenciamento)*
- `Main` *(ponto de entrada da aplicação)*

## Como Executar

1. Certifique-se de ter o **Java JDK** instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/lucaszheitor/sistema-hospitalar.git
   ```
3. Compile os arquivos `.java`:
   ```bash
   javac *.java
   ```
4. Execute a classe principal:
   ```bash
   java Main
   ```

## Autores:

**Lucas Heitor Lopes da Silva**  
**Andriele de Sousa Santos**

Estudantes de Ciência da Computação — UEPB  
[LinkedIn](https://www.linkedin.com/in/lucas-heitor006)
