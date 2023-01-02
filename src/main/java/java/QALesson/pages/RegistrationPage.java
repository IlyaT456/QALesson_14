package java.QALesson.pages;


import java.QALesson.component.ComponentCalendar;
import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    ComponentCalendar componentСalendar = new ComponentCalendar();

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        $("#lastName").setValue(value);
        return this;
    }

    public RegistrationPage setEmall(String value) {
        $("#userEmail").setValue(value);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        componentСalendar.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSex(String sex) {
        $x("//*[text() = '" + sex + "']").click();
        return this;
    }

    public RegistrationPage setUserNumber(String number) {
        $("#userNumber").setValue(number);
        return this;
    }

    public RegistrationPage subjectsInput(String value) {
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage uploadPicture(String path) {
        $("#uploadPicture").uploadFile(new File(path));
        return this;
    }

    public RegistrationPage setHobby(String hobby) {
        $x("//*[text() = '" + hobby + "']").click();
        return this;
    }

    public RegistrationPage setCurrentAddress(String value) {
        $("#currentAddress").setValue(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        $("#state").scrollIntoView(true).click();
        $x("//*[text() = '" + value + "']").scrollIntoView(true).click();
        return this;
    }

    public RegistrationPage setСity(String value) {
        $("#city").scrollIntoView(true).click();
        $x("//*[text() = '" + value + "']").scrollIntoView(true).click();
        return this;
    }

    public RegistrationPage submit() {
        $("#submit").submit();
        return this;
    }
}





