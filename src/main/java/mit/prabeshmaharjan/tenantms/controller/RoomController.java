package mit.prabeshmaharjan.tenantms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mit.prabeshmaharjan.tenantms.entity.Room;
import mit.prabeshmaharjan.tenantms.service.RoomService;

@RestController
@RequestMapping(RoomController.BASE_API)
public class RoomController extends BaseController<Room> {

  public static final String BASE_API = "/room";

  public RoomController(RoomService service) {
    super(service);
  }
  
}
