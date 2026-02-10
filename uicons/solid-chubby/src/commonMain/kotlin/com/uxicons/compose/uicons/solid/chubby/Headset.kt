package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Headset: ImageVector? = null

val Icons.Sc.Headset: ImageVector
    get() = _Headset ?: UXIcon(name = "Headset") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 16.48f)
                curveToRelative(0f, -2.16f, -0.73f, -3.71f, -2.17f, -4.65f)
                curveToRelative(-0.18f, -6.85f, -3.0f, -10.05f, -8.83f, -10.05f)
                reflectiveCurveTo(3.35f, 4.98f, 3.17f, 11.83f)
                curveToRelative(-1.44f, 0.93f, -2.17f, 2.48f, -2.17f, 4.65f)
                curveToRelative(0f, 3.78f, 2.22f, 5.7f, 6.61f, 5.7f)
                curveToRelative(0.65f, 0f, 1.22f, -0.41f, 1.42f, -1.02f)
                curveToRelative(1.01f, -3.01f, 1.01f, -6.33f, 0f, -9.35f)
                curveToRelative(-0.2f, -0.61f, -0.78f, -1.02f, -1.42f, -1.02f)
                curveToRelative(-0.49f, 0f, -0.95f, 0.02f, -1.38f, 0.07f)
                curveToRelative(0.43f, -5.57f, 3.08f, -6.07f, 5.78f, -6.07f)
                reflectiveCurveToRelative(5.35f, 0.5f, 5.78f, 6.07f)
                curveToRelative(-0.43f, -0.05f, -0.9f, -0.07f, -1.38f, -0.07f)
                curveToRelative(-0.65f, 0f, -1.22f, 0.41f, -1.42f, 1.02f)
                curveToRelative(-0.8f, 2.38f, -0.96f, 4.95f, -0.5f, 7.41f)
                curveToRelative(-0.75f, -0.0f, -1.48f, -0.03f, -2.17f, -0.09f)
                curveToRelative(-0.83f, -0.06f, -1.55f, 0.55f, -1.61f, 1.38f)
                curveToRelative(-0.07f, 0.83f, 0.55f, 1.55f, 1.38f, 1.61f)
                curveToRelative(0.81f, 0.06f, 1.66f, 0.1f, 2.54f, 0.1f)
                curveToRelative(0.59f, 0f, 1.2f, -0.01f, 1.82f, -0.04f)
                curveToRelative(4.36f, -0.01f, 6.57f, -1.93f, 6.57f, -5.7f)
                close()
            }
        }.also { _Headset = it}
