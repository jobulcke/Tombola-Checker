<script setup>

</script>

<template>
  <nav class="navbar is-light is-fixed-top" role="navigation" aria-label="main navigation">
    <div class="navbar-brand">
      <router-link to="/home" class="navbar-item">Tombola Checker</router-link>
    </div>

    <div class="navbar-menu">
      <div class="navbar-start">
        <router-link to="/tickets" class="navbar-item">Tickets</router-link>
        <router-link to="/prizes" class="navbar-item">
          <span>Prijzen</span>
        </router-link>
      </div>
    </div>
  </nav>
</template>

<style scoped>
.navbar-brand {
  font-size: 20px;
  font-weight: 500;
}


</style>