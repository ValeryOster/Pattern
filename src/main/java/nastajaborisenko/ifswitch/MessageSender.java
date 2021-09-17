package nastajaborisenko.ifswitch;

public class MessageSender {

    private static final int TYPE_PERSONAL = 0;
    private static final int TYPE_BUSINESS = 1;
    private static final int TYPE_APOLOGY = 1;

    private void sendEmail() {
//        int emailTemplateCode = MessageSenderUtil.getTemplateCodeFromDB();
//        String emailTemplateAsString = MessageType.getTemplateByCode(emailTemplateCode).getMailTemplate().getTemplate();
//        System.out.println(emailTemplateAsString);
//        //Old solution
////        if (emailTemplateCode == TYPE_PERSONAL) {
////            emailTemplateAsString = getPersonalTemplateMessage();
////        }
//
//        MessageSenderUtil.sendMessage(emailTemplateAsString);
    }

    private String getPersonalTemplateMessage() {
        return "That is personal";
    }

    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender();
        messageSender.sendEmail();

    }
}
