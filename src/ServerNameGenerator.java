public class ServerNameGenerator {
    public static void main(String[] args) {
    String [] nouns = {"car","house","bicycle","dog","cat","bird","pen","rat","pat","mat"};
    String [] adjectives = {"engine","roof","pedals","bark","meow","flys","writes","bites","chats","pat"};
        System.out.println("Here is your server name:");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));



    }
    public static String randomElement(String [] word){
        return word[(int)(Math.random()*(word.length - 1))];

    }
}


