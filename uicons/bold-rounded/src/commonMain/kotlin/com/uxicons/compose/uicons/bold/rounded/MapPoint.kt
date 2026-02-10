package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPoint: ImageVector? = null

val Icons.Br.MapPoint: ImageVector
    get() = _MapPoint ?: UXIcon(name = "MapPoint") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.66f, 10.68f)
            curveToRelative(0.75f, 0.73f, 1.94f, 0.73f, 2.69f, 0f)
            lineToRelative(2.19f, -2.14f)
            curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
            reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
            curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
            reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
            curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
            reflectiveCurveToRelative(0.52f, 2.59f, 1.48f, 3.54f)
            lineToRelative(2.18f, 2.13f)
            close()
            moveTo(12f, 3f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            close()
            moveTo(22.5f, 6f)
            curveToRelative(-0.65f, 0f, -1.2f, 0.42f, -1.41f, 1f)
            horizontalLineToRelative(-1.59f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-1.26f)
            curveToRelative(-0.4f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
            lineToRelative(-2.12f, -2.12f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(2.12f, 2.12f)
            curveToRelative(0.84f, 0.84f, 2.0f, 1.32f, 3.18f, 1.32f)
            horizontalLineToRelative(1.26f)
            verticalLineToRelative(2f)
            lineTo(10f, 20.0f)
            verticalLineToRelative(-1.67f)
            curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
            lineToRelative(-1.83f, -1.83f)
            curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.48f, -1.02f)
            horizontalLineToRelative(-1.67f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.59f)
            curveToRelative(-0.21f, -0.58f, -0.76f, -1f, -1.41f, -1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(0.65f, 0f, 1.2f, -0.42f, 1.41f, -1f)
            lineTo(21.09f, 23.0f)
            curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(4.67f, 16f)
            curveToRelative(0.13f, 0f, 0.26f, 0.05f, 0.35f, 0.15f)
            lineToRelative(1.83f, 1.83f)
            curveToRelative(0.09f, 0.1f, 0.15f, 0.22f, 0.15f, 0.35f)
            verticalLineToRelative(1.67f)
            lineTo(3f, 20.0f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(1.67f)
            close()
        }
    }.also { _MapPoint = it }
