package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserRight: ImageVector? = null

val Icons.Sr.UserRight: ImageVector
    get() = _UserRight ?: UXIcon(name = "UserRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 16f)
                curveToRelative(-3.91f, 0f, -7.2f, 3.04f, -7.5f, 6.92f)
                curveToRelative(-0.02f, 0.28f, 0.07f, 0.55f, 0.26f, 0.76f)
                reflectiveCurveToRelative(0.46f, 0.32f, 0.73f, 0.32f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.54f, -0.12f, 0.73f, -0.32f)
                reflectiveCurveToRelative(0.28f, -0.48f, 0.26f, -0.76f)
                curveToRelative(-0.3f, -3.88f, -3.59f, -6.92f, -7.5f, -6.92f)
                close()
                moveTo(7.5f, 14f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(24f, 5.04f)
                curveToRelative(0f, 0.39f, -0.15f, 0.76f, -0.43f, 1.04f)
                lineToRelative(-2.86f, 2.86f)
                curveToRelative(-0.9f, 0.93f, -2.35f, -0.51f, -1.41f, -1.41f)
                lineToRelative(1.52f, -1.52f)
                horizontalLineToRelative(-4.82f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.75f)
                lineToRelative(-1.45f, -1.45f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.86f, 2.86f)
                curveToRelative(0.28f, 0.28f, 0.43f, 0.65f, 0.43f, 1.04f)
                close()
            }
        }.also { _UserRight = it}
