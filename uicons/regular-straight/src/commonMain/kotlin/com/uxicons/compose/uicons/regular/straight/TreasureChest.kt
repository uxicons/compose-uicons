package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreasureChest: ImageVector? = null

val Icons.Rs.TreasureChest: ImageVector
    get() = _TreasureChest ?: UXIcon(name = "TreasureChest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                lineTo(6f, 0f)
                curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(22f, 6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 2.56f)
                curveToRelative(1.19f, 0.69f, 2f, 1.97f, 2f, 3.44f)
                close()
                moveTo(18f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 2f)
                horizontalLineToRelative(12f)
                close()
                moveTo(13f, 9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(4f, 2.56f)
                verticalLineToRelative(6.44f)
                lineTo(2f, 9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.47f, 0.81f, -2.75f, 2f, -3.44f)
                close()
                moveTo(20f, 22f)
                lineTo(20f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                lineTo(6f, 22f)
                lineTo(6f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                lineTo(2f, 22f)
                lineTo(2f, 11f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _TreasureChest = it}
