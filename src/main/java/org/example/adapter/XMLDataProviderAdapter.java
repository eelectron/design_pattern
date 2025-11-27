package org.example.adapter;

public class XMLDataProviderAdapter implements Report{
    private final XMLDataProvider xmlDataProvider;
    public XMLDataProviderAdapter(XMLDataProvider xmlDataProvider){
        this.xmlDataProvider = xmlDataProvider;
    }

    @Override
    public String getJsonData(String data) {
        return this.xmlDataProvider.getXMLData(data);
    }
}
