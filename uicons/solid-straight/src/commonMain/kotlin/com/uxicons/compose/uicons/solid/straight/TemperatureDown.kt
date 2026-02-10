package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureDown: ImageVector? = null

val Icons.Ss.TemperatureDown: ImageVector
    get() = _TemperatureDown ?: UXIcon(name = "TemperatureDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12.11f)
                curveTo(16.33f, 16.36f, 13.08f, 24.12f, 7f, 24f)
                curveToRelative(-6.08f, 0.12f, -9.34f, -7.64f, -5f, -11.89f)
                verticalLineTo(5f)
                curveToRelative(0.21f, -6.61f, 9.79f, -6.6f, 10f, 0f)
                close()
                moveTo(10f, 17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.82f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineToRelative(2.18f)
                arcTo(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 17f)
                close()
                moveTo(15.71f, 6.71f)
                lineTo(14.29f, 8.12f)
                lineToRelative(3.29f, 3.29f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, 0f)
                lineToRelative(3.29f, -3.29f)
                lineTo(22.29f, 6.71f)
                lineTo(20f, 9f)
                verticalLineTo(0f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                close()
            }
        }.also { _TemperatureDown = it}
