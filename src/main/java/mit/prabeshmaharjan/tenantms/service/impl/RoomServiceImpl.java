package mit.prabeshmaharjan.tenantms.service.impl;

import org.springframework.stereotype.Service;

import mit.prabeshmaharjan.tenantms.entity.Room;
import mit.prabeshmaharjan.tenantms.repository.RoomRepository;
import mit.prabeshmaharjan.tenantms.service.RoomService;

@Service
public class RoomServiceImpl extends BaseServiceImpl<Room> implements RoomService {

  public RoomServiceImpl(RoomRepository repository) {
    super(repository);
  }
  
}
