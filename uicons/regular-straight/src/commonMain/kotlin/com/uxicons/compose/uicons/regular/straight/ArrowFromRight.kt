package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromRight: ImageVector? = null

val Icons.Rs.ArrowFromRight: ImageVector
    get() = _ArrowFromRight ?: UXIcon(name = "ArrowFromRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5f)
                verticalLineToRelative(6f)
                horizontalLineTo(2.79f)
                lineTo(7.1f, 6.7f)
                lineTo(5.68f, 5.28f)
                lineTo(0.73f, 10.23f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
                lineToRelative(4.95f, 4.95f)
                lineTo(7.1f, 17.3f)
                lineTo(2.79f, 13f)
                horizontalLineTo(22f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                close()
            }
        }.also { _ArrowFromRight = it}
