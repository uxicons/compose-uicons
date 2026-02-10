package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Total: ImageVector? = null

val Icons.Ts.Total: ImageVector
    get() = _Total ?: UXIcon(name = "Total") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(3.18f)
                lineToRelative(10f, 11f)
                lineTo(3.18f, 23f)
                horizontalLineToRelative(16.32f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1.19f)
                lineToRelative(9.82f, -10.81f)
                lineTo(2f, 1.19f)
                verticalLineTo(0f)
                horizontalLineToRelative(17.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _Total = it}
