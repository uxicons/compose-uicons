package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Toilet: ImageVector? = null

val Icons.Rs.Toilet: ImageVector
    get() = _Toilet ?: UXIcon(name = "Toilet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6.62f)
                curveToRelative(-1.27f, 0.76f, -2f, 1.93f, -2f, 2.88f)
                curveToRelative(0f, 2.73f, 2.33f, 6.63f, 7.29f, 7.38f)
                curveToRelative(-0.53f, 2.38f, -3.29f, 1.41f, -3.29f, 4.12f)
                horizontalLineToRelative(10f)
                curveToRelative(0f, -2.71f, -2.76f, -1.75f, -3.29f, -4.12f)
                curveToRelative(4.96f, -0.74f, 7.29f, -4.65f, 7.29f, -7.38f)
                curveToRelative(0f, -0.95f, -0.73f, -2.12f, -2f, -2.88f)
                verticalLineToRelative(-4.62f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6.03f)
                lineToRelative(-10f, -0.03f)
                lineTo(7f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-2.76f, 0f, -4.62f, -1.12f, -5.72f, -2.44f)
                curveToRelative(1.65f, 0.38f, 3.72f, 0.44f, 5.72f, 0.44f)
                reflectiveCurveToRelative(4.08f, -0.06f, 5.72f, -0.44f)
                curveToRelative(-1.1f, 1.32f, -2.96f, 2.44f, -5.72f, 2.44f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-4.64f, 0f, -7.0f, -0.51f, -7f, -1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.01f, -0.28f, 0.57f, -1.13f, 1.81f, -1.5f)
                horizontalLineToRelative(10.39f)
                curveToRelative(1.23f, 0.37f, 1.8f, 1.23f, 1.81f, 1.5f)
                curveToRelative(0f, 0.99f, -2.35f, 1.5f, -7f, 1.5f)
                close()
            }
        }.also { _Toilet = it}
