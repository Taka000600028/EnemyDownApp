package plugin.EnemyDown.App.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import plugin.EnemyDown.App.mapper.data.GameConfig;
import plugin.EnemyDown.App.mapper.data.PlayerScore;
import plugin.EnemyDown.App.mapper.data.SpawnEnemy;

@Mapper
public interface PlayerScoreMapper {
  @Select("select * from player_score order by id asc")
  List<PlayerScore> selectPlayerScoreList();

  }
