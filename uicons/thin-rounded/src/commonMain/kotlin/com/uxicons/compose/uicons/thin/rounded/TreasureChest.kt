package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreasureChest: ImageVector? = null

val Icons.Tr.TreasureChest: ImageVector
    get() = _TreasureChest ?: UXIcon(name = "TreasureChest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(23f, 6.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                lineTo(20f, 1.61f)
                curveToRelative(1.78f, 0.91f, 3f, 2.76f, 3f, 4.89f)
                close()
                moveTo(17.5f, 1f)
                curveToRelative(0.52f, 0f, 1.02f, 0.08f, 1.5f, 0.21f)
                verticalLineToRelative(7.79f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                lineTo(5f, 9f)
                lineTo(5f, 1.21f)
                curveToRelative(0.48f, -0.14f, 0.98f, -0.21f, 1.5f, -0.21f)
                horizontalLineToRelative(11f)
                close()
                moveTo(10f, 9f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4f, 1.61f)
                verticalLineToRelative(7.39f)
                lineTo(1f, 9f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.13f, 1.22f, -3.98f, 3f, -4.89f)
                close()
                moveTo(20f, 22.95f)
                lineTo(20f, 12.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                lineTo(5f, 23f)
                lineTo(5f, 12.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10.45f)
                curveToRelative(-1.69f, -0.24f, -3f, -1.69f, -3f, -3.45f)
                lineTo(1f, 10f)
                lineTo(9f, 10f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.76f, -1.31f, 3.2f, -3f, 3.45f)
                close()
            }
        }.also { _TreasureChest = it}
