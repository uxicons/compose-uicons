package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dashboard: ImageVector? = null

val Icons.Rs.Dashboard: ImageVector
    get() = _Dashboard ?: UXIcon(name = "Dashboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.89f, 21.82f)
                lineToRelative(0.26f, 0.18f)
                horizontalLineToRelative(13.26f)
                lineToRelative(0.26f, -0.18f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.89f, -21.82f)
                close()
                moveTo(17.99f, 21f)
                horizontalLineToRelative(-11.98f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.98f, 0f)
                close()
                moveTo(20f, 13f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.41f, 5.71f)
                lineToRelative(-1.4f, -1.43f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.59f, -5.83f)
                lineToRelative(1.57f, -1.57f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.64f, 3.12f)
                close()
                moveTo(6f, 13f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.8f, 4.29f)
                lineToRelative(-1.4f, 1.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.72f, -13.08f)
                lineToRelative(-1.57f, 1.57f)
                arcToRelative(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.55f, 5.79f)
                close()
                moveTo(13.93f, 12.49f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(4.28f, -4.28f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _Dashboard = it}
