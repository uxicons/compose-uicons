package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorOpen: ImageVector? = null

val Icons.Sc.DoorOpen: ImageVector
    get() = _DoorOpen ?: UXIcon(name = "DoorOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.96f, 20.28f)
                curveToRelative(-0.16f, -0.65f, -0.72f, -1.09f, -1.35f, -1.13f)
                curveToRelative(0.22f, -1.56f, 0.47f, -3.85f, 0.47f, -6.4f)
                curveToRelative(0f, -4.71f, -0.81f, -8.18f, -0.84f, -8.33f)
                curveToRelative(-0.12f, -0.49f, -0.47f, -0.89f, -0.95f, -1.06f)
                curveToRelative(-0.06f, -0.02f, -1.35f, -0.49f, -3.22f, -0.81f)
                verticalLineToRelative(-0.31f)
                curveToRelative(0f, -0.42f, -0.25f, -0.79f, -0.62f, -0.94f)
                curveToRelative(-0.64f, -0.25f, -2.02f, -0.29f, -2.8f, -0.29f)
                curveToRelative(-3.36f, 0f, -6.37f, 1.15f, -6.49f, 1.2f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.39f, -0.61f, 0.73f)
                curveToRelative(-0.03f, 0.16f, -0.8f, 3.92f, -0.8f, 8.95f)
                curveToRelative(0f, 3.0f, 0.27f, 5.62f, 0.49f, 7.29f)
                curveToRelative(-0.57f, 0.1f, -1.04f, 0.52f, -1.19f, 1.12f)
                curveToRelative(-0.2f, 0.8f, 0.29f, 1.62f, 1.1f, 1.82f)
                curveToRelative(0.15f, 0.04f, 3.69f, 0.9f, 7.86f, 0.9f)
                reflectiveCurveToRelative(7.71f, -0.87f, 7.86f, -0.9f)
                curveToRelative(0.81f, -0.2f, 1.29f, -1.01f, 1.09f, -1.82f)
                close()
                moveTo(16.47f, 5.93f)
                curveToRelative(0.23f, 1.24f, 0.6f, 3.76f, 0.6f, 6.81f)
                curveToRelative(0f, 2.96f, -0.36f, 5.57f, -0.59f, 6.93f)
                curveToRelative(-0.44f, 0.06f, -0.93f, 0.12f, -1.44f, 0.17f)
                lineToRelative(0.01f, -14.25f)
                curveToRelative(0.56f, 0.11f, 1.04f, 0.23f, 1.41f, 0.34f)
                close()
                moveTo(11.76f, 10.28f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _DoorOpen = it}
