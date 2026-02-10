package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureHigh: ImageVector? = null

val Icons.Br.TemperatureHigh: ImageVector
    get() = _TemperatureHigh ?: UXIcon(name = "TemperatureHigh") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 16.04f)
            arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, -2.58f)
            lineTo(9.5f, 6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(6.95f)
            arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 16.04f)
            close()
            moveTo(17f, 10.73f)
            curveToRelative(4.57f, 4.95f, 0.74f, 13.41f, -6f, 13.27f)
            curveTo(4.26f, 24.14f, 0.43f, 15.68f, 5f, 10.73f)
            lineTo(5f, 6.04f)
            curveToRelative(0.25f, -7.93f, 11.75f, -7.93f, 12f, 0f)
            close()
            moveTo(16f, 16f)
            arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.59f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11.33f)
            lineTo(14f, 6.04f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
            lineTo(8f, 11.33f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.46f, 1.08f)
            arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 16f)
            close()
            moveTo(24f, 2.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 0f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 2.5f)
            close()
        }
    }.also { _TemperatureHigh = it }
