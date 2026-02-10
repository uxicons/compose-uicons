package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorClosed: ImageVector? = null

val Icons.Rc.DoorClosed: ImageVector
    get() = _DoorClosed ?: UXIcon(name = "DoorClosed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.97f, 20.91f)
                curveToRelative(-0.12f, -0.54f, -0.67f, -0.87f, -1.2f, -0.75f)
                curveToRelative(-0.01f, 0.0f, -0.15f, 0.04f, -0.41f, 0.09f)
                curveToRelative(0.24f, -1.56f, 0.64f, -4.65f, 0.64f, -8.25f)
                curveToRelative(0f, -5.13f, -0.79f, -8.9f, -0.83f, -9.06f)
                curveToRelative(-0.07f, -0.33f, -0.3f, -0.59f, -0.6f, -0.72f)
                curveToRelative(-0.12f, -0.05f, -3.08f, -1.22f, -6.57f, -1.22f)
                reflectiveCurveToRelative(-6.44f, 1.17f, -6.57f, 1.22f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.4f, -0.61f, 0.72f)
                curveToRelative(-0.03f, 0.16f, -0.83f, 3.97f, -0.83f, 9.06f)
                curveToRelative(0f, 3.62f, 0.39f, 6.69f, 0.64f, 8.25f)
                curveToRelative(-0.26f, -0.05f, -0.4f, -0.09f, -0.41f, -0.09f)
                curveToRelative(-0.54f, -0.12f, -1.08f, 0.21f, -1.2f, 0.75f)
                reflectiveCurveToRelative(0.21f, 1.07f, 0.75f, 1.2f)
                curveToRelative(0.15f, 0.04f, 3.86f, 0.89f, 8.23f, 0.89f)
                reflectiveCurveToRelative(8.07f, -0.85f, 8.23f, -0.89f)
                curveToRelative(0.54f, -0.13f, 0.87f, -0.66f, 0.75f, -1.2f)
                close()
                moveTo(17.27f, 20.61f)
                curveToRelative(-1.41f, 0.2f, -3.28f, 0.39f, -5.27f, 0.39f)
                reflectiveCurveToRelative(-3.87f, -0.19f, -5.28f, -0.4f)
                curveToRelative(-0.18f, -1.06f, -0.72f, -4.5f, -0.72f, -8.61f)
                curveToRelative(0f, -3.79f, 0.47f, -6.89f, 0.68f, -8.1f)
                curveToRelative(0.93f, -0.31f, 3.01f, -0.9f, 5.32f, -0.9f)
                reflectiveCurveToRelative(4.39f, 0.59f, 5.32f, 0.9f)
                curveToRelative(0.21f, 1.2f, 0.68f, 4.28f, 0.68f, 8.1f)
                curveToRelative(0f, 4.07f, -0.54f, 7.54f, -0.73f, 8.61f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12.0f)
                moveToRelative(-1.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.99f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.99f, 0f)
            }
        }.also { _DoorClosed = it}
