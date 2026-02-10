package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneTail: ImageVector? = null

val Icons.Br.PlaneTail: ImageVector
    get() = _PlaneTail ?: UXIcon(name = "PlaneTail") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.27f, 15.11f)
            curveToRelative(-0.89f, -0.32f, -1.95f, -0.69f, -3.15f, -1.07f)
            lineToRelative(2.77f, -10.41f)
            curveToRelative(0.23f, -0.88f, 0.05f, -1.79f, -0.5f, -2.51f)
            curveToRelative(-0.55f, -0.72f, -1.39f, -1.13f, -2.29f, -1.13f)
            horizontalLineToRelative(-0.28f)
            curveToRelative(-1.47f, 0f, -2.87f, 0.69f, -3.77f, 1.85f)
            curveToRelative(0f, 0f, -6.72f, 7.76f, -6.74f, 7.79f)
            curveToRelative(-0.97f, 1.29f, -2.94f, 1.36f, -3.32f, 1.36f)
            lineTo(1.5f, 11f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(6.26f, 0f, 13.39f, 2.08f, 17.67f, 3.56f)
            curveToRelative(-4.28f, 1.43f, -11.41f, 3.44f, -17.67f, 3.44f)
            lineTo(1.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(7.27f, 0f, 15.49f, -2.5f, 19.75f, -3.98f)
            curveToRelative(1.05f, -0.37f, 1.74f, -1.33f, 1.74f, -2.44f)
            reflectiveCurveToRelative(-0.67f, -2.08f, -1.72f, -2.46f)
            close()
            moveTo(10.69f, 11.49f)
            reflectiveCurveToRelative(6.72f, -7.76f, 6.74f, -7.79f)
            curveToRelative(0.33f, -0.44f, 0.85f, -0.7f, 1.4f, -0.7f)
            horizontalLineToRelative(0.14f)
            lineToRelative(-2.72f, 10.19f)
            curveToRelative(-1.81f, -0.51f, -3.79f, -0.99f, -5.83f, -1.37f)
            curveToRelative(0.09f, -0.1f, 0.18f, -0.21f, 0.27f, -0.33f)
            close()
            moveTo(6.5f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(6.5f, 19f)
            close()
        }
    }.also { _PlaneTail = it }
