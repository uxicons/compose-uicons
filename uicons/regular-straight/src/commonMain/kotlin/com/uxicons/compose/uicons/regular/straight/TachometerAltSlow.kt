package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlow: ImageVector? = null

val Icons.Rs.TachometerAltSlow: ImageVector
    get() = _TachometerAltSlow ?: UXIcon(name = "TachometerAltSlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(0.37f, 0.98f, -4.41f, 16.17f, 5.11f, 22.82f)
                lineTo(5.37f, 23f)
                lineTo(18.63f, 23f)
                lineToRelative(0.26f, -0.18f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                close()
                moveTo(17.99f, 21f)
                lineTo(6.01f, 21f)
                curveTo(-1.63f, 15.32f, 2.47f, 2.98f, 12f, 3f)
                curveTo(21.53f, 2.98f, 25.63f, 15.32f, 17.99f, 21f)
                close()
                moveTo(6f, 13f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.8f, 4.29f)
                lineToRelative(-1.4f, 1.43f)
                arcTo(8.02f, 8.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.63f, 9.88f)
                lineTo(6.21f, 11.45f)
                arcTo(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 13f)
                close()
                moveTo(20f, 13f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.41f, 5.71f)
                lineToRelative(-1.4f, -1.43f)
                curveToRelative(4.39f, -4.22f, 0.12f, -11.7f, -5.74f, -10.07f)
                lineTo(8.88f, 5.63f)
                arcTo(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 13f)
                close()
                moveTo(14f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.93f, -0.52f)
                lineTo(5.79f, 8.21f)
                lineTo(7.21f, 6.79f)
                lineToRelative(4.28f, 4.28f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                close()
            }
        }.also { _TachometerAltSlow = it}
