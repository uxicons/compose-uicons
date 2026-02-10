package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sitemap: ImageVector? = null

val Icons.Bs.Sitemap: ImageVector
    get() = _Sitemap ?: UXIcon(name = "Sitemap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 17f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4f)
                horizontalLineTo(5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6f)
                horizontalLineTo(0f)
                verticalLineToRelative(-6f)
                horizontalLineTo(1.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(6f)
                verticalLineTo(7f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(1.5f)
                close()
            }
        }.also { _Sitemap = it}
