package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angry: ImageVector? = null

val Icons.Sc.Angry: ImageVector
    get() = _Angry ?: UXIcon(name = "Angry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.82f, 1.17f)
                curveTo(4.75f, 1.21f, 0.83f, 5.2f, 0.83f, 12.15f)
                reflectiveCurveToRelative(3.93f, 10.98f, 11.01f, 11.02f)
                curveToRelative(7.16f, -0.04f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(6.24f, 9.42f)
                curveToRelative(0.0f, -0.55f, 0.45f, -0.99f, 1f, -0.99f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.88f, 0.01f, 3.01f, 1.15f, 3.05f, 3.04f)
                curveToRelative(0.01f, 0.55f, -0.43f, 1.02f, -0.98f, 1.02f)
                curveToRelative(-0.38f, 0f, -0.98f, -0.26f, -1.02f, -0.98f)
                curveToRelative(-0.04f, -0.81f, -0.27f, -1.07f, -1.06f, -1.07f)
                curveToRelative(-0.55f, -0.0f, -1.0f, -0.45f, -0.99f, -1.01f)
                close()
                moveTo(17.08f, 17.9f)
                curveToRelative(-0.59f, 0.58f, -1.22f, 0.2f, -1.42f, 0.01f)
                curveToRelative(-2.47f, -2.44f, -4.81f, -2.44f, -7.34f, 0.01f)
                curveToRelative(-0.4f, 0.38f, -1.03f, 0.37f, -1.41f, -0.03f)
                curveToRelative(-0.38f, -0.4f, -0.37f, -1.03f, 0.03f, -1.41f)
                curveToRelative(3.3f, -3.19f, 6.9f, -3.19f, 10.14f, 0.01f)
                curveToRelative(0.39f, 0.39f, 0.41f, 1.03f, 0.01f, 1.41f)
                close()
                moveTo(16.77f, 10.43f)
                curveToRelative(-0.79f, 0.01f, -1.02f, 0.27f, -1.06f, 1.07f)
                curveToRelative(-0.03f, 0.72f, -0.63f, 0.98f, -1.02f, 0.98f)
                curveToRelative(-0.55f, 0f, -0.99f, -0.47f, -0.98f, -1.02f)
                curveToRelative(0.03f, -1.89f, 1.17f, -3.02f, 3.05f, -3.04f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.55f, 0f, 1.0f, 0.44f, 1f, 0.99f)
                curveToRelative(0.0f, 0.55f, -0.44f, 1.0f, -0.99f, 1.01f)
                close()
            }
        }.also { _Angry = it}
