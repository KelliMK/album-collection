package org.wecancodeit.albumcollection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.albumcollection.model.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {

}
