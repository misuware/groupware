package groupware.sample.service.mapper;

import groupware.sample.service.vo.SampleVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {
    public List<SampleVO> selectSampleList();
}
