package printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();

        printer.print(new ConsolePrinter.Message("Привіт!", "Марія"));
        printer.print(new ConsolePrinter.Message("Як справи?", null));
        printer.print(new ConsolePrinter.Message("Добрий день", ""));
        printer.print(new ConsolePrinter.Message(null, null));
    }
}