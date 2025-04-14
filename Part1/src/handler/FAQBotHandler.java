package handler;

import logger.Logger;

import java.util.Arrays;
import java.util.List;

public class FAQBotHandler extends SupportHandler {
    private static final List<String> SUPPORTED_ISSUES = Arrays.asList("password_reset");

    @Override
    public void handle(String issue) {
        Logger.log("FAQBot", "Trying to handle: " + issue);
        if (SUPPORTED_ISSUES.contains(issue)) {
            System.out.println("[FAQBot] Handled " + issue);
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle " + issue + " — escalate manually");
        }
    }
}