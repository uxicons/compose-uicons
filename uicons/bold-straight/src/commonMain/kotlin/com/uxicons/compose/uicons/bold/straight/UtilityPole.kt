package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UtilityPole: ImageVector? = null

val Icons.Bs.UtilityPole: ImageVector
    get() = _UtilityPole ?: UXIcon(name = "UtilityPole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.5f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.5f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                lineTo(3f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3.88f)
                lineToRelative(6.62f, 6.62f)
                verticalLineToRelative(12.38f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12.38f)
                lineToRelative(6.62f, -6.62f)
                horizontalLineToRelative(3.88f)
                close()
                moveTo(8.12f, 5f)
                horizontalLineToRelative(2.38f)
                verticalLineToRelative(2.38f)
                lineToRelative(-2.38f, -2.38f)
                close()
                moveTo(13.5f, 7.38f)
                verticalLineToRelative(-2.38f)
                horizontalLineToRelative(2.38f)
                lineToRelative(-2.38f, 2.38f)
                close()
            }
        }.also { _UtilityPole = it}
