package hello;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "addressBook", path = "addressBook.json")
public interface AddressBookRepository extends CrudRepository<AddressBook, Integer> {


    //List<AddressBook> findById(Integer id);
}
