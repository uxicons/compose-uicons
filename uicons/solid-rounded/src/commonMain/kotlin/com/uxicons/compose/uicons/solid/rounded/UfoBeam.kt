package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UfoBeam: ImageVector? = null

val Icons.Sr.UfoBeam: ImageVector
    get() = _UfoBeam ?: UXIcon(name = "UfoBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.92f, 16.39f)
                lineToRelative(-3f, 7f)
                curveToRelative(-0.16f, 0.38f, -0.53f, 0.61f, -0.92f, 0.61f)
                curveToRelative(-0.13f, 0f, -0.27f, -0.03f, -0.39f, -0.08f)
                curveToRelative(-0.51f, -0.22f, -0.74f, -0.81f, -0.53f, -1.31f)
                lineToRelative(3f, -7f)
                curveToRelative(0.22f, -0.51f, 0.8f, -0.75f, 1.31f, -0.53f)
                curveToRelative(0.51f, 0.22f, 0.74f, 0.81f, 0.53f, 1.31f)
                close()
                moveTo(18.92f, 15.61f)
                curveToRelative(-0.22f, -0.51f, -0.8f, -0.75f, -1.31f, -0.53f)
                curveToRelative(-0.51f, 0.22f, -0.74f, 0.81f, -0.53f, 1.31f)
                lineToRelative(3f, 7f)
                curveToRelative(0.16f, 0.38f, 0.53f, 0.61f, 0.92f, 0.61f)
                curveToRelative(0.13f, 0f, 0.27f, -0.03f, 0.39f, -0.08f)
                curveToRelative(0.51f, -0.22f, 0.74f, -0.81f, 0.53f, -1.31f)
                lineToRelative(-3f, -7f)
                close()
                moveTo(17.94f, 5.2f)
                curveToRelative(-0.4f, -2.93f, -2.9f, -5.2f, -5.94f, -5.2f)
                reflectiveCurveToRelative(-5.54f, 2.27f, -5.94f, 5.2f)
                curveToRelative(1.25f, 1.07f, 3.46f, 1.8f, 5.94f, 1.8f)
                reflectiveCurveToRelative(4.69f, -0.73f, 5.94f, -1.8f)
                close()
                moveTo(20.09f, 5.8f)
                curveToRelative(-1.45f, 1.91f, -4.48f, 3.2f, -8.09f, 3.2f)
                reflectiveCurveToRelative(-6.64f, -1.29f, -8.09f, -3.2f)
                curveToRelative(-2.51f, 0.84f, -3.91f, 2.06f, -3.91f, 3.53f)
                curveToRelative(0f, 3.06f, 6.04f, 4.67f, 12f, 4.67f)
                reflectiveCurveToRelative(12f, -1.6f, 12f, -4.67f)
                curveToRelative(0f, -1.47f, -1.41f, -2.69f, -3.91f, -3.53f)
                close()
            }
        }.also { _UfoBeam = it}
