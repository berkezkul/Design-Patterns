public class DecoratorMain {

    public static void main(String[] args) {
        // Hem Facebook hem de WhatsApp bildirimini kullanarak gönderim yapar
        INotifier notifyAll = new FacebookNotifierDecorator(
                new WhatsappNotifierDecorator(
                        new Notifier("Yemeksepeti")
                )
        );
        notifyAll.send("Rate and Share Comment!!!");

        System.out.println("=================================");

        // Sadece Facebook bildirimi ile gönderim yapar
        INotifier notifyFbMail = new FacebookNotifierDecorator(new Notifier("Yemeksepeti"));
        notifyFbMail.send("Rate and Share Comment!!!");
    }
}
