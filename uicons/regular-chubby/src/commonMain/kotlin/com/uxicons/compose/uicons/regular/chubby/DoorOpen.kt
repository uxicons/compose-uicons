package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorOpen: ImageVector? = null

val Icons.Rc.DoorOpen: ImageVector
    get() = _DoorOpen ?: UXIcon(name = "DoorOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.97f, 20.91f)
                curveToRelative(-0.13f, -0.54f, -0.67f, -0.87f, -1.2f, -0.75f)
                curveToRelative(-0.01f, 0.0f, -0.14f, 0.03f, -0.38f, 0.08f)
                curveToRelative(0.25f, -1.49f, 0.61f, -4.22f, 0.61f, -7.37f)
                curveToRelative(0f, -4.71f, -0.8f, -8.17f, -0.83f, -8.31f)
                curveToRelative(-0.08f, -0.33f, -0.31f, -0.59f, -0.63f, -0.71f)
                curveToRelative(-0.05f, -0.02f, -1.04f, -0.38f, -2.53f, -0.69f)
                verticalLineToRelative(-0.94f)
                curveToRelative(0.0f, -0.49f, -0.35f, -0.9f, -0.83f, -0.99f)
                curveToRelative(-0.88f, -0.15f, -2.01f, -0.24f, -3.18f, -0.24f)
                curveToRelative(-3.48f, 0f, -6.44f, 1.17f, -6.57f, 1.22f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.4f, -0.6f, 0.72f)
                curveToRelative(-0.03f, 0.16f, -0.83f, 3.97f, -0.83f, 9.06f)
                curveToRelative(0f, 3.62f, 0.39f, 6.69f, 0.64f, 8.25f)
                curveToRelative(-0.26f, -0.05f, -0.4f, -0.09f, -0.41f, -0.09f)
                curveToRelative(-0.54f, -0.12f, -1.07f, 0.21f, -1.2f, 0.75f)
                reflectiveCurveToRelative(0.21f, 1.07f, 0.75f, 1.2f)
                curveToRelative(0.16f, 0.04f, 3.86f, 0.89f, 8.23f, 0.89f)
                reflectiveCurveToRelative(8.07f, -0.85f, 8.23f, -0.89f)
                curveToRelative(0.54f, -0.13f, 0.87f, -0.66f, 0.75f, -1.2f)
                close()
                moveTo(13.99f, 20.94f)
                curveToRelative(-0.64f, 0.04f, -1.31f, 0.06f, -1.99f, 0.06f)
                curveToRelative(-1.99f, 0f, -3.87f, -0.19f, -5.28f, -0.4f)
                curveToRelative(-0.18f, -1.06f, -0.72f, -4.5f, -0.72f, -8.61f)
                curveToRelative(0f, -3.79f, 0.47f, -6.89f, 0.68f, -8.1f)
                curveToRelative(0.93f, -0.31f, 3.02f, -0.9f, 5.32f, -0.9f)
                curveToRelative(0.71f, 0f, 1.4f, 0.03f, 2.01f, 0.1f)
                lineToRelative(-0.02f, 17.84f)
                close()
                moveTo(17.3f, 20.6f)
                curveToRelative(-0.4f, 0.06f, -0.84f, 0.11f, -1.31f, 0.17f)
                lineToRelative(0.02f, -15.55f)
                curveToRelative(0.55f, 0.12f, 1.01f, 0.25f, 1.33f, 0.35f)
                curveToRelative(0.21f, 1.12f, 0.67f, 3.89f, 0.67f, 7.31f)
                curveToRelative(0f, 3.58f, -0.5f, 6.65f, -0.7f, 7.72f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12.0f)
                moveToRelative(-1.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.99f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.99f, 0f)
            }
        }.also { _DoorOpen = it}
