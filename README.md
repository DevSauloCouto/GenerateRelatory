# Manipulando Arquivos e Pastas com Java

### Descrição

- Este exercício foi proposto no curso do Nélio Alves com o objetivo de fixar o conhecimento sobre trabalhar com arquivos e diretórios com a linguagem Java.

Resolvi este desafio utilizando meus conhecimentos em POO e os novos conhecimentos adquiridos sobre leitura e escrita de arquivos.

Fiz o uso de classes do Java que nos auxiliam no processo de leitura e escrita de arquivos como: File; FileReader; BufferedReader; FileWriter; BufferedWriter;

Trabalhei também com a abstração das entidades como Produto e Relatório, o que tornou o processo de construção da solução bastante versátil e idiomático, permitindo quaisquer alterações futuras sob demanda.

Separei as responsabilidades de leitura, escrita e geração de relatório para um diretório de saída em Classes diferentes, buscando obter uma alta coesão na solução do exercício.

O programa faz a leitura do arquivo `.csv` localizado no diretório que é passado como argumento no construtor da Classe ReaderService.
Esse arquivo contém informações de vendas de produtos com os campos `nome`, `preço`, `quantidade`. 

O Objetivo do exercício é fazer a leitura desse arquivo e gerar como output em um subdiretório chamado `out` um arquivo `summary.csv` com informações do `nome do produto` e `valor total`.

