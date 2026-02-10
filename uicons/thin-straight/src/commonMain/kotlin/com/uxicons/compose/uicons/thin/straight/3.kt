package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ts3: ImageVector? = null

val Icons.Ts.Ts3: ImageVector
    get() = _Ts3 ?: UXIcon(name = "Ts3") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.12f, 10.33f)
                curveToRelative(1.71f, -0.93f, 2.88f, -2.75f, 2.88f, -4.83f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineTo(4f)
                verticalLineTo(1f)
                horizontalLineTo(12.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                horizontalLineTo(4f)
                verticalLineToRelative(1f)
                horizontalLineTo(13f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -3.12f, -2.05f, -5.77f, -4.88f, -6.67f)
                close()
            }
        }.also { _Ts3 = it}
