package com.hbgc.agricultureserver.service.imp;

import com.hbgc.agricultureserver.domain.RealTimeData;
import com.hbgc.agricultureserver.repository.RealTimeDataRepository;
import com.hbgc.agricultureserver.service.RealTimeDataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealTimeDataServiceImp extends BaseServiceImpl<RealTimeData,Integer, RealTimeDataRepository> implements RealTimeDataService {
    @Override
    public List<RealTimeData> findData(String company, String area) {
        return super.dao.findAllByCompanyAndArea(company,area);
    }
}
