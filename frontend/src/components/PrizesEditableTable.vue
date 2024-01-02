<script setup>
import { useFetch } from '@/composables/fetch.js'

const { data, error } = useFetch('/api/v1/prizes')

</script>

<template>
  <nav class="navbar">
    <div class="navbar-menu">
      <div class="navbar-end">
        <div class="navbar-item">
          <div class="buttons">
            <router-link to="/prizes" class="button is-danger is-inverted">
              Annuleer
            </router-link>
          </div>
        </div>
      </div>
    </div>
  </nav>
  <table class="table is-fullwidth is-bordered has-text-centered">
    <thead>
    <tr>
      <th class="has-text-centered">Beschrijving</th>
      <th class="has-text-centered">Winnend ticketnummer</th>
      <th class="has-text-centered">Eerste reservenummer</th>
      <th class="has-text-centered">Tweede reservenummer</th>
    </tr>
    </thead>
    <tbody>
    <tr v-for="prize in data">
      <td class="is-vcentered">{{ prize.description }}</td>
      <td>
        <input class="input" :value="prize.ticketNumber" placeholder="123.123">
      </td>
      <td>
        <input class="input" :value="prize.firstSpareNumber" placeholder="123.123">
      </td>
      <td>
        <input class="input" :value="prize.secondSpareNumber" placeholder="123.123">
      </td>
    </tr>
    </tbody>
  </table>
</template>