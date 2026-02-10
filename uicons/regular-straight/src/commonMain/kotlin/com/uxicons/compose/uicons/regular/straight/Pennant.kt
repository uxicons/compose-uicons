package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pennant: ImageVector? = null

val Icons.Rs.Pennant: ImageVector
    get() = _Pennant ?: UXIcon(name = "Pennant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.34f, 3.48f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 3.72f)
                verticalLineTo(24f)
                horizontalLineTo(3f)
                verticalLineTo(20.66f)
                lineTo(23.58f, 12f)
                close()
                moveTo(3f, 5.51f)
                lineTo(18.42f, 12f)
                lineTo(3f, 18.49f)
                close()
            }
        }.also { _Pennant = it}
