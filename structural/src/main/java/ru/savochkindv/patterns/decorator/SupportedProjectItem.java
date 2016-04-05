package ru.savochkindv.patterns.decorator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * "Декорирует" класс Projectltem и сохраняет ссылку на коллекцию ArrayList вспомогательных
 * документов-файловых объектов, представляющих дополнительную информацию или ресурсы
 *
 * @author savochkindv
 *         Date: 05.04.2016.
 */
public class SupportedProjectItem extends ProjectDecorator {

    /**
     * Вспомогательные документы
     */
    private List<File> supportingDocuments = new ArrayList<>();

    public SupportedProjectItem() {
    }

    public SupportedProjectItem(File supportingDocument) {
        addSupportingDocument(supportingDocument);
    }

    public List<File> getSupportingDocuments() {
        return supportingDocuments;
    }

    public void addSupportingDocument(File supportingDocument) {
        if (!supportingDocuments.contains(supportingDocument)) {
            supportingDocuments.add(supportingDocument);
        }
    }

    public void removeSupportingDocument(File supportingDocument) {
        supportingDocuments.remove(supportingDocument);
    }

    @Override
    public String toString() {
        return getProjectItem().toString() + EOL_STRING + "\tSupporting Documents: " + supportingDocuments;
    }
}
