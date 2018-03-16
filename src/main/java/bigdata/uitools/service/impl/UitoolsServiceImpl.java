package bigdata.uitools.service.impl;



import bigdata.uitools.dao.UitoolsMapper;
import bigdata.uitools.dto.UitoolsDTO;
import bigdata.uitools.service.UitoolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;
/**
 * Created by buck on 2018/03/16.
 * @author buck wang
 */
@Service("UitoolsService")
public class UitoolsServiceImpl implements UitoolsService {

    @Autowired
    UitoolsMapper uitoolsMapper;

    @Override
    public List<Map<String, String>> selectUitools(UitoolsDTO uitoolsDto) {

        List<Map<String,String>> resultList = uitoolsMapper.selectUitools(uitoolsDto);
        return resultList;
    }

    @Override
    public void deleteUitools(int[] idList) {
        uitoolsMapper.deleteUitools(idList);

    }
}
