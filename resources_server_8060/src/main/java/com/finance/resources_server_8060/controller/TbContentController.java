//package com.finance.resources_server_8060.controller;
//
//import com.finance.www.utils.ResponseResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.lang.reflect.Member;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author ：邓一凡
// * @date ：Created in 2019/7/30 17:34
// * @description ：
// */
//@RestController
//public class TbContentController {
//
//
//
//    /**
//     * 获取全部资源
//     *
//     * @return
//     */
//    @GetMapping("/")
//    public ResponseResult<List<String>> selectAll() {
//        ArrayList<String> strings = new ArrayList<>();
//
//        strings.add("全部资源");
//        strings.add("资源");
//
//        return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), strings);
//    }
//
//    /**
//     * 获取资源详情
//     *
//     * @param id
//     * @return
//     */
//    @GetMapping("/view/{id}")
//    public ResponseResult<String> getById(@PathVariable Long id) {
//        return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), "VIVW 详情  ID "+id);
//    }
//
//    /**
//     * 新增资源
//     *
//     * @param
//     * @return
//     */
//    @PostMapping("/insert")
//    public ResponseResult<String> insert(@RequestBody String rec) {
//
//        if ("添加".equals(rec)) {
//            return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), rec);
//        } else {
//            return new ResponseResult<>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.toString());
//        }
//    }
//
//    /**
//     * 更新资源
//     *
//     * @param tbContent
//     * @return
//     */
//    @PutMapping("/update")
//    public ResponseResult<String> update(@RequestBody String tbContent) {
//
//
//        if ("更新".equals(tbContent)) {
//            return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), tbContent);
//        } else {
//            return new ResponseResult<>(Integer.valueOf(HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST.toString());
//        }
//    }
//
//    /**
//     * 删除资源
//     *
//     * @param id
//     * @return
//     */
//    @DeleteMapping("/delete/{id}")
//    public ResponseResult<String> delete(@PathVariable Long id) {
//
//        if (id > 0) {
//            return new ResponseResult<>(HttpStatus.OK.value(), HttpStatus.OK.toString(), id+"");
//        } else {
//            return new ResponseResult<>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.toString());
//        }
//    }
//}