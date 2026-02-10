package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeRobot: ImageVector? = null

val Icons.Ts.HomeRobot: ImageVector
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
                moveTo(18f, 13f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(17f, 12.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(10f)
                close()
                moveTo(24f, 9.99f)
                verticalLineToRelative(14.01f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-14.01f)
                curveToRelative(0f, -0.82f, 0.39f, -1.61f, 1.03f, -2.12f)
                lineToRelative(9.31f, -7.29f)
                curveToRelative(0.98f, -0.77f, 2.34f, -0.77f, 3.32f, 0f)
                lineToRelative(9.31f, 7.29f)
                curveToRelative(0.65f, 0.51f, 1.03f, 1.3f, 1.03f, 2.12f)
                close()
                moveTo(23f, 9.99f)
                curveToRelative(0f, -0.52f, -0.24f, -1.01f, -0.65f, -1.33f)
                lineToRelative(-9.31f, -7.29f)
                curveToRelative(-0.61f, -0.48f, -1.47f, -0.48f, -2.08f, 0f)
                lineToRelative(-9.31f, 7.29f)
                curveToRelative(-0.41f, 0.32f, -0.65f, 0.82f, -0.65f, 1.33f)
                verticalLineToRelative(13.01f)
                horizontalLineToRelative(22f)
                close()
            }
        }.also { _HomeRobot = it}
