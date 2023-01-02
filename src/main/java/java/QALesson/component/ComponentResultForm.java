package java.QALesson.component;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$x;

public class ComponentResultForm {

    private final String TITLE_TEXT = "Thanks for submitting the form";

    public ComponentResultForm checkTable() {
        $x("//*[. = '"+ TITLE_TEXT +"']").should(exist);
        return this;
    }

    public ComponentResultForm checkResult(String valueOne, String valueTwo) {
        $x("//td[.='" + valueOne + "']/following-sibling::td").shouldHave(Condition.text(valueTwo));
        return this;
    }
}
