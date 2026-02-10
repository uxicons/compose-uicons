package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tree: ImageVector? = null

val Icons.Bs.Tree: ImageVector
    get() = _Tree ?: UXIcon(name = "Tree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.91f, 22f)
                lineToRelative(-4.08f, -6f)
                horizontalLineTo(22f)
                lineToRelative(-4.5f, -6f)
                horizontalLineToRelative(2.83f)
                lineTo(14.4f, 1.25f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.81f, 0.01f)
                lineTo(3.67f, 10f)
                horizontalLineTo(6.5f)
                lineTo(2f, 16f)
                horizontalLineTo(5.17f)
                lineTo(1.09f, 22f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineTo(22f)
                close()
                moveTo(8.79f, 16f)
                horizontalLineToRelative(3.99f)
                lineToRelative(-2f, -2.94f)
                lineToRelative(0.04f, -0.06f)
                horizontalLineTo(8f)
                lineToRelative(2.25f, -3f)
                horizontalLineToRelative(1f)
                lineTo(9.17f, 7.23f)
                lineTo(12f, 3.06f)
                lineTo(14.67f, 7f)
                horizontalLineTo(11.5f)
                lineTo(16f, 13f)
                horizontalLineTo(13.17f)
                lineToRelative(4.08f, 6f)
                horizontalLineTo(6.76f)
                close()
            }
        }.also { _Tree = it}
