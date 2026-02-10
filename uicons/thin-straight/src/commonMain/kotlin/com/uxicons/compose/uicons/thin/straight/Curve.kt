package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curve: ImageVector? = null

val Icons.Ts.Curve: ImageVector
    get() = _Curve ?: UXIcon(name = "Curve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.04f, 24f)
                horizontalLineTo(0.04f)
                curveTo(0.04f, 10.79f, 10.79f, 0.04f, 24f, 0.04f)
                verticalLineToRelative(1f)
                curveTo(11.34f, 1.04f, 1.04f, 11.34f, 1.04f, 24f)
                close()
            }
        }.also { _Curve = it}
