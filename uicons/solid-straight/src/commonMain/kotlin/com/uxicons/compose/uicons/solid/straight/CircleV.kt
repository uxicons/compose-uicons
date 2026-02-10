package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleV: ImageVector? = null

val Icons.Ss.CircleV: ImageVector
    get() = _CircleV ?: UXIcon(name = "CircleV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(14.53f, 16.84f)
                curveToRelative(-0.6f, 1.37f, -1.45f, 1.66f, -2.53f, 1.66f)
                curveToRelative(-1.08f, 0f, -1.92f, -0.29f, -2.54f, -1.7f)
                lineToRelative(-3.37f, -10.05f)
                horizontalLineToRelative(2.13f)
                lineToRelative(2.87f, 9.12f)
                curveToRelative(0.19f, 0.41f, 0.54f, 0.62f, 0.92f, 0.63f)
                curveToRelative(0.39f, -0.01f, 0.74f, -0.22f, 0.9f, -0.56f)
                lineToRelative(2.9f, -9.2f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-3.39f, 10.09f)
                close()
            }
        }.also { _CircleV = it}
