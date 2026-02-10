package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserShakespeare: ImageVector? = null

val Icons.Bs.UserShakespeare: ImageVector
    get() = _UserShakespeare ?: UXIcon(name = "UserShakespeare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                verticalLineToRelative(2.95f)
                lineToRelative(-4f, -3f)
                lineToRelative(-4f, 3f)
                verticalLineToRelative(-2.95f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(10.5f, 20.62f)
                verticalLineToRelative(3.38f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.38f)
                lineToRelative(-1.5f, -1.12f)
                close()
                moveTo(4.05f, 10.03f)
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
                moveTo(9f, 6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
            }
        }.also { _UserShakespeare = it}
