package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileUser: ImageVector? = null

val Icons.Br.FileUser: ImageVector
    get() = _FileUser ?: UXIcon(name = "FileUser") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15f, 13f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
            moveTo(22f, 8.16f)
            verticalLineToRelative(10.34f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(7.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(2f, 5.5f)
            curveTo(2f, 2.47f, 4.47f, 0f, 7.5f, 0f)
            horizontalLineToRelative(6.34f)
            curveToRelative(1.47f, 0f, 2.85f, 0.57f, 3.89f, 1.61f)
            lineToRelative(2.66f, 2.66f)
            curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
            close()
            moveTo(19f, 18.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(13f, 3f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.25f, 0.91f, 2.28f, 2.11f, 2.47f)
            curveToRelative(0.47f, -2.27f, 2.48f, -3.97f, 4.89f, -3.97f)
            reflectiveCurveToRelative(4.42f, 1.7f, 4.89f, 3.97f)
            curveToRelative(1.19f, -0.19f, 2.11f, -1.22f, 2.11f, -2.47f)
            close()
        }
    }.also { _FileUser = it }
