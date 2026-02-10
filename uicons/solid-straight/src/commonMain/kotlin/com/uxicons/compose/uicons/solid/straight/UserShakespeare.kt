package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserShakespeare: ImageVector? = null

val Icons.Ss.UserShakespeare: ImageVector
    get() = _UserShakespeare ?: UXIcon(name = "UserShakespeare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.05f, 10.03f)
                curveToRelative(-0.24f, -1.16f, 0.32f, -2.21f, 1.23f, -2.72f)
                curveToRelative(0.45f, -0.25f, 0.71f, -0.79f, 0.71f, -1.31f)
                curveToRelative(0f, -3.31f, 2.69f, -6.0f, 6f, -6.0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 0.52f, 0.26f, 1.06f, 0.71f, 1.31f)
                curveToRelative(0.91f, 0.51f, 1.47f, 1.56f, 1.23f, 2.72f)
                curveToRelative(-0.25f, 1.21f, -1.42f, 1.99f, -2.65f, 1.97f)
                curveToRelative(-1.17f, -0.03f, -2.05f, -0.27f, -2.7f, -0.59f)
                curveToRelative(-0.79f, 0.38f, -1.66f, 0.6f, -2.59f, 0.6f)
                reflectiveCurveToRelative(-1.8f, -0.22f, -2.59f, -0.6f)
                curveToRelative(-0.65f, 0.32f, -1.53f, 0.57f, -2.7f, 0.59f)
                curveToRelative(-1.23f, 0.03f, -2.4f, -0.76f, -2.65f, -1.97f)
                close()
                moveTo(9f, 17.49f)
                lineTo(12f, 15.24f)
                lineTo(15f, 17.49f)
                verticalLineToRelative(-3.49f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(7f, 14.1f)
                curveToRelative(-2.28f, 0.47f, -4f, 2.48f, -4f, 4.9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5.51f)
                lineToRelative(-4f, 3f)
                close()
                moveTo(17f, 14.1f)
                verticalLineToRelative(7.39f)
                lineToRelative(-4f, -3f)
                verticalLineToRelative(5.51f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.41f, -1.72f, -4.43f, -4f, -4.9f)
                close()
            }
        }.also { _UserShakespeare = it}
