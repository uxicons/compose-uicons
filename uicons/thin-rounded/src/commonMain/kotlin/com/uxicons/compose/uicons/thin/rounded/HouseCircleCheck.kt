package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleCheck: ImageVector? = null

val Icons.Tr.HouseCircleCheck: ImageVector
    get() = _HouseCircleCheck ?: UXIcon(name = "HouseCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.56f)
                verticalLineToRelative(1.94f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.94f)
                curveToRelative(0f, -1.16f, -0.58f, -2.25f, -1.54f, -2.9f)
                lineTo(13.96f, 1.6f)
                curveToRelative(-1.19f, -0.8f, -2.73f, -0.8f, -3.92f, 0f)
                lineTo(2.54f, 6.66f)
                curveToRelative(-0.97f, 0.65f, -1.54f, 1.74f, -1.54f, 2.9f)
                verticalLineToRelative(9.94f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-9.94f)
                curveToRelative(0f, -1.5f, 0.74f, -2.89f, 1.98f, -3.73f)
                lineTo(9.48f, 0.77f)
                curveToRelative(1.53f, -1.03f, 3.5f, -1.03f, 5.03f, 0f)
                lineToRelative(7.5f, 5.06f)
                curveToRelative(1.24f, 0.84f, 1.98f, 2.23f, 1.98f, 3.73f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
                moveTo(20.14f, 16.13f)
                lineToRelative(-2.71f, 2.62f)
                curveToRelative(-0.34f, 0.33f, -0.89f, 0.33f, -1.22f, 0.0f)
                lineToRelative(-1.36f, -1.34f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.0f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                lineToRelative(1.36f, 1.35f)
                curveToRelative(0.36f, 0.35f, 0.84f, 0.53f, 1.31f, 0.53f)
                reflectiveCurveToRelative(0.95f, -0.18f, 1.31f, -0.53f)
                lineToRelative(2.7f, -2.61f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                close()
            }
        }.also { _HouseCircleCheck = it}
