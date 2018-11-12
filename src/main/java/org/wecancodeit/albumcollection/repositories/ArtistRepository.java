package org.wecancodeit.albumcollection.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.albumcollection.model.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
