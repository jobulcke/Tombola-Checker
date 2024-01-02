import { ref } from 'vue'

export function useFetch(url, httpMethod = 'GET') {
  const data = ref(null)
  const error = ref(null)

  fetch(url, { method: httpMethod })
    .then((res) => res.json())
    .then((json) => (data.value = json))
    .catch((err) => (error.value = err))

  return { data, error }
}