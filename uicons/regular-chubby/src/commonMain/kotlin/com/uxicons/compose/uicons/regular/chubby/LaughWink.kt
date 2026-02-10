package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughWink: ImageVector? = null

val Icons.Rc.LaughWink: ImageVector
    get() = _LaughWink ?: UXIcon(name = "LaughWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.24f, 13.72f)
                curveToRelative(-0.21f, -0.2f, -0.5f, -0.29f, -0.79f, -0.26f)
                curveToRelative(-1.23f, 0.14f, -2.38f, 0.22f, -3.44f, 0.22f)
                curveToRelative(-1.05f, 0f, -2.21f, -0.07f, -3.44f, -0.22f)
                curveToRelative(-0.29f, -0.03f, -0.58f, 0.06f, -0.79f, 0.26f)
                curveToRelative(-0.21f, 0.2f, -0.33f, 0.47f, -0.33f, 0.77f)
                curveToRelative(0.03f, 1.03f, 0.52f, 2.04f, 1.47f, 3.0f)
                curveToRelative(0.99f, 0.97f, 2.03f, 1.46f, 3.08f, 1.46f)
                curveToRelative(1.05f, 0f, 2.12f, -0.49f, 3.14f, -1.48f)
                curveToRelative(0.91f, -0.94f, 1.39f, -1.94f, 1.43f, -2.98f)
                curveToRelative(0.01f, -0.29f, -0.11f, -0.57f, -0.32f, -0.77f)
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
        }.also { _LaughWink = it}
