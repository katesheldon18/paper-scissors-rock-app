import {useQuery, useMutation, useQueryClient} from '@tanstack/react-query'
import {API_BASE_URL} from '../config'

type Game = {
    userId: number
    win: boolean
    id: number
}

type NewGame = {
    userId: number
    win: boolean
}

export default function Leaderboard() {
    const queryClient = useQueryClient();

    const { isPending, error, data: leaderboard } = useQuery({
        queryKey: ['leaderboard'],
        queryFn: (): Promise<Game[]> =>
        fetch(`${API_BASE_URL}/games`).then((res) =>
            res.json(),
        ),
      })

    const mutation = useMutation({ 
        mutationFn: (game: NewGame) => fetch(`${API_BASE_URL}/games`, {method: 'POST', body: JSON.stringify(game), headers: {'content-type': 'application/json'}}),
        onSuccess: async () => {
            await queryClient.invalidateQueries({ queryKey: ['leaderboard'] })
        }
    })

    if (isPending) return 'Loading leaderboard'
    if (error) return 'Can not load leaderboard'

    return (
        <>
            <h2>Leaderboard</h2>
            
            {/* temporary */}
            <button onClick={() => mutation.mutate(
                {
                    userId: 2,
                    win: true
                }
            )}>Add Game</button>

            <table>
                <thead>
                    <tr>
                        <th>User ID</th>
                        <th>Result</th>
                        <th>ID</th>
                    </tr>
                </thead>
                <tbody>
                    {leaderboard.map((player: Game, index: number) => (
                        <tr key={index}>
                            <td>{player.userId}</td>
                            <td>{player.win ? "win" : "loss"}</td>
                            <td>{player.id}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </>
    )
}
