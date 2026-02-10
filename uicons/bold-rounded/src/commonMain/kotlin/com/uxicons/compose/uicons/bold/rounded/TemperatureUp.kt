package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureUp: ImageVector? = null

val Icons.Br.TemperatureUp: ImageVector
    get() = _TemperatureUp ?: UXIcon(name = "TemperatureUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 16.04f)
            arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, -2.58f)
            lineTo(6.5f, 6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(6.95f)
            arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 16.04f)
            close()
            moveTo(14f, 10.73f)
            curveToRelative(4.57f, 4.95f, 0.74f, 13.41f, -6f, 13.27f)
            curveToRelative(-6.74f, 0.14f, -10.57f, -8.32f, -6f, -13.27f)
            lineTo(2f, 6.04f)
            curveToRelative(0.25f, -7.93f, 11.75f, -7.93f, 12f, 0f)
            close()
            moveTo(13f, 16f)
            arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.59f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 11.33f)
            lineTo(11f, 6.04f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
            lineTo(5f, 11.33f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.46f, 1.08f)
            arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 16f)
            close()
            moveTo(21f, 10.5f)
            lineTo(21f, 5.16f)
            horizontalLineToRelative(1.66f)
            arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -1.71f)
            lineTo(20.21f, 0.29f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
            lineTo(15.63f, 3.46f)
            arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 1.71f)
            lineTo(18f, 5.16f)
            lineTo(18f, 10.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 10.5f)
            close()
        }
    }.also { _TemperatureUp = it }
