package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltFastest: ImageVector? = null

val Icons.Ss.TachometerAltFastest: ImageVector
    get() = _TachometerAltFastest ?: UXIcon(name = "TachometerAltFastest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.53f, 1.01f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, 22.82f)
                lineTo(5.37f, 23f)
                horizontalLineTo(18.63f)
                lineToRelative(0.26f, -0.18f)
                curveTo(28.6f, 16.03f, 23.41f, 0.55f, 11.53f, 1.01f)
                close()
                moveTo(6.05f, 19.75f)
                quadToRelative(-0.21f, -0.19f, -0.41f, -0.39f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.34f, -5.88f)
                lineToRelative(-1.99f, -0.83f)
                curveToRelative(-0.15f, -5.93f, -7.81f, -8.9f, -11.93f, -4.6f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.9f)
                curveToRelative(0.1f, 0.1f, 0.21f, 0.2f, 0.32f, 0.3f)
                close()
                moveTo(12f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.97f, -2.27f)
                lineToRelative(6.25f, 2.61f)
                lineToRelative(-0.77f, 1.85f)
                lineToRelative(-6.23f, -2.61f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
            }
        }.also { _TachometerAltFastest = it}
