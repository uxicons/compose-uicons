package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferArrow: ImageVector? = null

val Icons.Br.ReferArrow: ImageVector
    get() = _ReferArrow ?: UXIcon(name = "ReferArrow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(11.31f, 0f, 8f, 0f)
            reflectiveCurveTo(2f, 2.69f, 2f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(8f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(10.98f, 15.79f)
            curveToRelative(-0.12f, 0.82f, -0.87f, 1.39f, -1.7f, 1.27f)
            curveToRelative(-0.26f, -0.04f, -0.52f, -0.06f, -0.79f, -0.06f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -4.69f, 3.81f, -8.5f, 8.5f, -8.5f)
            curveToRelative(0.41f, 0f, 0.81f, 0.03f, 1.21f, 0.09f)
            curveToRelative(0.82f, 0.12f, 1.39f, 0.88f, 1.27f, 1.7f)
            close()
            moveTo(22.97f, 18.97f)
            lineToRelative(-2.38f, 2.55f)
            curveToRelative(-0.3f, 0.32f, -0.7f, 0.48f, -1.1f, 0.48f)
            curveToRelative(-0.37f, 0f, -0.73f, -0.13f, -1.02f, -0.4f)
            curveToRelative(-0.6f, -0.56f, -0.64f, -1.51f, -0.07f, -2.12f)
            lineToRelative(1.38f, -1.48f)
            horizontalLineToRelative(-2.78f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            horizontalLineToRelative(2.78f)
            lineToRelative(-1.38f, -1.48f)
            curveToRelative(-0.56f, -0.6f, -0.53f, -1.55f, 0.07f, -2.12f)
            curveToRelative(0.6f, -0.56f, 1.55f, -0.53f, 2.12f, 0.07f)
            lineToRelative(2.41f, 2.59f)
            curveToRelative(1.33f, 1.33f, 1.33f, 3.55f, -0.04f, 4.91f)
            close()
        }
    }.also { _ReferArrow = it }
