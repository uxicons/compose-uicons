package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownSmallBig: ImageVector? = null

val Icons.Bs.ArrowDownSmallBig: ImageVector
    get() = _ArrowDownSmallBig ?: UXIcon(name = "ArrowDownSmallBig") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.4f, 16.9f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-4.25f, 4.25f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                lineTo(0.45f, 19.07f)
                lineToRelative(2.1f, -2.14f)
                lineToRelative(2.45f, 2.4f)
                lineTo(5f, 0f)
                horizontalLineToRelative(3f)
                lineTo(8f, 19.29f)
                lineToRelative(2.4f, -2.4f)
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
        }.also { _ArrowDownSmallBig = it}
