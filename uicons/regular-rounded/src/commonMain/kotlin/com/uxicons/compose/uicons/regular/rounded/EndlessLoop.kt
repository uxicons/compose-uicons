package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EndlessLoop: ImageVector? = null

val Icons.Rr.EndlessLoop: ImageVector
    get() = _EndlessLoop ?: UXIcon(name = "EndlessLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.36f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(6.13f)
                curveToRelative(-0.03f, -0.04f, -0.06f, -0.08f, -0.1f, -0.12f)
                lineTo(8.4f, 1.7f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.41f, 0.01f)
                lineToRelative(5.13f, 5.18f)
                curveToRelative(0.67f, 0.67f, 1.04f, 1.57f, 1.04f, 2.53f)
                reflectiveCurveToRelative(-0.37f, 1.85f, -1.05f, 2.53f)
                lineToRelative(-5.13f, 5.17f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.3f, -0.71f, 0.3f)
                curveToRelative(-0.25f, 0f, -0.51f, -0.1f, -0.7f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                lineToRelative(5.13f, -5.18f)
                curveToRelative(0.04f, -0.04f, 0.07f, -0.08f, 0.1f, -0.12f)
                horizontalLineToRelative(-6.13f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                curveToRelative(0f, -2.23f, -1.33f, -4.22f, -3.38f, -5.08f)
                curveToRelative(-0.51f, -0.21f, -0.75f, -0.8f, -0.54f, -1.31f)
                curveToRelative(0.21f, -0.51f, 0.8f, -0.75f, 1.31f, -0.54f)
                curveToRelative(2.8f, 1.17f, 4.61f, 3.89f, 4.61f, 6.92f)
                close()
            }
        }.also { _EndlessLoop = it}
