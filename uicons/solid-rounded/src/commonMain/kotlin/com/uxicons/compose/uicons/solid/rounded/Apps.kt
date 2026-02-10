package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Apps: ImageVector? = null

val Icons.Sr.Apps: ImageVector
    get() = _Apps ?: UXIcon(name = "Apps", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(85.33f, 0f)
                horizontalLineToRelative(64f)
                curveToRelative(47.13f, 0f, 85.33f, 38.21f, 85.33f, 85.33f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 47.13f, -38.21f, 85.33f, -85.33f, 85.33f)
                horizontalLineToRelative(-64f)
                curveTo(38.21f, 234.67f, 0f, 196.46f, 0f, 149.33f)
                verticalLineToRelative(-64f)
                curveTo(0f, 38.21f, 38.21f, 0f, 85.33f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(362.67f, 0f)
                horizontalLineToRelative(64f)
                curveTo(473.8f, 0f, 512f, 38.21f, 512f, 85.33f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 47.13f, -38.21f, 85.33f, -85.33f, 85.33f)
                horizontalLineToRelative(-64f)
                curveToRelative(-47.13f, 0f, -85.33f, -38.21f, -85.33f, -85.33f)
                verticalLineToRelative(-64f)
                curveTo(277.33f, 38.21f, 315.54f, 0f, 362.67f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(85.33f, 277.33f)
                horizontalLineToRelative(64f)
                curveToRelative(47.13f, 0f, 85.33f, 38.21f, 85.33f, 85.33f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 47.13f, -38.21f, 85.33f, -85.33f, 85.33f)
                horizontalLineToRelative(-64f)
                curveTo(38.21f, 512f, 0f, 473.8f, 0f, 426.67f)
                verticalLineToRelative(-64f)
                curveTo(0f, 315.54f, 38.21f, 277.33f, 85.33f, 277.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(362.67f, 277.33f)
                horizontalLineToRelative(64f)
                curveToRelative(47.13f, 0f, 85.33f, 38.21f, 85.33f, 85.33f)
                verticalLineToRelative(64f)
                curveTo(512f, 473.8f, 473.8f, 512f, 426.67f, 512f)
                horizontalLineToRelative(-64f)
                curveToRelative(-47.13f, 0f, -85.33f, -38.21f, -85.33f, -85.33f)
                verticalLineToRelative(-64f)
                curveTo(277.33f, 315.54f, 315.54f, 277.33f, 362.67f, 277.33f)
                close()
            }
        }.also { _Apps = it}
