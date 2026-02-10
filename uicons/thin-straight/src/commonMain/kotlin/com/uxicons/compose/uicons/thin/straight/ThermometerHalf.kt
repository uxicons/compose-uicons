package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerHalf: ImageVector? = null

val Icons.Ts.ThermometerHalf: ImageVector
    get() = _ThermometerHalf ?: UXIcon(name = "ThermometerHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 14.04f)
                verticalLineToRelative(-5.04f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.04f)
                curveToRelative(-1.42f, 0.24f, -2.5f, 1.47f, -2.5f, 2.96f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.48f, -1.08f, -2.72f, -2.5f, -2.96f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(17f, 12.11f)
                verticalLineToRelative(-7.11f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(7.11f)
                curveToRelative(-1.29f, 1.32f, -2f, 3.05f, -2f, 4.89f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -1.85f, -0.71f, -3.58f, -2f, -4.89f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -1.64f, 0.66f, -3.18f, 1.85f, -4.32f)
                lineToRelative(0.15f, -0.15f)
                verticalLineToRelative(-7.53f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(7.53f)
                lineToRelative(0.15f, 0.15f)
                curveToRelative(1.19f, 1.15f, 1.85f, 2.68f, 1.85f, 4.32f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _ThermometerHalf = it}
