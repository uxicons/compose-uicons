package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crown: ImageVector? = null

val Icons.Bs.Crown: ImageVector
    get() = _Crown ?: UXIcon(name = "Crown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 22.2f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(1.8f)
                lineTo(6.27f, 8.08f)
                lineTo(12f, 2.35f)
                lineToRelative(5.73f, 5.73f)
                lineTo(24f, 1.8f)
                verticalLineTo(19.2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 22.2f)
                close()
                moveTo(3f, 9.04f)
                verticalLineTo(19.2f)
                lineToRelative(18f, 0f)
                verticalLineTo(9.04f)
                lineToRelative(-3.27f, 3.27f)
                lineTo(12f, 6.59f)
                lineTo(6.27f, 12.32f)
                close()
            }
        }.also { _Crown = it}
