package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterSki: ImageVector? = null

val Icons.Ss.WaterSki: ImageVector
    get() = _WaterSki ?: UXIcon(name = "WaterSki") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(3.89f, 14.34f)
                lineTo(7f, 15.66f)
                verticalLineToRelative(3.34f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.66f)
                lineToRelative(-3f, -1.28f)
                verticalLineToRelative(-4.37f)
                lineToRelative(2.23f, 1.31f)
                horizontalLineToRelative(3.77f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.23f)
                lineToRelative(-2.07f, -1.22f)
                curveToRelative(-0.67f, -0.42f, -1.24f, -0.78f, -2.12f, -0.78f)
                curveToRelative(-1.45f, 0f, -2.58f, 1.16f, -2.58f, 2.65f)
                verticalLineToRelative(2.35f)
                curveToRelative(0f, 1.19f, 0.49f, 2.69f, 1.89f, 3.34f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                lineToRelative(2.5f, 3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(22.5f, 21.32f)
                curveToRelative(-0.38f, 0.43f, -0.93f, 0.68f, -1.5f, 0.68f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                curveToRelative(-0.57f, 0f, -1.12f, -0.25f, -1.5f, -0.68f)
                lineToRelative(-1.51f, 1.32f)
                curveToRelative(0.76f, 0.87f, 1.85f, 1.37f, 3.01f, 1.37f)
                curveToRelative(1.2f, 0f, 2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                reflectiveCurveToRelative(2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                reflectiveCurveToRelative(2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                curveToRelative(1.15f, 0f, 2.25f, -0.5f, 3.01f, -1.37f)
                lineToRelative(-1.51f, -1.31f)
                close()
            }
        }.also { _WaterSki = it}
