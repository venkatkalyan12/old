import React from 'react';
import { GoogleMap, LoadScript, Marker, InfoWindow } from '@react-google-maps/api';

const containerStyle = {
    width: '100%',
    height: '400px'
};

const GoogleMapComponent = ({ hospitals }) => {
    const [selected, setSelected] = React.useState(null);

    const center = {
        lat: hospitals.length > 0 ? hospitals[0].latitude : 0,
        lng: hospitals.length > 0 ? hospitals[0].longitude : 0
    };

    return (
        <LoadScript googleMapsApiKey="kalYan.googlemap">
            <GoogleMap
                mapContainerStyle={containerStyle}
                center={center}
                zoom={12}
            >
                {hospitals.map(hospital => (
                    <Marker
                        key={hospital.id}
                        position={{ lat: hospital.latitude, lng: hospital.longitude }}
                        onClick={() => setSelected(hospital)}
                    />
                ))}

                {selected && (
                    <InfoWindow
                        position={{ lat: selected.latitude, lng: selected.longitude }}
                        onCloseClick={() => setSelected(null)}
                    >
                        <div>
                            <h2>{selected.name}</h2>
                            <p>{selected.address}</p>
                        </div>
                    </InfoWindow>
                )}
            </GoogleMap>
        </LoadScript>
    );
};

export default GoogleMapComponent;
