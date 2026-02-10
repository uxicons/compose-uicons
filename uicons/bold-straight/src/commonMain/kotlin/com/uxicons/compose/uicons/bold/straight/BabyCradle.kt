package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BabyCradle: ImageVector? = null

val Icons.Bs.BabyCradle: ImageVector
    get() = _BabyCradle ?: UXIcon(name = "BabyCradle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-4.74f)
                reflectiveCurveToRelative(2.13f, -2.35f, 6f, -3.11f)
                verticalLineToRelative(2.12f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-4.28f)
                horizontalLineToRelative(-1f)
                curveToRelative(-6.5f, 0f, -10f, 3.81f, -10f, 3.81f)
                verticalLineToRelative(20.19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-18f)
                close()
                moveTo(13.5f, 13f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(10.5f, 19f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(3f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(19f, 19f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _BabyCradle = it}
