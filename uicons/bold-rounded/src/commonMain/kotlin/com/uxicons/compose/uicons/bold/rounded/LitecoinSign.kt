package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LitecoinSign: ImageVector? = null

val Icons.Br.LitecoinSign: ImageVector
    get() = _LitecoinSign ?: UXIcon(name = "LitecoinSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(9.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-4.87f)
            lineToRelative(-1.95f, 0.77f)
            curveToRelative(-0.18f, 0.07f, -0.37f, 0.1f, -0.55f, 0.1f)
            curveToRelative(-0.6f, 0f, -1.16f, -0.36f, -1.4f, -0.95f)
            curveToRelative(-0.3f, -0.77f, 0.08f, -1.64f, 0.85f, -1.95f)
            lineToRelative(3.05f, -1.2f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(7.73f)
            lineToRelative(7.95f, -3.12f)
            curveToRelative(0.77f, -0.3f, 1.64f, 0.08f, 1.94f, 0.85f)
            curveToRelative(0.3f, 0.77f, -0.08f, 1.64f, -0.85f, 1.95f)
            lineToRelative(-9.05f, 3.55f)
            verticalLineToRelative(6.05f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _LitecoinSign = it }
