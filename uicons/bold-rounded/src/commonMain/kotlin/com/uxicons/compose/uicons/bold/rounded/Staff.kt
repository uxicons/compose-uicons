package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Staff: ImageVector? = null

val Icons.Br.Staff: ImageVector
    get() = _Staff ?: UXIcon(name = "Staff") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 5f)
            curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-1.44f)
            curveToRelative(-1.0f, 0f, -1.85f, 0.75f, -1.98f, 1.74f)
            lineToRelative(-0.55f, 4.1f)
            curveToRelative(-0.22f, 1.67f, -1.0f, 3.25f, -2.2f, 4.45f)
            lineTo(2.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(10.28f, -10.28f)
            curveToRelative(0.73f, -0.73f, 1.21f, -1.7f, 1.34f, -2.72f)
            lineToRelative(0.55f, -4.1f)
            curveToRelative(0.33f, -2.47f, 2.46f, -4.34f, 4.96f, -4.34f)
            horizontalLineToRelative(1.44f)
            curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
            close()
        }
    }.also { _Staff = it }
