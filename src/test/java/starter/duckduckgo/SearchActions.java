package starter.duckduckgo;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class SearchActions extends UIInteractions {
    @Step("Search for '{0}'")
    public void byKeyword(String keyword) {
        $("#searchbox_input").sendKeys(keyword);
        $("//button[@aria-label='Search']").click();
    }
}
