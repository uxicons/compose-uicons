package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glass: ImageVector? = null

val Icons.Bs.Glass: ImageVector
    get() = _Glass ?: UXIcon(name = "Glass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.77f, 0f)
                lineToRelative(3f, 21f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, 3f)
                horizontalLineToRelative(9.53f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, -3f)
                lineTo(23.23f, 0f)
                close()
                moveTo(17.26f, 20.57f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, 0.43f)
                horizontalLineTo(7.23f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, -0.43f)
                lineTo(5.37f, 11f)
                horizontalLineToRelative(11.1f)
                lineTo(17f, 8f)
                horizontalLineTo(4.94f)
                lineTo(4.23f, 3f)
                horizontalLineTo(19.77f)
                close()
            }
        }.also { _Glass = it}
