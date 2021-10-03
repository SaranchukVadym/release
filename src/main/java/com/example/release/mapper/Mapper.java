package com.example.release.mapper;

import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class Mapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public <T, V> T convertTo(V v, Class destination) {
        if (v != null) {
            return (T) modelMapper.map(v, destination);
        }
        return null;
    }

}