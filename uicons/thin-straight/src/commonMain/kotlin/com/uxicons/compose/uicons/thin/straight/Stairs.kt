package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stairs: ImageVector? = null

val Icons.Ts.Stairs: ImageVector
    get() = _Stairs ?: UXIcon(name = "Stairs") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 0.04f)
                lineToRelative(-0.01f, 1f)
                lineToRelative(-4.0f, -0.03f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineTo(1f)
                verticalLineToRelative(4f)
                horizontalLineTo(0f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineTo(-0.0f)
                lineToRelative(5.0f, 0.04f)
                close()
            }
        }.also { _Stairs = it}
