package violet.video.common.mapper;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;
import violet.video.common.pojo.User;

import java.util.List;

@Repository
public interface UserMapper extends Neo4jRepository<User, Long> {
    @Query("match(n:user{name:{0}})return n")
    List<User> getUserByName(String name);

    @Query("match(a:user{name:{0}}),(b:user{name:{1}})create(a)-[:follow]->(b)")
    void createFollow(String sender, String receiver);

    @Query("match(:user{name:{0}})-[:follow]->(user)return user")
    List<User> getFollowersList(String name);
}
