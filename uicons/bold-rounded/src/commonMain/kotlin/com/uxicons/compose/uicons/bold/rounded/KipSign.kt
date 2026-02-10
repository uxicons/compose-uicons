package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KipSign: ImageVector? = null

val Icons.Br.KipSign: ImageVector
    get() = _KipSign ?: UXIcon(name = "KipSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 13f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(10.45f)
            lineToRelative(8.95f, 6.81f)
            curveToRelative(0.66f, 0.5f, 0.79f, 1.44f, 0.29f, 2.1f)
            curveToRelative(-0.29f, 0.39f, -0.74f, 0.59f, -1.2f, 0.59f)
            curveToRelative(-0.32f, 0f, -0.64f, -0.1f, -0.91f, -0.31f)
            lineTo(7f, 15.64f)
            verticalLineToRelative(6.86f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(14.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineTo(10.04f)
            lineTo(17.48f, 0.4f)
            curveToRelative(0.61f, -0.56f, 1.56f, -0.52f, 2.12f, 0.09f)
            curveToRelative(0.56f, 0.61f, 0.52f, 1.56f, -0.09f, 2.12f)
            lineTo(9.85f, 11.5f)
            horizontalLineToRelative(10.65f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _KipSign = it }
