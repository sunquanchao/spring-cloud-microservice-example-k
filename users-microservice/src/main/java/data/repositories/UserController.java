package data.repositories;

import data.domain.nodes.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RestController
@RequestMapping("/v1")
public UserController {
    @RequestMapping("/findByName")
    public List<User> findByName(@Param("0") String name){
        return new ArrayList<User>();
    }

}
