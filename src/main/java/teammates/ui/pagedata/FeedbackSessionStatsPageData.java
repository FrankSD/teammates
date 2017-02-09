package teammates.ui.pagedata;

import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.common.datatransfer.FeedbackSessionDetailsBundle;

public class FeedbackSessionStatsPageData extends PageData {
    public FeedbackSessionDetailsBundle sessionDetails;
    
    public FeedbackSessionStatsPageData(AccountAttributes account) {
        super(account);
    }
}
