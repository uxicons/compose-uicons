package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerFast: ImageVector? = null

val Icons.Ss.TachometerFast: ImageVector
    get() = _TachometerFast ?: UXIcon(name = "TachometerFast") {
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
                moveTo(10.59f, 14.41f)
                arcToRelative(2.0f, 2.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.93f, -3.34f)
                lineToRelative(5.15f, -5.15f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-5.15f, 5.15f)
                arcTo(2.0f, 2.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.59f, 14.41f)
                close()
            }
        }.also { _TachometerFast = it}
