package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClothingRack: ImageVector? = null

val Icons.Rs.ClothingRack: ImageVector
    get() = _ClothingRack ?: UXIcon(name = "ClothingRack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.6f, 7f)
                horizontalLineToRelative(-0.59f)
                lineTo(15f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 7f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 7f)
                horizontalLineToRelative(-0.59f)
                curveToRelative(-2.63f, 0f, -4.41f, 1.61f, -4.41f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.39f, -1.77f, -4f, -4.41f, -4f)
                close()
                moveTo(8.4f, 9f)
                horizontalLineToRelative(0.12f)
                curveToRelative(-0.33f, 0.57f, -0.52f, 1.24f, -0.52f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.8f, 1.68f, -2f, 2.4f, -2f)
                close()
                moveTo(8f, 17f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(16f, 11f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.54f, 1.22f, -1.91f, 2.03f, -1.98f)
                curveToRelative(0.46f, 0.59f, 1.16f, 0.98f, 1.97f, 0.98f)
                reflectiveCurveToRelative(1.51f, -0.39f, 1.97f, -0.98f)
                curveToRelative(0.81f, 0.07f, 2.03f, 0.44f, 2.03f, 1.98f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(22.0f, 24f)
                lineToRelative(-0.0f, -20f)
                horizontalLineToRelative(-5.0f)
                lineTo(17f, 2f)
                horizontalLineToRelative(5f)
                lineTo(22f, 0f)
                reflectiveCurveToRelative(2f, 0f, 2f, 0f)
                lineToRelative(0.0f, 24f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(2.0f, 4f)
                lineToRelative(0.0f, 20f)
                lineTo(0f, 24f)
                lineTo(-0.0f, 0f)
                lineTo(2.0f, 0f)
                lineTo(2.0f, 2f)
                lineTo(7f, 2f)
                verticalLineToRelative(2f)
                lineTo(2.0f, 4f)
                close()
            }
        }.also { _ClothingRack = it}
