package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignPosts: ImageVector? = null

val Icons.Bs.SignPosts: ImageVector
    get() = _SignPosts ?: UXIcon(name = "SignPosts") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.2f, -3f, -3.45f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                lineTo(6f, 2f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.05f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                lineTo(24f, 5.5f)
                close()
                moveTo(21f, 16f)
                lineTo(3f, 16f)
                lineTo(3f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                close()
            }
        }.also { _SignPosts = it}
