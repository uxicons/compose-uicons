package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVisor: ImageVector? = null

val Icons.Bs.UserVisor: ImageVector
    get() = _UserVisor ?: UXIcon(name = "UserVisor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(13.96f, 19f)
                curveToRelative(-0.63f, 0.62f, -1.14f, 1.42f, -1.47f, 2.39f)
                curveToRelative(-0.23f, 0.72f, -0.41f, 1.58f, -0.49f, 2.61f)
                curveToRelative(0f, 0.02f, 1.5f, -1.5f, 2.29f, -1.5f)
                curveToRelative(0.59f, 0f, 1.37f, 0.59f, 1.71f, 1f)
                curveToRelative(-0.1f, -0.86f, -0.26f, -1.51f, -0.59f, -2.29f)
                curveToRelative(-0.33f, -0.8f, -0.84f, -1.59f, -1.46f, -2.21f)
                close()
                moveTo(4f, 8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.29f)
                curveToRelative(0.86f, -2.89f, 3.54f, -5f, 6.71f, -5f)
                reflectiveCurveToRelative(5.84f, 2.11f, 6.71f, 5f)
                horizontalLineToRelative(0.29f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.29f)
                curveToRelative(-0.86f, 2.89f, -3.54f, 5f, -6.71f, 5f)
                reflectiveCurveToRelative(-5.84f, -2.11f, -6.71f, -5f)
                horizontalLineToRelative(-0.29f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(15.44f, 9f)
                horizontalLineToRelative(-6.89f)
                curveToRelative(0.69f, 1.19f, 1.97f, 2f, 3.44f, 2f)
                reflectiveCurveToRelative(2.75f, -0.81f, 3.44f, -2f)
                close()
                moveTo(8.56f, 5f)
                horizontalLineToRelative(6.89f)
                curveToRelative(-0.69f, -1.19f, -1.97f, -2f, -3.44f, -2f)
                reflectiveCurveToRelative(-2.75f, 0.81f, -3.44f, 2f)
                close()
            }
        }.also { _UserVisor = it}
