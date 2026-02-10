package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rugby: ImageVector? = null

val Icons.Bs.Rugby: ImageVector
    get() = _Rugby ?: UXIcon(name = "Rugby") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.02f, 1.98f)
                curveToRelative(-3.52f, -3.53f, -12.65f, -2.15f, -17.42f, 2.62f)
                reflectiveCurveToRelative(-6.15f, 13.9f, -2.62f, 17.42f)
                arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.94f, 1.98f)
                arcToRelative(17.03f, 17.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.49f, -4.6f)
                curveToRelative(4.78f, -4.78f, 6.15f, -13.9f, 2.62f, -17.42f)
                close()
                moveTo(17.28f, 17.28f)
                arcToRelative(14.16f, 14.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.49f, 3.68f)
                lineToRelative(-5.74f, -5.74f)
                arcToRelative(14.17f, 14.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.68f, -8.49f)
                arcToRelative(14.17f, 14.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.49f, -3.68f)
                lineToRelative(5.74f, 5.74f)
                arcToRelative(14.17f, 14.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.68f, 8.49f)
                close()
                moveTo(18.32f, 9.68f)
                lineTo(16.2f, 11.8f)
                lineTo(15.26f, 10.86f)
                lineTo(14.12f, 12f)
                lineTo(15.06f, 12.94f)
                lineTo(12.94f, 15.06f)
                lineTo(12f, 14.12f)
                lineTo(10.88f, 15.24f)
                lineTo(11.82f, 16.18f)
                lineTo(9.7f, 18.3f)
                lineTo(5.7f, 14.3f)
                lineTo(7.82f, 12.18f)
                lineTo(8.76f, 13.12f)
                lineTo(9.88f, 12f)
                lineTo(8.94f, 11.06f)
                lineTo(11.06f, 8.94f)
                lineTo(12f, 9.88f)
                lineTo(13.14f, 8.74f)
                lineTo(12.2f, 7.8f)
                lineTo(14.32f, 5.68f)
                close()
            }
        }.also { _Rugby = it}
