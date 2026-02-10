package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserWriter: ImageVector? = null

val Icons.Rs.UserWriter: ImageVector
    get() = _UserWriter ?: UXIcon(name = "UserWriter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(24f, 12.06f)
                reflectiveCurveToRelative(-0.6f, 4.64f, -4.14f, 7.51f)
                curveToRelative(-1.13f, 0.91f, -2.29f, 1.47f, -3.36f, 1.81f)
                curveToRelative(0f, 0f, 1f, -3.38f, 4.07f, -6.94f)
                curveToRelative(-3.1f, 1.72f, -5.31f, 4.83f, -6.28f, 7.41f)
                curveToRelative(-0.28f, 0.7f, -0.48f, 1.45f, -0.65f, 2.15f)
                horizontalLineToRelative(-2.14f)
                curveToRelative(0.2f, -0.89f, 0.46f, -1.86f, 0.83f, -2.81f)
                curveToRelative(0.17f, -1.36f, 0.99f, -4.67f, 3.75f, -6.91f)
                curveToRelative(3.55f, -2.86f, 7.91f, -2.23f, 7.91f, -2.23f)
                close()
                moveTo(12.07f, 16f)
                lineTo(5f, 16f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.32f, 0f, 0.63f, 0.03f, 0.93f, 0.09f)
                curveToRelative(-0.55f, 0.62f, -0.99f, 1.27f, -1.36f, 1.92f)
                close()
            }
        }.also { _UserWriter = it}
