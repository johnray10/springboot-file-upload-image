package com.net.springbootfileuploadimage.services;

import com.net.springbootfileuploadimage.models.ImgGallery;
import com.net.springbootfileuploadimage.repository.ImgGalleryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImgGalleryService {
    @Autowired
    private ImgGalleryDao imgGalleryDao;

    public void saveImage(ImgGallery imgGallery) {
        imgGalleryDao.save(imgGallery);
    }

    public List<ImgGallery> getAllActiveImages() {
        return imgGalleryDao.findAll();
    }

    public Optional<ImgGallery> getImageById(Long id) {
        return imgGalleryDao.findById(id);
    }
}
