package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureDown: ImageVector? = null

val Icons.Sr.TemperatureDown: ImageVector
    get() = _TemperatureDown ?: UXIcon(name = "TemperatureDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12.11f)
                curveTo(16.33f, 16.36f, 13.08f, 24.12f, 7f, 24f)
                curveToRelative(-6.08f, 0.12f, -9.34f, -7.64f, -5f, -11.89f)
                lineTo(2f, 5f)
                curveToRelative(0.21f, -6.61f, 9.79f, -6.6f, 10f, 0f)
                close()
                moveTo(10f, 17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.83f)
                lineTo(8f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(2.17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 17f)
                close()
                moveTo(15.3f, 8.69f)
                lineTo(18.3f, 11.69f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(3f, -3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.3f, 7.28f)
                lineTo(20f, 8.57f)
                lineTo(20f, 0.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(18f, 8.57f)
                lineTo(16.7f, 7.28f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.42f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _TemperatureDown = it}
