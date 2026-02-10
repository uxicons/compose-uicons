package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Journal: ImageVector? = null

val Icons.Br.Journal: ImageVector
    get() = _Journal ?: UXIcon(name = "Journal") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.5f, 0f)
            horizontalLineToRelative(-5f)
            curveToRelative(-2.13f, 0f, -3.99f, 1.22f, -4.9f, 3f)
            horizontalLineToRelative(-1.1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.1f)
            curveToRelative(0.91f, 1.78f, 2.77f, 3f, 4.9f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(18f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(15f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(13f, 7.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 2.11f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 1f, -0.4f, 1.96f, -1.1f, 2.67f)
            lineToRelative(-0.59f, 0.59f)
            curveToRelative(-0.17f, 0.17f, -0.45f, 0.17f, -0.61f, 0f)
            lineToRelative(-0.59f, -0.59f)
            curveToRelative(-0.71f, -0.71f, -1.1f, -1.67f, -1.1f, -2.67f)
            lineTo(20.0f, 2f)
            curveTo(20f, 0.83f, 21.01f, -0.11f, 22.21f, 0.01f)
            curveToRelative(1.04f, 0.1f, 1.79f, 1.06f, 1.79f, 2.1f)
            close()
        }
    }.also { _Journal = it }
