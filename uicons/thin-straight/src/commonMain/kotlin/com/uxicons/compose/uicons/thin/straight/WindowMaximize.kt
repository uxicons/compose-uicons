package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowMaximize: ImageVector? = null

val Icons.Ts.WindowMaximize: ImageVector
    get() = _WindowMaximize ?: UXIcon(name = "WindowMaximize") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 1f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                verticalLineTo(23f)
                horizontalLineTo(24f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 2f)
                horizontalLineTo(21.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineTo(1f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 22f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                verticalLineToRelative(13f)
                horizontalLineTo(1f)
                close()
            }
        }.also { _WindowMaximize = it}
