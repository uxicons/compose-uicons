package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tree: ImageVector? = null

val Icons.Ss.Tree: ImageVector
    get() = _Tree ?: UXIcon(name = "Tree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.4f, 22f)
                lineToRelative(-4.13f, -6f)
                horizontalLineToRelative(2.82f)
                lineTo(16.8f, 10f)
                horizontalLineToRelative(3.15f)
                lineToRelative(-5.9f, -8.93f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.12f, 0.02f)
                lineTo(5.37f, 8f)
                horizontalLineTo(12f)
                lineToRelative(1.43f, 2f)
                horizontalLineTo(6.86f)
                lineTo(4f, 14f)
                horizontalLineToRelative(9.58f)
                lineToRelative(1.38f, 2f)
                horizontalLineTo(5.73f)
                lineTo(1.6f, 22f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                close()
            }
        }.also { _Tree = it}
