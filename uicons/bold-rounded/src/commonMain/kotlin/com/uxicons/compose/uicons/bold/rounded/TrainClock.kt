package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainClock: ImageVector? = null

val Icons.Br.TrainClock: ImageVector
    get() = _TrainClock ?: UXIcon(name = "TrainClock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 13f)
            curveToRelative(-3.04f, 0f, -5.5f, 2.46f, -5.5f, 5.5f)
            reflectiveCurveToRelative(2.46f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
            reflectiveCurveToRelative(-2.46f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(14.5f, 21f)
            curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
            lineToRelative(-1.79f, -1.79f)
            curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(2.09f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
            close()
            moveTo(5f, 15.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(23.84f, 11.16f)
            curveToRelative(-1.74f, -5.54f, -7.05f, -11.16f, -13.84f, -11.16f)
            horizontalLineToRelative(-8.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.48f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-1.48f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(18.05f)
            curveToRelative(0.62f, 0.99f, 1.1f, 2.03f, 1.43f, 3.06f)
            curveToRelative(0.27f, 0.86f, -0.28f, 1.64f, -0.95f, 1.87f)
            curveToRelative(-0.79f, 0.27f, -1.21f, 1.11f, -0.94f, 1.9f)
            curveToRelative(0.21f, 0.63f, 0.8f, 1.02f, 1.42f, 1.02f)
            curveToRelative(0.16f, 0f, 0.32f, -0.03f, 0.48f, -0.08f)
            curveToRelative(2.3f, -0.78f, 3.58f, -3.29f, 2.86f, -5.61f)
            close()
            moveTo(12f, 3.23f)
            curveToRelative(1.91f, 0.43f, 3.63f, 1.45f, 5.08f, 2.77f)
            horizontalLineToRelative(-5.08f)
            close()
            moveTo(5.98f, 3f)
            horizontalLineToRelative(3.02f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3.02f)
            close()
        }
    }.also { _TrainClock = it }
