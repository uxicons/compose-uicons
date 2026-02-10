package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlSpoon: ImageVector? = null

val Icons.Tr.BowlSpoon: ImageVector
    get() = _BowlSpoon ?: UXIcon(name = "BowlSpoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.17f, 9f)
                curveToRelative(2.48f, 0f, 4.51f, -1.76f, 4.78f, -4f)
                horizontalLineToRelative(11.55f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-11.55f)
                curveToRelative(-0.27f, -2.24f, -2.3f, -4f, -4.78f, -4f)
                curveTo(4.65f, 0f, 0f, 1.85f, 0f, 4.5f)
                reflectiveCurveToRelative(4.65f, 4.5f, 7.17f, 4.5f)
                close()
                moveTo(7.17f, 1f)
                curveToRelative(2.11f, 0f, 3.83f, 1.57f, 3.83f, 3.5f)
                reflectiveCurveToRelative(-1.72f, 3.5f, -3.83f, 3.5f)
                curveToRelative(-2.27f, 0f, -6.17f, -1.73f, -6.17f, -3.5f)
                reflectiveCurveTo(4.9f, 1f, 7.17f, 1f)
                close()
                moveTo(23.38f, 12.47f)
                curveToRelative(-0.69f, -0.93f, -1.77f, -1.47f, -2.96f, -1.47f)
                lineTo(3.69f, 11f)
                curveToRelative(-1.19f, 0f, -2.27f, 0.54f, -2.96f, 1.47f)
                curveToRelative(-0.66f, 0.89f, -0.85f, 2.0f, -0.53f, 3.05f)
                curveToRelative(0.71f, 2.34f, 2.01f, 4.45f, 3.74f, 6.1f)
                curveToRelative(1.59f, 1.51f, 3.83f, 2.38f, 6.16f, 2.38f)
                horizontalLineToRelative(3.89f)
                curveToRelative(2.33f, 0f, 4.57f, -0.87f, 6.16f, -2.38f)
                curveToRelative(1.73f, -1.65f, 3.03f, -3.76f, 3.74f, -6.1f)
                curveToRelative(0.32f, -1.05f, 0.13f, -2.16f, -0.53f, -3.05f)
                close()
                moveTo(22.95f, 15.22f)
                curveToRelative(-0.66f, 2.15f, -1.89f, 4.16f, -3.48f, 5.67f)
                curveToRelative(-1.4f, 1.34f, -3.4f, 2.1f, -5.47f, 2.1f)
                horizontalLineToRelative(-3.89f)
                curveToRelative(-2.07f, 0f, -4.07f, -0.77f, -5.47f, -2.1f)
                curveToRelative(-1.59f, -1.51f, -2.82f, -3.53f, -3.48f, -5.67f)
                curveToRelative(-0.23f, -0.74f, -0.09f, -1.53f, 0.38f, -2.16f)
                curveToRelative(0.5f, -0.68f, 1.28f, -1.06f, 2.15f, -1.06f)
                horizontalLineToRelative(16.72f)
                curveToRelative(0.87f, 0f, 1.66f, 0.39f, 2.15f, 1.06f)
                curveToRelative(0.47f, 0.63f, 0.6f, 1.42f, 0.38f, 2.16f)
                close()
            }
        }.also { _BowlSpoon = it}
