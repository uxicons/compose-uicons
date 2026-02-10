package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pencil: ImageVector? = null

val Icons.Sr.Pencil: ImageVector
    get() = _Pencil ?: UXIcon(name = "Pencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.17f, 19.12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 21.95f)
                verticalLineTo(24f)
                horizontalLineTo(2.05f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, -1.17f)
                lineTo(18.22f, 9.48f)
                lineTo(14.52f, 5.78f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.14f, 0.85f)
                arcToRelative(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.71f, 0f)
                lineTo(15.93f, 4.36f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.51f, -3.51f)
                arcTo(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.14f, 0.85f)
                close()
            }
        }.also { _Pencil = it}
