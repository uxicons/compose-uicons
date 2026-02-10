package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartSimpleHorizontal: ImageVector? = null

val Icons.Ts.ChartSimpleHorizontal: ImageVector
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
                moveTo(23f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 14f)
                verticalLineToRelative(-4f)
                lineTo(22f, 10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 4f)
                lineTo(18f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(0f, 0f)
                lineTo(0f, 6f)
                lineTo(16f, 6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(1f, 1f)
                horizontalLineToRelative(15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 5f)
                lineTo(1f, 1f)
                close()
                moveTo(10f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(6f)
                lineTo(10f, 24f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(11f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 23f)
                verticalLineToRelative(-4f)
                lineTo(10f, 19f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _ChartSimpleHorizontal = it}
