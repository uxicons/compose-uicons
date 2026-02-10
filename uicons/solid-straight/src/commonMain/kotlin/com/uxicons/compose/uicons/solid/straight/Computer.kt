package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Computer: ImageVector? = null

val Icons.Ss.Computer: ImageVector
    get() = _Computer ?: UXIcon(name = "Computer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                verticalLineTo(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                verticalLineToRelative(9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                lineToRelative(0f, -4f)
                lineToRelative(-24f, 0f)
                lineToRelative(0f, 4f)
                lineToRelative(11f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(12f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(11f, 0f)
                close()
            }
        }.also { _Computer = it}
