package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClothingRack: ImageVector? = null

val Icons.Bs.ClothingRack: ImageVector
    get() = _ClothingRack ?: UXIcon(name = "ClothingRack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.1f, 7f)
                horizontalLineToRelative(-0.59f)
                lineTo(13.5f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 7f)
                horizontalLineToRelative(-0.59f)
                curveToRelative(-2.93f, 0f, -4.91f, 1.81f, -4.91f, 4.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -2.69f, -1.97f, -4.5f, -4.91f, -4.5f)
                close()
                moveTo(16f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.99f, 0.64f, -1.5f, 1.91f, -1.5f)
                horizontalLineToRelative(0.11f)
                curveToRelative(0.46f, 0.6f, 1.17f, 1f, 1.99f, 1f)
                reflectiveCurveToRelative(1.53f, -0.4f, 1.99f, -1f)
                horizontalLineToRelative(0.11f)
                curveToRelative(1.26f, 0f, 1.91f, 0.51f, 1.91f, 1.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(21.0f, 24f)
                lineToRelative(-0.0f, -19f)
                horizontalLineToRelative(-5.5f)
                lineTo(15.5f, 2f)
                horizontalLineToRelative(5.5f)
                lineTo(21f, 0f)
                reflectiveCurveToRelative(3f, 0f, 3f, 0f)
                lineToRelative(0.0f, 24f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(3.0f, 5f)
                lineToRelative(0.0f, 19f)
                lineTo(0f, 24f)
                lineTo(-0.0f, 0f)
                lineTo(3.0f, 0f)
                lineTo(3.0f, 2f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(3f)
                lineTo(3.0f, 5f)
                close()
            }
        }.also { _ClothingRack = it}
