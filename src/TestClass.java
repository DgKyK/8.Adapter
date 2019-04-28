public class TestClass {
    public static void main(String[] args) {
        Translator translator = new RuSmartHomeAssistant();
        translator.invitation();
        translator.parting();
        translator = new EnglishLenguageAdapter();
        translator.invitation();
        translator.parting();
    }
}
