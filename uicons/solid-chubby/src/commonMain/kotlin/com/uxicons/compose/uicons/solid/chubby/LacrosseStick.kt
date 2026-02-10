package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LacrosseStick: ImageVector? = null

val Icons.Sc.LacrosseStick: ImageVector
    get() = _LacrosseStick ?: UXIcon(name = "LacrosseStick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 9.0f)
                curveToRelative(0.17f, -2.02f, -0.63f, -3.98f, -2.33f, -5.68f)
                curveToRelative(-3.23f, -3.23f, -7.39f, -3.08f, -10.86f, 0.39f)
                curveToRelative(-1.26f, 1.26f, -1.59f, 2.65f, -1.61f, 3.67f)
                curveToRelative(-2.62f, 1.07f, -2.96f, 3.59f, -2.96f, 5.46f)
                curveToRelative(-0.0f, 1.33f, 0.18f, 2.39f, 0.58f, 3.24f)
                lineToRelative(-4.36f, 4.36f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(4.37f, -4.37f)
                curveToRelative(0.85f, 0.4f, 1.91f, 0.59f, 3.19f, 0.59f)
                horizontalLineToRelative(0.04f)
                curveToRelative(2.87f, -0.01f, 4.67f, -0.98f, 5.47f, -2.96f)
                curveToRelative(1.01f, -0.03f, 2.4f, -0.35f, 3.65f, -1.61f)
                curveToRelative(1.6f, -1.6f, 2.54f, -3.41f, 2.69f, -5.21f)
                close()
            }
        }.also { _LacrosseStick = it}
