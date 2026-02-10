package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UtilityPole: ImageVector? = null

val Icons.Rs.UtilityPole: ImageVector
    get() = _UtilityPole ?: UXIcon(name = "UtilityPole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(2f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4.59f)
                lineToRelative(6.41f, 6.41f)
                verticalLineToRelative(13.59f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13.59f)
                lineToRelative(6.41f, -6.41f)
                horizontalLineToRelative(4.59f)
                close()
                moveTo(7.41f, 4f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                close()
                moveTo(13f, 7.59f)
                verticalLineToRelative(-3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, 3.59f)
                close()
            }
        }.also { _UtilityPole = it}
