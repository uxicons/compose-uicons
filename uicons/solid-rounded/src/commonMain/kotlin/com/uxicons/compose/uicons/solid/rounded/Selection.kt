package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Selection: ImageVector? = null

val Icons.Sr.Selection: ImageVector
    get() = _Selection ?: UXIcon(name = "Selection") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2f)
                curveTo(19f, 0.9f, 19.89f, 0f, 21f, 0f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(3f, 4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(4.11f, 0f, 3f, 0f)
                reflectiveCurveTo(1f, 0.9f, 1f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(23.34f, 8f)
                curveToRelative(0.45f, 0f, 0.76f, -0.44f, 0.63f, -0.88f)
                curveToRelative(-0.38f, -1.23f, -1.52f, -2.12f, -2.87f, -2.12f)
                horizontalLineToRelative(-1.17f)
                curveToRelative(0.04f, 0.33f, 0.07f, 0.66f, 0.07f, 1f)
                curveToRelative(0f, 0.69f, -0.1f, 1.36f, -0.26f, 2f)
                horizontalLineToRelative(3.6f)
                close()
                moveTo(4.07f, 5f)
                horizontalLineToRelative(-1.15f)
                curveTo(1.53f, 5f, 0.37f, 5.93f, 0.02f, 7.21f)
                curveToRelative(-0.11f, 0.4f, 0.23f, 0.79f, 0.65f, 0.79f)
                horizontalLineToRelative(3.59f)
                curveToRelative(-0.17f, -0.64f, -0.26f, -1.31f, -0.26f, -2f)
                curveToRelative(0f, -0.34f, 0.03f, -0.67f, 0.07f, -1f)
                close()
                moveTo(23f, 23.41f)
                verticalLineToRelative(0.59f)
                lineTo(6.54f, 24f)
                lineToRelative(-1.82f, -1.63f)
                curveToRelative(-0.92f, -0.86f, -0.96f, -2.31f, -0.1f, -3.23f)
                curveToRelative(0.86f, -0.92f, 2.31f, -0.97f, 3.23f, -0.11f)
                curveToRelative(0.03f, 0.03f, 1.07f, 0.9f, 2.15f, 1.78f)
                verticalLineToRelative(-9.82f)
                curveToRelative(0f, -1.22f, 1.08f, -2.18f, 2.34f, -1.97f)
                curveToRelative(0.98f, 0.16f, 1.66f, 1.08f, 1.66f, 2.08f)
                verticalLineToRelative(5.36f)
                lineToRelative(5.83f, 2.29f)
                curveToRelative(1.91f, 0.75f, 3.17f, 2.6f, 3.17f, 4.65f)
                close()
                moveTo(12f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 1.8f, 0.8f, 3.4f, 2.05f, 4.5f)
                curveToRelative(0.12f, -0.98f, 0.59f, -1.9f, 1.35f, -2.55f)
                curveToRelative(0.9f, -0.76f, 2.08f, -1.09f, 3.25f, -0.9f)
                curveToRelative(1.71f, 0.28f, 3.03f, 1.71f, 3.29f, 3.45f)
                curveToRelative(1.25f, -1.1f, 2.05f, -2.71f, 2.05f, -4.5f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _Selection = it}
