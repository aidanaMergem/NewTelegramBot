import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class SimpleBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
      //  System.out.println(update.getMessage().getText());
       // System.out.println(update.getMessage().getFrom().getFirstName());

        String command = update.getMessage().getText();

        if(command.equals("/run")){
            String message = "This is Bot! HA HA HA";
            SendMessage response = new SendMessage();

            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);
            try {
                execute(response);
            }catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        // TODO
        return "DesignPatternsBot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "6077723719:AAEpT4ScSjfySSUM3Xd_VtsW-DXGlgOHxlg";
    }
}
