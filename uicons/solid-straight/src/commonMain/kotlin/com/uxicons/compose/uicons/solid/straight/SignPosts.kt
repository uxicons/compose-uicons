package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignPosts: ImageVector? = null

val Icons.Ss.SignPosts: ImageVector
    get() = _SignPosts ?: UXIcon(name = "SignPosts") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                close()
            }
        }.also { _SignPosts = it}
