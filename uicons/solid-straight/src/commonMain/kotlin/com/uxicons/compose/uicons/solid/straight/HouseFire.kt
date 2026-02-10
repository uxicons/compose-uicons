package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFire: ImageVector? = null

val Icons.Ss.HouseFire: ImageVector
    get() = _HouseFire ?: UXIcon(name = "HouseFire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8f)
                curveToRelative(-2.12f, 2.45f, -1.19f, 6.92f, -3.19f, 6.92f)
                curveToRelative(-0.71f, 0f, -1.48f, -2.69f, -1.48f, -2.69f)
                curveToRelative(-1.16f, 1.2f, -2.33f, 2.75f, -2.33f, 4.77f)
                curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.13f, 7f, -7f)
                curveToRelative(0f, -4.05f, -4.79f, -6.79f, -7f, -9f)
                close()
                moveTo(18.41f, 21.41f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(1.42f, 1.42f)
                horizontalLineToRelative(0f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                close()
                moveTo(11.36f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, 0.43f, -1.85f, 1.19f, -2.44f)
                lineTo(10.09f, 0.66f)
                curveToRelative(1.12f, -0.88f, 2.69f, -0.88f, 3.82f, 0f)
                lineToRelative(8.9f, 6.98f)
                curveToRelative(0.75f, 0.59f, 1.19f, 1.48f, 1.19f, 2.44f)
                verticalLineToRelative(1.73f)
                curveToRelative(-1.15f, -1.46f, -2.61f, -2.67f, -3.85f, -3.69f)
                curveToRelative(-0.66f, -0.55f, -1.29f, -1.07f, -1.74f, -1.52f)
                lineToRelative(-1.52f, -1.52f)
                lineToRelative(-1.41f, 1.62f)
                curveToRelative(-0.91f, 1.05f, -1.38f, 2.27f, -1.69f, 3.44f)
                lineToRelative(-0.51f, -1.76f)
                lineToRelative(-2.4f, 2.48f)
                curveToRelative(-1.24f, 1.28f, -2.89f, 3.31f, -2.89f, 6.16f)
                curveToRelative(0f, 2.83f, 1.31f, 5.35f, 3.36f, 7f)
                close()
            }
        }.also { _HouseFire = it}
