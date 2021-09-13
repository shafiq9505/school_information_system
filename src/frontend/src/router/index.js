import Vue from 'vue'
import VueRouter from 'vue-router'
import StudentInfo from '../views/StudentInfo.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: StudentInfo
  },
]

const router = new VueRouter({
  routes
})

export default router
