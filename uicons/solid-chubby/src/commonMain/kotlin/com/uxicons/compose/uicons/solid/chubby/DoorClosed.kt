package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorClosed: ImageVector? = null

val Icons.Sc.DoorClosed: ImageVector
    get() = _DoorClosed ?: UXIcon(name = "DoorClosed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.95f, 20.28f)
                curveToRelative(-0.17f, -0.68f, -0.77f, -1.13f, -1.44f, -1.14f)
                curveToRelative(0.23f, -1.7f, 0.49f, -4.27f, 0.49f, -7.18f)
                curveToRelative(0f, -5.12f, -0.79f, -8.87f, -0.83f, -9.03f)
                curveToRelative(-0.07f, -0.32f, -0.3f, -0.59f, -0.6f, -0.72f)
                curveToRelative(-0.12f, -0.05f, -3.08f, -1.22f, -6.57f, -1.22f)
                reflectiveCurveToRelative(-6.44f, 1.17f, -6.57f, 1.22f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.39f, -0.61f, 0.72f)
                curveToRelative(-0.03f, 0.16f, -0.83f, 3.96f, -0.83f, 9.03f)
                curveToRelative(0f, 2.92f, 0.26f, 5.48f, 0.48f, 7.18f)
                curveToRelative(-0.67f, 0.01f, -1.27f, 0.46f, -1.44f, 1.14f)
                curveToRelative(-0.2f, 0.8f, 0.29f, 1.62f, 1.09f, 1.82f)
                curveToRelative(0.15f, 0.04f, 3.7f, 0.91f, 7.86f, 0.91f)
                reflectiveCurveToRelative(7.71f, -0.87f, 7.86f, -0.91f)
                curveToRelative(0.8f, -0.2f, 1.29f, -1.01f, 1.09f, -1.82f)
                close()
                moveTo(15f, 10.47f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _DoorClosed = it}
