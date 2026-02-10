package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stairs: ImageVector? = null

val Icons.Rs.Stairs: ImageVector
    get() = _Stairs ?: UXIcon(name = "Stairs") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineTo(2f)
                verticalLineToRelative(6f)
                horizontalLineTo(0f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineTo(0f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Stairs = it}
