package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mosque: ImageVector? = null

val Icons.Ss.Mosque: ImageVector
    get() = _Mosque ?: UXIcon(name = "Mosque") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(15f)
                lineTo(0f, 24f)
                verticalLineToRelative(-15f)
                close()
                moveTo(10.58f, 12.97f)
                lineToRelative(10.8f, 0.03f)
                curveToRelative(1.61f, -1.22f, 2.62f, -2.92f, 2.62f, -4.42f)
                curveToRelative(0f, -3.82f, -3.98f, -5.18f, -6.33f, -6.48f)
                curveToRelative(0f, 0f, -0.67f, -0.3f, -0.67f, -2.1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.85f, -0.72f, 2.13f, -0.72f, 2.13f)
                curveToRelative(-2.35f, 1.29f, -6.28f, 2.65f, -6.28f, 6.45f)
                curveToRelative(0f, 1.48f, 1.0f, 3.17f, 2.58f, 4.38f)
                close()
                moveTo(3f, 0f)
                reflectiveCurveTo(0f, 2.5f, 0f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                curveTo(6f, 2.5f, 3f, 0f, 3f, 0f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-9f)
                lineTo(8f, 15f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _Mosque = it}
