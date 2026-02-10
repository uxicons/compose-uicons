package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignPosts: ImageVector? = null

val Icons.Br.SignPosts: ImageVector
    get() = _SignPosts ?: UXIcon(name = "SignPosts") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21f, 2.61f)
            verticalLineToRelative(-1.11f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            lineTo(6f, 2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.11f)
            curveTo(1.22f, 3.52f, 0f, 5.37f, 0f, 7.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.13f, 1.22f, 3.98f, 3f, 4.89f)
            verticalLineToRelative(4.11f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4.11f)
            curveToRelative(1.78f, -0.91f, 3f, -2.76f, 3f, -4.89f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -2.13f, -1.22f, -3.98f, -3f, -4.89f)
            close()
            moveTo(21f, 13.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 16f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(6f)
            close()
        }
    }.also { _SignPosts = it }
