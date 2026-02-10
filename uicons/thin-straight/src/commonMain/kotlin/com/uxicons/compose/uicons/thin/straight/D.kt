package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _D: ImageVector? = null

val Icons.Ts.D: ImageVector
    get() = _D ?: UXIcon(name = "D") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 24f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(2.5f)
                curveTo(2f, 1.12f, 3.12f, 0f, 4.5f, 0f)
                horizontalLineTo(12.5f)
                curveToRelative(5.24f, 0f, 9.5f, 4.26f, 9.5f, 9.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 5.24f, -4.26f, 9.5f, -9.5f, 9.5f)
                close()
                moveTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(12.5f)
                curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -4.69f, -3.81f, -8.5f, -8.5f, -8.5f)
                horizontalLineTo(4.5f)
                close()
            }
        }.also { _D = it}
