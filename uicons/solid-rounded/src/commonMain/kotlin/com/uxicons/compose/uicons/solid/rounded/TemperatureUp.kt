package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureUp: ImageVector? = null

val Icons.Sr.TemperatureUp: ImageVector
    get() = _TemperatureUp ?: UXIcon(name = "TemperatureUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12.1f)
                curveToRelative(4.33f, 4.25f, 1.08f, 12.01f, -5f, 11.89f)
                curveTo(0.92f, 24.1f, -2.33f, 16.35f, 2f, 12.1f)
                lineTo(2f, 4.99f)
                curveToRelative(0.21f, -6.61f, 9.79f, -6.6f, 10f, 0f)
                close()
                moveTo(10f, 16.99f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.83f)
                lineTo(8f, 4.88f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(9.28f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 2.83f)
                close()
                moveTo(22.7f, 3.3f)
                lineTo(19.7f, 0.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineToRelative(-3f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.7f, 4.71f)
                lineTo(18f, 3.42f)
                lineTo(18f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(20f, 3.42f)
                lineToRelative(1.3f, 1.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.71f, 3.29f)
                horizontalLineToRelative(-0.01f)
                close()
            }
        }.also { _TemperatureUp = it}
