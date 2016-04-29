package student.application.lhu_companion_2;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    public static MapsActivity newInstance() {
        MapsActivity fragment = new MapsActivity();
        return fragment;
    }

    public MapsActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_maps, container, false);

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        return rootView;
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    private static final LatLng LHU = new LatLng(41.141465, -77.462347);
    private static final LatLng AKEL = new LatLng(41.142051, -77.463862);
    private static final LatLng ROB = new LatLng(41.141582, -77.463582);
    private static final LatLng RAUB = new LatLng(41.141457, -77.462922);
    private static final LatLng THOMANN = new LatLng(41.142317, -77.462988);
    private static final LatLng THOMFIELD = new LatLng(41.142614, -77.462981);
    private static final LatLng ZIMM = new LatLng(41.143319, -77.463480);
    private static final LatLng ROGERS = new LatLng(41.141852, -77.463267);
    private static final LatLng HIMES = new LatLng(41.142542, -77.462288);
    private static final LatLng STEVENSON = new LatLng(41.141629, -77.462277);
    private static final LatLng HONORS = new LatLng(41.143035, -77.461789);
    private static final LatLng HURSH = new LatLng(41.143144, -77.461113);
    private static final LatLng DURRWACT = new LatLng(41.142441, -77.461258);
    private static final LatLng NORTH = new LatLng(41.140767, -77.463053);
    private static final LatLng MAC = new LatLng(41.140225, -77.464767);
    private static final LatLng PRICE = new LatLng(41.140189, -77.462128);
    private static final LatLng GLENNON = new LatLng(41.139805, -77.462713);
    private static final LatLng SULLIVAN = new LatLng(41.140520, -77.461270);
    private static final LatLng BENTLEY = new LatLng(41.139958, -77.461061);
    private static final LatLng SLOAN = new LatLng(41.139506, -77.460401);
    private static final LatLng ULMER = new LatLng(41.141300, -77.460648);
    private static final LatLng PUB = new LatLng(41.141268, -77.459983);
    private static final LatLng CV = new LatLng(41.139293, -77.456663);
    private static final LatLng EASTC1 = new LatLng(41.138816, -77.453470);
    private static final LatLng EASTC2 = new LatLng(41.138239, -77.452882);
    private static final LatLng REC = new LatLng(41.139492, -77.458341);
    private static final LatLng ARTANN = new LatLng(41.139059, -77.457644);
    private static final LatLng WILLIS = new LatLng(41.137831, -77.456442);
    private static final LatLng SMITH = new LatLng(41.140455, -77.460268);
    private static final LatLng WOOL = new LatLng(41.139817, -77.459718);
    private static final LatLng FAIRVIEW1 = new LatLng(41.138932, -77.459098);
    private static final LatLng FAIRVIEW2 = new LatLng(41.138384, -77.458861);
    private static final LatLng FAIRVIEW3 = new LatLng(41.137852, -77.458354);
    private static final LatLng cvpark = new LatLng(41.138901, -77.456314);
    private static final LatLng commlot1 = new LatLng(41.140843, -77.459584);
    private static final LatLng commlot2 = new LatLng(41.140569, -77.459324);
    private static final LatLng commlot3 = new LatLng(41.140192, -77.458946);
    private static final LatLng woollot = new LatLng(41.139537, -77.459580);
    private static final LatLng sloanlot = new LatLng(41.139078, -77.460324);
    private static final LatLng courtyard1 = new LatLng(41.141282, -77.461713);
    private static final LatLng courtyard2 = new LatLng(41.140870, -77.461628);
    private static final LatLng circlestop = new LatLng(41.142489, -77.463495);
    private static final LatLng circlestopm = new LatLng(41.142436, -77.463481);
    private static final LatLng akelparking = new LatLng(41.142164, -77.464249);
    private static final LatLng tfparking = new LatLng(41.142475, -77.463745);
    private static final LatLng willisparking = new LatLng(41.138160, -77.457276);
    private static final LatLng redparking = new LatLng(41.138597, -77.457839);
    private static final LatLng commuter1 = new LatLng(41.143991, -77.463832);
    private static final LatLng commuter2 = new LatLng(41.144761, -77.464404);
    private static final LatLng eaststop = new LatLng(41.138834, -77.454251);








    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //if (ContextCompat.checkSelfPermission(android.Manifest.permission.ACCESS_FINE_LOCATION) ==
        //        PackageManager.PERMISSION_GRANTED &&
        //        ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) ==
        //                PackageManager.PERMISSION_GRANTED) {
        //    googleMap.setMyLocationEnabled(true);
        //    googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        //} else {

        //}


        // Add a marker in Sydney and move the camera

        mMap.setMyLocationEnabled(true);


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LHU, 17));



        mMap.addMarker(new MarkerOptions()
                        .position(AKEL)
                        .title("Akeley")
                        .snippet("Classrooms, Computer Science & Business")
                        .alpha(0)

        );
        //mMap.setOnPolygonClickListener();

        Polygon Akely = (mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.142407, -77.463905), new LatLng(41.142366, -77.463659), new LatLng(41.141919, -77.463792), new LatLng(41.141967, -77.464039))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        ));

        mMap.addMarker(new MarkerOptions()
                        .position(ROB)
                        .title("Robinson Learning Center")
                        .snippet("Classrooms, Computer Center, Hall of Flags")
                        .alpha(0)

        );

        Polygon Robinson = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.141869, -77.463612), new LatLng(41.141821, -77.463791), new LatLng(41.141679, -77.463714), new LatLng(41.141624, -77.463816),
                                new LatLng(41.141537, -77.463794), new LatLng(41.141482, -77.463705), new LatLng(41.141467, -77.463610), new LatLng(41.141481, -77.463572)
                                , new LatLng(41.141554, -77.463511), new LatLng(41.141483, -77.463300), new LatLng(41.141631, -77.463258), new LatLng(41.141695, -77.463448)
                                , new LatLng(41.141790, -77.463556), new LatLng(41.141878, -77.463606))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(RAUB)
                        .title("Raub | 88")
                        .snippet("Classrooms, Mountain Serve")
                        .alpha(0)

        );

        Polygon Raub = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.141643, -77.463191), new LatLng(41.141573, -77.462738), new LatLng(41.141371, -77.462795), new LatLng(41.141361, -77.462759),
                                new LatLng(41.141145, -77.462853), new LatLng(41.141186, -77.463024), new LatLng(41.141404, -77.462930), new LatLng(41.141393, -77.462877),
                                new LatLng(41.141437, -77.462863), new LatLng(41.141497, -77.463230))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(ROGERS)
                        .title("Rogers | 45")
                        .snippet("Gymnasium, Weight Room")
                        .alpha(0)

        );


        Polygon Rodgers = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.141796, -77.463406), new LatLng(41.142086, -77.463328), new LatLng(41.142077, -77.463272), new LatLng(41.142104, -77.463264),
                                new LatLng(41.142101, -77.463211), new LatLng(41.142092, -77.463135), new LatLng(41.142080, -77.463136), new LatLng(41.142076, -77.463111),
                                new LatLng(41.142048, -77.463120), new LatLng(41.142042, -77.463094), new LatLng(41.141762, -77.463171))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(THOMANN)
                        .title("Thomas Annex | 42")
                        .snippet("Athletics, Coaches Offices")
                        .alpha(0)

        );

        Polygon ThomasAnnex = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.142418, -77.463117), new LatLng(41.142384, -77.462902), new LatLng(41.142483, -77.462875), new LatLng(41.142517, -77.463087))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(THOMFIELD)
                        .title("Thomas Fieldhouse | 46")
                        .snippet("Athletics, Main Gym")
                        .alpha(0)

        );

        Polygon ThomasFH = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.142514, -77.462612), new LatLng(41.142591, -77.463406), new LatLng(41.142921, -77.463359), new LatLng(41.142869, -77.462759),
                                new LatLng(41.142920, -77.462751), new LatLng(41.142904, -77.462555), new LatLng(41.142863, -77.462561), new LatLng(41.142858, -77.462448),
                                new LatLng(41.142836, -77.462412), new LatLng(41.142551, -77.462455), new LatLng(41.142565, -77.462603))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(HIMES)
                        .title("Himes Hall")
                        .snippet("")
                        .alpha(0)

        );

        Polygon Himes = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.142777, -77.462363), new LatLng(41.142537, -77.462407), new LatLng(41.142518, -77.462225), new LatLng(41.142762, -77.462181))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(ZIMM)
                        .title("Zimmerli | 65")
                        .snippet("Classrooms, Gym, Pool, Sauna")
                        .alpha(0)

        );

        Polygon Zimmerli = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.143116, -77.463893), new LatLng(41.143577, -77.463858), new LatLng(41.143567, -77.463581), new LatLng(41.143807, -77.463547),
                                new LatLng(41.143784, -77.463141), new LatLng(41.143514, -77.463169), new LatLng(41.143515, -77.463205)
                                , new LatLng(41.143131, -77.463225), new LatLng(41.143132, -77.463278), new LatLng(41.143076, -77.463286))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(STEVENSON)
                        .title("Stevenson Library")
                        .snippet("")
                        .alpha(0)

        );

        Polygon Stevenson = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.141950, -77.462401), new LatLng(41.141947, -77.462371), new LatLng(41.141993, -77.462358), new LatLng(41.141978, -77.462281),
                                new LatLng(41.141961, -77.462285), new LatLng(41.141905, -77.461956), new LatLng(41.141924, -77.461952), new LatLng(41.141912, -77.461879),
                                new LatLng(41.141880, -77.461889), new LatLng(41.141878, -77.461878), new LatLng(41.141865, -77.461882), new LatLng(41.141860, -77.461861),
                                new LatLng(41.141691, -77.461911), new LatLng(41.141693, -77.461931), new LatLng(41.141683, -77.461935), new LatLng(41.141708, -77.462098),
                                new LatLng(41.141471, -77.462177), new LatLng(41.141472, -77.462193), new LatLng(41.141453, -77.462201), new LatLng(41.141502, -77.462495),
                                new LatLng(41.141518, -77.462490), new LatLng(41.141521, -77.462506), new LatLng(41.141530, -77.462505), new LatLng(41.141534, -77.462526),
                                new LatLng(41.141592, -77.462511), new LatLng(41.141596, -77.462535), new LatLng(41.141650, -77.462520), new LatLng(41.141647, -77.462495))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(HONORS)
                        .title("Honors Center | 30")
                        .snippet("")
                        .alpha(0)

        );

        Polygon Honors = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.143192, -77.461709), new LatLng(41.143115, -77.461899), new LatLng(41.143023, -77.461836), new LatLng(41.143100, -77.461645))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(HURSH)
                        .title("Hursh Nevel | 26")
                        .snippet("Mailroom, Duplicating, Receiving")
                        .alpha(0)

        );

        Polygon Hursh = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.143278, -77.461546), new LatLng(41.143464, -77.461128), new LatLng(41.143151, -77.460876), new LatLng(41.142961, -77.461294),
                                new LatLng(41.143112, -77.461415), new LatLng(41.143193, -77.461246), new LatLng(41.143250, -77.461291)
                                , new LatLng(41.143177, -77.461465))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(DURRWACT)
                        .title("Durrwachter Alumni Conference Center")
                        .snippet("Admissions, Alumni")
                        .alpha(0)

        );

        Polygon Durrwachter = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.142599, -77.461529), new LatLng(41.142707, -77.461320), new LatLng(41.142682, -77.461297), new LatLng(41.142717, -77.461233),
                                new LatLng(41.142669, -77.461184), new LatLng(41.142689, -77.461143), new LatLng(41.142543, -77.460997)
                                , new LatLng(41.142517, -77.461048), new LatLng(41.142481, -77.461014), new LatLng(41.142440, -77.461095)
                                , new LatLng(41.142405, -77.461063), new LatLng(41.142342, -77.461192), new LatLng(41.142429, -77.461278)
                                , new LatLng(41.142401, -77.461340))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(NORTH)
                        .title("North Hall")
                        .snippet("Residence Hall")
                        .alpha(0)

        );

        Polygon North = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.140874, -77.462985), new LatLng(41.140943, -77.463425), new LatLng(41.140820, -77.463457), new LatLng(41.140772, -77.463143),
                                new LatLng(41.140734, -77.463151), new LatLng(41.140669, -77.462722), new LatLng(41.140788, -77.462692)
                                , new LatLng(41.140838, -77.462990))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(MAC)
                        .title("MacEntire")
                        .snippet("Residence Hall")
                        .alpha(0)

        );

        Polygon mac = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.140354, -77.464465), new LatLng(41.140364, -77.465169), new LatLng(41.140251, -77.465177), new LatLng(41.140243, -77.465016),
                                new LatLng(41.140182, -77.465011), new LatLng(41.140174, -77.464298), new LatLng(41.140290, -77.464306)
                                , new LatLng(41.140302, -77.464452))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(PRICE)
                        .title("Price Performance Center | 20")
                        .snippet("Auditorium")
                        .alpha(0)

        );

        Polygon price = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.140500, -77.461936), new LatLng(41.140334, -77.461797), new LatLng(41.140043, -77.462344), new LatLng(41.140213, -77.462489))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(GLENNON)
                        .title("Glennon Health Services")
                        .snippet("Infirmary/Public Safety")
                        .alpha(0)

        );

        Polygon glennon = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.140039, -77.462623), new LatLng(41.139968, -77.462505), new LatLng(41.139716, -77.462768), new LatLng(41.139795, -77.462899),
                                new LatLng(41.139852, -77.462845), new LatLng(41.139859, -77.462859), new LatLng(41.139990, -77.462721)
                                , new LatLng(41.139975, -77.462695))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(SULLIVAN)
                        .title("Sullivan Hall | 401")
                        .snippet("Teaching & Learning Center")
                        .alpha(0)

        );

        Polygon sullivan = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.140619, -77.461504), new LatLng(41.140720, -77.461142), new LatLng(41.140556, -77.461062), new LatLng(41.140455, -77.461419))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(BENTLEY)
                        .title("Bentley Dining Hall | 301")
                        .snippet("Starbucks, Chick-Fil-A")
                        .alpha(0)

        );

        Polygon bentley = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.140158, -77.461516), new LatLng(41.139758, -77.461350), new LatLng(41.139924, -77.460720), new LatLng(41.139940, -77.460730),
                                new LatLng(41.140049, -77.460467), new LatLng(41.140235, -77.460661), new LatLng(41.140223, -77.460708)
                                , new LatLng(41.140306, -77.460753), new LatLng(41.140314, -77.460733), new LatLng(41.140364, -77.460775))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(SLOAN)
                        .title("Sloan Fine Arts | 255")
                        .snippet("Auditorium, Classrooms, Gallery")
                        .alpha(0)

        );

        Polygon sloan = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.139822, -77.460322), new LatLng(41.139618, -77.460861), new LatLng(41.139246, -77.460612), new LatLng(41.139353, -77.460314),
                                new LatLng(41.139145, -77.460164), new LatLng(41.139242, -77.459920))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(ULMER)
                        .title("Ulmer | 420")
                        .snippet("Enrollment Services, Student Affairs")
                        .alpha(0)

        );

        Polygon ulmer = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.141741, -77.460972), new LatLng(41.141785, -77.460816), new LatLng(41.141697, -77.460773), new LatLng(41.141708, -77.460733),
                                new LatLng(41.141414, -77.460593), new LatLng(41.141456, -77.460431), new LatLng(41.141070, -77.460246)
                                , new LatLng(41.141002, -77.460498), new LatLng(41.141306, -77.460646), new LatLng(41.141268, -77.460792)
                                , new LatLng(41.141636, -77.460968), new LatLng(41.141646, -77.460931))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(PUB)
                        .title("Parsons Union Building")
                        .snippet("PUB, Bookstore")
                        .alpha(0)

        );

        Polygon pub = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.141577, -77.460354), new LatLng(41.141718, -77.460066), new LatLng(41.141410, -77.459809), new LatLng(41.141475, -77.459672),
                                new LatLng(41.141260, -77.459494), new LatLng(41.141060, -77.459919))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(CV)
                        .title("Campus Village | 500")
                        .snippet("Residence Hall")
                        .alpha(0)

        );

        Polygon cv = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.139404, -77.456354), new LatLng(41.139897, -77.457367), new LatLng(41.139675, -77.457531), new LatLng(41.139544, -77.457259),
                                new LatLng(41.139600, -77.457223), new LatLng(41.139354, -77.456633), new LatLng(41.139019, -77.456872)
                                , new LatLng(41.138942, -77.456675))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(EASTC1)
                        .title("East Campus | 301")
                        .snippet("Classrooms, Human Resources")
                        .alpha(0)

        );

        mMap.addMarker(new MarkerOptions()
                        .position(EASTC2)
                        .title("East Campus | 301")
                        .snippet("Classrooms, Human Resources")
                        .alpha(0)

        );

        Polygon eastcampus = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.139489, -77.453688), new LatLng(41.138761, -77.454189), new LatLng(41.138058, -77.452671), new LatLng(41.138369, -77.452403),
                                new LatLng(41.138749, -77.453226), new LatLng(41.139216, -77.452907))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(REC)
                        .title("Student Recreation Center | 550")
                        .snippet("Gym, Indoor Track")
                        .alpha(0)

        );

        Polygon rec = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.139931, -77.458395), new LatLng(41.139830, -77.458739), new LatLng(41.139752, -77.458679), new LatLng(41.139679, -77.458858),
                                new LatLng(41.139153, -77.458387), new LatLng(41.139377, -77.457898))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(ARTANN)
                        .title("Art Annex")
                        .snippet("Ceramics, Pottery")
                        .alpha(0)

        );

        Polygon artannex = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.139322, -77.457737), new LatLng(41.139190, -77.457912), new LatLng(41.139132, -77.457826), new LatLng(41.139151, -77.457790),
                                new LatLng(41.139077, -77.457685), new LatLng(41.139003, -77.457743), new LatLng(41.138910, -77.457623)
                                , new LatLng(41.139028, -77.457460), new LatLng(41.139119, -77.457575), new LatLng(41.139138, -77.457561)
                                , new LatLng(41.139214, -77.457651), new LatLng(41.139241, -77.457622))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(WILLIS)
                        .title("Willis Health Professions Center | 432")
                        .snippet("")
                        .alpha(0)

        );

        Polygon willis = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.138155, -77.456590), new LatLng(41.137876, -77.456909), new LatLng(41.137720, -77.456660), new LatLng(41.137780, -77.456595),
                                new LatLng(41.137729, -77.456515), new LatLng(41.137772, -77.456470), new LatLng(41.137755, -77.456441)
                                , new LatLng(41.137589, -77.456559), new LatLng(41.137429, -77.456253), new LatLng(41.137623, -77.456060)
                                , new LatLng(41.137591, -77.455950), new LatLng(41.137664, -77.455880), new LatLng(41.137893, -77.456365)
                                , new LatLng(41.137887, -77.456385), new LatLng(41.137913, -77.456430), new LatLng(41.138000, -77.456349))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(SMITH)
                        .title("Smith Hall | 300")
                        .snippet("Residence Hall")
                        .alpha(0)

        );

        Polygon smith = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.140942, -77.460332), new LatLng(41.140875, -77.460454), new LatLng(41.140625, -77.460221), new LatLng(41.140573, -77.460318),
                                new LatLng(41.140630, -77.460375), new LatLng(41.140557, -77.460516), new LatLng(41.140437, -77.460406)
                                , new LatLng(41.140444, -77.460391), new LatLng(41.140154, -77.460119), new LatLng(41.140219, -77.459985)
                                , new LatLng(41.140488, -77.460232), new LatLng(41.140551, -77.460111), new LatLng(41.140490, -77.460046)
                                , new LatLng(41.140541, -77.459947))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(WOOL)
                        .title("Woolridge Hall | 260")
                        .snippet("Residence Hall")
                        .alpha(0)

        );

        Polygon wool = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.139999, -77.459982), new LatLng(41.139839, -77.459875), new LatLng(41.139830, -77.459895), new LatLng(41.139790, -77.459869),
                                new LatLng(41.139813, -77.459810), new LatLng(41.139784, -77.459791), new LatLng(41.139748, -77.459876)
                                , new LatLng(41.139725, -77.459861), new LatLng(41.139752, -77.459790), new LatLng(41.139723, -77.459768)
                                , new LatLng(41.139917, -77.459270), new LatLng(41.140285, -77.459526), new LatLng(41.140231, -77.459671)
                                , new LatLng(41.139952, -77.459478), new LatLng(41.139863, -77.459703), new LatLng(41.140055, -77.459839))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(FAIRVIEW1)
                        .title("Fairview Suites | 200")
                        .snippet("Residence Hall")
                        .alpha(0)

        );
        mMap.addMarker(new MarkerOptions()
                        .position(FAIRVIEW2)
                        .title("Fairview Suites | 200")
                        .snippet("Residence Hall")
                        .alpha(0)

        );
        mMap.addMarker(new MarkerOptions()
                        .position(FAIRVIEW3)
                        .title("Fairview Suites | 200")
                        .snippet("Residence Hall")
                        .alpha(0)

        );

        Polygon fairview = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.139396, -77.459657), new LatLng(41.138376, -77.458941), new LatLng(41.138449, -77.458710), new LatLng(41.137726, -77.458203),
                                new LatLng(41.137657, -77.458361), new LatLng(41.137499, -77.458246), new LatLng(41.137665, -77.457793)
                                , new LatLng(41.138669, -77.458574), new LatLng(41.138610, -77.458738), new LatLng(41.139176, -77.459132)
                                , new LatLng(41.139144, -77.459234), new LatLng(41.139314, -77.459360), new LatLng(41.139403, -77.459170)
                                , new LatLng(41.139548, -77.459272))
                        .fillColor(0x78FF0000)
                        .strokeColor(0x78FF0000)
        );

        mMap.addMarker(new MarkerOptions()
                        .position(cvpark)
                        .title("Campus Village Parking")
                        .snippet("Permit Required 5PM Sunday - 5PM Friday")
                        .alpha(0)

        );

        Polygon cvpark = (mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.139349, -77.456376), new LatLng(41.138863, -77.456713), new LatLng(41.138623, -77.456262), new LatLng(41.139154, -77.455919))
                        .fillColor(0xff909090)
                        .strokeColor(0xff909090)
        ));

        //, new LatLng(), new LatLng()

        mMap.addMarker(new MarkerOptions()
                        .position(commlot1)
                        .title("Area 9 Parking, Permit Required M-F 7AM-5PM")
                        .snippet("Lot closed M-F 12AM-5AM")
                        .alpha(0)

        );
        mMap.addMarker(new MarkerOptions()
                        .position(commlot2)
                        .title("Area 9 Parking, Permit Required M-F 7AM-5PM")
                        .snippet("Lot closed M-F 12AM-5AM")
                        .alpha(0)

        );
        mMap.addMarker(new MarkerOptions()
                        .position(commlot3)
                        .title("Area 9 Parking, Permit Required M-F 7AM-5PM")
                        .snippet("Lot closed M-F 12AM-5AM")
                        .alpha(0)

        );

        Polygon commlot = (mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.141267, -77.459399), new LatLng(41.140093, -77.458434), new LatLng(41.139895, -77.458875), new LatLng(41.139910, -77.459010), new LatLng(41.139966, -77.459110)
                                , new LatLng(41.140054, -77.459149), new LatLng(41.140162, -77.459080), new LatLng(41.140209, -77.459123)
                                , new LatLng(41.140214, -77.459264), new LatLng(41.140273, -77.459373), new LatLng(41.140386, -77.459432), new LatLng(41.140450, -77.459376), new LatLng(41.140489, -77.459304)
                                , new LatLng(41.140533, -77.459340), new LatLng(41.140511, -77.459448), new LatLng(41.140548, -77.459576), new LatLng(41.140634, -77.459662), new LatLng(41.140730, -77.459639)
                                , new LatLng(41.140813, -77.459565), new LatLng(41.140842, -77.459603), new LatLng(41.140827, -77.459713), new LatLng(41.140864, -77.459839), new LatLng(41.140950, -77.459910)
                                , new LatLng(41.141038, -77.459910))
                        .fillColor(0xff909090)
                        .strokeColor(0xff909090)
        ));

        mMap.addMarker(new MarkerOptions()
                        .position(woollot)
                        .title("15A|Parking, Permit Required M-F 7AM-5PM")
                        .snippet("Lot closed M-F 12AM-5AM")
                        .alpha(0)

        );

        Polygon wolllot = (mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.139608, -77.459861), new LatLng(41.139789, -77.459314), new LatLng(41.139661, -77.459221), new LatLng(41.139528, -77.459545), new LatLng(41.139564, -77.459584)
                                , new LatLng(41.139496, -77.459770))
                        .fillColor(0xff909090)
                        .strokeColor(0xff909090)
        ));

        mMap.addMarker(new MarkerOptions()
                        .position(sloanlot)
                        .title("10|Parking, Permit Required M-F 7AM-10PM")
                        .snippet("Lot closed M-F 12AM-5AM")
                        .alpha(0)

        );

        Polygon sloanlot = (mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.139211, -77.459906), new LatLng(41.139116, -77.460193), new LatLng(41.139282, -77.460311), new LatLng(41.139219, -77.460509), new LatLng(41.138977, -77.460380)
                                , new LatLng(41.139169, -77.459873))
                        .fillColor(0xff909090)
                        .strokeColor(0xff909090)
        ));

        mMap.addMarker(new MarkerOptions()
                        .position(courtyard1)
                        .title("Campus Courtyard")
                        .snippet("")
                        .alpha(0)

        );

        mMap.addMarker(new MarkerOptions()
                        .position(courtyard2)
                        .title("Campus Courtyard")
                        .snippet("")
                        .alpha(0)

        );

        Polygon courtyard = (mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.140942, -77.461091), new LatLng(41.141536, -77.461403), new LatLng(41.141622, -77.461972), new LatLng(41.141376, -77.462040), new LatLng(41.141275, -77.462036)
                                , new LatLng(41.141191, -77.462133), new LatLng(41.140735, -77.461802))
                        .fillColor(0xff009900)
                        .strokeColor(0xff009900)
        ));

        mMap.addMarker(new MarkerOptions()
                        .position(circlestopm)
                        .title("Campus Circle Trolley Stop")
                        .snippet("")
                        .alpha(0)

        );

        Circle campuscircle = (mMap.addCircle(new CircleOptions()
                .center(circlestop)
                .strokeColor(0x78FF0000)
                .fillColor(0x78FF0000)
                .radius(9)));

        mMap.addMarker(new MarkerOptions()
                        .position(akelparking)
                        .title("Akeley Parking")
                        .snippet("Permit Required M-F 7AM-5PM")
                        .alpha(0)

        );

        mMap.addMarker(new MarkerOptions()
                        .position(tfparking)
                        .title("Zimmerli, Thomas Field House Parking")
                        .snippet("Permit Required M-F 7AM-5PM")
                        .alpha(0)

        );


        Polygon akeleyparking = (mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.142892, -77.463554), new LatLng(41.142906, -77.463904), new LatLng(41.142502, -77.463990), new LatLng(41.142548, -77.464631), new LatLng(41.142243, -77.464679)
                                , new LatLng(41.142094, -77.464081), new LatLng(41.142484, -77.463963), new LatLng(41.142437, -77.463625))
                        .fillColor(0xff909090)
                        .strokeColor(0xff909090)
        ));

        mMap.addMarker(new MarkerOptions()
                        .position(willisparking)
                        .title("19|Parking, Permit Required M-F 7AM-10PM")
                        .snippet("Lot closed M-F 12AM-5AM")
                        .alpha(0)

        );

        Polygon willisparking = (mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.138745, -77.457218), new LatLng(41.138319, -77.457762), new LatLng(41.137849, -77.457332), new LatLng(41.138324, -77.456716))
                        .fillColor(0xff909090)
                        .strokeColor(0xff909090)
        ));

        mMap.addMarker(new MarkerOptions()
                        .position(redparking)
                        .title("Parking, Red Decal Required")
                        .snippet("24 Hours, 7 Days a Week")
                        .alpha(0)

        );

        Polygon redparking = (mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.138748, -77.457248), new LatLng(41.138851, -77.457383), new LatLng(41.138710, -77.457565), new LatLng(41.139185, -77.458072), new LatLng(41.139025, -77.458399)
                                , new LatLng(41.138343, -77.457752))
                        .fillColor(0xff6e6e6e)
                        .strokeColor(0xff6e6e6e)
        ));

        mMap.addMarker(new MarkerOptions()
                        .position(commuter1)
                        .title("Parking, Commuter")
                        .snippet("")
                        .alpha(0)

        );

        mMap.addMarker(new MarkerOptions()
                        .position(commuter2)
                        .title("Parking, Commuter")
                        .snippet("")
                        .alpha(0)

        );

        Polygon commuterlot = (mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(new LatLng(41.144086, -77.463314), new LatLng(41.145388, -77.464435), new LatLng(41.145162, -77.465023), new LatLng(41.143813, -77.463945))
                        .fillColor(0xff909090)
                        .strokeColor(0xff909090)
        ));

        mMap.addMarker(new MarkerOptions()
                        .position(eaststop)
                        .title("East Campus Trolley Stop")
                        .snippet("")
                        .alpha(0)

        );

        Circle estop = (mMap.addCircle(new CircleOptions()
                .center(eaststop)
                .strokeColor(0x78FF0000)
                .fillColor(0x78FF0000)
                .radius(9)));












    }



    public void onCameraChange(CameraPosition position) {
        float maxZoom = 17.0f;
        float minZoom = 14.0f;

        if (position.zoom > maxZoom) {
            mMap.animateCamera(CameraUpdateFactory.zoomTo(maxZoom));
        } else if (position.zoom < minZoom) {
            mMap.animateCamera(CameraUpdateFactory.zoomTo(minZoom));
        }
    }



}
