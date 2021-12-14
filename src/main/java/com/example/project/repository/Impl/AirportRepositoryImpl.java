package com.example.project.repository.Impl;

import com.example.project.dataobject.Airport;
import com.example.project.repository.AirportRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AirportRepositoryImpl implements AirportRepository {
    @Override
    public <S extends Airport> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Airport> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Airport> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Airport> findAll() {
        return null;
    }

    @Override
    public Iterable<Airport> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Airport entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Airport> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
