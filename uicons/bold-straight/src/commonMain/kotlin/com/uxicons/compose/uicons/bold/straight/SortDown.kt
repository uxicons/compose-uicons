package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortDown: ImageVector? = null

val Icons.Bs.SortDown: ImageVector
    get() = _SortDown ?: UXIcon(name = "SortDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.02f, 18f)
                curveToRelative(-0.79f, 0f, -1.55f, -0.34f, -2.08f, -0.93f)
                lineTo(1.64f, 8f)
                lineTo(22.41f, 8f)
                lineToRelative(-8.31f, 9.08f)
                curveToRelative(-0.52f, 0.58f, -1.28f, 0.92f, -2.07f, 0.92f)
                close()
                moveTo(11.88f, 15.06f)
                lineToRelative(-0.0f, 0.0f)
                lineToRelative(0.0f, -0.0f)
                close()
                moveTo(12.16f, 15.05f)
                horizontalLineToRelative(0f)
                close()
                moveTo(8.45f, 11.0f)
                lineToRelative(3.57f, 3.9f)
                lineToRelative(3.57f, -3.9f)
                horizontalLineToRelative(-7.14f)
                close()
            }
        }.also { _SortDown = it}
