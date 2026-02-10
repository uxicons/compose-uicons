package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ObjectExclude: ImageVector? = null

val Icons.Ss.ObjectExclude: ImageVector
    get() = _ObjectExclude ?: UXIcon(name = "ObjectExclude") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 11f)
                verticalLineToRelative(5f)
                lineTo(0f, 16f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(13f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(8f)
                lineTo(8f, 16f)
                verticalLineToRelative(8f)
                lineTo(24f, 24f)
                lineTo(24f, 11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _ObjectExclude = it}
