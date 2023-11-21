import { useState, useEffect } from 'react'

export default function Root() {
    const [user, setUser] = useState(null);
    useEffect(() => {
        fetch('http://localhost:8080/user', {
            // mode: 'no-cors'
        })
            .then((res) => res.json())
            .then((data) => {
                console.log(data);
                setUser(data);
            });
        console.log('useEffect')
    }, []);
    return (
        <main>
            {user && <h1>Hello {user.name}</h1>}
            {user && <h1>Balance {user.balance}</h1>}
        </main>
    )
}
