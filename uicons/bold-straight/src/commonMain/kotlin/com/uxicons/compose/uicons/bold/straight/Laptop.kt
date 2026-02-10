package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Laptop: ImageVector? = null

val Icons.Bs.Laptop: ImageVector
    get() = _Laptop ?: UXIcon(name = "Laptop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                lineTo(22f, 3f)
                lineTo(2f, 3f)
                lineTo(2f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(21f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(24f, 15f)
                close()
                moveTo(14.77f, 16f)
                lineTo(9.23f, 16f)
                lineToRelative(-0.92f, -1f)
                lineTo(5f, 15f)
                lineTo(5f, 6f)
                lineTo(19f, 6f)
                verticalLineToRelative(9f)
                lineTo(15.69f, 15f)
                close()
            }
        }.also { _Laptop = it}
