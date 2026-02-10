package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneRotary: ImageVector? = null

val Icons.Sr.PhoneRotary: ImageVector
    get() = _PhoneRotary ?: UXIcon(name = "PhoneRotary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 7.25f)
                curveToRelative(0f, -1.41f, 0.56f, -2.76f, 1.59f, -3.79f)
                curveTo(3.88f, 1.18f, 7.94f, 0.03f, 12f, 0.03f)
                reflectiveCurveToRelative(8.12f, 1.14f, 10.41f, 3.43f)
                curveToRelative(1.03f, 1.03f, 1.59f, 2.37f, 1.59f, 3.79f)
                curveToRelative(0f, 1.36f, -0.74f, 2.54f, -1.83f, 3.19f)
                lineToRelative(-2.58f, -3.67f)
                curveToRelative(-0.58f, -0.83f, -1.4f, -1.47f, -2.35f, -1.82f)
                curveToRelative(-1.22f, -0.45f, -3.07f, -0.95f, -5.23f, -0.95f)
                reflectiveCurveToRelative(-4.01f, 0.5f, -5.23f, 0.95f)
                curveToRelative(-0.95f, 0.35f, -1.76f, 0.99f, -2.35f, 1.82f)
                lineToRelative(-2.58f, 3.67f)
                curveToRelative(-1.09f, -0.65f, -1.83f, -1.83f, -1.83f, -3.19f)
                close()
                moveTo(15f, 15f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(24.0f, 20.2f)
                curveToRelative(-0.04f, 2.13f, -1.86f, 3.8f, -3.99f, 3.8f)
                lineTo(3.99f, 24f)
                curveTo(1.9f, 24f, 0.04f, 22.29f, 0.0f, 20.2f)
                curveToRelative(-0.03f, -1.68f, 0.33f, -3.36f, 1.05f, -4.89f)
                curveToRelative(0.15f, -0.33f, 0.35f, -0.64f, 0.55f, -0.94f)
                lineToRelative(4.12f, -6.09f)
                curveToRelative(0.49f, -0.72f, 1.19f, -1.26f, 2.01f, -1.54f)
                curveToRelative(1.04f, -0.36f, 2.55f, -0.73f, 4.27f, -0.73f)
                curveToRelative(1.72f, 0f, 3.23f, 0.38f, 4.27f, 0.73f)
                curveToRelative(0.82f, 0.28f, 1.53f, 0.82f, 2.01f, 1.54f)
                lineToRelative(4.42f, 6.54f)
                curveToRelative(0.88f, 1.65f, 1.33f, 3.51f, 1.29f, 5.37f)
                close()
                moveTo(17f, 15f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _PhoneRotary = it}
