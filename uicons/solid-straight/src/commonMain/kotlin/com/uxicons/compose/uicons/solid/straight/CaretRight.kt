package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretRight: ImageVector? = null

val Icons.Ss.CaretRight: ImageVector
    get() = _CaretRight ?: UXIcon(name = "CaretRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.71f, 19.29f)
                verticalLineToRelative(-14f)
                lineTo(16f, 11.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 13f)
                close()
            }
        }.also { _CaretRight = it}
