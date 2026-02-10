package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterLadder: ImageVector? = null

val Icons.Bs.WaterLadder: ImageVector
    get() = _WaterLadder ?: UXIcon(name = "WaterLadder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                verticalLineToRelative(3f)
                curveToRelative(-1.16f, 0f, -2.2f, -0.45f, -3f, -1.17f)
                curveToRelative(-0.8f, 0.72f, -1.84f, 1.17f, -3f, 1.17f)
                reflectiveCurveToRelative(-2.2f, -0.45f, -3f, -1.17f)
                curveToRelative(-0.8f, 0.72f, -1.84f, 1.17f, -3f, 1.17f)
                reflectiveCurveToRelative(-2.2f, -0.45f, -3f, -1.17f)
                curveToRelative(-0.8f, 0.72f, -1.84f, 1.17f, -3f, 1.17f)
                reflectiveCurveToRelative(-2.2f, -0.45f, -3f, -1.17f)
                curveToRelative(-0.8f, 0.72f, -1.84f, 1.17f, -3f, 1.17f)
                verticalLineToRelative(-3f)
                curveToRelative(0.65f, 0f, 1.2f, -0.42f, 1.41f, -1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
                reflectiveCurveToRelative(1.2f, -0.42f, 1.41f, -1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
                reflectiveCurveToRelative(1.2f, -0.42f, 1.41f, -1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
                reflectiveCurveToRelative(1.2f, -0.42f, 1.41f, -1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(-3f)
                lineTo(4f, 4.5f)
                curveTo(4f, 2.02f, 6.02f, 0f, 8.5f, 0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                lineTo(7f, 15f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                lineTo(7f, 9f)
                close()
            }
        }.also { _WaterLadder = it}
