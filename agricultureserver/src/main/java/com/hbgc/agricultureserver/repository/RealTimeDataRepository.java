package com.hbgc.agricultureserver.repository;

import com.hbgc.agricultureserver.domain.RealTimeData;

import java.util.List;

public interface RealTimeDataRepository extends BaseRepository<RealTimeData,Integer> {
    List<RealTimeData> findAllByCompanyAndArea(String company,String area);
}
