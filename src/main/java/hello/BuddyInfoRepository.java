package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "buddyInfo", path = "buddyInfo")

    public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {

        List<BuddyInfo> findByName(String lastName);
    }
