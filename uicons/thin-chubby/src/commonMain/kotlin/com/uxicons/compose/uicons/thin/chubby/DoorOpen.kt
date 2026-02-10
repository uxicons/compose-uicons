package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorOpen: ImageVector? = null

val Icons.Tc.DoorOpen: ImageVector
    get() = _DoorOpen ?: UXIcon(name = "DoorOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.99f, 21.48f)
                curveToRelative(-0.06f, -0.27f, -0.33f, -0.43f, -0.6f, -0.38f)
                curveToRelative(-0.01f, 0.0f, -0.46f, 0.1f, -1.22f, 0.24f)
                curveToRelative(0.26f, -1.28f, 0.83f, -4.53f, 0.83f, -8.34f)
                curveToRelative(0f, -4.88f, -0.9f, -8.53f, -0.93f, -8.69f)
                curveToRelative(-0.04f, -0.16f, -0.16f, -0.29f, -0.31f, -0.35f)
                curveToRelative(-0.06f, -0.02f, -1.35f, -0.49f, -3.25f, -0.82f)
                verticalLineToRelative(-1.15f)
                curveToRelative(0f, -0.19f, -0.11f, -0.36f, -0.28f, -0.45f)
                curveToRelative(-0.04f, -0.02f, -1.13f, -0.55f, -3.22f, -0.55f)
                curveToRelative(-3.59f, 0f, -6.64f, 1.19f, -6.77f, 1.24f)
                curveToRelative(-0.16f, 0.06f, -0.27f, 0.2f, -0.31f, 0.36f)
                curveToRelative(-0.01f, 0.04f, -0.93f, 4.61f, -0.93f, 9.89f)
                curveToRelative(0f, 4.21f, 0.59f, 7.55f, 0.86f, 8.85f)
                curveToRelative(-0.77f, -0.14f, -1.23f, -0.24f, -1.25f, -0.24f)
                curveToRelative(-0.27f, -0.06f, -0.54f, 0.11f, -0.6f, 0.38f)
                curveToRelative(-0.06f, 0.27f, 0.1f, 0.54f, 0.38f, 0.6f)
                curveToRelative(0.16f, 0.04f, 4.04f, 0.92f, 8.61f, 0.92f)
                reflectiveCurveToRelative(8.45f, -0.88f, 8.61f, -0.92f)
                curveToRelative(0.27f, -0.06f, 0.44f, -0.33f, 0.38f, -0.6f)
                close()
                moveTo(18.16f, 4.82f)
                curveToRelative(0.2f, 0.92f, 0.84f, 4.16f, 0.84f, 8.18f)
                curveToRelative(0f, 4.15f, -0.71f, 7.69f, -0.89f, 8.52f)
                curveToRelative(-0.74f, 0.11f, -1.63f, 0.23f, -2.61f, 0.32f)
                verticalLineToRelative(-17.67f)
                curveToRelative(1.25f, 0.23f, 2.22f, 0.52f, 2.66f, 0.66f)
                close()
                moveTo(5.92f, 21.52f)
                curveToRelative(-0.18f, -0.81f, -0.92f, -4.42f, -0.92f, -9.02f)
                curveToRelative(0f, -4.45f, 0.66f, -8.37f, 0.86f, -9.42f)
                curveToRelative(0.79f, -0.28f, 3.32f, -1.08f, 6.14f, -1.08f)
                curveToRelative(1.26f, 0f, 2.1f, 0.21f, 2.5f, 0.34f)
                verticalLineToRelative(19.57f)
                curveToRelative(-0.8f, 0.05f, -1.64f, 0.09f, -2.5f, 0.09f)
                curveToRelative(-2.34f, 0f, -4.53f, -0.24f, -6.08f, -0.48f)
                close()
            }
        }.also { _DoorOpen = it}
