package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartWaterfall: ImageVector? = null

val Icons.Rs.ChartWaterfall: ImageVector
    get() = _ChartWaterfall ?: UXIcon(name = "ChartWaterfall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(24f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 17f)
                horizontalLineToRelative(2f)
                lineTo(24f, 0f)
                close()
                moveTo(19f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                lineTo(19f, 4f)
                close()
                moveTo(14f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(9f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _ChartWaterfall = it}
