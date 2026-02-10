package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureUp: ImageVector? = null

val Icons.Ss.TemperatureUp: ImageVector
    get() = _TemperatureUp ?: UXIcon(name = "TemperatureUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12.1f)
                curveToRelative(4.33f, 4.25f, 1.08f, 12.01f, -5f, 11.89f)
                curveTo(0.92f, 24.1f, -2.33f, 16.35f, 2f, 12.1f)
                lineTo(2f, 4.99f)
                curveToRelative(0.21f, -6.61f, 9.79f, -6.6f, 10f, 0f)
                close()
                moveTo(10f, 16.99f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.82f)
                lineTo(8f, 4.88f)
                lineTo(6f, 4.88f)
                verticalLineToRelative(9.29f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 2.82f)
                close()
                moveTo(22.29f, 5.29f)
                lineToRelative(1.41f, -1.41f)
                lineTo(20.41f, 0.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0f)
                lineTo(14.29f, 3.88f)
                lineToRelative(1.41f, 1.41f)
                lineTo(18f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                lineTo(20f, 3f)
                close()
            }
        }.also { _TemperatureUp = it}
