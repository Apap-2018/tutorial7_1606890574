package com.apap.tutorial7.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
    FlightModel addFlight(FlightModel flight);
    Optional<FlightModel> getFlightDetailById(long id);
    void deleteByFlightNumber(String flightNumber);
    void deleteFlight(FlightModel flight);
    void updateFlight(long id, FlightModel flight);
    Optional<FlightModel> getFlightDetailByFlightNumber(String flightNumber);
    List<FlightModel> getAll();
}