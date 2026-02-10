package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BabyCradle: ImageVector? = null

val Icons.Ss.BabyCradle: ImageVector
    get() = _BabyCradle ?: UXIcon(name = "BabyCradle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.89f, -0.63f, 3.43f, -2.2f, 7f, -2.46f)
                verticalLineToRelative(2.24f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-4.28f)
                horizontalLineToRelative(-1f)
                curveToRelative(-6.31f, 0.12f, -9.3f, 3.03f, -10f, 3.54f)
                verticalLineToRelative(20.46f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-18f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _BabyCradle = it}
