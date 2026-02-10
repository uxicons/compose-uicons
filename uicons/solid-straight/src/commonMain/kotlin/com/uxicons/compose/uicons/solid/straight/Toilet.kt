package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Toilet: ImageVector? = null

val Icons.Ss.Toilet: ImageVector
    get() = _Toilet ?: UXIcon(name = "Toilet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                lineTo(5f, 9f)
                lineTo(5f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19.54f, 11f)
                lineTo(4.46f, 11f)
                curveToRelative(-0.81f, 0.64f, -1.29f, 1.44f, -1.41f, 2.17f)
                curveToRelative(0.51f, 1.63f, 5.3f, 1.83f, 8.95f, 1.83f)
                reflectiveCurveToRelative(8.44f, -0.2f, 8.95f, -1.83f)
                curveToRelative(-0.12f, -0.73f, -0.6f, -1.53f, -1.41f, -2.17f)
                close()
                moveTo(3.65f, 16.09f)
                curveToRelative(0.99f, 1.96f, 3.11f, 3.77f, 6.47f, 4.27f)
                curveToRelative(-1.12f, 2.14f, -3.12f, 1.14f, -3.12f, 3.64f)
                horizontalLineToRelative(10f)
                curveToRelative(0f, -2.5f, -2f, -1.5f, -3.12f, -3.64f)
                curveToRelative(3.36f, -0.5f, 5.48f, -2.31f, 6.47f, -4.27f)
                curveToRelative(-2.15f, 0.8f, -5.3f, 0.91f, -8.35f, 0.91f)
                reflectiveCurveToRelative(-6.2f, -0.11f, -8.35f, -0.91f)
                close()
            }
        }.also { _Toilet = it}
