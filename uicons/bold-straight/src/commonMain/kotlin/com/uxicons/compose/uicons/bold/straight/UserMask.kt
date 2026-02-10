package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMask: ImageVector? = null

val Icons.Bs.UserMask: ImageVector
    get() = _UserMask ?: UXIcon(name = "UserMask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 11.0f)
                curveToRelative(0f, -0.51f, 0.03f, -0.96f, 0.08f, -1.37f)
                curveToRelative(0.56f, 0.43f, 1.21f, 0.83f, 1.93f, 1.09f)
                curveToRelative(-0.09f, 1.74f, 0.47f, 3.36f, 0.49f, 3.27f)
                horizontalLineToRelative(5f)
                curveToRelative(0.03f, 0.08f, 0.58f, -1.53f, 0.49f, -3.27f)
                curveToRelative(0.72f, -0.26f, 1.38f, -0.67f, 1.93f, -1.09f)
                curveToRelative(0.08f, 0.66f, 0.1f, 1.59f, 0.04f, 2.3f)
                curveToRelative(1.26f, -1.27f, 2.04f, -3.01f, 2.04f, -4.93f)
                curveToRelative(0f, -3.86f, -3.14f, -7.0f, -7f, -7.0f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                curveToRelative(0f, 1.92f, 0.78f, 3.66f, 2.04f, 4.93f)
                curveToRelative(-0.02f, -0.29f, -0.04f, -0.6f, -0.04f, -0.93f)
                close()
                moveTo(12f, 3.0f)
                curveToRelative(2.0f, 0f, 3.65f, 1.49f, 3.94f, 3.41f)
                lineToRelative(0.03f, 0.06f)
                curveToRelative(-0.69f, 0.72f, -1.75f, 1.53f, -2.47f, 1.53f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.72f, 0f, -1.77f, -0.81f, -2.47f, -1.53f)
                lineToRelative(0.03f, -0.06f)
                curveToRelative(0.29f, -1.92f, 1.94f, -3.41f, 3.94f, -3.41f)
                close()
                moveTo(21f, 24f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3.0f)
                reflectiveCurveToRelative(-3f, 0f, -3f, 0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _UserMask = it}
