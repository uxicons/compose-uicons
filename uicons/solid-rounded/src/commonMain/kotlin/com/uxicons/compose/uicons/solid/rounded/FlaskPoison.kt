package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlaskPoison: ImageVector? = null

val Icons.Sr.FlaskPoison: ImageVector
    get() = _FlaskPoison ?: UXIcon(name = "FlaskPoison") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(10f, 13f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 16.71f)
                curveToRelative(0f, 0.98f, -0.13f, 1.95f, -0.39f, 2.89f)
                curveToRelative(-0.71f, 2.59f, -3.09f, 4.4f, -5.79f, 4.4f)
                lineTo(6.18f, 24f)
                curveToRelative(-2.7f, 0f, -5.08f, -1.81f, -5.79f, -4.4f)
                curveToRelative(-0.26f, -0.94f, -0.39f, -1.91f, -0.39f, -2.89f)
                curveToRelative(0f, -4.28f, 2.47f, -8.17f, 6.45f, -10.16f)
                curveToRelative(0.34f, -0.17f, 0.56f, -0.51f, 0.56f, -0.89f)
                verticalLineToRelative(-3.67f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.71f)
                curveToRelative(0f, 0.37f, 0.21f, 0.71f, 0.55f, 0.89f)
                curveToRelative(3.98f, 2.02f, 6.45f, 5.9f, 6.45f, 10.12f)
                close()
                moveTo(16f, 14f)
                curveToRelative(0f, -2.34f, -2.01f, -4.21f, -4.4f, -3.98f)
                curveToRelative(-2.08f, 0.2f, -3.6f, 2.07f, -3.6f, 4.16f)
                verticalLineToRelative(1.82f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _FlaskPoison = it}
