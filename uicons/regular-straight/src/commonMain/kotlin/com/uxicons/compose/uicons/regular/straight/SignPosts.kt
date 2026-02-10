package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignPosts: ImageVector? = null

val Icons.Rs.SignPosts: ImageVector
    get() = _SignPosts ?: UXIcon(name = "SignPosts") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(5f, 2f)
                lineTo(5f, 0f)
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
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 16f)
                lineTo(2f, 16f)
                lineTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _SignPosts = it}
