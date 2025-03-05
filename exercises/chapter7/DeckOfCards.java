package exercises.chapter7;

import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck; // array de objetos Card
    private int currentCard; // índice da próxima Card a ser distribuída (0-51)
    private static final int NUMBER_OF_CARDS = 52; // número constante de Cards
    // gerador de número aleatório
    private static final SecureRandom randomNumbers = new SecureRandom();

    // construtor preenche o baralho de cartas
    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; // cria array de objetos Card
        currentCard = 0; // a primeira Card distribuída será o deck[0]

        // preenche baralho com objeto Card
        for (int count = 0; count < deck.length; count++)
            // count % 13 resulta num valor entre 0 e 12 e count / 13 com valor entre 0 e 3
            // que são os índices do array faces e suits
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
    }

    // embaralha as cartas com um algoritmo de uma passagem
    public void shuffle() {
        // a próxima chamada para o método dealCard deve começar no deck [0] novamente
        currentCard = 0;

        // para cada Card, seleciona outra Card aleatória (0-51) e as compara
        for (int first = 0; first < deck.length; first++){
            // seleciona um número aleatório entre 0 e 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // compara Card atual com Card aleatóriamente selecionada
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    // distribui um Card
    public Card dealCard() {
        // determina se ainda há Cards a serem distribuídas
        if (currentCard < deck.length)
            return deck[currentCard++]; // retorna Card atual no array
        else
            return null; // retorna nulo para indicar que todos os Cards foram distribuídas
    }
}
