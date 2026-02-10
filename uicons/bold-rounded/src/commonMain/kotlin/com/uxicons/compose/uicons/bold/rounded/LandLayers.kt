package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayers: ImageVector? = null

val Icons.Br.LandLayers: ImageVector
    get() = _LandLayers ?: UXIcon(name = "LandLayers") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(0.72f, 10.73f)
            lineToRelative(9.41f, 5.7f)
            curveToRelative(0.57f, 0.35f, 1.22f, 0.52f, 1.86f, 0.52f)
            reflectiveCurveToRelative(1.29f, -0.17f, 1.86f, -0.52f)
            lineToRelative(9.41f, -5.7f)
            curveToRelative(0.45f, -0.27f, 0.72f, -0.76f, 0.72f, -1.28f)
            reflectiveCurveToRelative(-0.27f, -1.01f, -0.72f, -1.28f)
            lineTo(13.86f, 2.46f)
            curveToRelative(-1.15f, -0.7f, -2.58f, -0.7f, -3.73f, 0f)
            lineTo(0.72f, 8.16f)
            curveToRelative(-0.45f, 0.27f, -0.72f, 0.76f, -0.72f, 1.28f)
            reflectiveCurveToRelative(0.27f, 1.01f, 0.72f, 1.28f)
            close()
            moveTo(12.31f, 13.86f)
            curveToRelative(-0.19f, 0.12f, -0.43f, 0.12f, -0.62f, 0f)
            lineToRelative(-2.45f, -1.48f)
            lineToRelative(2.8f, -1.68f)
            lineToRelative(2.76f, 1.66f)
            lineToRelative(-2.49f, 1.51f)
            close()
            moveTo(16.74f, 11.18f)
            lineToRelative(-2.75f, -1.65f)
            lineToRelative(2.89f, -1.73f)
            lineToRelative(2.73f, 1.65f)
            lineToRelative(-2.86f, 1.73f)
            close()
            moveTo(11.69f, 5.03f)
            curveToRelative(0.19f, -0.12f, 0.43f, -0.12f, 0.62f, 0f)
            lineToRelative(2.63f, 1.59f)
            lineToRelative(-2.9f, 1.74f)
            lineToRelative(-2.94f, -1.76f)
            lineToRelative(2.59f, -1.56f)
            close()
            moveTo(7.17f, 7.77f)
            lineToRelative(2.93f, 1.76f)
            lineToRelative(-2.79f, 1.68f)
            lineToRelative(-2.91f, -1.76f)
            lineToRelative(2.77f, -1.68f)
            close()
            moveTo(23.28f, 16.73f)
            lineToRelative(-9.41f, 5.7f)
            curveToRelative(-0.57f, 0.35f, -1.22f, 0.52f, -1.86f, 0.52f)
            reflectiveCurveToRelative(-1.29f, -0.17f, -1.86f, -0.52f)
            lineTo(0.72f, 16.73f)
            curveToRelative(-0.71f, -0.43f, -0.94f, -1.35f, -0.51f, -2.06f)
            curveToRelative(0.43f, -0.71f, 1.35f, -0.94f, 2.06f, -0.51f)
            lineToRelative(9.41f, 5.7f)
            curveToRelative(0.19f, 0.12f, 0.43f, 0.12f, 0.62f, 0f)
            lineToRelative(9.41f, -5.7f)
            curveToRelative(0.71f, -0.43f, 1.63f, -0.2f, 2.06f, 0.51f)
            reflectiveCurveToRelative(0.2f, 1.63f, -0.51f, 2.06f)
            close()
        }
    }.also { _LandLayers = it }
