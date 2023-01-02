package java.QALesson;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebTest extends BaseTest {

    @Step("Открытие главной")
    public void openMainPage() {
        open("https://github.com/");
    }

    @Step("Ищем репозиторий {repo}")
    public void searchRepo(String repo){
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repo);
        $(".header-search-input").submit();
    }

    @Step("Кликаем по сылки репозитория {repo}")
    public void clikOnRepositoryLink(String repo){
        $(linkText(repo)).click();
    }


    @Step("Открываем таб Issues")
    public void openIssuesTab(){
        $("#issues-tab").click();
    }

    @Step("Проверяем наличие текста to issues!")
    public void shouldSeeIssues(String Issues){
        $(withText(Issues)).should(Condition.exist);
    }


}
