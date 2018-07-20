module Provider {
    requires static ServiceInterface;
    provides javax0.serviceinterface.ServiceInterface with javax0.serviceprovider.Provider, javax0.serviceprovider.Provider2;
}