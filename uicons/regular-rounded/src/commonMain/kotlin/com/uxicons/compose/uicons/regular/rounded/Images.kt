package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Images: ImageVector? = null

val Icons.Rr.Images: ImageVector
    get() = _Images ?: UXIcon(name = "Images") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(10f, 16f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(5f, 5f)
                curveTo(5f, 2.24f, 7.24f, 0f, 10f, 0f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(7f, 11f)
                curveToRelative(0f, 0.77f, 0.29f, 1.47f, 0.77f, 2.01f)
                lineToRelative(5.24f, -5.24f)
                curveToRelative(0.98f, -0.98f, 2.69f, -0.98f, 3.67f, 0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.23f, 0.23f, 0.62f, 0.23f, 0.85f, 0f)
                lineToRelative(3.43f, -3.43f)
                verticalLineToRelative(-0.38f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(10f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                close()
                moveTo(22f, 11f)
                verticalLineToRelative(-2.79f)
                lineToRelative(-2.02f, 2.02f)
                curveToRelative(-0.98f, 0.98f, -2.69f, 0.98f, -3.67f, 0f)
                lineToRelative(-1.04f, -1.04f)
                curveToRelative(-0.23f, -0.23f, -0.61f, -0.23f, -0.85f, 0f)
                lineToRelative(-4.79f, 4.79f)
                curveToRelative(0.12f, 0.02f, 0.24f, 0.02f, 0.37f, 0.02f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
                moveTo(18.09f, 18.04f)
                curveToRelative(-0.53f, -0.15f, -1.08f, 0.17f, -1.23f, 0.7f)
                lineToRelative(-0.29f, 1.06f)
                curveToRelative(-0.21f, 0.77f, -0.71f, 1.42f, -1.41f, 1.81f)
                curveToRelative(-0.7f, 0.4f, -1.51f, 0.5f, -2.28f, 0.29f)
                lineToRelative(-8.68f, -2.38f)
                curveToRelative(-1.6f, -0.44f, -2.54f, -2.09f, -2.1f, -3.69f)
                lineToRelative(0.96f, -3.56f)
                curveToRelative(0.14f, -0.53f, -0.17f, -1.08f, -0.7f, -1.23f)
                curveToRelative(-0.53f, -0.14f, -1.08f, 0.17f, -1.23f, 0.7f)
                lineTo(0.18f, 15.29f)
                curveToRelative(-0.73f, 2.66f, 0.84f, 5.42f, 3.5f, 6.15f)
                lineToRelative(8.68f, 2.38f)
                curveToRelative(0.44f, 0.12f, 0.89f, 0.18f, 1.33f, 0.18f)
                curveToRelative(0.86f, 0f, 1.7f, -0.22f, 2.47f, -0.66f)
                curveToRelative(1.16f, -0.66f, 1.99f, -1.73f, 2.35f, -3.02f)
                lineToRelative(0.29f, -1.06f)
                curveToRelative(0.15f, -0.53f, -0.17f, -1.08f, -0.7f, -1.23f)
                close()
            }
        }.also { _Images = it}
