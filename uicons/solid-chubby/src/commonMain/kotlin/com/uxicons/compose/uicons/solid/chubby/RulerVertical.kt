package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerVertical: ImageVector? = null

val Icons.Sc.RulerVertical: ImageVector
    get() = _RulerVertical ?: UXIcon(name = "RulerVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.71f)
                curveToRelative(0.07f, -0.63f, 0.13f, -1.3f, 0.18f, -2f)
                horizontalLineToRelative(-3.89f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.99f)
                curveToRelative(0.01f, -0.33f, 0.01f, -0.66f, 0.01f, -1f)
                reflectiveCurveToRelative(-0.01f, -0.67f, -0.01f, -1f)
                horizontalLineToRelative(-3.99f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.89f)
                curveToRelative(-0.05f, -0.7f, -0.11f, -1.37f, -0.18f, -2f)
                horizontalLineToRelative(-3.71f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.46f)
                curveToRelative(-0.23f, -1.59f, -0.46f, -2.63f, -0.48f, -2.72f)
                curveToRelative(-0.08f, -0.37f, -0.37f, -0.66f, -0.73f, -0.75f)
                curveToRelative(-0.09f, -0.02f, -2.14f, -0.53f, -4.24f, -0.53f)
                reflectiveCurveToRelative(-4.16f, 0.51f, -4.24f, 0.53f)
                curveToRelative(-0.37f, 0.09f, -0.65f, 0.38f, -0.73f, 0.75f)
                curveToRelative(-0.04f, 0.19f, -1.02f, 4.67f, -1.02f, 9.72f)
                reflectiveCurveToRelative(0.98f, 9.53f, 1.02f, 9.72f)
                curveToRelative(0.08f, 0.37f, 0.37f, 0.66f, 0.73f, 0.75f)
                curveToRelative(0.09f, 0.02f, 2.14f, 0.53f, 4.24f, 0.53f)
                reflectiveCurveToRelative(4.16f, -0.51f, 4.24f, -0.53f)
                curveToRelative(0.37f, -0.09f, 0.65f, -0.38f, 0.73f, -0.75f)
                curveToRelative(0.02f, -0.09f, 0.25f, -1.13f, 0.48f, -2.72f)
                close()
            }
        }.also { _RulerVertical = it}
