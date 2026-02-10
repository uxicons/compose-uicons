package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeArrowProgress: ImageVector? = null

val Icons.Br.EyeArrowProgress: ImageVector
    get() = _EyeArrowProgress ?: UXIcon(name = "EyeArrowProgress") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.03f, 8.93f)
            curveToRelative(-1.56f, -2.21f, -5.06f, -5.93f, -11.03f, -5.93f)
            reflectiveCurveTo(2.52f, 6.71f, 0.97f, 8.93f)
            curveToRelative(-1.29f, 1.84f, -1.29f, 4.31f, -0.0f, 6.14f)
            curveToRelative(1.56f, 2.21f, 5.06f, 5.93f, 11.03f, 5.93f)
            reflectiveCurveToRelative(9.47f, -3.71f, 11.03f, -5.93f)
            curveToRelative(1.29f, -1.84f, 1.29f, -4.31f, 0.0f, -6.14f)
            close()
            moveTo(20.57f, 13.35f)
            curveToRelative(-1.22f, 1.74f, -3.96f, 4.65f, -8.57f, 4.65f)
            reflectiveCurveToRelative(-7.35f, -2.92f, -8.58f, -4.65f)
            curveToRelative(-0.57f, -0.81f, -0.56f, -1.89f, 0.0f, -2.69f)
            curveToRelative(1.22f, -1.74f, 3.96f, -4.65f, 8.57f, -4.65f)
            reflectiveCurveToRelative(7.36f, 2.92f, 8.58f, 4.66f)
            curveToRelative(0.56f, 0.8f, 0.56f, 1.88f, -0.0f, 2.69f)
            close()
            moveTo(12f, 7f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            curveToRelative(0f, 0.34f, 0.04f, 0.67f, 0.1f, 0.99f)
            lineToRelative(1.69f, -1.69f)
            curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
            lineToRelative(0.79f, 0.79f)
            lineToRelative(0.85f, -0.85f)
            lineToRelative(-0.66f, -0.66f)
            curveToRelative(-0.4f, -0.4f, -0.12f, -1.07f, 0.44f, -1.07f)
            horizontalLineToRelative(2.76f)
            curveToRelative(0.34f, 0f, 0.61f, 0.27f, 0.61f, 0.61f)
            verticalLineToRelative(2.76f)
            curveToRelative(0f, 0.56f, -0.68f, 0.84f, -1.07f, 0.44f)
            lineToRelative(-0.66f, -0.66f)
            lineToRelative(-1.56f, 1.56f)
            curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
            lineToRelative(-0.79f, -0.79f)
            lineToRelative(-1.53f, 1.53f)
            curveToRelative(0.91f, 1.24f, 2.37f, 2.06f, 4.03f, 2.06f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
            close()
        }
    }.also { _EyeArrowProgress = it }
