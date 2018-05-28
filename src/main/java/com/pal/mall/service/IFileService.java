package com.pal.mall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by pal
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
