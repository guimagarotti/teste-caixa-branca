## Análise de Código - Teste de Caixa Branca - ETAPA 2

## Extração dos Dados
<img src="/images/fluxo_dados.png">

## Grafo de Fluxo
  <p>Após a numeração dos pontos dentro do código, identificando pontos de entrada e saída de valores, foi realizada a identificação dos nodos, interligando os pontos com as devidas arestas.</p>

<img src="/images/grafo_via_paint_image.png">

## Cálculo da Complexidade Ciclomática V(G)
  <p>O Cálculo da Complexidade Ciclomática é uma métrica de software que quantifica a complexidade de um programa de computador com base na estrutura do seu fluxo de controle.</p>

```
29 arestas e 22 nós - V(G) = (arestas - nós) + 2

V(G) = (29 - 22) + 2
V(G) = 7 + 2 = 9
```

## Sequência e Quantidade da Base de Caminhos

### CAMINHO 1:
	
<p>1 -> 2 -> 3 -> 5 -> 6 -> 8</p>

### CAMINHO 2:

<p>1 -> 2  -> 3 -> 4 -> 5 -> 7 -> 8 -> 9 -> 10 -> 11 -> 1 -> 12 -> 13 -> 19</p>

### CAMINHO 3:

<p>1 -> 2 -> 3 -> 5 -> 7 -> 8 -> 9 -> 10 -> 11 -> 1 -> 12 -> 13 -> 19</p>

### CAMINHO 4:

<p>1 -> 2 -> 3 -> 4 -> 5 -> 7 -> 8 -> 9 -> 10 -> 11 -> 1 -> 12 -> 13 -> 14 -> 15 -> 16 -> 17 -> 18 -> 20 -> 21</p>

### CAMINHO 5:

<p>1 -> 2 -> 3 -> 4 -> 5 -> 7 -> 8 -> 9 -> 10 -> 11 -> 1 -> 12 -> 13 -> 14 -> 15 -> 16 -> 17 -> 18 -> 19 -> 21</p>

### CAMINHO 6:

<p>1 -> 2 -> 3 -> 4 -> 5 -> 7 -> 8 -> 9 -> 10 -> 11 -> 1 -> 12 -> 13 -> 14 -> 15 -> 17 -> 18 -> 20 -> 21</p>

### CAMINHO 7:

<p>1 -> 2 -> 3 -> 4 -> 5 -> 7 -> 8 -> 9 -> 10 -> 11 -> 1 -> 12 -> 13 -> 14 -> 15 -> 17 -> 18 -> 19 -> 21</p>

### CAMINHO 8:

<p>1 -> 2 -> 3 -> 4 -> 5 -> 7 -> 8 -> 9 -> 10 -> 11 -> 1 -> 12 -> 13 -> 18 -> 20 -> 21</p>

### CAMINHO 9:

<p>1 -> 2 -> 3 -> 4 -> 5 -> 7 -> 8 -> 9 -> 10 -> 11 -> 1 -> 12 -> 13 -> 18 -> 19 -> 21</p>
