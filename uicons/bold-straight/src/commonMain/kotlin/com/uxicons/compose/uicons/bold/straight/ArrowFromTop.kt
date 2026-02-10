package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromTop: ImageVector? = null

val Icons.Bs.ArrowFromTop: ImageVector
    get() = _ArrowFromTop ?: UXIcon(name = "ArrowFromTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.95f, 16.05f)
                lineTo(13.5f, 19.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(19f)
                verticalLineToRelative(-3f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                verticalLineTo(19.5f)
                lineToRelative(-3.45f, -3.45f)
                lineTo(4.93f, 18.17f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(4.95f, -4.95f)
                close()
            }
        }.also { _ArrowFromTop = it}
