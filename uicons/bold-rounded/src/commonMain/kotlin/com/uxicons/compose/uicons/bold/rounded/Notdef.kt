package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notdef: ImageVector? = null

val Icons.Br.Notdef: ImageVector
    get() = _Notdef ?: UXIcon(name = "Notdef") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 0f)
            horizontalLineToRelative(-7f)
            curveTo(5.47f, 0f, 3f, 2.47f, 3f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(21f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(13.84f, 12f)
            lineToRelative(4.16f, -5.84f)
            verticalLineToRelative(11.68f)
            lineToRelative(-4.16f, -5.84f)
            close()
            moveTo(15.5f, 3f)
            curveToRelative(0.33f, 0f, 0.65f, 0.07f, 0.94f, 0.19f)
            lineToRelative(-4.44f, 6.23f)
            lineTo(7.56f, 3.19f)
            curveToRelative(0.29f, -0.12f, 0.61f, -0.19f, 0.94f, -0.19f)
            horizontalLineToRelative(7f)
            close()
            moveTo(6f, 17.84f)
            lineTo(6f, 6.16f)
            lineToRelative(4.16f, 5.84f)
            lineToRelative(-4.16f, 5.84f)
            close()
            moveTo(8.5f, 21f)
            curveToRelative(-0.33f, 0f, -0.65f, -0.07f, -0.94f, -0.19f)
            lineToRelative(4.44f, -6.23f)
            lineToRelative(4.44f, 6.23f)
            curveToRelative(-0.29f, 0.12f, -0.61f, 0.19f, -0.94f, 0.19f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.also { _Notdef = it }
