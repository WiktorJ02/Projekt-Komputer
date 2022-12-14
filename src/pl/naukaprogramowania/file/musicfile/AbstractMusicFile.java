package pl.naukaprogramowania.file.musicfile;

import pl.naukaprogramowania.file.AbstractFile;
import pl.naukaprogramowania.file.FileType;
import pl.naukaprogramowania.file.imagefile.AbstractImageFile;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
   protected String bandName;
   protected String title;

    protected AbstractMusicFile(String name , int size, String bandName, String title){
        super(name, size);

        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}
