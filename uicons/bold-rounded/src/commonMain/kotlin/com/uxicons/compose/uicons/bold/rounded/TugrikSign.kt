package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TugrikSign: ImageVector? = null

val Icons.Br.TugrikSign: ImageVector
    get() = _TugrikSign ?: UXIcon(name = "TugrikSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            verticalLineTo(7.82f)
            lineToRelative(4.46f, -1.72f)
            curveToRelative(0.77f, -0.29f, 1.64f, 0.09f, 1.94f, 0.86f)
            curveToRelative(0.3f, 0.77f, -0.09f, 1.64f, -0.86f, 1.94f)
            lineToRelative(-5.54f, 2.13f)
            verticalLineToRelative(1.79f)
            lineToRelative(4.46f, -1.72f)
            curveToRelative(0.77f, -0.29f, 1.64f, 0.09f, 1.94f, 0.86f)
            curveToRelative(0.3f, 0.77f, -0.09f, 1.64f, -0.86f, 1.94f)
            lineToRelative(-5.54f, 2.13f)
            verticalLineToRelative(6.47f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.32f)
            lineToRelative(-4.46f, 1.72f)
            curveToRelative(-0.18f, 0.07f, -0.36f, 0.1f, -0.54f, 0.1f)
            curveToRelative(-0.6f, 0f, -1.17f, -0.37f, -1.4f, -0.96f)
            curveToRelative(-0.3f, -0.77f, 0.09f, -1.64f, 0.86f, -1.94f)
            lineToRelative(5.54f, -2.13f)
            verticalLineToRelative(-1.79f)
            lineToRelative(-4.46f, 1.72f)
            curveToRelative(-0.18f, 0.07f, -0.36f, 0.1f, -0.54f, 0.1f)
            curveToRelative(-0.6f, 0f, -1.17f, -0.37f, -1.4f, -0.96f)
            curveToRelative(-0.3f, -0.77f, 0.09f, -1.64f, 0.86f, -1.94f)
            lineToRelative(5.54f, -2.13f)
            verticalLineTo(3f)
            horizontalLineTo(3.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineTo(20.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _TugrikSign = it }
