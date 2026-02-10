package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerFastest: ImageVector? = null

val Icons.Ss.TachometerFastest: ImageVector
    get() = _TachometerFastest ?: UXIcon(name = "TachometerFastest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(0.37f, 0.98f, -4.41f, 16.17f, 5.11f, 22.82f)
                lineToRelative(0.64f, 0.45f)
                lineTo(8f, 20f)
                horizontalLineToRelative(8f)
                lineToRelative(2.25f, 3.27f)
                lineToRelative(0.64f, -0.45f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                close()
                moveTo(10.17f, 12.2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.81f, 0.58f)
                lineTo(20.64f, 15.7f)
                lineToRelative(-0.8f, 1.83f)
                lineToRelative(-6.66f, -2.92f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.17f, 12.2f)
                close()
            }
        }.also { _TachometerFastest = it}
