package printer;

public class ConsolePrinter implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        boolean noText = isEmpty(message.getText());
        boolean noSender = isEmpty(message.getSender());

        if (noText && noSender) {
            // Анонімний клас, що обробляє пусте повідомлення
            Printer emptyMessagePrinter = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            emptyMessagePrinter.print(message);
        } else if (noSender) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }
    private static boolean isEmpty(String value) {
        return value == null || value.isBlank();
    }
}