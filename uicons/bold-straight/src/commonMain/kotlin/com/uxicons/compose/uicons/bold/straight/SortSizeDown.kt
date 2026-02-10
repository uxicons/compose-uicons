package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortSizeDown: ImageVector? = null

val Icons.Bs.SortSizeDown: ImageVector
    get() = _SortSizeDown ?: UXIcon(name = "SortSizeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 1f)
                lineTo(24f, 11f)
                lineTo(14f, 11f)
                lineTo(14f, 1f)
                horizontalLineToRelative(10f)
                close()
                moveTo(16f, 23f)
                horizontalLineToRelative(8f)
                lineTo(24f, 15f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
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
        }.also { _SortSizeDown = it}
