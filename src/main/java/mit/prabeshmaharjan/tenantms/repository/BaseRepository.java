package mit.prabeshmaharjan.tenantms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mit.prabeshmaharjan.tenantms.entity.Base;

public interface BaseRepository<E extends Base> extends JpaRepository<E, Long> {
}
