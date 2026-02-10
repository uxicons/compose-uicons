package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dashboard: ImageVector? = null

val Icons.Bs.Dashboard: ImageVector
    get() = _Dashboard ?: UXIcon(name = "Dashboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.86f, 21.73f)
                lineToRelative(0.39f, 0.27f)
                horizontalLineToRelative(12.94f)
                lineToRelative(0.39f, -0.27f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.86f, -21.73f)
                close()
                moveTo(17.5f, 20f)
                horizontalLineToRelative(-11f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11f, 0f)
                close()
                moveTo(13.99f, 13.08f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.18f, -2.06f)
                lineToRelative(3.6f, -3.6f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(9.71f, 16.27f)
                lineTo(7.98f, 18.73f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.2f, -12.62f)
                lineToRelative(-4.17f, 4.26f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, 5.9f)
                close()
                moveTo(19f, 13f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.98f, 5.73f)
                lineToRelative(-1.73f, -2.46f)
                curveToRelative(0.32f, -0.22f, 4.58f, -4.54f, 4.58f, -4.54f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, 1.27f)
                close()
            }
        }.also { _Dashboard = it}
