package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Checkbox: ImageVector? = null

val Icons.Ss.Checkbox: ImageVector
    get() = _Checkbox ?: UXIcon(name = "Checkbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(10.75f, 17.33f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 0f)
                lineTo(3.29f, 12.71f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.63f, 4.63f)
                lineToRelative(9.96f, -9.96f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _Checkbox = it}
