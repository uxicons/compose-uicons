package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartSimpleHorizontal: ImageVector? = null

val Icons.Rs.ChartSimpleHorizontal: ImageVector
    get() = _ChartSimpleHorizontal ?: UXIcon(name = "ChartSimpleHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                lineTo(22f, 15f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 13f)
                lineTo(2f, 13f)
                verticalLineToRelative(-2f)
                lineTo(22f, 11f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(0f, 0f)
                lineTo(0f, 6f)
                lineTo(16f, 6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(18f, 2f)
                close()
                moveTo(16f, 4f)
                lineTo(2f, 4f)
                lineTo(2f, 2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(6f)
                lineTo(10f, 24f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(10f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-2f)
                lineTo(10f, 20f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _ChartSimpleHorizontal = it}
