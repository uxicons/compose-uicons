package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortShapesUp: ImageVector? = null

val Icons.Bs.SortShapesUp: ImageVector
    get() = _SortShapesUp ?: UXIcon(name = "SortShapesUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 10f)
                lineTo(14f, 10f)
                lineTo(14f, 1f)
                horizontalLineToRelative(9f)
                lineTo(23f, 10f)
                close()
                moveTo(18.5f, 13.7f)
                lineToRelative(-5f, 9.3f)
                horizontalLineToRelative(10f)
                lineToRelative(-5f, -9.3f)
                close()
                moveTo(4.74f, 0.72f)
                lineTo(0.45f, 4.93f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(2.45f, -2.4f)
                lineTo(5f, 24f)
                horizontalLineToRelative(3f)
                lineTo(8f, 4.71f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(2.12f, -2.12f)
                lineTo(8.27f, 0.73f)
                curveToRelative(-0.97f, -0.98f, -2.56f, -0.97f, -3.52f, -0.01f)
                close()
            }
        }.also { _SortShapesUp = it}
