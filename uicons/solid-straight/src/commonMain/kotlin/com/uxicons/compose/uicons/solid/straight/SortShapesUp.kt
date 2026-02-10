package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortShapesUp: ImageVector? = null

val Icons.Ss.SortShapesUp: ImageVector
    get() = _SortShapesUp ?: UXIcon(name = "SortShapesUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.41f, 0.59f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(7f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 3f)
                lineTo(1.5f, 6.5f)
                lineTo(0.09f, 5.09f)
                lineTo(4.59f, 0.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                close()
                moveTo(14f, 23f)
                horizontalLineToRelative(9f)
                lineTo(23f, 14f)
                lineTo(14f, 14f)
                verticalLineToRelative(9f)
                close()
                moveTo(18.52f, 0.98f)
                lineToRelative(-5.52f, 10.02f)
                horizontalLineToRelative(10.99f)
                lineTo(18.52f, 0.98f)
                close()
            }
        }.also { _SortShapesUp = it}
