package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImageSlash: ImageVector? = null

val Icons.Rr.ImageSlash: ImageVector
    get() = _ImageSlash ?: UXIcon(name = "ImageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 8f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(1.54f, 1.54f)
                curveToRelative(0.81f, -0.54f, 1.77f, -0.83f, 2.76f, -0.83f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.99f, -0.29f, 1.94f, -0.83f, 2.76f)
                lineToRelative(1.54f, 1.54f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(4.71f, 3.29f)
                lineToRelative(16f, 16f)
                curveToRelative(0.19f, -0.4f, 0.29f, -0.84f, 0.29f, -1.29f)
                lineTo(21f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(6f, 3f)
                curveToRelative(-0.45f, 0f, -0.89f, 0.1f, -1.29f, 0.29f)
                close()
                moveTo(17f, 21f)
                lineTo(6f, 21f)
                curveToRelative(-1.52f, 0f, -2.78f, -1.14f, -2.97f, -2.61f)
                lineToRelative(4.68f, -4.68f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.29f, 3.29f)
                lineTo(3f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ImageSlash = it}
