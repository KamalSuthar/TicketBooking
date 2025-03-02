package com.platform.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class ShowResponse {
    private int showId;
    private String showName;
    private LocalDate showDate;
    private LocalTime showTime;
}
