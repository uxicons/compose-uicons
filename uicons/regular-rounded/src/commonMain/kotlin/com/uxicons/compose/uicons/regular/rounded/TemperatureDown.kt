package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureDown: ImageVector? = null

val Icons.Rr.TemperatureDown: ImageVector
    get() = _TemperatureDown ?: UXIcon(name = "TemperatureDown") {
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
                lineTo(6f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(2.17f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                close()
                moveTo(7f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 16f)
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
