package org.wecancodeit.albumcollection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.albumcollection.model.Song;

public interface SongRepository extends CrudRepository<Song, Long> {

}
