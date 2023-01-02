package java.QALesson.component;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ComponentCalendar {

    public void setDate(String day, String month, String year) {
        // Выбор даты месяц
        $(".react-datepicker__month-select").selectOption(month);
        // Выбор даты год
        $(".react-datepicker__year-select").selectOption(year);
        // Выбор даты дата
        $$(".react-datepicker__day:not(.react-datepicker__day--outside-month)").findBy(text(day)).click();
    }
}
