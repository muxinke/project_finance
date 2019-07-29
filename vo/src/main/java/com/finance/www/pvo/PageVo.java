package com.finance.www.pvo;

import com.finance.www.pojo.Produit;
import lombok.Data;

import java.util.List;

/**
 * Created by 杜碧天 on 2019/7/27.
 */
@Data
public class PageVo {
    private Integer total;
    private List<Produit> kk;
}
