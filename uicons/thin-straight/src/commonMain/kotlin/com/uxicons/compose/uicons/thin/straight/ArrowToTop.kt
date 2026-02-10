package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToTop: ImageVector? = null

val Icons.Ts.ArrowToTop: ImageVector
    get() = _ArrowToTop ?: UXIcon(name = "ArrowToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(1f)
                horizontalLineToRelative(6.29f)
                lineTo(5.15f, 7.15f)
                lineToRelative(0.71f, 0.71f)
                lineTo(11.5f, 2.21f)
                verticalLineTo(24f)
                horizontalLineToRelative(1f)
                verticalLineTo(2.21f)
                lineToRelative(5.65f, 5.65f)
                lineToRelative(0.71f, -0.71f)
                lineTo(12.71f, 1f)
                horizontalLineToRelative(6.29f)
                verticalLineTo(0f)
                close()
            }
        }.also { _ArrowToTop = it}
