/*
Vehicle classından turetilmis, otobuse ait ozellikleri iceren bir class olusturulmalıdır.
Extend edilen classtan metotlar override edilmelidir
 */

public class Bus extends Vehicle{

    Route route = new Route();

    @Override
    public void CalculateFuelCost() {

        int AFirmasiGunlukGider = 57000 + 2 * (10 * route.ksefer3km);
        int BFirmasiGunlukGider = 37000 + (5 * route.ksefer3km) + (5 * route.ksefer4km);
        int CFirmasiGunlukGider = 25000 + (6 * route.ksefer4km) + 128000 + 2 * (25 * route.hsefer5km);
        int DFirmasiGunlukGider = 37000 + 2 * (3 * route.dsefer1km) + (3 * route.dsefer2km);
        int FFirmasiGunlukGider = 109000 + 2 * (20 * route.hsefer6km);

    }
}

