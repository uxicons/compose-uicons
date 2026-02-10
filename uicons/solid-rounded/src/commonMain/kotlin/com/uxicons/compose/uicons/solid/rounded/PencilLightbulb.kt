package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilLightbulb: ImageVector? = null

val Icons.Sr.PencilLightbulb: ImageVector
    get() = _PencilLightbulb ?: UXIcon(name = "PencilLightbulb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.14f, 6.47f)
                curveTo(4.73f, 3.31f, 7.25f, 0.77f, 10.4f, 0.16f)
                curveToRelative(2.4f, -0.47f, 4.83f, 0.14f, 6.68f, 1.67f)
                curveToRelative(1.85f, 1.53f, 2.92f, 3.78f, 2.92f, 6.18f)
                curveToRelative(0.01f, 2.9f, -1.6f, 5.54f, -4.09f, 7f)
                horizontalLineToRelative(-2.91f)
                verticalLineToRelative(-5.18f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineToRelative(5.18f)
                horizontalLineToRelative(-2.9f)
                curveToRelative(-3.02f, -1.73f, -4.61f, -5.05f, -3.96f, -8.53f)
                close()
                moveTo(9f, 17f)
                verticalLineToRelative(2.02f)
                curveToRelative(0f, 1.59f, 0.49f, 2.89f, 1.47f, 3.86f)
                lineToRelative(0.83f, 0.83f)
                curveToRelative(0.37f, 0.39f, 1.04f, 0.39f, 1.41f, 0f)
                lineToRelative(0.83f, -0.83f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                verticalLineToRelative(-2.34f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _PencilLightbulb = it}
