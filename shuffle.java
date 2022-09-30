class Deck{
    public static void main(String[] args) {
        String[] suit= {"Clubs","Diamonds","Hearts","Spades"};
        String[] rank= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int suitLeng=suit.length;
        int rankLeng=rank.length;

        String[] deck=new String[suitLeng*rankLeng];
        //create deck
        for(int i=0;i<rankLeng;i++){
            for(int j=0;j<suitLeng;j++){
                deck[suitLeng*i+j]=rank[i]+" of "+suit[j];
            }
        }

        //shuffle deck
        for(int i=0;i<suitLeng*rankLeng;i++){
            int n=(int)(i+Math.random()*(suitLeng*rankLeng-i));
            String tmp=deck[i];
            deck[i]=deck[n];
            deck[n]=tmp;
        }

        //print shuffled deck
        for(int i=0;i<suitLeng*rankLeng;i++){
            System.out.println(deck[i]);
        }
    }
}
