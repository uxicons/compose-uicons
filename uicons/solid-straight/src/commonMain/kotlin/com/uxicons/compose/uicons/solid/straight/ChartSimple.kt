package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartSimple: ImageVector? = null

val Icons.Ss.ChartSimple: ImageVector
    get() = _ChartSimple ?: UXIcon(name = "ChartSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 24f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineTo(15f, 24f)
                close()
                moveTo(24f, 24f)
                horizontalLineToRelative(-6f)
                lineTo(18f, 8f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineTo(24f, 24f)
                close()
                moveTo(6f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 14f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _ChartSimple = it}
