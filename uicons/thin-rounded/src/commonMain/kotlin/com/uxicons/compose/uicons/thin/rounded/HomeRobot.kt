package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeRobot: ImageVector? = null

val Icons.Tr.HomeRobot: ImageVector
    get() = _HomeRobot ?: UXIcon(name = "HomeRobot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(14f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(19f, 14.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.67f, -0.44f, 1.23f, -1.04f, 1.42f)
                curveToRelative(-0.21f, 1.73f, -1.67f, 3.08f, -3.46f, 3.08f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.78f, 0f, -3.25f, -1.35f, -3.46f, -3.08f)
                curveToRelative(-0.6f, -0.2f, -1.04f, -0.76f, -1.04f, -1.42f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.67f, 0.44f, -1.23f, 1.04f, -1.42f)
                curveToRelative(0.21f, -1.73f, 1.67f, -3.08f, 3.46f, -3.08f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2f)
                curveToRelative(1.78f, 0f, 3.25f, 1.35f, 3.46f, 3.08f)
                curveToRelative(0.6f, 0.2f, 1.04f, 0.76f, 1.04f, 1.42f)
                close()
                moveTo(17f, 16.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(24f, 9.56f)
                verticalLineToRelative(9.94f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-15f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-9.94f)
                curveToRelative(0f, -1.5f, 0.74f, -2.89f, 1.98f, -3.73f)
                lineToRelative(7.5f, -5.06f)
                curveToRelative(1.53f, -1.03f, 3.51f, -1.03f, 5.03f, 0f)
                lineToRelative(7.5f, 5.06f)
                curveToRelative(1.24f, 0.84f, 1.98f, 2.23f, 1.98f, 3.73f)
                close()
                moveTo(23f, 9.56f)
                curveToRelative(0f, -1.16f, -0.58f, -2.25f, -1.54f, -2.9f)
                lineToRelative(-7.5f, -5.06f)
                curveToRelative(-0.59f, -0.4f, -1.28f, -0.6f, -1.96f, -0.6f)
                reflectiveCurveToRelative(-1.36f, 0.2f, -1.96f, 0.6f)
                lineToRelative(-7.5f, 5.06f)
                curveToRelative(-0.97f, 0.65f, -1.54f, 1.74f, -1.54f, 2.9f)
                verticalLineToRelative(9.94f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _HomeRobot = it}
