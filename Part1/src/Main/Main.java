package Main;

import handler.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();

        faq.setNext(junior).setNext(senior);

        List<String> issues = List.of(
                "password_reset",
                "refund_request",
                "account_ban",
                "unknown_bug"
        )
                ;
        
        for (String issue : issues) {
            System.out.println("\n--- Handling issue: " + issue + " ---");
            faq.handle(issue);
        }
    }
}
