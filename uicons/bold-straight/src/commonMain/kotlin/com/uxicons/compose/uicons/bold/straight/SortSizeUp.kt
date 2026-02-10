package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortSizeUp: ImageVector? = null

val Icons.Bs.SortSizeUp: ImageVector
    get() = _SortSizeUp ?: UXIcon(name = "SortSizeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 15f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                verticalLineTo(15f)
                close()
                moveTo(14f, 1f)
                verticalLineTo(11f)
                horizontalLineToRelative(10f)
                verticalLineTo(1f)
                horizontalLineTo(14f)
                close()
                moveTo(4.74f, 0.72f)
                lineTo(0.45f, 4.93f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(2.45f, -2.4f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(4.71f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(2.12f, -2.12f)
                lineTo(8.27f, 0.73f)
                curveToRelative(-0.97f, -0.97f, -2.56f, -0.97f, -3.52f, -0.01f)
                close()
            }
        }.also { _SortSizeUp = it}
