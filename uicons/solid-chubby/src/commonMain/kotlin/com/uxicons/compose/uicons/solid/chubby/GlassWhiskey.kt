package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskey: ImageVector? = null

val Icons.Sc.GlassWhiskey: ImageVector
    get() = _GlassWhiskey ?: UXIcon(name = "GlassWhiskey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.0f, 7.02f)
                curveToRelative(-0.06f, -2.73f, 0.34f, -4.19f, 0.35f, -4.25f)
                curveToRelative(0.09f, -0.33f, 0.35f, -0.6f, 0.68f, -0.69f)
                curveToRelative(0.15f, -0.04f, 3.74f, -1.08f, 9.96f, -1.08f)
                reflectiveCurveToRelative(9.81f, 1.03f, 9.96f, 1.08f)
                curveToRelative(0.33f, 0.1f, 0.59f, 0.36f, 0.68f, 0.69f)
                curveToRelative(0.02f, 0.06f, 0.41f, 1.52f, 0.35f, 4.25f)
                curveToRelative(-0.04f, 1.84f, -0.28f, 3.94f, -0.7f, 5.98f)
                horizontalLineToRelative(-20.59f)
                curveToRelative(-0.42f, -2.04f, -0.66f, -4.14f, -0.7f, -5.98f)
                close()
                moveTo(2.16f, 15f)
                curveToRelative(1.06f, 4.14f, 2.43f, 6.42f, 2.73f, 6.89f)
                curveToRelative(0.14f, 0.21f, 0.35f, 0.37f, 0.6f, 0.43f)
                curveToRelative(0.65f, 0.16f, 3.02f, 0.68f, 6.51f, 0.68f)
                reflectiveCurveToRelative(5.86f, -0.52f, 6.51f, -0.68f)
                curveToRelative(0.25f, -0.06f, 0.46f, -0.21f, 0.6f, -0.43f)
                curveToRelative(0.3f, -0.47f, 1.67f, -2.75f, 2.73f, -6.89f)
                close()
            }
        }.also { _GlassWhiskey = it}
