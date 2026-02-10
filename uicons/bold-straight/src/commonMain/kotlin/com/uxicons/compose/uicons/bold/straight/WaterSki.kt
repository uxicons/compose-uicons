package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterSki: ImageVector? = null

val Icons.Bs.WaterSki: ImageVector
    get() = _WaterSki ?: UXIcon(name = "WaterSki") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22.59f, 20f)
                horizontalLineToRelative(-3.18f)
                curveToRelative(-0.21f, 0.58f, -0.76f, 1f, -1.41f, 1f)
                reflectiveCurveToRelative(-1.2f, -0.42f, -1.41f, -1f)
                horizontalLineToRelative(-3.18f)
                curveToRelative(-0.21f, 0.58f, -0.76f, 1f, -1.41f, 1f)
                reflectiveCurveToRelative(-1.29f, -0.42f, -1.5f, -1f)
                verticalLineToRelative(-3.35f)
                lineToRelative(-3.5f, -2.1f)
                verticalLineToRelative(-4.49f)
                lineToRelative(1.59f, 0.94f)
                horizontalLineToRelative(3.41f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(-1.94f, -1.14f)
                curveToRelative(-0.65f, -0.41f, -1.4f, -0.83f, -2.38f, -0.85f)
                curveToRelative(-1.71f, 0.04f, -3.08f, 1.43f, -3.08f, 3.14f)
                verticalLineToRelative(3.37f)
                curveToRelative(0f, 1.41f, 0.67f, 2.75f, 1.8f, 3.6f)
                lineToRelative(3.7f, 2.23f)
                verticalLineToRelative(1.65f)
                curveToRelative(-0.21f, 0.58f, -0.85f, 1f, -1.5f, 1f)
                reflectiveCurveToRelative(-1.2f, -0.42f, -1.41f, -1f)
                horizontalLineToRelative(-3.18f)
                curveToRelative(-0.21f, 0.58f, -0.76f, 1f, -1.41f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(1.16f, 0f, 2.2f, -0.45f, 3f, -1.17f)
                curveToRelative(0.8f, 0.72f, 1.84f, 1.17f, 3f, 1.17f)
                reflectiveCurveToRelative(2.2f, -0.45f, 3f, -1.17f)
                curveToRelative(0.8f, 0.72f, 1.84f, 1.17f, 3f, 1.17f)
                reflectiveCurveToRelative(2.2f, -0.45f, 3f, -1.17f)
                curveToRelative(0.8f, 0.72f, 1.84f, 1.17f, 3f, 1.17f)
                reflectiveCurveToRelative(2.2f, -0.45f, 3f, -1.17f)
                curveToRelative(0.8f, 0.72f, 1.84f, 1.17f, 3f, 1.17f)
                verticalLineToRelative(-3f)
                curveToRelative(-0.65f, 0f, -1.2f, -0.42f, -1.41f, -1f)
                close()
                moveTo(18.5f, 8f)
                lineTo(16.5f, 6f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2.5f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _WaterSki = it}
