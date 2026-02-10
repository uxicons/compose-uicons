package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pennant: ImageVector? = null

val Icons.Bs.Pennant: ImageVector
    get() = _Pennant ?: UXIcon(name = "Pennant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.65f, 3.78f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 4.5f)
                verticalLineTo(24f)
                horizontalLineTo(4f)
                verticalLineTo(20.49f)
                lineTo(24f, 12f)
                close()
                moveTo(4f, 6.77f)
                lineTo(16.33f, 12f)
                lineTo(4f, 17.23f)
                close()
            }
        }.also { _Pennant = it}
