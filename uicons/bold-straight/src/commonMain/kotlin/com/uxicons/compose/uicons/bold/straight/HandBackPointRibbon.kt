package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRibbon: ImageVector? = null

val Icons.Bs.HandBackPointRibbon: ImageVector
    get() = _HandBackPointRibbon ?: UXIcon(name = "HandBackPointRibbon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7.83f)
                verticalLineToRelative(-3.83f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(6f, 1.79f, 6f, 4f)
                verticalLineToRelative(1f)
                lineTo(2f, 5f)
                lineToRelative(2f, 1.5f)
                lineToRelative(-2f, 1.5f)
                lineTo(6f, 8f)
                verticalLineToRelative(1.94f)
                lineToRelative(-3.98f, 3.98f)
                curveToRelative(-1.36f, 1.36f, -1.36f, 3.58f, 0.02f, 4.97f)
                lineToRelative(5.35f, 5.13f)
                lineToRelative(14.6f, -0.02f)
                lineTo(22f, 9.83f)
                lineToRelative(-8f, -2f)
                close()
                moveTo(9f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19f, 21.0f)
                lineToRelative(-10.4f, 0.01f)
                lineToRelative(-4.46f, -4.27f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(1.85f, -1.85f)
                verticalLineToRelative(1.82f)
                horizontalLineToRelative(3f)
                lineTo(9f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.17f)
                lineToRelative(8f, 2f)
                verticalLineToRelative(8.83f)
                close()
            }
        }.also { _HandBackPointRibbon = it}
