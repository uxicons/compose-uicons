package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointDown: ImageVector? = null

val Icons.Ts.HandBackPointDown: ImageVector
    get() = _HandBackPointDown ?: UXIcon(name = "HandBackPointDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.71f, 0f)
                lineTo(2.73f, 4.97f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                reflectiveCurveToRelative(0.26f, 1.3f, 0.73f, 1.77f)
                lineToRelative(4.26f, 4.2f)
                verticalLineToRelative(8.79f)
                curveToRelative(0f, 0.73f, 0.32f, 1.43f, 0.88f, 1.91f)
                curveToRelative(0.46f, 0.39f, 1.03f, 0.59f, 1.62f, 0.59f)
                curveToRelative(0.14f, 0f, 0.27f, -0.01f, 0.41f, -0.03f)
                curveToRelative(1.19f, -0.19f, 2.08f, -1.3f, 2.08f, -2.57f)
                verticalLineToRelative(-6.48f)
                lineToRelative(10f, -2f)
                lineTo(22f, 0f)
                lineTo(7.71f, 0f)
                close()
                moveTo(21f, 12.09f)
                lineToRelative(-10f, 2f)
                verticalLineToRelative(7.3f)
                curveToRelative(0f, 0.79f, -0.54f, 1.47f, -1.24f, 1.59f)
                curveToRelative(-0.46f, 0.07f, -0.89f, -0.05f, -1.23f, -0.34f)
                curveToRelative(-0.34f, -0.29f, -0.53f, -0.7f, -0.53f, -1.14f)
                lineTo(8f, 7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.31f)
                lineToRelative(-3.56f, -3.5f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
                lineTo(8.12f, 1f)
                horizontalLineToRelative(12.88f)
                lineTo(21f, 12.09f)
                close()
            }
        }.also { _HandBackPointDown = it}
