package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileFriendly: ImageVector? = null

val Icons.Ss.MobileFriendly: ImageVector
    get() = _MobileFriendly ?: UXIcon(name = "MobileFriendly") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.99f, 15f)
                horizontalLineToRelative(3.01f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3.0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.14f)
                close()
                moveTo(12.55f, 9f)
                curveToRelative(-0.34f, 0.59f, -0.56f, 1.27f, -0.56f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.07f)
                lineToRelative(-0.85f, -1f)
                horizontalLineToRelative(-7.08f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(7.1f)
                curveToRelative(-0.32f, -0.07f, -0.66f, -0.1f, -1f, -0.1f)
                horizontalLineToRelative(-15f)
                reflectiveCurveToRelative(0f, 2f, 0f, 2f)
                close()
                moveTo(6f, 5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(22f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(22f, 12f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _MobileFriendly = it}
