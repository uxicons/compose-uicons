package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Milk: ImageVector? = null

val Icons.Rr.Milk: ImageVector
    get() = _Milk ?: UXIcon(name = "Milk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.95f, 7.8f)
                lineToRelative(-1.95f, -2.5f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(7.5f, 0.0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.8f)
                lineToRelative(-1.95f, 2.5f)
                curveToRelative(-0.68f, 0.87f, -1.05f, 1.96f, -1.05f, 3.07f)
                verticalLineToRelative(8.13f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.13f)
                curveToRelative(0f, -1.11f, -0.37f, -2.2f, -1.05f, -3.07f)
                close()
                moveTo(14.26f, 7.7f)
                curveToRelative(-0.35f, 0.39f, -0.61f, 0.83f, -0.82f, 1.3f)
                lineTo(3.65f, 9f)
                lineToRelative(2.33f, -3f)
                horizontalLineToRelative(9.78f)
                lineToRelative(-1.51f, 1.7f)
                close()
                moveTo(7.5f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(6f, 4f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3f, 19f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0f, 0.01f, -0.0f, 0.01f, -0.0f, 0.02f)
                verticalLineToRelative(7.98f)
                curveToRelative(0f, 1.13f, 0.39f, 2.16f, 1.03f, 3f)
                lineTo(6f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(21f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7.98f)
                curveToRelative(0f, -0.74f, 0.27f, -1.44f, 0.76f, -1.99f)
                lineToRelative(2.46f, -2.77f)
                lineToRelative(2.15f, 2.77f)
                curveToRelative(0.41f, 0.52f, 0.63f, 1.18f, 0.63f, 1.84f)
                verticalLineToRelative(8.13f)
                close()
            }
        }.also { _Milk = it}
