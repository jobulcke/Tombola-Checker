<script setup>
import { useFetch } from '@/composables/fetch.js'

const { data } = useFetch('/api/v1/prizes')
</script>

<template>
  <nav class="navbar">
    <div class="navbar-menu">
      <div class="navbar-end">
        <div class="navbar-item">
          <div class="buttons">
            <router-link to="/prizes/edit-tickets" class="button is-info is-outlined">
              Bewerk ticketnummers
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
      <td>{{ prize.description }}</td>
      <td v-if="prize.ticketNumber != null">{{ prize.ticketNumber }}</td>
      <td v-else colspan="3">Nog niet bepaald</td>
      <td v-if="prize.ticketNumber != null">{{ prize.firstSpareNumber }}</td>
      <td v-if="prize.ticketNumber != null">{{ prize.secondSpareNumber }}</td>
    </tr>
    </tbody>
  </table>
</template>