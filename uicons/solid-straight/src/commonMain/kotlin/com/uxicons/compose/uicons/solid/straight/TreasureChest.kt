package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreasureChest: ImageVector? = null

val Icons.Ss.TreasureChest: ImageVector
    get() = _TreasureChest ?: UXIcon(name = "TreasureChest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0.35f)
                curveToRelative(2.33f, 0.83f, 4f, 3.04f, 4f, 5.65f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                lineTo(20f, 0.35f)
                close()
                moveTo(6f, 9f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(3f)
                lineTo(18f, 0f)
                lineTo(6f, 0f)
                lineTo(6f, 9f)
                close()
                moveTo(15f, 11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4f)
                lineTo(0f, 11f)
                verticalLineToRelative(13f)
                lineTo(4f, 24f)
                lineTo(4f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(12f)
                lineTo(18f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(4f)
                lineTo(24f, 11f)
                lineTo(15f, 11f)
                close()
                moveTo(11f, 9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(4f, 9f)
                lineTo(4f, 0.35f)
                curveTo(1.67f, 1.18f, 0f, 3.39f, 0f, 6f)
                verticalLineToRelative(3f)
                lineTo(4f, 9f)
                close()
            }
        }.also { _TreasureChest = it}
