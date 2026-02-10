package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blood: ImageVector? = null

val Icons.Tc.Blood: ImageVector
    get() = _Blood ?: UXIcon(name = "Blood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.3f, 6.1f)
                curveToRelative(-0.18f, -0.13f, -0.41f, -0.13f, -0.59f, 0f)
                curveToRelative(-0.19f, 0.14f, -4.71f, 3.48f, -4.71f, 6.9f)
                curveToRelative(0f, 3.5f, 1.5f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -1.5f, 5f, -5f)
                curveToRelative(0f, -3.43f, -4.51f, -6.76f, -4.71f, -6.9f)
                close()
                moveTo(18f, 17f)
                curveToRelative(-2.95f, 0f, -4f, -1.05f, -4f, -4f)
                curveToRelative(0f, -2.47f, 3.03f, -5.09f, 4f, -5.87f)
                curveToRelative(0.97f, 0.78f, 4f, 3.4f, 4f, 5.87f)
                curveToRelative(0f, 2.95f, -1.05f, 4f, -4f, 4f)
                close()
                moveTo(10.5f, 9f)
                curveToRelative(2.42f, 0f, 3.5f, -1.08f, 3.5f, -3.5f)
                curveToRelative(0f, -1.96f, -2.87f, -4.16f, -3.2f, -4.4f)
                curveToRelative(-0.18f, -0.13f, -0.42f, -0.13f, -0.6f, 0f)
                curveToRelative(-0.33f, 0.24f, -3.2f, 2.44f, -3.2f, 4.4f)
                curveToRelative(0f, 2.42f, 1.08f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(10.5f, 2.13f)
                curveToRelative(0.88f, 0.72f, 2.5f, 2.27f, 2.5f, 3.37f)
                curveToRelative(0f, 1.87f, -0.63f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -0.63f, -2.5f, -2.5f)
                curveToRelative(0f, -1.1f, 1.6f, -2.63f, 2.5f, -3.37f)
                close()
                moveTo(6.78f, 10.09f)
                curveToRelative(-0.17f, -0.12f, -0.4f, -0.12f, -0.56f, 0f)
                curveToRelative(-0.21f, 0.15f, -5.22f, 3.62f, -5.22f, 7.41f)
                curveToRelative(0f, 3.85f, 1.65f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -1.65f, 5.5f, -5.5f)
                curveToRelative(0f, -3.79f, -5.0f, -7.27f, -5.22f, -7.41f)
                close()
                moveTo(6.5f, 22.0f)
                curveToRelative(-3.28f, 0f, -4.5f, -1.22f, -4.5f, -4.5f)
                curveToRelative(0f, -2.79f, 3.47f, -5.61f, 4.5f, -6.38f)
                curveToRelative(1.03f, 0.77f, 4.5f, 3.59f, 4.5f, 6.38f)
                curveToRelative(0f, 3.28f, -1.22f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }.also { _Blood = it}
