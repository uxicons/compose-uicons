package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Br.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineTo(13.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(6.94f)
            curveToRelative(1.1f, 0f, 2.12f, -0.49f, 2.8f, -1.35f)
            curveToRelative(0.67f, -0.84f, 0.91f, -1.91f, 0.67f, -2.94f)
            curveToRelative(-1.2f, -5.11f, -5.45f, -8.95f, -10.41f, -9.6f)
            verticalLineTo(3f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(2.1f)
            curveTo(5.54f, 5.75f, 1.29f, 9.59f, 0.09f, 14.7f)
            curveToRelative(-0.24f, 1.03f, 0.0f, 2.1f, 0.67f, 2.94f)
            curveToRelative(0.68f, 0.86f, 1.7f, 1.35f, 2.8f, 1.35f)
            horizontalLineToRelative(6.94f)
            verticalLineToRelative(2f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineTo(22.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(3.11f, 15.78f)
            curveToRelative(-0.07f, -0.08f, -0.14f, -0.22f, -0.1f, -0.39f)
            curveToRelative(1.0f, -4.28f, 4.78f, -7.39f, 8.99f, -7.39f)
            reflectiveCurveToRelative(7.99f, 3.11f, 8.99f, 7.39f)
            curveToRelative(0.04f, 0.17f, -0.03f, 0.31f, -0.1f, 0.39f)
            curveToRelative(-0.05f, 0.07f, -0.2f, 0.22f, -0.45f, 0.22f)
            horizontalLineTo(3.56f)
            curveToRelative(-0.25f, 0f, -0.4f, -0.15f, -0.45f, -0.22f)
            close()
        }
    }.also { _ConciergeBell = it }
