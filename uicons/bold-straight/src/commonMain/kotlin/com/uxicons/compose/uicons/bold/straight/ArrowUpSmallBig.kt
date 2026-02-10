package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpSmallBig: ImageVector? = null

val Icons.Bs.ArrowUpSmallBig: ImageVector
    get() = _ArrowUpSmallBig ?: UXIcon(name = "ArrowUpSmallBig") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.27f, 0.73f)
                lineToRelative(4.25f, 4.25f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.4f, -2.4f)
                lineTo(8f, 24f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 4.67f)
                lineToRelative(-2.45f, 2.4f)
                lineTo(0.45f, 4.93f)
                lineTo(4.74f, 0.72f)
                curveToRelative(0.96f, -0.96f, 2.55f, -0.96f, 3.52f, 0.01f)
                close()
                moveTo(14f, 23f)
                horizontalLineToRelative(10f)
                lineTo(24f, 13f)
                lineTo(14f, 13f)
                verticalLineToRelative(10f)
                close()
                moveTo(16f, 1f)
                lineTo(16f, 9f)
                horizontalLineToRelative(8f)
                lineTo(24f, 1f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _ArrowUpSmallBig = it}
