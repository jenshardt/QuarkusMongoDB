package de.jenshardt.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import de.jenshardt.entity.Knight;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.panache.common.Sort;

@ApplicationScoped
public class KnightRepository implements PanacheMongoRepository<Knight>{

    public Knight findByName(String name){
        return find("name", name).firstResult();
    }

    public List<Knight> findOrderedByName(){
        return findAll(Sort.by("name")).list();
    }

}
