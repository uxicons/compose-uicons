package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilLightbulb: ImageVector? = null

val Icons.Ss.PencilLightbulb: ImageVector
    get() = _PencilLightbulb ?: UXIcon(name = "PencilLightbulb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 17f)
                verticalLineToRelative(3.95f)
                lineToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(-3.95f)
                horizontalLineToRelative(6f)
                close()
                moveTo(12f, 0f)
                curveTo(7.59f, 0f, 4f, 3.59f, 4f, 8f)
                curveToRelative(0f, 2.84f, 1.52f, 5.49f, 3.98f, 6.91f)
                curveToRelative(0.04f, 0.02f, 0.07f, 0.06f, 0.11f, 0.09f)
                horizontalLineToRelative(2.91f)
                verticalLineToRelative(-5.18f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.51f, -2f, -2.82f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(5.18f)
                horizontalLineToRelative(2.91f)
                curveToRelative(0.04f, -0.03f, 0.07f, -0.06f, 0.11f, -0.09f)
                curveToRelative(2.46f, -1.43f, 3.98f, -4.08f, 3.98f, -6.91f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                close()
            }
        }.also { _PencilLightbulb = it}
