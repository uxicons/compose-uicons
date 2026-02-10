package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimePast: ImageVector? = null

val Icons.Ss.TimePast: ImageVector
    get() = _TimePast ?: UXIcon(name = "TimePast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 3.06f)
                verticalLineTo(0f)
                horizontalLineTo(2f)
                verticalLineTo(5.14f)
                arcTo(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.86f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(4.86f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 12f)
                horizontalLineTo(0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 7f)
                lineToRelative(0f, 5.41f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.71f, -2.71f)
                lineToRelative(0f, -4.59f)
                lineToRelative(-2f, 0f)
                close()
            }
        }.also { _TimePast = it}
