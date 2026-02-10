package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtRunning: ImageVector? = null

val Icons.Br.ShirtRunning: ImageVector
    get() = _ShirtRunning ?: UXIcon(name = "ShirtRunning") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.41f, 7.55f)
            curveToRelative(-0.89f, -0.55f, -1.41f, -1.5f, -1.41f, -2.55f)
            lineTo(18f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            lineTo(9f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.04f, -0.53f, 2.0f, -1.42f, 2.55f)
            curveToRelative(-0.98f, 0.61f, -1.58f, 1.73f, -1.58f, 2.93f)
            verticalLineToRelative(8.53f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(8f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-8.53f)
            curveToRelative(0f, -1.19f, -0.61f, -2.31f, -1.59f, -2.93f)
            close()
            moveTo(6f, 10.47f)
            curveToRelative(0f, -0.16f, 0.07f, -0.32f, 0.17f, -0.38f)
            curveToRelative(0.71f, -0.44f, 1.31f, -1.02f, 1.77f, -1.68f)
            curveToRelative(1.07f, 0.98f, 2.5f, 1.59f, 4.06f, 1.59f)
            reflectiveCurveToRelative(2.99f, -0.6f, 4.06f, -1.59f)
            curveToRelative(0.45f, 0.64f, 1.02f, 1.2f, 1.71f, 1.64f)
            lineToRelative(-11.77f, 9.05f)
            curveToRelative(-0.0f, -0.04f, -0.0f, -0.07f, -0.0f, -0.1f)
            verticalLineToRelative(-8.53f)
            close()
            moveTo(16f, 21.0f)
            horizontalLineToRelative(-7.54f)
            lineToRelative(9.54f, -7.34f)
            verticalLineToRelative(5.34f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
        }
    }.also { _ShirtRunning = it }
