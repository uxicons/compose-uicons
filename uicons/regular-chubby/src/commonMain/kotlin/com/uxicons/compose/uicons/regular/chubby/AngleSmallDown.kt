package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallDown: ImageVector? = null

val Icons.Rc.AngleSmallDown: ImageVector
    get() = _AngleSmallDown ?: UXIcon(name = "AngleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.2f, 8.93f)
                curveToRelative(-0.53f, -0.17f, -1.09f, 0.12f, -1.26f, 0.65f)
                curveToRelative(-0.83f, 2.58f, -2.41f, 3.32f, -2.94f, 3.5f)
                curveToRelative(-0.54f, -0.19f, -2.11f, -0.93f, -2.94f, -3.5f)
                curveToRelative(-0.17f, -0.53f, -0.73f, -0.81f, -1.26f, -0.65f)
                curveToRelative(-0.53f, 0.17f, -0.81f, 0.73f, -0.64f, 1.26f)
                curveToRelative(1.38f, 4.27f, 4.54f, 4.88f, 4.67f, 4.91f)
                curveToRelative(0.06f, 0.01f, 0.12f, 0.02f, 0.18f, 0.02f)
                reflectiveCurveToRelative(0.12f, -0.01f, 0.18f, -0.02f)
                curveToRelative(0.13f, -0.02f, 3.29f, -0.64f, 4.67f, -4.91f)
                curveToRelative(0.17f, -0.53f, -0.12f, -1.09f, -0.64f, -1.26f)
                close()
            }
        }.also { _AngleSmallDown = it}
