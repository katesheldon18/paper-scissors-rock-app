import './App.css'
import Leaderboard from './components/Leaderboard'
import {QueryClientProvider, QueryClient} from '@tanstack/react-query'

const queryClient = new QueryClient();

function App() {
  return (
    <QueryClientProvider client={queryClient}>
    <div>
      <h1>Paper Scissors Rock</h1>
      <Leaderboard />
    </div>
    </QueryClientProvider>
  )
}

export default App
