package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClothingRack: ImageVector? = null

val Icons.Ss.ClothingRack: ImageVector
    get() = _ClothingRack ?: UXIcon(name = "ClothingRack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.0f, 24f)
                lineToRelative(-0.0f, -20f)
                horizontalLineToRelative(-4.0f)
                lineTo(18f, 2f)
                horizontalLineToRelative(4f)
                lineTo(22f, 0f)
                reflectiveCurveToRelative(2f, 0f, 2f, 0f)
                lineToRelative(0.0f, 24f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(7f, 4f)
                lineTo(7f, 2f)
                lineTo(2.0f, 2f)
                lineTo(2.0f, 0f)
                lineTo(-0.0f, 0f)
                lineToRelative(0.0f, 24f)
                lineTo(2f, 24f)
                lineToRelative(-0.0f, -20f)
                lineTo(7f, 4f)
                close()
                moveTo(16f, 5f)
                lineTo(16f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 5f)
                lineTo(11f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16f, 7.03f)
                verticalLineToRelative(-0.03f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(0.03f)
                curveToRelative(-2.4f, 0.16f, -4f, 1.7f, -4f, 3.97f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.27f, -1.6f, -3.81f, -4f, -3.97f)
                close()
                moveTo(8f, 11f)
                curveToRelative(0f, -1.58f, 0.56f, -2.96f, 1.52f, -4f)
                horizontalLineToRelative(-1.11f)
                curveToRelative(-2.63f, 0f, -4.41f, 1.61f, -4.41f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _ClothingRack = it}
