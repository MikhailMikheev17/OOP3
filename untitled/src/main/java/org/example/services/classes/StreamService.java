package org.example.services.classes;

import org.example.data.interfaces.IStream;
import org.example.services.interfaces.IStreamService;

import java.util.Collections;
import java.util.List;

public class StreamService implements IStreamService {
    @Override
    public void sortByGroupCount(List<IStream> stream){
        StreamComparator comparator = new StreamComparator();
        Collections.sort(stream, comparator);
    }
}
