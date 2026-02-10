package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFlag: ImageVector? = null

val Icons.Br.HouseFlag: ImageVector
    get() = _HouseFlag ?: UXIcon(name = "HouseFlag") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.77f, 9.91f)
            curveToRelative(-0.78f, 0.28f, -1.64f, -0.11f, -1.93f, -0.89f)
            curveToRelative(-0.18f, -0.49f, -0.51f, -0.91f, -0.95f, -1.21f)
            lineToRelative(-6.5f, -4.39f)
            curveToRelative(-0.85f, -0.57f, -1.95f, -0.57f, -2.8f, 0f)
            lineToRelative(-6.5f, 4.39f)
            curveToRelative(-0.69f, 0.47f, -1.1f, 1.24f, -1.1f, 2.07f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-8.61f)
            curveToRelative(0f, -1.83f, 0.91f, -3.54f, 2.42f, -4.56f)
            lineTo(8.92f, 0.94f)
            curveToRelative(1.87f, -1.26f, 4.28f, -1.26f, 6.15f, 0f)
            lineToRelative(6.92f, 4.72f)
            curveToRelative(0.74f, 0.62f, 1.32f, 1.4f, 1.66f, 2.32f)
            curveToRelative(0.29f, 0.78f, -0.11f, 1.64f, -0.89f, 1.93f)
            close()
            moveTo(21.87f, 12.78f)
            lineToRelative(-3.5f, -2.5f)
            curveToRelative(-0.46f, -0.33f, -1.06f, -0.37f, -1.56f, -0.11f)
            curveToRelative(-0.5f, 0.26f, -0.81f, 0.77f, -0.81f, 1.33f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5.36f)
            lineToRelative(2.83f, -1.89f)
            curveToRelative(0.41f, -0.27f, 0.66f, -0.73f, 0.67f, -1.22f)
            curveToRelative(0.01f, -0.49f, -0.23f, -0.96f, -0.63f, -1.25f)
            close()
        }
    }.also { _HouseFlag = it }
