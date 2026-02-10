package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mode: ImageVector? = null

val Icons.Br.Mode: ImageVector
    get() = _Mode ?: UXIcon(name = "Mode") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(7.59f, 0f, 4f, 3.59f, 4f, 8f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
            verticalLineToRelative(-8f)
            curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
            close()
            moveTo(17f, 16f)
            curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
            verticalLineToRelative(8f)
            close()
            moveTo(15f, 8f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
            close()
        }
    }.also { _Mode = it }
