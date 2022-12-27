package occ;

public class Message implements EndingMessage{
    @Override
    public void ending_message() {
        System.out.println("\nHave a nice day.");
    }
}