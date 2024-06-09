package groupware.sample.service.vo;

import groupware.com.service.vo.CommonVO;
import lombok.Data;
import lombok.Getter;

@Data
public class SampleVO extends CommonVO {
    private int sampleId;
    private String sampleNm;
}
