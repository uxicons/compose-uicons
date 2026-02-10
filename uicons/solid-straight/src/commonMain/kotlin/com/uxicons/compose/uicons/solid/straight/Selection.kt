package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Selection: ImageVector? = null

val Icons.Ss.Selection: ImageVector
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
                moveTo(22.5f, 5f)
                horizontalLineToRelative(-2.57f)
                curveToRelative(0.04f, 0.33f, 0.07f, 0.66f, 0.07f, 1f)
                curveToRelative(0f, 0.69f, -0.1f, 1.36f, -0.26f, 2f)
                horizontalLineToRelative(4.26f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(4f, 6f)
                curveToRelative(0f, -0.34f, 0.03f, -0.67f, 0.07f, -1f)
                lineTo(1.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.26f)
                curveToRelative(-0.17f, -0.64f, -0.26f, -1.31f, -0.26f, -2f)
                close()
                moveTo(14f, 11.11f)
                curveToRelative(0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-1.25f, -0.2f, -2.34f, 0.76f, -2.34f, 1.97f)
                verticalLineToRelative(9.82f)
                curveToRelative(-1.08f, -0.89f, -2.11f, -1.75f, -2.15f, -1.78f)
                curveToRelative(-0.92f, -0.86f, -2.37f, -0.81f, -3.23f, 0.11f)
                curveToRelative(-0.86f, 0.92f, -0.82f, 2.37f, 0.1f, 3.23f)
                lineToRelative(1.82f, 1.63f)
                horizontalLineToRelative(16.46f)
                verticalLineToRelative(-4f)
                lineToRelative(-9f, -3.54f)
                verticalLineToRelative(-5.36f)
                close()
                moveTo(12f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 1.79f, 0.79f, 3.4f, 2.03f, 4.5f)
                curveToRelative(0.12f, -0.98f, 0.61f, -1.89f, 1.38f, -2.54f)
                curveToRelative(0.9f, -0.76f, 2.08f, -1.09f, 3.25f, -0.9f)
                curveToRelative(1.71f, 0.28f, 3.05f, 1.71f, 3.3f, 3.45f)
                curveToRelative(1.25f, -1.1f, 2.04f, -2.71f, 2.04f, -4.51f)
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
