package plugin.EnemyDown.App.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import plugin.EnemyDown.App.Service.PlayerScoreService;
import plugin.EnemyDown.App.mapper.data.PlayerScore;

@RestController
public class PlayerScoreController {

  @Autowired
  private PlayerScoreService service;

  @RequestMapping(value = "/playerScoreList", method = RequestMethod.GET)
  public List<PlayerScore> playerScoreList() {
   return service.searchPlayerScore();
  }
}
