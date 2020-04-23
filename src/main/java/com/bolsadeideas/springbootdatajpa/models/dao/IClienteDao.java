package com.bolsadeideas.springbootdatajpa.models.dao;

import com.bolsadeideas.springbootdatajpa.models.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

}
