export default function Leaderboard() {
    const leaderboard = [
        { name: 'Kate', wins: 5, losses: 2 },
        { name: 'Shan', wins: 3, losses: 4 },
        { name: 'Noodle', wins: 7, losses: 1 },
    ]
    return (
        <>
            <h2>Leaderboard</h2>
            <table>
                <thead>
                    <tr>
                        <th>Player</th>
                        <th>Wins</th>
                        <th>Losses</th>
                    </tr>
                </thead>
                <tbody>
                    {leaderboard.map((player) => (
                        <tr key={player.name}>
                            <td>{player.name}</td>
                            <td>{player.wins}</td>
                            <td>{player.losses}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </>
    )
}