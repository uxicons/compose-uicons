package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureUp: ImageVector? = null

val Icons.Rr.TemperatureUp: ImageVector
    get() = _TemperatureUp ?: UXIcon(name = "TemperatureUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 24f)
                curveToRelative(-6.08f, 0.12f, -9.33f, -7.64f, -5f, -11.89f)
                lineTo(2f, 5f)
                curveToRelative(0.21f, -6.61f, 9.79f, -6.6f, 10f, 0f)
                verticalLineToRelative(7.11f)
                curveTo(16.34f, 16.36f, 13.08f, 24.12f, 7f, 24f)
                close()
                moveTo(7f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5f)
                verticalLineToRelative(7.54f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, 0.74f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 22f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.33f, -8.72f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12.54f)
                lineTo(10f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 2f)
                close()
                moveTo(7f, 20f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -5.83f)
                lineTo(6f, 4.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(9.28f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                close()
                moveTo(7f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 16f)
                close()
                moveTo(22.7f, 3.29f)
                lineTo(19.7f, 0.29f)
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
