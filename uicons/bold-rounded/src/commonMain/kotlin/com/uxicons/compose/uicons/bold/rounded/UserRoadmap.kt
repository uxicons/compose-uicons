package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserRoadmap: ImageVector? = null

val Icons.Br.UserRoadmap: ImageVector
    get() = _UserRoadmap ?: UXIcon(name = "UserRoadmap") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 8.5f)
            lineTo(17f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.66f, 0f, 1.31f, 0.13f, 1.93f, 0.38f)
            lineToRelative(3.1f, 1.26f)
            curveToRelative(0.64f, 0.4f, 0.64f, 1.33f, 0f, 1.73f)
            lineToRelative(-3.52f, 1.69f)
            verticalLineToRelative(3.44f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(3.5f, 19f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(3.5f, 20f)
            curveToRelative(-1.63f, 0f, -3.01f, 1.05f, -3.45f, 2.5f)
            curveToRelative(-0.1f, 0.32f, -0.19f, 1.5f, 1.4f, 1.5f)
            lineTo(5.56f, 24f)
            curveToRelative(1.58f, 0f, 1.49f, -1.18f, 1.4f, -1.5f)
            curveToRelative(-0.44f, -1.45f, -1.82f, -2.5f, -3.45f, -2.5f)
            close()
            moveTo(19.5f, 14f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(10.5f, 20f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
            close()
        }
    }.also { _UserRoadmap = it }
