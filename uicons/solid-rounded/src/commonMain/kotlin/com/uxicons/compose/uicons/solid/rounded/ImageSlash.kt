package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImageSlash: ImageVector? = null

val Icons.Sr.ImageSlash: ImageVector
    get() = _ImageSlash ?: UXIcon(name = "ImageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-1.54f, -1.54f)
                curveToRelative(0.54f, -0.81f, 0.83f, -1.77f, 0.83f, -2.76f)
                lineTo(23f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(6f, 1f)
                curveToRelative(-0.99f, 0f, -1.94f, 0.29f, -2.76f, 0.83f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(16f, 10f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(1f, 17.59f)
                lineTo(1f, 7.5f)
                curveToRelative(0f, -0.4f, 0.24f, -0.77f, 0.62f, -0.92f)
                curveToRelative(0.38f, -0.16f, 0.8f, -0.07f, 1.09f, 0.22f)
                lineToRelative(4.54f, 4.54f)
                lineToRelative(-6.25f, 6.25f)
                close()
                moveTo(17.42f, 22.38f)
                curveToRelative(-0.15f, 0.37f, -0.52f, 0.62f, -0.92f, 0.62f)
                lineTo(6f, 23f)
                curveToRelative(-2.05f, 0f, -3.81f, -1.24f, -4.58f, -3.0f)
                lineToRelative(7.25f, -7.25f)
                lineToRelative(8.54f, 8.54f)
                curveToRelative(0.29f, 0.29f, 0.37f, 0.72f, 0.22f, 1.09f)
                close()
            }
        }.also { _ImageSlash = it}
