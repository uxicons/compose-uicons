package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eraser: ImageVector? = null

val Icons.Br.Eraser: ImageVector
    get() = _Eraser ?: UXIcon(name = "Eraser") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 20f)
            horizontalLineToRelative(-6.89f)
            lineToRelative(6.78f, -6.78f)
            curveToRelative(1.04f, -1.04f, 1.61f, -2.42f, 1.61f, -3.89f)
            reflectiveCurveToRelative(-0.57f, -2.85f, -1.61f, -3.89f)
            lineToRelative(-2.83f, -2.83f)
            curveToRelative(-2.14f, -2.14f, -5.63f, -2.14f, -7.78f, 0.01f)
            lineTo(1.61f, 12.87f)
            curveToRelative(-2.15f, 2.15f, -2.15f, 5.63f, 0f, 7.78f)
            lineToRelative(0.74f, 0.74f)
            curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
            horizontalLineToRelative(16.26f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(13.9f, 4.73f)
            curveToRelative(0.49f, -0.49f, 1.13f, -0.73f, 1.77f, -0.73f)
            reflectiveCurveToRelative(1.28f, 0.24f, 1.77f, 0.73f)
            lineToRelative(2.83f, 2.83f)
            curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
            reflectiveCurveToRelative(-0.26f, 1.3f, -0.73f, 1.77f)
            lineToRelative(-4.28f, 4.28f)
            lineToRelative(-6.35f, -6.35f)
            lineToRelative(4.26f, -4.29f)
            close()
            moveTo(6.24f, 20f)
            curveToRelative(-0.66f, 0f, -1.3f, -0.27f, -1.77f, -0.73f)
            lineToRelative(-0.74f, -0.74f)
            curveToRelative(-0.97f, -0.97f, -0.97f, -2.56f, 0.01f, -3.54f)
            lineToRelative(3.8f, -3.83f)
            lineToRelative(6.34f, 6.34f)
            lineToRelative(-2.51f, 2.51f)
            horizontalLineToRelative(-5.12f)
            close()
        }
    }.also { _Eraser = it }
