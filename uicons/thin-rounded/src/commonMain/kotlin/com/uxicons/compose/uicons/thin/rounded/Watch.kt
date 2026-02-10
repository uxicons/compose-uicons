package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Tr.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.85f, 14.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-2.5f, -2.5f)
                curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.29f)
                lineToRelative(2.35f, 2.35f)
                close()
                moveTo(18f, 20.0f)
                reflectiveCurveToRelative(0f, 0.0f, 0f, 0.01f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2.84f)
                curveToRelative(-1.47f, 0.85f, -3.18f, 1.34f, -5f, 1.34f)
                reflectiveCurveToRelative(-3.53f, -0.49f, -5f, -1.34f)
                verticalLineToRelative(2.84f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.01f)
                curveToRelative(-2.43f, -1.83f, -4f, -4.73f, -4f, -8.0f)
                reflectiveCurveToRelative(1.57f, -6.17f, 4f, -8.0f)
                curveToRelative(0f, -0.0f, 0f, -0.0f, 0f, -0.01f)
                lineTo(6f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.84f)
                curveToRelative(1.47f, -0.85f, 3.18f, -1.34f, 5f, -1.34f)
                reflectiveCurveToRelative(3.53f, 0.49f, 5f, 1.34f)
                lineTo(17f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                reflectiveCurveToRelative(0f, 0.0f, 0f, 0.01f)
                curveToRelative(2.43f, 1.83f, 4f, 4.73f, 4f, 8.0f)
                reflectiveCurveToRelative(-1.57f, 6.17f, -4f, 8.0f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
            }
        }.also { _Watch = it}
