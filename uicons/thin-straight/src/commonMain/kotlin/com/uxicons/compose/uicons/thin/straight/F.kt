package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _F: ImageVector? = null

val Icons.Ts.F: ImageVector
    get() = _F ?: UXIcon(name = "F") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 1f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineTo(24f)
                horizontalLineToRelative(1f)
                verticalLineTo(13f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _F = it}
