package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopArrowDown: ImageVector? = null

val Icons.Br.LaptopArrowDown: ImageVector
    get() = _LaptopArrowDown ?: UXIcon(name = "LaptopArrowDown") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 18f)
            verticalLineToRelative(1.15f)
            curveToRelative(0f, 1.02f, -0.83f, 1.85f, -1.85f, 1.85f)
            lineTo(1.85f, 21f)
            curveToRelative(-1.02f, 0f, -1.85f, -0.83f, -1.85f, -1.85f)
            verticalLineToRelative(-1.15f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            verticalLineToRelative(-7.63f)
            curveToRelative(0f, -2.51f, 1.7f, -4.7f, 4.13f, -5.33f)
            curveToRelative(0.8f, -0.2f, 1.62f, 0.28f, 1.83f, 1.08f)
            curveToRelative(0.21f, 0.8f, -0.28f, 1.62f, -1.08f, 1.83f)
            curveToRelative(-1.1f, 0.28f, -1.87f, 1.28f, -1.87f, 2.42f)
            verticalLineToRelative(7.63f)
            horizontalLineToRelative(3.31f)
            lineToRelative(0.92f, 1f)
            horizontalLineToRelative(5.54f)
            lineToRelative(0.92f, -1f)
            horizontalLineToRelative(3.31f)
            verticalLineToRelative(-7.63f)
            curveToRelative(0f, -1.14f, -0.77f, -2.14f, -1.87f, -2.42f)
            curveToRelative(-0.8f, -0.21f, -1.28f, -1.02f, -1.08f, -1.83f)
            curveToRelative(0.21f, -0.8f, 1.02f, -1.28f, 1.83f, -1.08f)
            curveToRelative(2.43f, 0.62f, 4.13f, 2.81f, 4.13f, 5.33f)
            verticalLineToRelative(7.63f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(8.13f, 9.71f)
            lineToRelative(3.16f, 3.16f)
            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
            lineToRelative(3.16f, -3.16f)
            curveToRelative(0.63f, -0.63f, 0.18f, -1.71f, -0.71f, -1.71f)
            horizontalLineToRelative(-1.66f)
            lineTo(13.5f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(6.5f)
            horizontalLineToRelative(-1.66f)
            curveToRelative(-0.89f, 0f, -1.34f, 1.08f, -0.71f, 1.71f)
            close()
        }
    }.also { _LaptopArrowDown = it }
