package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tilde: ImageVector? = null

val Icons.Br.Tilde: ImageVector
    get() = _Tilde ?: UXIcon(name = "Tilde") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.18f, 20f)
            curveToRelative(-2.88f, 0f, -5.31f, -1.96f, -6.67f, -5.37f)
            lineToRelative(-1.74f, -4.19f)
            curveToRelative(-0.52f, -1.3f, -1.71f, -3.45f, -3.92f, -3.45f)
            curveToRelative(-1.62f, 0f, -2.85f, 1.29f, -2.85f, 3f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -3.36f, 2.57f, -6f, 5.85f, -6f)
            curveToRelative(2.91f, 0f, 5.35f, 1.94f, 6.7f, 5.31f)
            lineToRelative(1.74f, 4.19f)
            curveToRelative(0.53f, 1.32f, 1.72f, 3.5f, 3.9f, 3.5f)
            curveToRelative(1.61f, 0f, 2.82f, -1.29f, 2.82f, -3f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.36f, -2.56f, 6f, -5.82f, 6f)
            close()
        }
    }.also { _Tilde = it }
