package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tree: ImageVector? = null

val Icons.Rs.Tree: ImageVector
    get() = _Tree ?: UXIcon(name = "Tree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.4f, 22f)
                lineToRelative(-4.13f, -6f)
                horizontalLineToRelative(2.82f)
                lineTo(16.8f, 10f)
                horizontalLineToRelative(3.15f)
                lineToRelative(-5.9f, -8.93f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.12f, 0.02f)
                lineTo(4.04f, 10f)
                horizontalLineTo(7.2f)
                lineTo(2.91f, 16f)
                horizontalLineTo(5.73f)
                lineTo(1.6f, 22f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                close()
                moveTo(8.16f, 16f)
                horizontalLineToRelative(5.25f)
                lineToRelative(-1.38f, -2f)
                horizontalLineTo(6.8f)
                lineToRelative(2.86f, -4f)
                horizontalLineToRelative(2.23f)
                lineTo(10.46f, 8f)
                horizontalLineTo(7.76f)
                lineToRelative(3.82f, -5.79f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.81f, -0.02f)
                lineTo(16.23f, 8f)
                horizontalLineTo(12.91f)
                lineTo(17.2f, 14f)
                horizontalLineTo(14.46f)
                lineTo(18.6f, 20f)
                horizontalLineTo(5.4f)
                close()
            }
        }.also { _Tree = it}
