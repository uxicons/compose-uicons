package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallDown: ImageVector? = null

val Icons.Tc.AngleSmallDown: ImageVector
    get() = _AngleSmallDown ?: UXIcon(name = "AngleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.55f, 9.07f)
                curveToRelative(-0.27f, -0.08f, -0.55f, 0.06f, -0.63f, 0.33f)
                curveToRelative(-1.14f, 3.61f, -3.43f, 4.41f, -3.92f, 4.54f)
                curveToRelative(-0.5f, -0.13f, -2.78f, -0.93f, -3.92f, -4.54f)
                curveToRelative(-0.08f, -0.26f, -0.36f, -0.41f, -0.63f, -0.33f)
                curveToRelative(-0.26f, 0.08f, -0.41f, 0.36f, -0.33f, 0.63f)
                curveToRelative(1.44f, 4.58f, 4.64f, 5.22f, 4.78f, 5.24f)
                curveToRelative(0.03f, 0.01f, 0.06f, 0.01f, 0.09f, 0.01f)
                reflectiveCurveToRelative(0.06f, -0.0f, 0.09f, -0.01f)
                curveToRelative(0.14f, -0.03f, 3.34f, -0.67f, 4.78f, -5.24f)
                curveToRelative(0.08f, -0.26f, -0.06f, -0.54f, -0.33f, -0.63f)
                close()
            }
        }.also { _AngleSmallDown = it}
