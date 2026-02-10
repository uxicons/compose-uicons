package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindTurbine: ImageVector? = null

val Icons.Sr.WindTurbine: ImageVector
    get() = _WindTurbine ?: UXIcon(name = "WindTurbine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.68f, 13.76f)
                curveToRelative(-1.37f, -1.09f, -3.91f, -3.07f, -6.06f, -4.47f)
                curveToRelative(-0.29f, -2.56f, -0.93f, -5.71f, -1.29f, -7.42f)
                curveToRelative(-0.24f, -1.1f, -1.19f, -1.87f, -2.33f, -1.87f)
                reflectiveCurveToRelative(-2.09f, 0.77f, -2.33f, 1.87f)
                curveToRelative(-0.37f, 1.71f, -1.0f, 4.86f, -1.29f, 7.42f)
                curveToRelative(-2.16f, 1.4f, -4.69f, 3.37f, -6.06f, 4.47f)
                curveToRelative(-0.88f, 0.7f, -1.15f, 1.91f, -0.64f, 2.92f)
                curveToRelative(0.5f, 1.01f, 1.62f, 1.53f, 2.71f, 1.25f)
                curveToRelative(1.59f, -0.41f, 4.32f, -1.14f, 6.61f, -1.94f)
                lineToRelative(0.01f, 6.01f)
                horizontalLineToRelative(-3.01f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.99f)
                lineToRelative(-0.01f, -6.01f)
                curveToRelative(2.29f, 0.8f, 5.02f, 1.53f, 6.61f, 1.94f)
                curveToRelative(0.2f, 0.05f, 0.4f, 0.08f, 0.6f, 0.08f)
                curveToRelative(0.88f, 0f, 1.71f, -0.49f, 2.12f, -1.32f)
                curveToRelative(0.51f, -1.01f, 0.24f, -2.21f, -0.64f, -2.92f)
                close()
                moveTo(12.01f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _WindTurbine = it}
