package org.example.services.interfaces;

import org.example.data.interfaces.IStream;

import java.util.List;

public interface IStreamService {
    void sortByGroupCount(List<IStream> stream);
}
