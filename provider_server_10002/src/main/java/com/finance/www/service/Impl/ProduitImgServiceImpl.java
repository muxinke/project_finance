package com.finance.www.service.Impl;

import com.finance.www.mapper.ProduitImgMapper;
import com.finance.www.pojo.ProduitImg;
import com.finance.www.pojo.ProduitImgExample;
import com.finance.www.service.ProduitImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/26.
 */
@Service
public class ProduitImgServiceImpl implements ProduitImgService{
    @Autowired
    ProduitImgMapper produitImgMapper;

    @Override
    public List<ProduitImg> chaProduitImgById(Integer pid) {
        ProduitImgExample produitImgExample = new ProduitImgExample();
        ProduitImgExample.Criteria criteria = produitImgExample.createCriteria();
        criteria.andProduitIdEqualTo(pid);
        List<ProduitImg> produitImgs = produitImgMapper.selectByExample(produitImgExample);
        return produitImgs;
    }
}
