package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartSimple: ImageVector? = null

val Icons.Rs.ChartSimple: ImageVector
    get() = _ChartSimple ?: UXIcon(name = "ChartSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                lineTo(9f, 24f)
                horizontalLineToRelative(6f)
                lineTo(15f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(13f, 22f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 22f)
                close()
                moveTo(22f, 6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                lineTo(18f, 24f)
                horizontalLineToRelative(6f)
                lineTo(24f, 8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                close()
                moveTo(4f, 12f)
                lineTo(2f, 12f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(10f)
                lineTo(6f, 24f)
                lineTo(6f, 14f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(4f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _ChartSimple = it}
