package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortShapesDown: ImageVector? = null

val Icons.Bs.SortShapesDown: ImageVector
    get() = _SortShapesDown ?: UXIcon(name = "SortShapesDown") {
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
                moveTo(8f, 19.29f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 19.33f)
                lineToRelative(-2.45f, -2.4f)
                lineTo(0.45f, 19.07f)
                lineToRelative(4.28f, 4.2f)
                curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.28f, -0.24f, 1.77f, -0.73f)
                lineToRelative(4.25f, -4.25f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.4f, 2.4f)
                close()
            }
        }.also { _SortShapesDown = it}
