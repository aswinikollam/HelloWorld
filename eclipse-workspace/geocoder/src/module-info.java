public static String getAddressFromLatLng(Context context, LatLng latLng) {
    Geocoder geocoder;
    List<Address> addresses;
    geocoder = new Geocoder(context, Locale.getDefault());
    try {
        addresses = geocoder.getFromLocation(latLng.latitude, latLng.longitude, 1);
        return addresses.get(0).getAddressLine(0);
    } catch (Exception e) {
        e.printStackTrace();
        return "";
    }
}