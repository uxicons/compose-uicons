package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltFastest: ImageVector? = null

val Icons.Rs.TachometerAltFastest: ImageVector
    get() = _TachometerAltFastest ?: UXIcon(name = "TachometerAltFastest") {
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
                moveTo(13.99f, 12.78f)
                lineTo(19.52f, 15.21f)
                lineTo(18.72f, 17.04f)
                lineTo(13.19f, 14.61f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.8f, -1.83f)
                close()
                moveTo(20f, 13f)
                curveToRelative(0f, 0.08f, -0.01f, 0.15f, -0.01f, 0.23f)
                lineToRelative(-2.03f, -0.89f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                curveToRelative(-5.27f, -0.1f, -8.04f, 6.68f, -4.2f, 10.29f)
                lineToRelative(-1.4f, 1.43f)
                curveTo(1.29f, 13.85f, 4.94f, 4.92f, 12f, 5f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 13f)
                close()
            }
        }.also { _TachometerAltFastest = it}
