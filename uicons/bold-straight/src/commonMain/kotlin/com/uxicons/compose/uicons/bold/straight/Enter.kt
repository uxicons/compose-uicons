package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Enter: ImageVector? = null

val Icons.Bs.Enter: ImageVector
    get() = _Enter ?: UXIcon(name = "Enter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.5f)
                lineTo(24f, 10.5f)
                lineToRelative(-14.69f, 0.03f)
                lineToRelative(3.46f, -3.46f)
                lineTo(10.65f, 4.94f)
                lineTo(6.07f, 9.53f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.95f)
                lineToRelative(4.58f, 4.59f)
                lineToRelative(2.12f, -2.12f)
                lineTo(9.36f, 13.53f)
                close()
            }
        }.also { _Enter = it}
