package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorClosed: ImageVector? = null

val Icons.Tc.DoorClosed: ImageVector
    get() = _DoorClosed ?: UXIcon(name = "DoorClosed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.19f, 12.01f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.99f, 21.48f)
                curveToRelative(-0.06f, -0.27f, -0.33f, -0.43f, -0.6f, -0.38f)
                curveToRelative(-0.01f, 0.0f, -0.47f, 0.11f, -1.24f, 0.24f)
                curveToRelative(0.26f, -1.41f, 0.85f, -5.17f, 0.85f, -9.35f)
                curveToRelative(0f, -5.33f, -0.89f, -9.24f, -0.93f, -9.4f)
                curveToRelative(-0.04f, -0.16f, -0.15f, -0.29f, -0.3f, -0.35f)
                curveToRelative(-0.13f, -0.05f, -3.17f, -1.24f, -6.77f, -1.24f)
                reflectiveCurveToRelative(-6.64f, 1.19f, -6.77f, 1.24f)
                curveToRelative(-0.15f, 0.06f, -0.27f, 0.19f, -0.3f, 0.35f)
                curveToRelative(-0.04f, 0.17f, -0.93f, 4.11f, -0.93f, 9.4f)
                curveToRelative(0f, 4.21f, 0.6f, 7.94f, 0.85f, 9.35f)
                curveToRelative(-0.77f, -0.14f, -1.23f, -0.24f, -1.24f, -0.24f)
                curveToRelative(-0.27f, -0.06f, -0.54f, 0.11f, -0.6f, 0.38f)
                reflectiveCurveToRelative(0.11f, 0.54f, 0.38f, 0.6f)
                curveToRelative(0.16f, 0.04f, 4.04f, 0.92f, 8.61f, 0.92f)
                reflectiveCurveToRelative(8.45f, -0.88f, 8.61f, -0.92f)
                curveToRelative(0.27f, -0.06f, 0.44f, -0.33f, 0.38f, -0.6f)
                close()
                moveTo(5.9f, 21.52f)
                curveToRelative(-0.19f, -0.96f, -0.9f, -4.95f, -0.9f, -9.52f)
                curveToRelative(0f, -4.41f, 0.65f, -7.95f, 0.85f, -8.92f)
                curveToRelative(0.78f, -0.28f, 3.32f, -1.08f, 6.15f, -1.08f)
                reflectiveCurveToRelative(5.37f, 0.81f, 6.15f, 1.08f)
                curveToRelative(0.2f, 0.96f, 0.85f, 4.46f, 0.85f, 8.92f)
                curveToRelative(0f, 4.53f, -0.72f, 8.56f, -0.9f, 9.52f)
                curveToRelative(-1.55f, 0.23f, -3.74f, 0.48f, -6.1f, 0.48f)
                reflectiveCurveToRelative(-4.54f, -0.25f, -6.1f, -0.48f)
                close()
            }
        }.also { _DoorClosed = it}
