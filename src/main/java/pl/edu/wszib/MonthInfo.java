package pl.edu.wszib;

import java.time.LocalDate;
import java.time.Period;

class MonthInfo {
    private LocalDate firstDay;
    private LocalDate lastDay;
    private Period noDaysInMonth;

    public MonthInfo(LocalDate firstDay, LocalDate lastDay, Period noDaysInMonth) {
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.noDaysInMonth = noDaysInMonth;
    }

    public LocalDate getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(LocalDate firstDay) {
        this.firstDay = firstDay;
    }

    public LocalDate getLastDay() {
        return lastDay;
    }

    public void setLastDay(LocalDate lastDay) {
        this.lastDay = lastDay;
    }

    public Period getNoDaysInMonth() {
        return noDaysInMonth;
    }

    public void setNoDaysInMonth(Period noDaysInMonth) {
        this.noDaysInMonth = noDaysInMonth;
    }
}
