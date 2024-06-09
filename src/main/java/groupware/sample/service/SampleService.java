package groupware.sample.service;

import groupware.sample.service.vo.SampleDTO;
import groupware.sample.service.vo.SampleVO;

import java.util.List;

public interface SampleService {
    List<SampleVO> selectSampleList();
    SampleDTO selectSampleList2();
}
