package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimePast: ImageVector? = null

val Icons.Bs.TimePast: ImageVector
    get() = _TimePast ?: UXIcon(name = "TimePast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.53f, 3.53f)
                lineTo(1f, 1f)
                verticalLineTo(6.91f)
                arcTo(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.09f, 8f)
                horizontalLineTo(8f)
                lineTo(5.65f, 5.65f)
                arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 12f)
                horizontalLineTo(0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 7f)
                lineToRelative(0f, 6.62f)
                lineToRelative(3.44f, 3.44f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.56f, -2.56f)
                lineToRelative(0f, -5.38f)
                lineToRelative(-3f, 0f)
                close()
            }
        }.also { _TimePast = it}
