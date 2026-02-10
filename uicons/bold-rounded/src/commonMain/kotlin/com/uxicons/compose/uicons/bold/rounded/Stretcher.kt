package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stretcher: ImageVector? = null

val Icons.Br.Stretcher: ImageVector
    get() = _Stretcher ?: UXIcon(name = "Stretcher") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21f, 18f)
            curveToRelative(-0.37f, 0f, -0.72f, 0.07f, -1.04f, 0.19f)
            lineToRelative(-2.75f, -2.56f)
            lineToRelative(3.89f, -3.62f)
            horizontalLineToRelative(1.41f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-12.7f)
            curveToRelative(-1.21f, 0f, -2.35f, -0.64f, -2.98f, -1.68f)
            lineTo(2.78f, 0.72f)
            curveTo(2.35f, 0.01f, 1.43f, -0.21f, 0.72f, 0.22f)
            curveTo(0.01f, 0.65f, -0.21f, 1.57f, 0.22f, 2.28f)
            lineToRelative(4.04f, 6.61f)
            curveToRelative(1.0f, 1.64f, 2.7f, 2.75f, 4.57f, 3.04f)
            lineToRelative(3.97f, 3.7f)
            lineToRelative(-2.75f, 2.57f)
            curveToRelative(-0.33f, -0.12f, -0.68f, -0.19f, -1.04f, -0.19f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            curveToRelative(0f, -0.17f, -0.01f, -0.33f, -0.04f, -0.5f)
            lineToRelative(3.04f, -2.83f)
            lineToRelative(3.04f, 2.83f)
            curveToRelative(-0.03f, 0.16f, -0.04f, 0.33f, -0.04f, 0.5f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
            close()
            moveTo(13.31f, 12f)
            horizontalLineToRelative(3.38f)
            lineToRelative(-1.69f, 1.57f)
            lineToRelative(-1.69f, -1.57f)
            close()
        }
    }.also { _Stretcher = it }
