package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Checkbox: ImageVector? = null

val Icons.Rs.Checkbox: ImageVector
    get() = _Checkbox ?: UXIcon(name = "Checkbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(2f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.33f, 17.92f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -0.59f)
                lineTo(3.29f, 12.71f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.63f, 4.63f)
                lineToRelative(9.96f, -9.96f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-9.96f, 9.96f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.33f, 17.92f)
                close()
            }
        }.also { _Checkbox = it}
