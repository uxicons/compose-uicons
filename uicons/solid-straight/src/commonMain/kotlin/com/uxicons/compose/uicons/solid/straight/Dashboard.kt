package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dashboard: ImageVector? = null

val Icons.Ss.Dashboard: ImageVector
    get() = _Dashboard ?: UXIcon(name = "Dashboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.89f, 21.82f)
                lineToRelative(0.26f, 0.18f)
                horizontalLineToRelative(13.26f)
                lineToRelative(0.26f, -0.18f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.89f, -21.82f)
                close()
                moveTo(6.06f, 19.75f)
                arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.81f, -14.86f)
                lineToRelative(-1.53f, 1.53f)
                arcToRelative(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.35f, -0.41f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.62f, 12.25f)
                close()
                moveTo(12f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.51f, -3.93f)
                lineToRelative(4.78f, -4.78f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.78f, 4.78f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.93f, 2.51f)
                close()
                moveTo(17.94f, 19.75f)
                lineTo(16.62f, 18.25f)
                arcToRelative(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.97f, -7.59f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.17f, 10.62f)
                close()
            }
        }.also { _Dashboard = it}
