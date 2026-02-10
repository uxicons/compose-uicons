package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mercury: ImageVector? = null

val Icons.Br.Mercury: ImageVector
    get() = _Mercury ?: UXIcon(name = "Mercury") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 10f)
            curveToRelative(0f, -2.67f, -1.32f, -5.04f, -3.34f, -6.5f)
            curveToRelative(0.39f, -0.28f, 0.77f, -0.61f, 1.11f, -0.96f)
            curveToRelative(0.57f, -0.6f, 0.55f, -1.55f, -0.04f, -2.12f)
            curveToRelative(-0.6f, -0.57f, -1.55f, -0.56f, -2.12f, 0.04f)
            curveToRelative(-0.95f, 0.99f, -2.23f, 1.54f, -3.61f, 1.54f)
            reflectiveCurveToRelative(-2.66f, -0.55f, -3.61f, -1.54f)
            curveToRelative(-0.57f, -0.6f, -1.52f, -0.62f, -2.12f, -0.04f)
            curveToRelative(-0.6f, 0.57f, -0.62f, 1.52f, -0.04f, 2.12f)
            curveToRelative(0.34f, 0.36f, 0.72f, 0.68f, 1.11f, 0.96f)
            curveToRelative(-2.02f, 1.45f, -3.34f, 3.82f, -3.34f, 6.5f)
            curveToRelative(0f, 3.9f, 2.8f, 7.15f, 6.5f, 7.86f)
            verticalLineToRelative(1.14f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1.14f)
            curveToRelative(3.7f, -0.7f, 6.5f, -3.96f, 6.5f, -7.86f)
            close()
            moveTo(7f, 10f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
            close()
        }
    }.also { _Mercury = it }
