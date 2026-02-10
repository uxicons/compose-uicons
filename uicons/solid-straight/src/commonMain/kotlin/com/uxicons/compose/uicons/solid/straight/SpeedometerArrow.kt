package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpeedometerArrow: ImageVector? = null

val Icons.Ss.SpeedometerArrow: ImageVector
    get() = _SpeedometerArrow ?: UXIcon(name = "SpeedometerArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 12.09f)
                verticalLineToRelative(-6.09f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.67f, -2.67f)
                curveToRelative(-0.71f, -0.7f, -1.85f, -0.7f, -2.56f, 0f)
                lineToRelative(-2.67f, 2.67f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.54f, -1.54f)
                verticalLineToRelative(4.27f)
                curveToRelative(-1.72f, -1.24f, -3.77f, -2.04f, -6f, -2.22f)
                lineTo(13.0f, 3f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.28f, 0.45f)
                curveToRelative(-0.7f, -0.7f, -1.85f, -0.7f, -2.56f, 0f)
                lineToRelative(-2.67f, 2.67f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.54f, -1.54f)
                verticalLineToRelative(5.05f)
                curveToRelative(-2.23f, 0.18f, -4.28f, 0.98f, -6f, 2.22f)
                verticalLineToRelative(-4.27f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.67f, -2.67f)
                curveToRelative(-0.7f, -0.7f, -1.85f, -0.7f, -2.56f, 0f)
                lineTo(0.05f, 6.12f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.54f, -1.54f)
                verticalLineToRelative(6.09f)
                curveToRelative(-1.86f, 2.12f, -3f, 4.88f, -3f, 7.91f)
                curveToRelative(0f, 1.09f, 0.16f, 2.19f, 0.46f, 3.27f)
                lineToRelative(0.21f, 0.73f)
                horizontalLineToRelative(22.66f)
                lineToRelative(0.21f, -0.73f)
                curveToRelative(0.31f, -1.08f, 0.46f, -2.19f, 0.46f, -3.27f)
                curveToRelative(0f, -3.03f, -1.14f, -5.8f, -3f, -7.91f)
                close()
                moveTo(14f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.16f, 0f, 0.32f, 0.03f, 0.47f, 0.06f)
                lineToRelative(3.79f, -3.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.77f, 3.77f)
                curveToRelative(0.05f, 0.18f, 0.09f, 0.36f, 0.09f, 0.55f)
                close()
            }
        }.also { _SpeedometerArrow = it}
