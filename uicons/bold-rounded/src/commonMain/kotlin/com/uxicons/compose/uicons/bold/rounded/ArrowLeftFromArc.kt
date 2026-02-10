package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromArc: ImageVector? = null

val Icons.Br.ArrowLeftFromArc: ImageVector
    get() = _ArrowLeftFromArc ?: UXIcon(name = "ArrowLeftFromArc") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7.54f, 16.75f)
            curveToRelative(0.6f, 0.57f, 0.62f, 1.52f, 0.05f, 2.12f)
            curveToRelative(-0.29f, 0.31f, -0.69f, 0.47f, -1.09f, 0.47f)
            curveToRelative(-0.37f, 0f, -0.74f, -0.14f, -1.03f, -0.41f)
            lineTo(1.2f, 14.85f)
            curveToRelative(-0.78f, -0.78f, -1.2f, -1.78f, -1.2f, -2.85f)
            reflectiveCurveToRelative(0.42f, -2.07f, 1.17f, -2.83f)
            lineToRelative(4.29f, -4.09f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.55f, 2.12f, 0.05f)
            curveToRelative(0.57f, 0.6f, 0.55f, 1.55f, -0.05f, 2.12f)
            lineToRelative(-3.41f, 3.25f)
            horizontalLineToRelative(11.37f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(4.13f)
            lineToRelative(3.41f, 3.25f)
            close()
            moveTo(12.57f, 0.01f)
            curveToRelative(-0.84f, -0.03f, -1.53f, 0.6f, -1.57f, 1.43f)
            curveToRelative(-0.04f, 0.83f, 0.6f, 1.53f, 1.43f, 1.57f)
            curveToRelative(4.81f, 0.23f, 8.57f, 4.17f, 8.57f, 8.99f)
            reflectiveCurveToRelative(-3.77f, 8.77f, -8.57f, 8.99f)
            curveToRelative(-0.83f, 0.04f, -1.47f, 0.74f, -1.43f, 1.57f)
            curveToRelative(0.04f, 0.8f, 0.7f, 1.43f, 1.5f, 1.43f)
            curveToRelative(0.02f, 0f, 0.05f, 0f, 0.07f, -0.0f)
            curveToRelative(6.41f, -0.3f, 11.43f, -5.57f, 11.43f, -11.99f)
            reflectiveCurveTo(18.98f, 0.31f, 12.57f, 0.01f)
            close()
        }
    }.also { _ArrowLeftFromArc = it }
