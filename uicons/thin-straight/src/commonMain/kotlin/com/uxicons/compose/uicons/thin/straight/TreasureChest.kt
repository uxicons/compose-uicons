package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreasureChest: ImageVector? = null

val Icons.Ts.TreasureChest: ImageVector
    get() = _TreasureChest ?: UXIcon(name = "TreasureChest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 0f)
                lineTo(5.5f, 0f)
                curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(23f, 5.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3f)
                lineTo(20f, 1.28f)
                curveToRelative(1.74f, 0.62f, 3f, 2.27f, 3f, 4.22f)
                close()
                moveTo(18.5f, 1f)
                curveToRelative(0.17f, 0f, 0.33f, 0.03f, 0.5f, 0.05f)
                verticalLineToRelative(7.95f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                lineTo(5f, 9f)
                lineTo(5f, 1.05f)
                curveToRelative(0.17f, -0.02f, 0.33f, -0.05f, 0.5f, -0.05f)
                horizontalLineToRelative(13f)
                close()
                moveTo(14f, 9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(4f, 1.28f)
                verticalLineToRelative(7.72f)
                lineTo(1f, 9f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.95f, 1.26f, -3.6f, 3f, -4.22f)
                close()
                moveTo(20f, 23f)
                lineTo(20f, 12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(11f)
                lineTo(5f, 23f)
                lineTo(5f, 12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(11f)
                lineTo(1f, 23f)
                lineTo(1f, 10f)
                lineTo(9f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _TreasureChest = it}
