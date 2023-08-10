package io.codelex.dateandtime.practice.DatePeriod;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public DatePeriod intersection(DatePeriod other) {
        LocalDate intersectionStart = this.start.isBefore(other.start) ? other.start : this.start;
        LocalDate intersectionEnd = this.end.isBefore(other.end) ? this.end : other.end;

        if (intersectionStart.isAfter(intersectionEnd)) {
            return null;
        }

        return new DatePeriod(intersectionStart, intersectionEnd);
    }
}