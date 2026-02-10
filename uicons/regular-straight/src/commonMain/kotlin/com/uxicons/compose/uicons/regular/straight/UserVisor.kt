package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVisor: ImageVector? = null

val Icons.Rs.UserVisor: ImageVector
    get() = _UserVisor ?: UXIcon(name = "UserVisor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 16f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(14.96f, 19f)
                curveToRelative(-0.63f, 0.62f, -1.14f, 1.42f, -1.47f, 2.39f)
                curveToRelative(-0.23f, 0.72f, -0.41f, 1.58f, -0.49f, 2.61f)
                curveToRelative(0f, 0.02f, 1.5f, -1.5f, 2.29f, -1.5f)
                curveToRelative(0.59f, 0f, 1.37f, 0.59f, 1.71f, 1f)
                curveToRelative(-0.1f, -0.86f, -0.26f, -1.51f, -0.59f, -2.29f)
                curveToRelative(-0.33f, -0.8f, -0.84f, -1.59f, -1.46f, -2.21f)
                close()
                moveTo(5f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.35f)
                curveToRelative(0.83f, -2.33f, 3.04f, -4f, 5.65f, -4f)
                reflectiveCurveToRelative(4.82f, 1.67f, 5.65f, 4f)
                horizontalLineToRelative(0.35f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.35f)
                curveToRelative(-0.83f, 2.33f, -3.04f, 4f, -5.65f, 4f)
                reflectiveCurveToRelative(-4.82f, -1.67f, -5.65f, -4f)
                horizontalLineToRelative(-0.35f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(15.44f, 8f)
                horizontalLineToRelative(-6.89f)
                curveToRelative(0.69f, 1.19f, 1.97f, 2f, 3.44f, 2f)
                reflectiveCurveToRelative(2.75f, -0.81f, 3.44f, -2f)
                close()
                moveTo(8.56f, 4f)
                horizontalLineToRelative(6.89f)
                curveToRelative(-0.69f, -1.19f, -1.97f, -2f, -3.44f, -2f)
                reflectiveCurveToRelative(-2.75f, 0.81f, -3.44f, 2f)
                close()
            }
        }.also { _UserVisor = it}
