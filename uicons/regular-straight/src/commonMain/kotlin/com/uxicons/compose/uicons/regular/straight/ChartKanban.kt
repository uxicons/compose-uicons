package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartKanban: ImageVector? = null

val Icons.Rs.ChartKanban: ImageVector
    get() = _ChartKanban ?: UXIcon(name = "ChartKanban") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(6f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(20f)
                close()
                moveTo(4f, 0f)
                horizontalLineToRelative(-2f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6f)
                lineTo(6f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(4f, 17f)
                horizontalLineToRelative(-2f)
                lineTo(2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(15f)
                close()
                moveTo(13f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(6f)
                lineTo(15f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _ChartKanban = it}
