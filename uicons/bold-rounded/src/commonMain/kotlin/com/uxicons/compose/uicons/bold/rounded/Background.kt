package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Background: ImageVector? = null

val Icons.Br.Background: ImageVector
    get() = _Background ?: UXIcon(name = "Background") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(18.85f, 3.03f)
            lineTo(3.03f, 18.85f)
            curveToRelative(-0.02f, -0.12f, -0.03f, -0.23f, -0.03f, -0.35f)
            verticalLineToRelative(-4.88f)
            reflectiveCurveToRelative(0.04f, -0.04f, 0.06f, -0.06f)
            curveToRelative(0f, 0f, 10.54f, -10.54f, 10.56f, -10.56f)
            horizontalLineToRelative(4.88f)
            curveToRelative(0.12f, 0f, 0.24f, 0f, 0.35f, 0.03f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(3.88f)
            lineTo(3f, 9.38f)
            verticalLineToRelative(-3.88f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(5.15f, 20.97f)
            lineTo(20.97f, 5.15f)
            curveToRelative(0.02f, 0.12f, 0.03f, 0.23f, 0.03f, 0.35f)
            verticalLineToRelative(4.88f)
            reflectiveCurveToRelative(-0.04f, 0.04f, -0.06f, 0.06f)
            curveToRelative(0f, 0f, -10.54f, 10.54f, -10.56f, 10.56f)
            lineTo(5.5f, 21f)
            curveToRelative(-0.12f, 0f, -0.24f, 0f, -0.35f, -0.03f)
            close()
            moveTo(18.5f, 21f)
            horizontalLineToRelative(-3.88f)
            lineToRelative(6.38f, -6.38f)
            verticalLineToRelative(3.88f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _Background = it }
