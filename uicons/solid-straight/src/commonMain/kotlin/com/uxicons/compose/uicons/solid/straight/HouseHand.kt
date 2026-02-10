package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseHand: ImageVector? = null

val Icons.Ss.HouseHand: ImageVector
    get() = _HouseHand ?: UXIcon(name = "HouseHand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.36f, 2.96f)
                lineToRelative(-3.33f, -2.61f)
                curveToRelative(-0.3f, -0.24f, -0.66f, -0.35f, -1.03f, -0.35f)
                reflectiveCurveToRelative(-0.72f, 0.12f, -1.03f, 0.35f)
                lineToRelative(-3.33f, 2.61f)
                curveToRelative(-0.4f, 0.32f, -0.64f, 0.8f, -0.64f, 1.31f)
                verticalLineToRelative(5.72f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-5.72f)
                curveToRelative(0f, -0.51f, -0.24f, -1.0f, -0.64f, -1.31f)
                close()
                moveTo(9f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.15f, 9.68f)
                curveToRelative(-0.52f, -0.47f, -1.19f, -0.71f, -1.88f, -0.68f)
                curveToRelative(-0.7f, 0.03f, -1.34f, 0.33f, -1.79f, 0.83f)
                lineToRelative(-3.54f, 3.74f)
                curveToRelative(0.03f, 0.21f, 0.07f, 0.42f, 0.07f, 0.64f)
                curveToRelative(0f, 2.08f, -1.55f, 3.88f, -3.62f, 4.17f)
                lineToRelative(-4.24f, 0.61f)
                lineToRelative(-0.28f, -1.98f)
                lineToRelative(4.15f, -0.59f)
                curveToRelative(0.94f, -0.13f, 1.75f, -0.81f, 1.94f, -1.73f)
                curveToRelative(0.3f, -1.43f, -0.79f, -2.69f, -2.16f, -2.69f)
                horizontalLineToRelative(-8.79f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(10.5f)
                lineToRelative(9.84f, -10.65f)
                curveToRelative(0.95f, -1.06f, 0.86f, -2.71f, -0.19f, -3.67f)
                close()
            }
        }.also { _HouseHand = it}
