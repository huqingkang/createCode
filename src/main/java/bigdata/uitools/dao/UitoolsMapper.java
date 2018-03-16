package bigdata.uitools.dao;

import bigdata.uitools.dto.UitoolsDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
/**
 * Created by buck on 2018/03/16.
 * @author buck wang
 */
@Mapper
public interface UitoolsMapper {
    /**
     * 获取流程信息
     *
     * @param uitoolsDto 流程集合
     * @return 流程信息集合
     */

    public List<Map<String, String>> selectUitools(@Param("uitools") UitoolsDTO uitoolsDto);

    /**
     * 删除模板数据
     * @param idList
     */
    public void deleteUitools(int[] idList);
}
