package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hamburger: ImageVector? = null

val Icons.Tr.Hamburger: ImageVector
    get() = _Hamburger ?: UXIcon(name = "Hamburger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(7f, 9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(23f, 15.5f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0.0f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                lineTo(6.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-1.82f)
                curveToRelative(-0.61f, -0.46f, -1f, -1.28f, -1f, -2.09f)
                curveToRelative(0f, -0.82f, 0.39f, -1.63f, 1f, -2.09f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, -0.0f)
                curveTo(1f, 5.71f, 5.71f, 1f, 11.5f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(5.79f, 0f, 10.5f, 4.71f, 10.5f, 10.5f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0.0f)
                curveToRelative(0.61f, 0.46f, 1f, 1.18f, 1f, 2.0f)
                reflectiveCurveToRelative(-0.39f, 1.54f, -1f, 2.0f)
                close()
                moveTo(2.01f, 11.05f)
                curveToRelative(0.16f, -0.03f, 0.32f, -0.05f, 0.49f, -0.05f)
                horizontalLineToRelative(19f)
                curveToRelative(0.17f, 0f, 0.33f, 0.02f, 0.49f, 0.05f)
                curveToRelative(-0.24f, -5.03f, -4.4f, -9.05f, -9.49f, -9.05f)
                horizontalLineToRelative(-1f)
                curveTo(6.41f, 2f, 2.25f, 6.02f, 2.01f, 11.05f)
                close()
                moveTo(22f, 15.95f)
                curveToRelative(-0.16f, 0.03f, -0.33f, 0.05f, -0.5f, 0.05f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.29f, 0f, -4.5f, 0.83f, -6.23f, 2.33f)
                curveToRelative(-0.51f, 0.45f, -1.14f, 0.67f, -1.77f, 0.67f)
                reflectiveCurveToRelative(-1.26f, -0.22f, -1.77f, -0.67f)
                curveToRelative(-1.33f, -1.16f, -2.99f, -1.92f, -4.73f, -2.21f)
                curveToRelative(-0.01f, 0f, -0.0f, 0f, 0f, 0f)
                verticalLineToRelative(1.38f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-1.55f)
                close()
                moveTo(23f, 13.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 12.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.76f, -1.5f, 1.59f)
                curveToRelative(0f, 0.72f, 0.51f, 1.44f, 1.19f, 1.55f)
                curveToRelative(1.92f, 0.32f, 3.72f, 1.16f, 5.19f, 2.44f)
                curveToRelative(0.65f, 0.56f, 1.58f, 0.56f, 2.23f, 0f)
                curveToRelative(1.91f, -1.66f, 4.36f, -2.57f, 6.88f, -2.57f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(2f, 16.12f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0.01f, 0f, 0f, 0f)
                close()
            }
        }.also { _Hamburger = it}
