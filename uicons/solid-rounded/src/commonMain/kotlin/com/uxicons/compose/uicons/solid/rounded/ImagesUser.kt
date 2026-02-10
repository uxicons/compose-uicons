package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImagesUser: ImageVector? = null

val Icons.Sr.ImagesUser: ImageVector
    get() = _ImagesUser ?: UXIcon(name = "ImagesUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 16.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.41f, -1.72f, 4.43f, -4f, 4.9f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(1.4f)
                curveToRelative(-2.28f, -0.47f, -4f, -2.48f, -4f, -4.9f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(17f, 7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(18f, 21f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                verticalLineToRelative(-1.99f)
                lineToRelative(0.02f, -2.67f)
                curveToRelative(0.0f, -0.42f, -0.25f, -0.79f, -0.64f, -0.94f)
                curveToRelative(-0.39f, -0.15f, -0.83f, -0.04f, -1.1f, 0.27f)
                curveToRelative(-0.82f, 0.92f, -1.28f, 2.1f, -1.28f, 3.34f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _ImagesUser = it}
