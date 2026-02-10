package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Computer: ImageVector? = null

val Icons.Ts.Computer: ImageVector
    get() = _Computer ?: UXIcon(name = "Computer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineTo(11.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(2.5f, 2f)
                horizontalLineTo(21.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(14f)
                horizontalLineTo(1f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 15f)
                horizontalLineTo(23f)
                verticalLineToRelative(3f)
                horizontalLineTo(1f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Computer = it}
