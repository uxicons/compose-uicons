package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadMapPin: ImageVector? = null

val Icons.Br.RoadMapPin: ImageVector
    get() = _RoadMapPin ?: UXIcon(name = "RoadMapPin") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 13f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(8.48f, 8.55f)
            curveToRelative(-0.96f, -0.96f, -1.48f, -2.21f, -1.48f, -3.55f)
            reflectiveCurveToRelative(0.52f, -2.59f, 1.47f, -3.54f)
            curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
            reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.46f)
            curveToRelative(0.94f, 0.94f, 1.47f, 2.2f, 1.47f, 3.54f)
            reflectiveCurveToRelative(-0.52f, 2.59f, -1.47f, 3.54f)
            lineToRelative(-1.81f, 1.77f)
            curveToRelative(-0.96f, 0.94f, -2.5f, 0.94f, -3.46f, 0f)
            lineToRelative(-1.8f, -1.76f)
            close()
            moveTo(10f, 5f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
            close()
            moveTo(23.92f, 17.76f)
            lineToRelative(-1.45f, -8.21f)
            curveToRelative(-0.18f, -1.04f, -0.66f, -2.0f, -1.37f, -2.77f)
            curveToRelative(-0.56f, -0.61f, -1.51f, -0.65f, -2.12f, -0.09f)
            reflectiveCurveToRelative(-0.65f, 1.51f, -0.09f, 2.12f)
            curveToRelative(0.32f, 0.35f, 0.54f, 0.79f, 0.62f, 1.26f)
            lineToRelative(1.45f, 8.21f)
            curveToRelative(0.28f, 1.37f, -0.89f, 2.75f, -2.28f, 2.72f)
            horizontalLineToRelative(-5.18f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            lineTo(5.32f, 21.0f)
            curveToRelative(-1.4f, 0.03f, -2.56f, -1.35f, -2.28f, -2.72f)
            lineToRelative(1.44f, -8.21f)
            curveToRelative(0.08f, -0.47f, 0.3f, -0.91f, 0.63f, -1.27f)
            curveToRelative(0.56f, -0.61f, 0.53f, -1.56f, -0.08f, -2.12f)
            curveToRelative(-0.61f, -0.56f, -1.56f, -0.53f, -2.12f, 0.08f)
            curveToRelative(-0.72f, 0.78f, -1.2f, 1.74f, -1.38f, 2.79f)
            lineTo(0.08f, 17.77f)
            curveToRelative(-0.63f, 3.15f, 2.03f, 6.31f, 5.24f, 6.24f)
            horizontalLineToRelative(13.36f)
            curveToRelative(3.21f, 0.08f, 5.87f, -3.09f, 5.24f, -6.24f)
            close()
        }
    }.also { _RoadMapPin = it }
