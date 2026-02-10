package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughWink: ImageVector? = null

val Icons.Sc.LaughWink: ImageVector
    get() = _LaughWink ?: UXIcon(name = "LaughWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.82f, 1f, 1f, 5.11f, 1f, 12.02f)
                curveToRelative(0f, 6.86f, 3.85f, 10.98f, 11.01f, 10.98f)
                reflectiveCurveToRelative(10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.98f, -11.01f, -10.98f)
                close()
                moveTo(6.09f, 9.71f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.04f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(16.56f, 14.91f)
                curveToRelative(-0.04f, 1.03f, -0.52f, 2.04f, -1.43f, 2.98f)
                curveToRelative(-1.02f, 0.99f, -2.09f, 1.48f, -3.14f, 1.48f)
                curveToRelative(-1.05f, 0f, -2.09f, -0.49f, -3.08f, -1.46f)
                curveToRelative(-0.95f, -0.96f, -1.44f, -1.97f, -1.47f, -3.0f)
                curveToRelative(-0.01f, -0.29f, 0.11f, -0.57f, 0.33f, -0.77f)
                curveToRelative(0.21f, -0.2f, 0.5f, -0.29f, 0.79f, -0.26f)
                curveToRelative(1.24f, 0.14f, 2.4f, 0.22f, 3.44f, 0.22f)
                curveToRelative(1.06f, 0f, 2.22f, -0.07f, 3.44f, -0.22f)
                curveToRelative(0.29f, -0.03f, 0.58f, 0.06f, 0.79f, 0.26f)
                curveToRelative(0.21f, 0.2f, 0.33f, 0.48f, 0.32f, 0.77f)
                close()
                moveTo(15.9f, 11.62f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.24f, -0.01f, -1.99f, -0.72f, -2.01f, -1.9f)
                curveToRelative(0.02f, -1.22f, 0.78f, -1.92f, 2.02f, -1.93f)
                curveToRelative(1.23f, 0.01f, 2.0f, 0.73f, 2.02f, 1.9f)
                curveToRelative(-0.02f, 1.21f, -0.78f, 1.92f, -2.01f, 1.93f)
                close()
            }
        }.also { _LaughWink = it}
