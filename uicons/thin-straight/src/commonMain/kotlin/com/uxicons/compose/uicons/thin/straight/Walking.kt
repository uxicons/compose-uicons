package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walking: ImageVector? = null

val Icons.Ts.Walking: ImageVector
    get() = _Walking ?: UXIcon(name = "Walking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.76f, 10.62f)
                lineToRelative(-2.38f, -3.76f)
                curveToRelative(-0.47f, -0.54f, -1.16f, -0.85f, -1.88f, -0.85f)
                horizontalLineToRelative(-3.12f)
                lineToRelative(-4.67f, 2.33f)
                lineToRelative(-1.2f, 5.05f)
                lineToRelative(0.97f, 0.23f)
                lineToRelative(1.09f, -4.6f)
                lineToRelative(3.9f, -1.95f)
                lineToRelative(-1.4f, 5.77f)
                curveToRelative(-0.26f, 1.08f, 0.23f, 2.21f, 1.2f, 2.76f)
                lineToRelative(4.73f, 2.69f)
                verticalLineToRelative(5.71f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6.29f)
                lineToRelative(-2.79f, -1.59f)
                lineToRelative(2.03f, -7.63f)
                lineToRelative(1.82f, 2.9f)
                lineToRelative(4.12f, 2.06f)
                lineToRelative(0.45f, -0.9f)
                lineToRelative(-3.88f, -1.94f)
                close()
                moveTo(11.35f, 15.63f)
                lineToRelative(-1.58f, -0.9f)
                curveToRelative(-0.58f, -0.33f, -0.87f, -1.01f, -0.72f, -1.66f)
                lineToRelative(1.47f, -6.08f)
                horizontalLineToRelative(1.98f)
                curveToRelative(0.4f, 0f, 0.77f, 0.16f, 1.02f, 0.39f)
                lineToRelative(-2.17f, 8.25f)
                close()
                moveTo(12.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(12.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.79f, 17.1f)
                lineToRelative(0.71f, 0.4f)
                lineToRelative(-0.56f, 2.25f)
                lineToRelative(-2.01f, 4.25f)
                horizontalLineToRelative(-1.1f)
                lineToRelative(2.19f, -4.66f)
                lineToRelative(0.6f, -2.35f)
                curveToRelative(0.06f, 0.04f, 0.12f, 0.07f, 0.18f, 0.11f)
                close()
            }
        }.also { _Walking = it}
