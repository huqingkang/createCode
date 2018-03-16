package bigdata.uitools.service;

import bigdata.uitools.dto.UitoolsDTO;

import java.util.List;
import java.util.Map;

/**
 * Created by buck on 2018/03/16.
 * @author buck wang
 */
public interface UitoolsService {
    /**
     * 查询列表
     * @param uitoolsDto
     * @return
     */
    public List<Map<String,String>> selectUitools(UitoolsDTO uitoolsDto);
    /**
     * 删除模板数据
     * @param idList
     */
    public void deleteUitools(int[] idList);
}
