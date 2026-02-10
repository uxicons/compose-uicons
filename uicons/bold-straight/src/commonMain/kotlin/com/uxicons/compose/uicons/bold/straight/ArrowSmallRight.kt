package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallRight: ImageVector? = null

val Icons.Bs.ArrowSmallRight: ImageVector
    get() = _ArrowSmallRight ?: UXIcon(name = "ArrowSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.77f, 10.23f)
                lineTo(13.47f, 5.94f)
                lineTo(11.35f, 8.06f)
                lineTo(13.79f, 10.5f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8.79f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.29f, -4.29f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.77f, 10.23f)
                close()
            }
        }.also { _ArrowSmallRight = it}
