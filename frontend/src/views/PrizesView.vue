<script setup>
import { ref } from 'vue'

const editable = ref(false)

function toggleEditable() {
  editable.value = !editable.value
}
</script>

<template>
  <router-view></router-view>
</template>