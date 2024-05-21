package groupware.sample.service;

import groupware.sample.service.vo.SampleVO;

import java.util.List;

public interface SampleService {
    List<SampleVO> selectSampleList();
}
