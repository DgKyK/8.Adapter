public class EnglishLenguageAdapter implements Translator{
    private EnSmartHomeAssistant enSmartHomeAssistant;

    public EnglishLenguageAdapter(){
        enSmartHomeAssistant = new EnSmartHomeAssistant();
    }

    @Override
    public void invitation() {
        enSmartHomeAssistant.invitationOnEnglish();
    }

    @Override
    public void parting() {
        enSmartHomeAssistant.partingOnEnglish();
    }
}
