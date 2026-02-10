package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Label: ImageVector? = null

val Icons.Bs.Label: ImageVector
    get() = _Label ?: UXIcon(name = "Label") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                lineTo(2f, 5.62f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(5.62f)
                close()
                moveTo(5f, 21f)
                verticalLineTo(7.37f)
                lineToRelative(7f, -3.93f)
                lineToRelative(7f, 3.93f)
                lineTo(19f, 21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
        }.also { _Label = it}
