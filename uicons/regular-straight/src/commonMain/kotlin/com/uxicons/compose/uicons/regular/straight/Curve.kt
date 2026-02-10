package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curve: ImageVector? = null

val Icons.Rs.Curve: ImageVector
    get() = _Curve ?: UXIcon(name = "Curve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 24f)
                horizontalLineTo(0f)
                curveTo(0f, 10.77f, 10.77f, 0f, 24f, 0f)
                verticalLineToRelative(2f)
                curveTo(11.87f, 2f, 2f, 11.87f, 2f, 24f)
                close()
            }
        }.also { _Curve = it}
