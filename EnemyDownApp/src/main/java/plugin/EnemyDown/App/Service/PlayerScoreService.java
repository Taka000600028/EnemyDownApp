package plugin.EnemyDown.App.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plugin.EnemyDown.App.mapper.PlayerScoreMapper;
import plugin.EnemyDown.App.mapper.data.GameConfig;
import plugin.EnemyDown.App.mapper.data.PlayerScore;

@Service
public class PlayerScoreService {

  @Autowired
    private PlayerScoreMapper mapper;

  public List<PlayerScore> searchPlayerScore(){
    return mapper.selectPlayerScoreList();

  }
}


