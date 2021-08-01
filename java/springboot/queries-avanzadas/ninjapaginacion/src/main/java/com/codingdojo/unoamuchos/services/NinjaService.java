package com.codingdojo.unoamuchos.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingdojo.unoamuchos.models.Ninja;
import com.codingdojo.unoamuchos.repositories.NinjaRepository;

@Service
@Transactional
public class NinjaService {
    @Autowired 
    NinjaRepository ninjaRepo;
    //la variable estática establece el número de ninjas que queremos mostrar por página.
    private static final int PAGE_SIZE = 5;
    public Page<Ninja> ninjasPerPage(int pageNumber) {
        // Obtener todas las páginas de ninjas y clasificarlas en orden ascendente por apellido.
    	Pageable pageRequest = PageRequest.of(pageNumber, PAGE_SIZE, Sort.by("lastName").ascending());
        Page<Ninja> ninjas = ninjaRepo.findAll(pageRequest);
        return ninjaRepo.findAll(pageRequest);
    }
}

