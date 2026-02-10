package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateUtensils: ImageVector? = null

val Icons.Sr.PlateUtensils: ImageVector
    get() = _PlateUtensils ?: UXIcon(name = "PlateUtensils") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.41f, -1.72f, 4.43f, -4f, 4.9f)
                verticalLineToRelative(11.1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-11.1f)
                curveToRelative(-2.28f, -0.47f, -4f, -2.48f, -4f, -4.9f)
                lineTo(14f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                lineTo(18f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8.82f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                lineTo(22f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(16f, 18.92f)
                curveToRelative(-1.18f, 0.68f, -2.54f, 1.08f, -4f, 1.08f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                lineTo(12f, 1f)
                curveToRelative(0f, -0.35f, 0.07f, -0.68f, 0.18f, -0.99f)
                curveToRelative(-0.06f, 0f, -0.12f, -0.01f, -0.18f, -0.01f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                curveToRelative(1.42f, 0f, 2.77f, -0.26f, 4.03f, -0.71f)
                curveToRelative(-0.01f, -0.1f, -0.03f, -0.19f, -0.03f, -0.29f)
                verticalLineToRelative(-4.08f)
                close()
                moveTo(6f, 12f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(1.54f, 0f, 2.94f, -0.59f, 4f, -1.54f)
                verticalLineToRelative(-3.15f)
                curveToRelative(-2.36f, -1.13f, -4f, -3.53f, -4f, -6.32f)
                verticalLineToRelative(-1f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                close()
            }
        }.also { _PlateUtensils = it}
