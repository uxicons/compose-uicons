package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphCurve: ImageVector? = null

val Icons.Br.GraphCurve: ImageVector
    get() = _GraphCurve ?: UXIcon(name = "GraphCurve") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(5.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineTo(1.5f)
            curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(12.09f)
            curveToRelative(2.87f, -5.06f, 8.53f, -8.59f, 14.88f, -8.59f)
            horizontalLineToRelative(1.12f)
            verticalLineToRelative(-1.56f)
            curveToRelative(0f, -0.86f, 1.04f, -1.29f, 1.65f, -0.69f)
            lineToRelative(3.06f, 3.06f)
            curveToRelative(0.38f, 0.38f, 0.38f, 0.99f, 0f, 1.37f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.61f, 0.61f, -1.65f, 0.18f, -1.65f, -0.69f)
            verticalLineToRelative(-1.56f)
            horizontalLineToRelative(-1.12f)
            curveToRelative(-7.22f, 0f, -13.55f, 5.79f, -13.85f, 12.51f)
            curveToRelative(0.41f, 0.3f, 0.92f, 0.49f, 1.47f, 0.49f)
            horizontalLineToRelative(17f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _GraphCurve = it }
