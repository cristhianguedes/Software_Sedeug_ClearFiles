package br.com.sedeug.clearfiles;

import java.io.File;
import java.math.BigInteger;
import s.lib.TUtil;

/**
 @author Cristhian Guedes
 */
class FolderSize {

  private final File _folder;
  private final BigInteger _fileSize;

  FolderSize(File folder_, BigInteger fileSize_){
    _folder = folder_;
    _fileSize = fileSize_;
  }

  int compareTo(FolderSize o2__){
    return _fileSize.compareTo(o2__._fileSize);
  }

  String getAbsolutePath(){
    return _folder.getAbsolutePath();
  }

  String getFileSizeFormatted(){
    return TUtil.longToFileSize(_fileSize);
  }
}
