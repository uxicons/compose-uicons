package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureHigh: ImageVector? = null

val Icons.Bs.TemperatureHigh: ImageVector
    get() = _TemperatureHigh ?: UXIcon(name = "TemperatureHigh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 16.04f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, -2.6f)
                lineTo(9.5f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7.44f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 16.04f)
                close()
                moveTo(17f, 10.73f)
                arcTo(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -5.27f)
                lineTo(5f, 6.04f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                close()
                moveTo(16f, 16f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.59f)
                lineTo(14f, 11.97f)
                lineTo(14f, 6.04f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 0f)
                verticalLineToRelative(5.93f)
                lineToRelative(-0.46f, 0.44f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 16f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                close()
                moveTo(21.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 0f)
                close()
            }
        }.also { _TemperatureHigh = it}
