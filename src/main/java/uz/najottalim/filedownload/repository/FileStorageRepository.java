package uz.najottalim.filedownload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.najottalim.filedownload.domain.FileStorage;
import uz.najottalim.filedownload.domain.FileStorageStatus;

import java.io.File;
import java.util.List;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {

    FileStorage findByHashId(String hashId);

    List<FileStorage> findAllByFileStorageStatus(FileStorageStatus fileStorageStatus);
}
