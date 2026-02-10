package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreasureChest: ImageVector? = null

val Icons.Rr.TreasureChest: ImageVector
    get() = _TreasureChest ?: UXIcon(name = "TreasureChest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                curveTo(3.14f, 0f, 0f, 3.14f, 0f, 7f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 7f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 3.0f)
                curveToRelative(1.21f, 0.91f, 2f, 2.37f, 2f, 4.0f)
                close()
                moveTo(17f, 2f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1f, 0.1f)
                verticalLineToRelative(6.9f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 2.1f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.1f, 1f, -0.1f)
                horizontalLineToRelative(10f)
                close()
                moveTo(11f, 9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(4f, 3.0f)
                verticalLineToRelative(6.0f)
                lineTo(2f, 9f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.63f, 0.79f, -3.08f, 2f, -4.0f)
                close()
                moveTo(20f, 21.83f)
                verticalLineToRelative(-7.83f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                lineTo(6f, 22f)
                lineTo(6f, 14f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7.83f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.52f, -2f, -2.83f)
                lineTo(2f, 11f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.3f, -0.84f, 2.42f, -2f, 2.83f)
                close()
            }
        }.also { _TreasureChest = it}
