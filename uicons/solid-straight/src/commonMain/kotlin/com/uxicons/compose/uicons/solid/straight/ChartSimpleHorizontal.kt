package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartSimpleHorizontal: ImageVector? = null

val Icons.Ss.ChartSimpleHorizontal: ImageVector
    get() = _ChartSimpleHorizontal ?: UXIcon(name = "ChartSimpleHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(-6f)
                lineTo(22f, 9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(16f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 0f)
                lineTo(16f, 0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(10f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-6f)
                lineTo(10f, 18f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _ChartSimpleHorizontal = it}
