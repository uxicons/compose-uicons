package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pencil: ImageVector? = null

val Icons.Bs.Pencil: ImageVector
    get() = _Pencil ?: UXIcon(name = "Pencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.82f, 1.18f)
                arcToRelative(4.11f, 4.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.68f, 0f)
                lineTo(0f, 18.32f)
                verticalLineTo(24f)
                horizontalLineTo(5.68f)
                lineTo(22.82f, 6.85f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.82f, 1.18f)
                close()
                moveTo(4.43f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(19.57f)
                lineTo(15.65f, 6.91f)
                lineToRelative(1.43f, 1.43f)
                close()
            }
        }.also { _Pencil = it}
