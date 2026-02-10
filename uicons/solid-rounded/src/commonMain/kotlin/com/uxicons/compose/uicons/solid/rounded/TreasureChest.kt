package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreasureChest: ImageVector? = null

val Icons.Sr.TreasureChest: ImageVector
    get() = _TreasureChest ?: UXIcon(name = "TreasureChest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 0.07f)
                curveToRelative(0.33f, -0.05f, 0.66f, -0.07f, 1f, -0.07f)
                horizontalLineToRelative(10f)
                curveToRelative(0.34f, 0f, 0.67f, 0.03f, 1f, 0.07f)
                lineTo(18f, 9f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 0.07f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.79f, -1.64f, -5.2f, -4f, -6.32f)
                lineTo(20f, 9f)
                close()
                moveTo(15f, 11f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                lineTo(0f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                lineTo(4f, 14f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(12f)
                lineTo(18f, 14f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9.9f)
                curveToRelative(2.28f, -0.47f, 4f, -2.48f, 4f, -4.9f)
                lineTo(24f, 11f)
                lineTo(15f, 11f)
                close()
                moveTo(4f, 9f)
                lineTo(4f, 0.68f)
                curveTo(1.64f, 1.8f, 0f, 4.21f, 0f, 7f)
                verticalLineToRelative(2f)
                lineTo(4f, 9f)
                close()
                moveTo(12f, 13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _TreasureChest = it}
