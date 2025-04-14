package handler;

import logger.Logger;
import java.util.Arrays;
import java.util.List;

public class SeniorSupportHandler extends SupportHandler {
    private static final List<String> SUPPORTED_ISSUES = Arrays.asList("account_ban", "data_loss");

    @Override
    public void handle(String issue) {
        Logger.log("SeniorSupport", "Trying to handle: " + issue);
        if (SUPPORTED_ISSUES.contains(issue)) {
            System.out.println("[SeniorSupport] Handled " + issue);
        } else {
            System.out.println("[SeniorSupport] Cannot handle " + issue + " — escalate manually");
        }
    }
}