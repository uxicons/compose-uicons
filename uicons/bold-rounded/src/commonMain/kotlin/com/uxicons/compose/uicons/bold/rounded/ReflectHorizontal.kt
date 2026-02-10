package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontal: ImageVector? = null

val Icons.Br.ReflectHorizontal: ImageVector
    get() = _ReflectHorizontal ?: UXIcon(name = "ReflectHorizontal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 1.5f)
            lineTo(13.5f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(10.5f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(9f, 12f)
            curveToRelative(0f, 0.74f, -0.32f, 1.45f, -0.87f, 1.94f)
            lineToRelative(-4.3f, 4.41f)
            curveToRelative(-0.47f, 0.43f, -1.03f, 0.65f, -1.6f, 0.65f)
            curveToRelative(-0.3f, 0f, -0.6f, -0.06f, -0.89f, -0.19f)
            curveToRelative(-0.82f, -0.36f, -1.34f, -1.17f, -1.34f, -2.06f)
            lineTo(0f, 7.25f)
            curveToRelative(0f, -0.89f, 0.53f, -1.7f, 1.34f, -2.06f)
            curveToRelative(0.81f, -0.36f, 1.77f, -0.2f, 2.43f, 0.4f)
            lineToRelative(4.43f, 4.53f)
            curveToRelative(0.48f, 0.43f, 0.8f, 1.13f, 0.8f, 1.88f)
            close()
            moveTo(5.84f, 12f)
            lineToRelative(-2.84f, -2.91f)
            verticalLineToRelative(5.82f)
            lineToRelative(2.84f, -2.91f)
            close()
            moveTo(24f, 7.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.89f, -0.53f, 1.7f, -1.34f, 2.06f)
            curveToRelative(-0.29f, 0.13f, -0.6f, 0.19f, -0.9f, 0.19f)
            curveToRelative(-0.55f, 0f, -1.1f, -0.2f, -1.52f, -0.59f)
            lineToRelative(-4.43f, -4.53f)
            curveToRelative(-0.48f, -0.43f, -0.8f, -1.13f, -0.8f, -1.88f)
            reflectiveCurveToRelative(0.32f, -1.45f, 0.87f, -1.94f)
            lineToRelative(4.3f, -4.41f)
            curveToRelative(0.72f, -0.66f, 1.67f, -0.82f, 2.48f, -0.46f)
            curveToRelative(0.82f, 0.36f, 1.34f, 1.17f, 1.34f, 2.06f)
            close()
        }
    }.also { _ReflectHorizontal = it }
