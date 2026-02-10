package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandDryer: ImageVector? = null

val Icons.Ss.HandDryer: ImageVector
    get() = _HandDryer ?: UXIcon(name = "HandDryer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(18f)
                close()
                moveTo(0.85f, 11.68f)
                curveToRelative(1.01f, -0.96f, 2.76f, -0.88f, 3.67f, 0.16f)
                lineToRelative(3.54f, 3.74f)
                curveToRelative(-0.03f, 0.21f, -0.07f, 0.42f, -0.07f, 0.64f)
                curveToRelative(0f, 2.08f, 1.55f, 3.88f, 3.62f, 4.17f)
                lineToRelative(4.24f, 0.61f)
                lineToRelative(0.28f, -1.98f)
                lineToRelative(-4.24f, -0.61f)
                curveToRelative(-1.08f, -0.15f, -1.9f, -1.1f, -1.9f, -2.19f)
                curveToRelative(0f, -1.22f, 0.99f, -2.21f, 2.21f, -2.21f)
                horizontalLineToRelative(8.79f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-12.41f)
                reflectiveCurveToRelative(-7.93f, -8.65f, -7.93f, -8.65f)
                curveToRelative(-0.95f, -1.06f, -0.86f, -2.71f, 0.19f, -3.67f)
                close()
            }
        }.also { _HandDryer = it}
