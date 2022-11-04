package com.project.petclinic.services.map;

import com.project.petclinic.model.Owner;
import com.project.petclinic.model.Pet;
import com.project.petclinic.model.Vet;
import com.project.petclinic.services.CrudService;
import com.project.petclinic.services.VetService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements
    VetService {

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);
  }

  @Override
  public Vet save(Vet object) {
    return super.save(object.getId(), object);
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }

}
