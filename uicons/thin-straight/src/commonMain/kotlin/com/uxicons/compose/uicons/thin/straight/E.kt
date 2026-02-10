package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _E: ImageVector? = null

val Icons.Ts.E: ImageVector
    get() = _E ?: UXIcon(name = "E") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 1f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineTo(22f)
                verticalLineToRelative(-1f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(12.06f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _E = it}
