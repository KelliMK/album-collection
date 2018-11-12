package org.wecancodeit.albumcollection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.albumcollection.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {

}
