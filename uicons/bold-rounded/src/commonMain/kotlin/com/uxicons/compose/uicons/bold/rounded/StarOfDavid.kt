package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarOfDavid: ImageVector? = null

val Icons.Br.StarOfDavid: ImageVector
    get() = _StarOfDavid ?: UXIcon(name = "StarOfDavid") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.98f, 12f)
            lineToRelative(2.81f, -4.73f)
            curveToRelative(0.28f, -0.46f, 0.28f, -1.04f, 0.01f, -1.51f)
            curveToRelative(-0.27f, -0.47f, -0.77f, -0.76f, -1.3f, -0.76f)
            horizontalLineToRelative(-5.68f)
            lineTo(13.29f, 0.73f)
            curveToRelative(-0.27f, -0.46f, -0.76f, -0.73f, -1.29f, -0.73f)
            reflectiveCurveToRelative(-1.02f, 0.28f, -1.29f, 0.73f)
            lineToRelative(-2.53f, 4.27f)
            lineTo(2.5f, 5f)
            curveToRelative(-0.54f, 0f, -1.04f, 0.29f, -1.3f, 0.76f)
            curveToRelative(-0.27f, 0.47f, -0.26f, 1.04f, 0.01f, 1.51f)
            lineToRelative(2.81f, 4.73f)
            lineToRelative(-2.81f, 4.73f)
            curveToRelative(-0.28f, 0.46f, -0.28f, 1.04f, -0.01f, 1.51f)
            curveToRelative(0.27f, 0.47f, 0.77f, 0.76f, 1.3f, 0.76f)
            horizontalLineToRelative(5.68f)
            lineToRelative(2.53f, 4.27f)
            curveToRelative(0.27f, 0.46f, 0.76f, 0.73f, 1.29f, 0.73f)
            reflectiveCurveToRelative(1.02f, -0.28f, 1.29f, -0.73f)
            lineToRelative(2.53f, -4.27f)
            horizontalLineToRelative(5.68f)
            curveToRelative(0.54f, 0f, 1.04f, -0.29f, 1.3f, -0.76f)
            curveToRelative(0.27f, -0.47f, 0.26f, -1.04f, -0.01f, -1.51f)
            lineToRelative(-2.81f, -4.73f)
            close()
            moveTo(17.61f, 12f)
            lineToRelative(-2.97f, 5f)
            horizontalLineToRelative(-5.29f)
            lineToRelative(-2.97f, -5f)
            lineToRelative(2.97f, -5f)
            horizontalLineToRelative(5.29f)
            lineToRelative(2.97f, 5f)
            close()
        }
    }.also { _StarOfDavid = it }
