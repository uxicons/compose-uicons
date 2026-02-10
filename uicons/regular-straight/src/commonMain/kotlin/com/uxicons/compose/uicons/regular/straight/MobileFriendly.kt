package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileFriendly: ImageVector? = null

val Icons.Rs.MobileFriendly: ImageVector
    get() = _MobileFriendly ?: UXIcon(name = "MobileFriendly") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.91f, 13f)
                horizontalLineToRelative(1.09f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.91f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-6.09f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4.91f)
                close()
                moveTo(24f, 11.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(22f, 11.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(7f)
                close()
                moveTo(18f, 6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(6f, 10f)
                horizontalLineToRelative(5.28f)
                curveToRelative(0.28f, -0.8f, 0.78f, -1.48f, 1.43f, -2f)
                horizontalLineToRelative(-6.71f)
                close()
            }
        }.also { _MobileFriendly = it}
