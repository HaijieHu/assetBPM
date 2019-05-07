package com.asset.service;


import com.asset.utils.PageGrids;

/**
 * @author hjhu
 */
public interface OrganizationService {


    /**
     *
     * @param pageNum
     * @param pageSize
     * @return PageGrids
     */
    PageGrids getOrganizationList(Integer pageNum, Integer pageSize);
}
