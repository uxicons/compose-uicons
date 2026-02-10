package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angry: ImageVector? = null

val Icons.Rc.Angry: ImageVector
    get() = _Angry ?: UXIcon(name = "Angry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.76f, 8.43f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.88f, 0.01f, -3.01f, 1.15f, -3.05f, 3.04f)
                curveToRelative(-0.01f, 0.55f, 0.43f, 1.02f, 0.98f, 1.02f)
                curveToRelative(0.56f, 0f, 1.01f, -0.44f, 1.02f, -0.98f)
                curveToRelative(0.01f, -0.81f, 0.27f, -1.07f, 1.06f, -1.07f)
                curveToRelative(0.55f, -0.0f, 1.0f, -0.45f, 0.99f, -1.01f)
                curveToRelative(-0.0f, -0.55f, -0.45f, -0.99f, -1f, -0.99f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.24f, 8.43f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.88f, 0.01f, 3.01f, 1.15f, 3.05f, 3.04f)
                curveToRelative(0.01f, 0.55f, -0.43f, 1.02f, -0.98f, 1.02f)
                curveToRelative(-0.56f, 0f, -1.01f, -0.44f, -1.02f, -0.98f)
                curveToRelative(-0.01f, -0.81f, -0.27f, -1.07f, -1.06f, -1.07f)
                curveToRelative(-0.55f, -0.0f, -1.0f, -0.45f, -0.99f, -1.01f)
                curveToRelative(0.0f, -0.55f, 0.45f, -0.99f, 1f, -0.99f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.93f, 16.48f)
                curveToRelative(-0.4f, 0.38f, -0.41f, 1.02f, -0.03f, 1.41f)
                curveToRelative(0.38f, 0.4f, 1.02f, 0.41f, 1.41f, 0.03f)
                curveToRelative(2.54f, -2.45f, 4.88f, -2.46f, 7.34f, -0.01f)
                curveToRelative(0.4f, 0.4f, 1.04f, 0.37f, 1.42f, -0.01f)
                curveToRelative(0.39f, -0.39f, 0.38f, -1.03f, -0.01f, -1.41f)
                curveToRelative(-3.24f, -3.19f, -6.84f, -3.2f, -10.14f, -0.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 5.01f, 1f, 12.02f)
                curveToRelative(0f, 6.89f, 3.93f, 10.94f, 11.01f, 10.98f)
                curveToRelative(7.16f, -0.04f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(12.01f, 21f)
                curveToRelative(-6.03f, -0.04f, -8.89f, -2.9f, -9.01f, -9f)
                curveToRelative(0.11f, -6.02f, 3.06f, -8.96f, 8.99f, -9f)
                curveToRelative(5.87f, 0.04f, 8.9f, 3.07f, 9.01f, 8.98f)
                curveToRelative(-0.11f, 6.12f, -2.97f, 8.98f, -8.99f, 9.02f)
                close()
            }
        }.also { _Angry = it}
