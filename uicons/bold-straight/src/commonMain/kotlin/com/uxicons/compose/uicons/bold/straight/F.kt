package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _F: ImageVector? = null

val Icons.Bs.F: ImageVector
    get() = _F ?: UXIcon(name = "F") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                horizontalLineTo(5.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(14f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineTo(5f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
            }
        }.also { _F = it}
