package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Laptop: ImageVector? = null

val Icons.Ss.Laptop: ImageVector
    get() = _Laptop ?: UXIcon(name = "Laptop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.99f, 18f)
                lineToRelative(-0.85f, -1f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(17f)
                horizontalLineTo(15.86f)
                lineToRelative(-0.85f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.08f, 15f)
                lineToRelative(0.85f, 1f)
                lineToRelative(4.16f, 0f)
                lineToRelative(0.85f, -1f)
                lineToRelative(7.07f, 0f)
                lineToRelative(0f, -12f)
                lineToRelative(-20f, 0f)
                lineToRelative(0f, 12f)
                lineToRelative(7.08f, 0f)
                close()
            }
        }.also { _Laptop = it}
