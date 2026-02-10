package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToLeft: ImageVector? = null

val Icons.Ts.ArrowToLeft: ImageVector
    get() = _ArrowToLeft ?: UXIcon(name = "ArrowToLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                horizontalLineTo(2.21f)
                lineTo(7.85f, 5.85f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(1f, 11.29f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineToRelative(14f)
                horizontalLineTo(1f)
                verticalLineToRelative(-6.29f)
                lineToRelative(6.15f, 6.15f)
                lineToRelative(0.71f, -0.71f)
                lineTo(2.21f, 12.5f)
                horizontalLineTo(24f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _ArrowToLeft = it}
