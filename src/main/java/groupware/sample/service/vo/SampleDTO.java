package groupware.sample.service.vo;

import groupware.com.service.vo.CommonVO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SampleDTO {
    SampleVO sampleVO;
    CommonVO commonVO;
    List<SampleVO> sampleVOList;
}
