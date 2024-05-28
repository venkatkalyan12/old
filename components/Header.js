import React from 'react';
import { Link } from 'react-router-dom';

const Header = () => {
    return (
        <header>
            <nav>
                <Link to="/">Home</Link> |
                <Link to="/register">Register</Link> |
                <Link to="/login">Login</Link> |
                <Link to="/hospitals">Hospitals</Link> |
                <Link to="/diseases">Diseases</Link> |
                <Link to="/emergency-report">Report Emergency</Link>
            </nav>
        </header>
    );
};

export default Header;
