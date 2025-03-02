package com.platform.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class TheaterResponse {
    private String movieId;
    private String movieName;
    private String cityName;
    private LocalDate showDate;
    private List<ShowResponse> showResponseList;
}
