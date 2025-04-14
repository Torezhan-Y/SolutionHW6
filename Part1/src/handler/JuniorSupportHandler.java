package handler;

import logger.Logger;
import java.util.Arrays;
import java.util.List;

public class JuniorSupportHandler extends SupportHandler {
    private static final List<String> SUPPORTED_ISSUES = Arrays.asList("refund_request", "billing_issue");

    @Override
    public void handle(String issue) {
        Logger.log("JuniorSupport", "Trying to handle: " + issue);
        if (SUPPORTED_ISSUES.contains(issue)) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Cannot handle " + issue + " — escalate manually");
        }
    }
}