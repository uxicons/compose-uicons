package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dashboard: ImageVector? = null

val Icons.Sr.Dashboard: ImageVector
    get() = _Dashboard ?: UXIcon(name = "Dashboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.9f, 11.44f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.9f, 1.56f)
                arcToRelative(11.88f, 11.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.76f, 8.71f)
                arcToRelative(4.84f, 4.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, 1.29f)
                horizontalLineToRelative(9.77f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.51f, -1.43f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.51f, -10.13f)
                close()
                moveTo(7.47f, 19.66f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0.09f)
                arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.94f, -15.75f)
                arcToRelative(9.1f, 9.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 0.28f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.5f, 1.94f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.37f, 12.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, 1.41f)
                close()
                moveTo(12f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.51f, -3.93f)
                lineToRelative(3.78f, -3.78f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-3.78f, 3.78f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.93f, 2.51f)
                close()
                moveTo(17.94f, 19.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, -1.5f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.16f, -7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.94f, -0.5f)
                arcToRelative(9.09f, 9.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.28f, 2.25f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.06f, 6.75f)
                close()
            }
        }.also { _Dashboard = it}
