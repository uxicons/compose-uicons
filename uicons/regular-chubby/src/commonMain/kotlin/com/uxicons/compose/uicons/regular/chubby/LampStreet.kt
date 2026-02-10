package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampStreet: ImageVector? = null

val Icons.Rc.LampStreet: ImageVector
    get() = _LampStreet ?: UXIcon(name = "LampStreet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.41f, 7.03f)
                curveToRelative(-0.48f, -4.16f, -2.88f, -6.03f, -7.66f, -6.03f)
                curveToRelative(-5.36f, 0f, -7.75f, 2.39f, -7.75f, 7.75f)
                curveToRelative(0f, 5.72f, 0.5f, 13.24f, 0.5f, 13.32f)
                curveToRelative(0.04f, 0.55f, 0.52f, 0.97f, 1.06f, 0.93f)
                curveToRelative(0.55f, -0.04f, 0.97f, -0.51f, 0.93f, -1.06f)
                curveToRelative(-0.01f, -0.07f, -0.5f, -7.53f, -0.5f, -13.18f)
                curveToRelative(0f, -4.25f, 1.5f, -5.75f, 5.75f, -5.75f)
                curveToRelative(3.67f, 0f, 5.25f, 1.08f, 5.64f, 4.04f)
                curveToRelative(-4.41f, 0.32f, -6.39f, 2.66f, -6.39f, 7.46f)
                curveToRelative(0f, 0.48f, 0.34f, 0.89f, 0.8f, 0.98f)
                curveToRelative(0.08f, 0.02f, 1.64f, 0.32f, 4.22f, 0.46f)
                curveToRelative(0.12f, 1.46f, 0.85f, 2.06f, 2.48f, 2.06f)
                reflectiveCurveToRelative(2.36f, -0.6f, 2.48f, -2.06f)
                curveToRelative(2.58f, -0.14f, 4.14f, -0.44f, 4.22f, -0.46f)
                curveToRelative(0.47f, -0.09f, 0.8f, -0.5f, 0.8f, -0.98f)
                curveToRelative(0f, -4.87f, -2.04f, -7.21f, -6.59f, -7.47f)
                close()
                moveTo(15.5f, 14f)
                curveToRelative(-2.53f, 0f, -4.45f, -0.21f, -5.48f, -0.35f)
                curveToRelative(0.19f, -3.46f, 1.66f, -4.65f, 5.48f, -4.65f)
                reflectiveCurveToRelative(5.29f, 1.19f, 5.48f, 4.65f)
                curveToRelative(-1.02f, 0.14f, -2.95f, 0.35f, -5.48f, 0.35f)
                close()
            }
        }.also { _LampStreet = it}
