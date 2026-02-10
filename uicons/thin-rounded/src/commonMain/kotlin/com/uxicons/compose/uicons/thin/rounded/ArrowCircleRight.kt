package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleRight: ImageVector? = null

val Icons.Tr.ArrowCircleRight: ImageVector
    get() = _ArrowCircleRight ?: UXIcon(name = "ArrowCircleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.61f, 9.53f)
                lineToRelative(-2.83f, -2.88f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                lineToRelative(2.83f, 2.88f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.47f, 0.71f, 0.77f)
                curveToRelative(0.13f, 0.15f, 0.22f, 0.32f, 0.29f, 0.49f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(10.4f)
                curveToRelative(-0.06f, 0.18f, -0.15f, 0.34f, -0.29f, 0.49f)
                curveToRelative(-0.27f, 0.3f, -0.53f, 0.59f, -0.72f, 0.78f)
                lineToRelative(-2.83f, 2.88f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.22f, 0.14f, 0.35f, 0.14f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.36f, -0.15f)
                lineToRelative(2.83f, -2.88f)
                curveToRelative(0.2f, -0.2f, 0.47f, -0.5f, 0.76f, -0.82f)
                curveToRelative(0.84f, -0.94f, 0.84f, -2.37f, 0f, -3.31f)
                curveToRelative(-0.28f, -0.32f, -0.56f, -0.62f, -0.75f, -0.81f)
                close()
            }
        }.also { _ArrowCircleRight = it}
