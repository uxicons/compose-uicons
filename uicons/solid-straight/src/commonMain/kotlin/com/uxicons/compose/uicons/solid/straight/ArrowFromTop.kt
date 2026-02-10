package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromTop: ImageVector? = null

val Icons.Ss.ArrowFromTop: ImageVector
    get() = _ArrowFromTop ?: UXIcon(name = "ArrowFromTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(21.21f)
                lineTo(6.7f, 16.9f)
                lineTo(5.28f, 18.32f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, 0f)
                lineToRelative(4.95f, -4.95f)
                lineTo(17.3f, 16.9f)
                lineToRelative(-4.3f, 4.3f)
                verticalLineTo(2f)
                close()
            }
        }.also { _ArrowFromTop = it}
