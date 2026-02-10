package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UtilityPole: ImageVector? = null

val Icons.Ts.UtilityPole: ImageVector
    get() = _UtilityPole ?: UXIcon(name = "UtilityPole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6.5f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6.5f)
                lineTo(5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                lineTo(1f, 2f)
                lineTo(1f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.29f)
                lineToRelative(7.21f, 7.21f)
                verticalLineToRelative(13.79f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-13.79f)
                lineToRelative(7.21f, -7.21f)
                horizontalLineToRelative(4.29f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(11.5f, 8.79f)
                lineTo(5.71f, 3f)
                horizontalLineToRelative(5.79f)
                verticalLineToRelative(5.79f)
                close()
                moveTo(12.5f, 8.79f)
                lineTo(12.5f, 3f)
                horizontalLineToRelative(5.79f)
                lineToRelative(-5.79f, 5.79f)
                close()
            }
        }.also { _UtilityPole = it}
