package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pencil: ImageVector? = null

val Icons.Rs.Pencil: ImageVector
    get() = _Pencil ?: UXIcon(name = "Pencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.94f, 1.06f)
                arcToRelative(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.12f, 0f)
                lineTo(0f, 18.88f)
                verticalLineTo(24f)
                horizontalLineTo(5.12f)
                lineTo(22.94f, 6.18f)
                arcTo(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.94f, 1.06f)
                close()
                moveTo(4.3f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(19.7f)
                lineTo(15.31f, 6.4f)
                lineToRelative(2.3f, 2.3f)
                close()
                moveTo(21.53f, 4.77f)
                lineTo(19.02f, 7.28f)
                lineToRelative(-2.29f, -2.3f)
                lineTo(19.23f, 2.47f)
                arcToRelative(1.62f, 1.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.3f, 2.3f)
                close()
            }
        }.also { _Pencil = it}
