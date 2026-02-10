package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileFriendly: ImageVector? = null

val Icons.Bs.MobileFriendly: ImageVector
    get() = _MobileFriendly ?: UXIcon(name = "MobileFriendly") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 9f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(9.23f, 15f)
                horizontalLineToRelative(2.77f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3.31f)
                close()
                moveTo(7f, 8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _MobileFriendly = it}
