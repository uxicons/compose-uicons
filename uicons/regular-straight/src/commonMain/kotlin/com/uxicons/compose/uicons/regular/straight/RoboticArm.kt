package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoboticArm: ImageVector? = null

val Icons.Rs.RoboticArm: ImageVector
    get() = _RoboticArm ?: UXIcon(name = "RoboticArm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 22f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.23f, -0.64f, -2.31f, -1.6f, -2.93f)
                lineTo(15.58f, 1.49f)
                curveToRelative(-0.52f, -0.89f, -1.48f, -1.49f, -2.58f, -1.49f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.36f, 0.07f, 0.71f, 0.2f, 1.04f)
                lineToRelative(-3.56f, 2.96f)
                lineTo(2.59f, 7f)
                lineTo(0.02f, 9.57f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.98f, -1.98f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(2.59f)
                lineToRelative(-1.98f, 1.98f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.57f, -2.57f)
                verticalLineToRelative(-3.95f)
                lineToRelative(3.27f, -2.72f)
                lineToRelative(3.76f, 5.51f)
                curveToRelative(-0.01f, 0.08f, -0.02f, 0.16f, -0.02f, 0.24f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(13.78f, 5.88f)
                curveToRelative(0.66f, -0.18f, 1.23f, -0.57f, 1.62f, -1.1f)
                lineToRelative(2.27f, 3.33f)
                curveToRelative(-0.66f, 0.16f, -1.25f, 0.51f, -1.7f, 0.99f)
                lineToRelative(-2.19f, -3.21f)
                close()
                moveTo(20f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.35f)
                curveToRelative(0.46f, 0.22f, 0.96f, 0.35f, 1.5f, 0.35f)
                reflectiveCurveToRelative(1.04f, -0.13f, 1.5f, -0.35f)
                verticalLineToRelative(7.35f)
                close()
                moveTo(18.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _RoboticArm = it}
