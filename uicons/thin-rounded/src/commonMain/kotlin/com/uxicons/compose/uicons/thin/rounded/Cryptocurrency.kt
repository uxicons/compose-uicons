package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cryptocurrency: ImageVector? = null

val Icons.Tr.Cryptocurrency: ImageVector
    get() = _Cryptocurrency ?: UXIcon(name = "Cryptocurrency") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(8.46f, 8.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                reflectiveCurveToRelative(5.12f, 1.95f, 7.07f, 0f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-1.04f, 1.04f, -2.38f, 1.59f, -3.74f, 1.71f)
                verticalLineToRelative(1.55f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.55f)
                curveToRelative(-1.36f, -0.11f, -2.7f, -0.66f, -3.74f, -1.71f)
                curveToRelative(-2.34f, -2.34f, -2.34f, -6.15f, 0f, -8.48f)
                curveToRelative(1.04f, -1.04f, 2.38f, -1.59f, 3.74f, -1.71f)
                verticalLineToRelative(-1.55f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.55f)
                curveToRelative(1.36f, 0.11f, 2.7f, 0.67f, 3.74f, 1.71f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(-0.51f, 0.2f, -0.71f, 0f)
                curveToRelative(-1.95f, -1.95f, -5.12f, -1.95f, -7.07f, 0f)
                close()
            }
        }.also { _Cryptocurrency = it}
