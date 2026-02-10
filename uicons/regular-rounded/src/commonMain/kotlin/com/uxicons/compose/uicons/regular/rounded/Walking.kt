package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walking: ImageVector? = null

val Icons.Rr.Walking: ImageVector
    get() = _Walking ?: UXIcon(name = "Walking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(20.89f, 13.74f)
                curveToRelative(-0.18f, 0.35f, -0.53f, 0.55f, -0.9f, 0.55f)
                curveToRelative(-0.15f, 0f, -0.3f, -0.03f, -0.45f, -0.1f)
                lineToRelative(-2.84f, -1.42f)
                curveToRelative(-0.65f, -0.33f, -1.21f, -0.83f, -1.6f, -1.45f)
                lineToRelative(-0.49f, -0.78f)
                lineToRelative(-1.41f, 5.3f)
                lineToRelative(1.27f, 0.72f)
                curveToRelative(0.94f, 0.53f, 1.52f, 1.53f, 1.52f, 2.61f)
                verticalLineToRelative(3.84f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.84f)
                curveToRelative(0f, -0.36f, -0.19f, -0.69f, -0.51f, -0.87f)
                lineToRelative(-3.98f, -2.26f)
                curveToRelative(-1.15f, -0.65f, -1.74f, -2.01f, -1.44f, -3.29f)
                lineToRelative(1.03f, -4.38f)
                curveToRelative(-0.21f, 0.08f, -0.41f, 0.16f, -0.61f, 0.26f)
                lineToRelative(-2.1f, 1.05f)
                curveToRelative(-0.26f, 0.13f, -0.45f, 0.36f, -0.52f, 0.64f)
                lineToRelative(-0.78f, 2.95f)
                curveToRelative(-0.14f, 0.53f, -0.69f, 0.85f, -1.22f, 0.71f)
                curveToRelative(-0.53f, -0.14f, -0.85f, -0.69f, -0.71f, -1.22f)
                lineToRelative(0.78f, -2.95f)
                curveToRelative(0.22f, -0.83f, 0.79f, -1.53f, 1.56f, -1.91f)
                lineToRelative(2.1f, -1.05f)
                curveToRelative(1.09f, -0.54f, 2.3f, -0.83f, 3.52f, -0.83f)
                horizontalLineToRelative(0.88f)
                curveToRelative(2.01f, 0f, 3.27f, 1.83f, 3.33f, 1.91f)
                lineToRelative(1.48f, 2.35f)
                curveToRelative(0.19f, 0.31f, 0.47f, 0.56f, 0.8f, 0.72f)
                lineToRelative(2.84f, 1.42f)
                curveToRelative(0.49f, 0.25f, 0.69f, 0.85f, 0.45f, 1.34f)
                close()
                moveTo(11.46f, 14.84f)
                lineToRelative(1.67f, -6.37f)
                curveToRelative(-0.29f, -0.24f, -0.69f, -0.47f, -1.12f, -0.47f)
                horizontalLineToRelative(-0.76f)
                lineToRelative(-1.22f, 5.2f)
                curveToRelative(-0.1f, 0.43f, 0.1f, 0.88f, 0.48f, 1.1f)
                lineToRelative(0.95f, 0.54f)
                close()
                moveTo(9.19f, 17.87f)
                curveToRelative(-0.01f, -0.01f, -0.02f, -0.01f, -0.02f, -0.01f)
                curveToRelative(-0.57f, -0.34f, -1.3f, -0.03f, -1.45f, 0.62f)
                lineToRelative(-0.15f, 0.66f)
                lineToRelative(-1.61f, 3.45f)
                curveToRelative(-0.31f, 0.66f, 0.17f, 1.42f, 0.9f, 1.42f)
                curveToRelative(0.39f, 0f, 0.74f, -0.22f, 0.9f, -0.57f)
                lineToRelative(1.65f, -3.51f)
                lineToRelative(0.23f, -0.99f)
                curveToRelative(0.1f, -0.41f, -0.09f, -0.84f, -0.45f, -1.05f)
                close()
            }
        }.also { _Walking = it}
