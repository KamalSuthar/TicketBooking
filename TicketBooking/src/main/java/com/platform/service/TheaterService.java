package com.platform.service;

import com.platform.entity.Theatre;
import com.platform.repository.TheaterRepo;
import com.platform.response.TheaterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TheaterService {

    @Autowired
    private TheaterRepo theaterRepo;

    public List<TheaterResponse> getTheatersByMovie(Integer movieId, String city, LocalDate date) {
        Optional<Theatre> response = theaterRepo.findById(movieId);
        List<TheaterResponse> list = new ArrayList<>();;
        return list;
        /*return theaters.stream().map(theater ->
                new TheaterResponse(
                        theater.getName(),
                        theater.getAddress(),
                        theater.getShow().stream()
                                .filter(show -> show.getMovieId().equals(movieId) && show.getShowDate().equals(date))
                                .map(Show::getShowTime)
                                .collect(Collectors.toList())
                )
        ).collect(Collectors.toList());

         */
    }


}
