package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignPosts: ImageVector? = null

val Icons.Ts.SignPosts: ImageVector
    get() = _SignPosts ?: UXIcon(name = "SignPosts") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                lineTo(4f, 2f)
                lineTo(4f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                lineTo(24f, 4.5f)
                close()
                moveTo(23f, 17f)
                lineTo(1f, 17f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                close()
            }
        }.also { _SignPosts = it}
