package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallDown: ImageVector? = null

val Icons.Sc.AngleSmallDown: ImageVector
    get() = _AngleSmallDown ?: UXIcon(name = "AngleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.36f, 8.46f)
                curveToRelative(-0.79f, -0.26f, -1.63f, 0.18f, -1.89f, 0.97f)
                curveToRelative(-0.69f, 2.14f, -1.92f, 2.89f, -2.46f, 3.12f)
                curveToRelative(-0.56f, -0.24f, -1.78f, -0.99f, -2.47f, -3.12f)
                curveToRelative(-0.25f, -0.79f, -1.1f, -1.22f, -1.89f, -0.97f)
                curveToRelative(-0.79f, 0.25f, -1.22f, 1.1f, -0.97f, 1.89f)
                curveToRelative(1.47f, 4.55f, 4.91f, 5.22f, 5.06f, 5.25f)
                curveToRelative(0.09f, 0.02f, 0.18f, 0.02f, 0.27f, 0.02f)
                reflectiveCurveToRelative(0.18f, -0.01f, 0.27f, -0.02f)
                curveToRelative(0.15f, -0.03f, 3.59f, -0.69f, 5.06f, -5.25f)
                curveToRelative(0.25f, -0.79f, -0.18f, -1.63f, -0.97f, -1.89f)
                close()
            }
        }.also { _AngleSmallDown = it}
