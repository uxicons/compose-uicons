package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartTreeMap: ImageVector? = null

val Icons.Ss.ChartTreeMap: ImageVector
    get() = _ChartTreeMap ?: UXIcon(name = "ChartTreeMap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                lineTo(13f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 0f)
                lineTo(13f, 0f)
                lineTo(13f, 6f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 18f)
                lineTo(13f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(8f, 13f)
                lineTo(3f, 13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                lineTo(11f, 24f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(8f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 11f)
                lineTo(11f, 11f)
                lineTo(11f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _ChartTreeMap = it}
