package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ts4: ImageVector? = null

val Icons.Ts.Ts4: ImageVector
    get() = _Ts4 ?: UXIcon(name = "Ts4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                verticalLineTo(14f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                verticalLineTo(12.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _Ts4 = it}
