package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarSide: ImageVector? = null

val Icons.Ts.CarSide: ImageVector
    get() = _CarSide ?: UXIcon(name = "CarSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.74f)
                lineTo(15.93f, 3.07f)
                curveToRelative(-0.47f, -0.67f, -1.23f, -1.07f, -2.05f, -1.07f)
                lineTo(5.88f, 2f)
                curveToRelative(-1.03f, 0f, -1.97f, 0.65f, -2.34f, 1.61f)
                lineTo(0.9f, 10.57f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.46f, -0.91f, 1.15f, -0.91f, 1.93f)
                verticalLineToRelative(5.5f)
                lineTo(2f, 18f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(15.11f, 3.64f)
                lineToRelative(4.43f, 6.36f)
                lineTo(10f, 10f)
                lineTo(10f, 3f)
                horizontalLineToRelative(3.88f)
                curveToRelative(0.49f, 0f, 0.95f, 0.24f, 1.23f, 0.64f)
                close()
                moveTo(4.48f, 3.97f)
                curveToRelative(0.22f, -0.58f, 0.78f, -0.97f, 1.4f, -0.97f)
                horizontalLineToRelative(3.12f)
                verticalLineToRelative(7f)
                lineTo(2.5f, 10f)
                curveToRelative(-0.11f, 0f, -0.21f, 0.01f, -0.32f, 0.02f)
                lineTo(4.48f, 3.97f)
                close()
                moveTo(7.0f, 19f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                lineTo(7f, 18f)
                verticalLineToRelative(1f)
                close()
                moveTo(21.0f, 19f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
                moveTo(23.0f, 17f)
                lineTo(1f, 17f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                close()
            }
        }.also { _CarSide = it}
