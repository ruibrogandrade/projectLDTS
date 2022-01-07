# LPO0504 - Island Defense 

Este trabalho tem como objetivo a criação dum jogo com base na junção de dois conceitos distintos, o de um Tower Defender e o de uma Batalha Naval. Sendo assim, o jogo tem como objetivo destruir barcos inimigos que se aproximam de uma ilha. É usado o terminal Lanterna em Java para efeitos de desenvolvimento do projeto. 

## 1. Implemented Features

### 1.1 Features a Implementar

**Terminal do jogo** - Usando o screen do Lanterna em Java representamos o mapa do jogo. Este mapa é constituído por uma ilha randomizada, dependendo do nível de dificuldade, ou costumizadae, por barcos que se vão aproximando da ilha e por 'power-ups'. Todos estes elementos são apresentados como caracteres de terminal.

**Níveis de dificuldade** - Os níveis de dificuldade apresentados como fácil, médio ou difícil têm a ver com os tamanhos dos barcos que vão aparecendo no mapa, que aumentam quanto maior for o nível de dificuldade, e com o tamanho da ilha, que aumenta também com o aumento do nível de dificuldade.

**Movimento dos barcos** - Os barcos podem-se mover de duas maneiras diferentes, ou seguem a sua direção e avançam um espaço para a frente ou mudam a sua direção. Estes movimentos nunca podem ser no sentido de se afastarem da ilha. Os barcos movem-se logo a seguir ao jogador mandar um tiro. Cada um dos barcos tem movimentos independentes.

**Movimento da mira** - O jogador pode movimentar a mira com as setas do teclado de acordo com o alvo que deseja acertar. Assim a mira movimenta-se em qualquer sentido ortogonal, desde que este não passe dos limites do mapa.

**Power-ups** - Quando o jogador mira e manda um tiro num quadrado onde está um power-up, é acionado o power-up. Estes podem ser de diversos tipos, tiros mais poderosos ou ganhar tempo fazendo com que os barcos não se mexam durante alguns turnos.

**Modo infinito** - O modo infinito partilha as regras do modo normal, mas só acaba quando o jogador perder e vai aumento a dificuldade gradualmente.

**Leaderboards** - Para manter o jogo competitivo, o modo infinito tem uma leaderboard onde os jogadores podem ver as melhores pontuações e quem as obteve.

**Importe de mapas** - É possível o jogador iniciar um jogo com um mapa feito por si a partir dum ficheiro de texto.

**Leitura dos leaderboards** - No fim do modo infinito é lido o leaderboard a partir dum ficheiro de texto e, caso seja uma ronda que mereça estar no leaderboard, é escrito o nome do jogador e a pontuação para esse ficheiro de texto.



## 2. Game States

O Island Defense começa com o mapa ocupado por uma ilha e por um barco inimigo. Na ilha encontra-se o jogador cujo objetivo é não deixar os barcos chegarem à ilha.

### Modo Normal

No modo de jogo normal, o jogo termina quando todos os barcos previstos forem destruídos ou quando pelo menos um dos barcos consegue desembarcar na ilha. A ação do jogador que faz desenvolver os Game States é o tiro. Assim enquanto o jogador move a mira, os barcos inimigos não desenvolvem qualquer ação. Após o tiro acertar, num barco, água ou power-up, os barcos inimigos têm um turno para fazer um de dois movimentos permitidos, ou avançam um quadrado no sentido que se encontram ou mudam de direção. Estes dois movimentos têm como única condição serem todos no sentido de chegar à ilha, isto é, um barco que se encontr a ir em direção À ilha não pode mudar de direção no sentido de se afastar dela. Um barco inimigo desaparece quando todos os seus segmentos sofrem um tiro. O diagrama abaixo representa a lógica do jogo. 

![alt text](https://github.com/FEUP-LDTS-2021/ldts-project-assignment-g0504/blob/main/docs/GameStatesLPO.png?raw=true) 

Figura 1: Lógica de jogo em modo normal 


### Modo infinito

No modo de jogo infinito, o jogo termina quando pelo menos um dos barcos consegue desembarcar na ilha. Os restantes game states são iguais ao do modo normal. O diagrama abaixo representa a lógica do jogo. 

![alt text](https://github.com/FEUP-LDTS-2021/ldts-project-assignment-g0504/blob/main/docs/GameStatesLPOMI.png?raw=true) 

Figura 2: Lógica de jogo em modo infinito

## 3. Como jogar

**1.** 

**2.**

**3.**

**4.**

**5.**

