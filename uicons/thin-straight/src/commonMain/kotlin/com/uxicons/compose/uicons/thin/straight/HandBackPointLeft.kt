package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointLeft: ImageVector? = null

val Icons.Ts.HandBackPointLeft: ImageVector
    get() = _HandBackPointLeft ?: UXIcon(name = "HandBackPointLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.02f, 2.73f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.95f, -3.54f, 0.0f)
                lineToRelative(-4.2f, 4.26f)
                lineTo(2.5f, 7f)
                curveToRelative(-0.73f, 0f, -1.43f, 0.32f, -1.91f, 0.88f)
                reflectiveCurveTo(-0.09f, 9.18f, 0.03f, 9.92f)
                curveToRelative(0.19f, 1.19f, 1.3f, 2.08f, 2.57f, 2.08f)
                horizontalLineToRelative(6.48f)
                lineToRelative(2f, 10f)
                horizontalLineToRelative(12.91f)
                lineTo(24f, 7.71f)
                lineToRelative(-4.97f, -4.97f)
                close()
                moveTo(23f, 21f)
                lineTo(11.91f, 21f)
                lineToRelative(-2f, -10f)
                lineTo(2.61f, 11f)
                curveToRelative(-0.79f, 0f, -1.47f, -0.54f, -1.59f, -1.24f)
                curveToRelative(-0.07f, -0.45f, 0.05f, -0.89f, 0.34f, -1.23f)
                curveToRelative(0.29f, -0.34f, 0.7f, -0.53f, 1.14f, -0.53f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.31f)
                lineToRelative(3.5f, -3.56f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                lineToRelative(4.68f, 4.68f)
                verticalLineToRelative(12.88f)
                close()
            }
        }.also { _HandBackPointLeft = it}
