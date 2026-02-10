package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerSlow: ImageVector? = null

val Icons.Ss.TachometerSlow: ImageVector
    get() = _TachometerSlow ?: UXIcon(name = "TachometerSlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 13f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, 9.82f)
                lineToRelative(0.64f, 0.45f)
                lineTo(8f, 20f)
                horizontalLineToRelative(8f)
                lineToRelative(2.25f, 3.27f)
                lineToRelative(0.64f, -0.45f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13f)
                close()
                moveTo(10.59f, 14.41f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.51f, -1.93f)
                lineTo(4.93f, 7.34f)
                lineTo(6.34f, 5.93f)
                lineToRelative(5.15f, 5.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.9f, 3.34f)
                close()
            }
        }.also { _TachometerSlow = it}
