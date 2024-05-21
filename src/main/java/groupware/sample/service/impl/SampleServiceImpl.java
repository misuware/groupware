package groupware.sample.service.impl;

import groupware.sample.service.mapper.SampleMapper;
import groupware.sample.service.SampleService;
import groupware.sample.service.vo.SampleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService {

    private final SampleMapper sampleMapper;

    @Autowired
    public SampleServiceImpl(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }
    @Override
    public List<SampleVO> selectSampleList() {
        return sampleMapper.selectSampleList();
    }
}
