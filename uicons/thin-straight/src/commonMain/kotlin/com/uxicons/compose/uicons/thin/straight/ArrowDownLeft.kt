package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownLeft: ImageVector? = null

val Icons.Ts.ArrowDownLeft: ImageVector
    get() = _ArrowDownLeft ?: UXIcon(name = "ArrowDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.99f, 0.71f)
                lineTo(23.29f, 0f)
                lineTo(1f, 22.29f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(14f)
                verticalLineToRelative(-1f)
                horizontalLineTo(1.71f)
                lineTo(23.99f, 0.71f)
                close()
            }
        }.also { _ArrowDownLeft = it}
