package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ss3: ImageVector? = null

val Icons.Ss.Ss3: ImageVector
    get() = _Ss3 ?: UXIcon(name = "Ss3") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.89f, 9.82f)
                curveToRelative(1.28f, -1.01f, 2.11f, -2.57f, 2.11f, -4.32f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                horizontalLineTo(12.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.5f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineTo(12.5f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                curveToRelative(0f, -2.91f, -1.67f, -5.44f, -4.11f, -6.68f)
                close()
            }
        }.also { _Ss3 = it}
