package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curve: ImageVector? = null

val Icons.Bs.Curve: ImageVector
    get() = _Curve ?: UXIcon(name = "Curve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(3f)
                curveTo(12.42f, 3f, 3f, 12.42f, 3f, 24f)
                horizontalLineTo(0f)
                curveTo(0f, 10.77f, 10.77f, 0f, 24f, 0f)
                close()
            }
        }.also { _Curve = it}
