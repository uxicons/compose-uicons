package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinWink: ImageVector? = null

val Icons.Rc.GrinWink: ImageVector
    get() = _GrinWink ?: UXIcon(name = "GrinWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.02f, 14.16f)
                curveToRelative(-0.25f, -0.16f, -0.64f, -0.4f, -1.35f, -0.14f)
                curveToRelative(-1.19f, 0.43f, -1.91f, 0.6f, -2.65f, 0.65f)
                curveToRelative(-0.78f, -0.05f, -1.63f, -0.25f, -2.69f, -0.65f)
                curveToRelative(-0.46f, -0.17f, -0.95f, -0.12f, -1.35f, 0.14f)
                curveToRelative(-0.38f, 0.24f, -0.61f, 0.64f, -0.64f, 1.07f)
                curveToRelative(-0.05f, 0.74f, 0.3f, 1.14f, 0.51f, 1.32f)
                curveToRelative(1.3f, 1.07f, 2.73f, 1.65f, 4.15f, 1.65f)
                curveToRelative(1.41f, -0.01f, 2.85f, -0.58f, 4.15f, -1.65f)
                curveToRelative(0.21f, -0.17f, 0.56f, -0.58f, 0.51f, -1.32f)
                curveToRelative(-0.03f, -0.44f, -0.26f, -0.83f, -0.64f, -1.07f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.39f, 7.79f)
                curveToRelative(-1.24f, 0.01f, -1.99f, 0.71f, -2.02f, 1.93f)
                curveToRelative(0.02f, 1.18f, 0.78f, 1.89f, 2.01f, 1.9f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.24f, -0.01f, 1.99f, -0.71f, 2.01f, -1.93f)
                curveToRelative(-0.02f, -1.16f, -0.79f, -1.89f, -2.02f, -1.9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.62f, 10.71f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.04f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 4.84f, 1f, 11.98f)
                curveToRelative(0f, 7.02f, 3.93f, 10.98f, 11.01f, 11.02f)
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
        }.also { _GrinWink = it}
