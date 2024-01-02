import { createRouter, createWebHistory } from 'vue-router'
import TicketsView from '@/views/TicketsView.vue'
import PrizesView from '@/views/PrizesView.vue'
import PrizesTable from '@/components/PrizesTable.vue'
import PrizesEditableTable from '@/components/PrizesEditableTable.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  linkActiveClass: 'is-active',
  routes: [
    {
      path: '/',
      alias: '/home'
    },
    {
      path: '/prizes',
      component: PrizesView,
      children: [
        { path: '', component: PrizesTable },
        { path: 'edit-tickets', component: PrizesEditableTable }
      ]
    },

    {
      path: '/tickets',
      name: 'tickets',
      component: TicketsView
    }
  ]
})

export default router