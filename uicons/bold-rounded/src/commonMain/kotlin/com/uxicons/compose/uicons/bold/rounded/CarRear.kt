package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarRear: ImageVector? = null

val Icons.Br.CarRear: ImageVector
    get() = _CarRear ?: UXIcon(name = "CarRear") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.58f, 10.59f)
            lineToRelative(-2.58f, -7.09f)
            curveToRelative(-0.76f, -2.09f, -2.77f, -3.5f, -5.0f, -3.5f)
            lineTo(7.99f, 0f)
            curveTo(5.76f, 0f, 3.76f, 1.41f, 2.99f, 3.5f)
            lineTo(0.42f, 10.59f)
            curveToRelative(-0.28f, 0.76f, -0.42f, 1.55f, -0.42f, 2.36f)
            verticalLineToRelative(2.73f)
            curveToRelative(0f, 2.1f, 1.23f, 3.9f, 3f, 4.76f)
            verticalLineToRelative(1.55f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-1.55f)
            curveToRelative(1.77f, -0.86f, 3f, -2.67f, 3f, -4.76f)
            verticalLineToRelative(-2.73f)
            curveToRelative(0f, -0.81f, -0.14f, -1.6f, -0.42f, -2.36f)
            close()
            moveTo(5.81f, 4.53f)
            curveToRelative(0.33f, -0.91f, 1.21f, -1.53f, 2.18f, -1.53f)
            horizontalLineToRelative(8.02f)
            curveToRelative(0.97f, 0f, 1.85f, 0.61f, 2.18f, 1.53f)
            lineToRelative(1.99f, 5.47f)
            lineTo(3.82f, 10f)
            lineToRelative(1.99f, -5.47f)
            close()
            moveTo(18.68f, 18f)
            horizontalLineToRelative(-2.77f)
            curveToRelative(0.06f, -0.16f, 0.09f, -0.32f, 0.09f, -0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.18f, 0.04f, 0.34f, 0.09f, 0.5f)
            horizontalLineToRelative(-2.77f)
            curveToRelative(-1.28f, 0f, -2.32f, -1.04f, -2.32f, -2.32f)
            verticalLineToRelative(-0.68f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.18f, -0.04f, -0.34f, -0.09f, -0.5f)
            horizontalLineToRelative(11.68f)
            curveToRelative(-0.06f, 0.16f, -0.09f, 0.32f, -0.09f, 0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(0.68f)
            curveToRelative(0f, 1.28f, -1.04f, 2.32f, -2.32f, 2.32f)
            close()
        }
    }.also { _CarRear = it }
