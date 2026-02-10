package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilLightbulb: ImageVector? = null

val Icons.Rs.PencilLightbulb: ImageVector
    get() = _PencilLightbulb ?: UXIcon(name = "PencilLightbulb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(7.59f, 0f, 4f, 3.59f, 4f, 8f)
                curveToRelative(0f, 2.84f, 1.52f, 5.49f, 3.98f, 6.91f)
                curveToRelative(0.63f, 0.37f, 1.02f, 1.03f, 1.02f, 1.74f)
                verticalLineToRelative(4.3f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(-4.3f)
                curveToRelative(0f, -0.7f, 0.39f, -1.37f, 1.02f, -1.74f)
                curveToRelative(2.46f, -1.43f, 3.98f, -4.08f, 3.98f, -6.91f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21.12f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-3.12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.12f)
                lineToRelative(-1f, 1f)
                close()
                moveTo(15.01f, 13.19f)
                curveToRelative(-0.73f, 0.43f, -1.3f, 1.07f, -1.64f, 1.81f)
                horizontalLineToRelative(-0.37f)
                verticalLineToRelative(-5.18f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineToRelative(5.18f)
                horizontalLineToRelative(-0.37f)
                curveToRelative(-0.34f, -0.74f, -0.91f, -1.39f, -1.64f, -1.81f)
                curveToRelative(-1.84f, -1.07f, -2.99f, -3.06f, -2.99f, -5.19f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.13f, -1.15f, 4.11f, -2.99f, 5.19f)
                close()
            }
        }.also { _PencilLightbulb = it}
