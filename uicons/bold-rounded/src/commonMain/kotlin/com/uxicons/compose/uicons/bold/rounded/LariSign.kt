package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LariSign: ImageVector? = null

val Icons.Br.LariSign: ImageVector
    get() = _LariSign ?: UXIcon(name = "LariSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.96f)
            curveToRelative(-2.13f, -2.01f, -3.46f, -4.85f, -3.46f, -8f)
            curveTo(1f, 8.35f, 3.91f, 4.36f, 8f, 2.75f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.55f)
            curveToRelative(0.33f, -0.03f, 0.66f, -0.05f, 1f, -0.05f)
            reflectiveCurveToRelative(0.67f, 0.02f, 1f, 0.05f)
            verticalLineToRelative(-0.55f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.25f)
            curveToRelative(4.09f, 1.6f, 7f, 5.59f, 7f, 10.25f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -2.95f, -1.61f, -5.54f, -4f, -6.93f)
            verticalLineToRelative(4.43f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(5.06f)
            curveToRelative(-0.33f, -0.04f, -0.66f, -0.06f, -1f, -0.06f)
            reflectiveCurveToRelative(-0.67f, 0.02f, -1f, 0.06f)
            verticalLineToRelative(5.44f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(6.07f)
            curveToRelative(-2.39f, 1.39f, -4f, 3.97f, -4f, 6.93f)
            curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _LariSign = it }
