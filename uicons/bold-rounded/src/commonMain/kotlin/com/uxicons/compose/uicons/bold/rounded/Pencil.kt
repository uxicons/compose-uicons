package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pencil: ImageVector? = null

val Icons.Br.Pencil: ImageVector
    get() = _Pencil ?: UXIcon(name = "Pencil") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.82f, 1.18f)
            arcToRelative(4.11f, 4.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.68f, 0f)
            lineTo(1.61f, 16.71f)
            arcTo(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 20.6f)
            verticalLineToRelative(1.9f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 24f)
            horizontalLineTo(3.4f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.89f, -1.61f)
            lineTo(22.82f, 6.85f)
            arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.82f, 1.18f)
            close()
            moveTo(5.17f, 20.27f)
            arcTo(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, 21f)
            horizontalLineTo(3f)
            verticalLineToRelative(-0.4f)
            arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.73f, -1.77f)
            lineTo(15.3f, 7.27f)
            lineTo(16.73f, 8.7f)
            close()
            moveTo(20.7f, 4.73f)
            lineTo(18.85f, 6.58f)
            lineTo(17.42f, 5.15f)
            lineTo(19.27f, 3.3f)
            arcToRelative(1.04f, 1.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.43f, 0f)
            arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.7f, 4.73f)
            close()
        }
    }.also { _Pencil = it }
