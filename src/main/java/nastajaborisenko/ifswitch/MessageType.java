package nastajaborisenko.ifswitch;

public enum MessageType {
    PEROSSONAL(0, PersonalMailTemplate.class), BUSSINES(1,BussinesMailTemplate.class);
    private int typeCode;
    private Class<? extends MailTemplate> mailTemplate;
    MessageType(int i, Class<? extends MailTemplate> bussinesMailTemplate) {
        this.typeCode = i;
        this.mailTemplate = bussinesMailTemplate;
    }

    public static MessageType getTemplateByCode(int code) {
        for (MessageType type : MessageType.values()) {
            if (type.typeCode == code) {
                return type;
            }
        }
        return null;
    }

    public MailTemplate getMailTemplate() throws IllegalAccessException, InstantiationException {
        return mailTemplate.newInstance();
    }
}
