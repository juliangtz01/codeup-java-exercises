import java.util.Random;

public class ServerNameGenerator
{
    public static void main(String[] args)
    {
        String[] adjectives = new String[10];
        String[] nouns = new String[10];

        adjectives[0] = "adorable";
        adjectives[1] = "adventurous";
        adjectives[2] = "aggressive";
        adjectives[3] = "ashamed";
        adjectives[4] = "attractive";
        adjectives[5] = "average";
        adjectives[6] = "awful";
        adjectives[7] = "bad";
        adjectives[8] = "beautiful";
        adjectives[9] = "better";

        nouns[0] = "Indiana";
        nouns[1] = "California";
        nouns[2] = "Utah";
        nouns[3] = "Texas";
        nouns[4] = "Florida";
        nouns[5] = "Mississippi";
        nouns[6] = "Arizona";
        nouns[7] = "Illinois";
        nouns[8] = "Massachusetts";
        nouns[9] = "Wyoming";

        System.out.printf("%s - %s%n",randomNoun(nouns), randomAdj(adjectives) );


    }

    public static String randomAdj(String[] adj)
    {
        Random random = new Random();
        int randNum = random.nextInt(9);

        return adj[randNum];
    }

    public static String randomNoun(String[] noun)
    {
        Random random = new Random();
        int randNum = random.nextInt(9);

        return noun[randNum];
    }


}
