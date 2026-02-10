package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eclipse: ImageVector? = null

val Icons.Tc.Eclipse: ImageVector
    get() = _Eclipse ?: UXIcon(name = "Eclipse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.03f, 2.93f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.28f)
                curveToRelative(-1.38f, 0.04f, -2.8f, 0.29f, -3.89f, 1.17f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, -0.0f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, -0.0f, 0.71f)
                lineToRelative(1.3f, 1.3f)
                curveToRelative(-0.66f, 0.86f, -1.1f, 2.11f, -1.17f, 3.9f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(3.77f)
                curveToRelative(0.07f, 1.79f, 0.51f, 3.04f, 1.17f, 3.9f)
                lineToRelative(-1.3f, 1.3f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(1.09f, 0.88f, 2.51f, 1.13f, 3.89f, 1.17f)
                verticalLineToRelative(2.28f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.77f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                curveToRelative(-3.16f, 0f, -5.27f, -0.9f, -5.27f, -5.3f)
                reflectiveCurveToRelative(2.11f, -5.3f, 5.27f, -5.3f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(3.43f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.31f, 6.29f)
                curveToRelative(-2.65f, 0f, -5.69f, 0.65f, -5.69f, 5.71f)
                reflectiveCurveToRelative(3.04f, 5.71f, 5.69f, 5.71f)
                reflectiveCurveToRelative(5.69f, -0.65f, 5.69f, -5.71f)
                reflectiveCurveToRelative(-3.04f, -5.71f, -5.69f, -5.71f)
                close()
                moveTo(17.31f, 16.71f)
                curveToRelative(-2.81f, 0f, -4.69f, -0.8f, -4.69f, -4.71f)
                reflectiveCurveToRelative(1.87f, -4.71f, 4.69f, -4.71f)
                reflectiveCurveToRelative(4.69f, 0.8f, 4.69f, 4.71f)
                reflectiveCurveToRelative(-1.87f, 4.71f, -4.69f, 4.71f)
                close()
            }
        }.also { _Eclipse = it}
