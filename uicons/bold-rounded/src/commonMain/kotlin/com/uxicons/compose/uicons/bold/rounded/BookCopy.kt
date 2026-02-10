package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCopy: ImageVector? = null

val Icons.Br.BookCopy: ImageVector
    get() = _BookCopy ?: UXIcon(name = "BookCopy") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 0f)
            horizontalLineToRelative(-6f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(7f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            lineTo(24f, 5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            close()
            moveTo(13f, 3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.34f, 0f, -0.68f, 0.04f, -1f, 0.13f)
            verticalLineToRelative(-6.13f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            close()
            moveTo(19f, 16f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(9f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
            moveTo(16f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(4f, 24f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineToRelative(-9.63f)
            curveToRelative(0f, -2.51f, 1.7f, -4.7f, 4.13f, -5.33f)
            curveToRelative(0.81f, -0.21f, 1.62f, 0.28f, 1.83f, 1.08f)
            curveToRelative(0.21f, 0.8f, -0.28f, 1.62f, -1.08f, 1.83f)
            curveToRelative(-1.1f, 0.28f, -1.87f, 1.28f, -1.87f, 2.42f)
            verticalLineToRelative(5.75f)
            curveToRelative(0.32f, -0.08f, 0.66f, -0.13f, 1f, -0.13f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _BookCopy = it }
