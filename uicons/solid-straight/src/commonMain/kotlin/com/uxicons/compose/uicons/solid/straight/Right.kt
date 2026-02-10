package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Right: ImageVector? = null

val Icons.Ss.Right: ImageVector
    get() = _Right ?: UXIcon(name = "Right") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 23.94f)
                verticalLineToRelative(-6.93f)
                horizontalLineTo(0f)
                verticalLineTo(7.01f)
                horizontalLineTo(13f)
                verticalLineTo(0.06f)
                lineToRelative(10.11f, 9.82f)
                curveToRelative(0.58f, 0.58f, 0.89f, 1.33f, 0.89f, 2.13f)
                reflectiveCurveToRelative(-0.31f, 1.56f, -0.88f, 2.13f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-10.11f, 9.8f, -10.11f, 9.8f)
                close()
            }
        }.also { _Right = it}
