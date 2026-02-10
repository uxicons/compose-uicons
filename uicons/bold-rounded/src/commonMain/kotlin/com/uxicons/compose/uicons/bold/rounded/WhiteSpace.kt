package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WhiteSpace: ImageVector? = null

val Icons.Br.WhiteSpace: ImageVector
    get() = _WhiteSpace ?: UXIcon(name = "WhiteSpace") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 1.5f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(12.56f)
            curveToRelative(-0.06f, 0.14f, -0.14f, 0.27f, -0.25f, 0.38f)
            lineToRelative(-3.37f, 3.33f)
            curveToRelative(-0.51f, 0.5f, -1.37f, 0.14f, -1.37f, -0.57f)
            verticalLineToRelative(-2.19f)
            horizontalLineTo(8.0f)
            verticalLineToRelative(2.19f)
            curveToRelative(0f, 0.72f, -0.86f, 1.08f, -1.37f, 0.57f)
            lineToRelative(-3.37f, -3.33f)
            curveToRelative(-0.11f, -0.11f, -0.19f, -0.24f, -0.25f, -0.38f)
            verticalLineToRelative(9.94f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(1.5f)
            curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineTo(11.44f)
            curveToRelative(0.06f, -0.14f, 0.14f, -0.27f, 0.25f, -0.38f)
            lineToRelative(3.37f, -3.33f)
            curveToRelative(0.51f, -0.5f, 1.37f, -0.14f, 1.37f, 0.57f)
            verticalLineToRelative(2.19f)
            horizontalLineToRelative(8.0f)
            verticalLineToRelative(-2.19f)
            curveToRelative(0f, -0.72f, 0.86f, -1.08f, 1.37f, -0.57f)
            lineToRelative(3.37f, 3.33f)
            curveToRelative(0.11f, 0.11f, 0.19f, 0.24f, 0.25f, 0.38f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _WhiteSpace = it }
