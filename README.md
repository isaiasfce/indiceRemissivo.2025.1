# ATIVIDADE FINAL DA DISCIPLINA "N692 - ESTRUTURA DE DADOS"

# AUTORES:
- Rafael Angelo Pinheiro Do Vale;
- Amanda Costa Silva;
- Isaias Do Amaral Sousa;
- Lucas Gabriel Vasconcelos;
- Paulo Henrique de Sousa Gomes;
- Pedro Yuri Rodrigues Nunes.

> JUSTIFICATIVA DO PROJETO

Muitas aplicações necessitam de um relatório de referências cruzadas. Por exemplo, a maioria dos livros apresenta um índice remissivo, que é uma lista alfabética de palavras-chave ou palavras relevantes do texto, com a indicação dos locais no texto onde cada palavra-chave ocorre. Para ilustrar, considere um arquivo contendo o seguinte texto:

“Good programming is not learned from generalities, but by seeing how significant programs can be made clean, easy to read, easy to maintain and modify,
human-engineered, efficient, and reliable, by the application of common sense and
by the use of good programming practices.”
 Assumindo que o índice remissivo seja constituído pelas palavras-chave:
programming, programs, easy, by, human-engineered, and, be, to
O programa para criação do índice deve produzir a seguinte saída:

Note que a lista de palavras-chave está em ordem alfabética. Adjacente a cada palavra, há uma lista de números representando as linhas em que a palavra ocorre no texto.
Uma estrutura de dados desse tipo é conhecida como arquivo invertido, que é um mecanismo amplamente utilizado em sistemas de busca textual, como os motores de busca na Web. Ele permite localizar rapidamente todas as ocorrências de uma palavra em um conjunto de documentos, sendo essencial para a eficiência e eficácia de buscas em grandes volumes de texto.

> OBJETIVO DA PROPOSTA DA ATIVIDADE

1. Desenvolver as Habilidades do aluno em Estruturas de Dados Avançadas, ele aprenderá a implementar e manipular estruturas de dados complexas, o que é essencial para a criação de algoritmos eficientes e de alta performance.
2. Desenvolver a aplicação Prática de Algoritmos de Busca e Indexação, habilidades que são altamente valorizadas no mercado de trabalho, especialmente em áreas como desenvolvimento de software, análise de dados e sistemas de busca.

> DESCRIÇÃO DA ENTREGA DO PROJETO

O objetivo deste projeto é desenvolver um programa para produzir um índice remissivo a partir de um texto e das palavras-chave fornecidas. O programa deve seguir os seguintes passos:

1. Ler um texto de tamanho arbitrário;
2. Processar as palavras do texto para armazená-las, juntamente com suas ocorrências (linhas do texto), nas estruturas de dados apropriadas;
3. Após as estruturas de dados estarem devidamente preenchidas com as palavras e suas ocorrências no texto, o programa deve ler um número arbitrário de palavras-chave que formarão o índice remissivo;
4. Gerar o índice remissivo.

Implemente um método eficiente para verificar se uma palavra lida do texto pertence ou não ao índice. **Para resolver esse problema, devem ser utilizadas as seguintes estruturas de dados principais:**
- **Tabela de Dispersão (Hash);**
- **Listas encadeadas.**

> PASSO A PASSO PARA DESENVOLVIMENTO DA ATIVIDADE

• 1. Criar uma classe para as palavras, que terá dois atributos: a palavra (string) e a lista das ocorrências dessa palavra no texto (Lista Encadeada);

• 2. Criar uma Tabela Hash, na qual a chave será a primeira letra da palavra; ou seja, cada compartimento da Hash armazenará palavras que começam com a mesma letra;

• 3. Em cada compartimento da Tabela Hash, deverá haver uma Lista Encadeada, cujos elementos armazenados serão da classe palavra;

• 4. O código deve percorrer todo o texto e armazenar todas as palavras na estrutura. Caso a palavra não exista, ela será criada, e o índice (número da linha) será acrescentado à lista encadeada da classe palavra. Caso a palavra exista, a nova ocorrência da palavra será adicionada à sua lista;

• 5. Por fim, o código deve ler o arquivo .txt com as palavras-chave, fazer a busca na estrutura desenvolvida e retornar um arquivo .txt de saída com o índice remissivo.

• O código fonte do projeto será submetido a uma ferramenta de verificação de plágio;

• Qualquer tentativa de copiar o projeto de outro aluno, da Internet ou de qualquer outra fonte, resultará na atribuição de nota ZERO;

• A originalidade e a autoria do código são fundamentais. Mesmo pequenos trechos de código copiados sem a devida atribuição serão considerados fraude;

• Essas estratégias visam garantir que o projeto seja desenvolvido de forma correta e ética, promovendo a aprendizagem e a integridade acadêmica.

• Todas as dúvidas acerca dos requisitos do projeto devem ser direcionadas ao professor. Utilizar os fóruns de discussão no AVA (Moodle) para obter esclarecimentos necessários.
