package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonXmark: ImageVector? = null

val Icons.Sc.OctagonXmark: ImageVector
    get() = _OctagonXmark ?: UXIcon(name = "OctagonXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.47f, 7.76f)
                curveToRelative(-0.04f, -0.18f, -0.14f, -0.34f, -0.26f, -0.47f)
                lineToRelative(-5.5f, -5.5f)
                curveToRelative(-0.13f, -0.13f, -0.29f, -0.22f, -0.46f, -0.26f)
                curveToRelative(-0.09f, -0.02f, -2.14f, -0.53f, -4.24f, -0.53f)
                reflectiveCurveToRelative(-4.16f, 0.51f, -4.24f, 0.53f)
                curveToRelative(-0.18f, 0.04f, -0.34f, 0.14f, -0.46f, 0.26f)
                lineToRelative(-5.5f, 5.5f)
                curveToRelative(-0.13f, 0.13f, -0.22f, 0.29f, -0.26f, 0.47f)
                curveToRelative(-0.02f, 0.09f, -0.53f, 2.14f, -0.53f, 4.24f)
                reflectiveCurveToRelative(0.51f, 4.16f, 0.53f, 4.24f)
                curveToRelative(0.04f, 0.18f, 0.14f, 0.34f, 0.26f, 0.47f)
                lineToRelative(5.5f, 5.5f)
                curveToRelative(0.13f, 0.13f, 0.29f, 0.22f, 0.46f, 0.26f)
                curveToRelative(0.09f, 0.02f, 2.14f, 0.53f, 4.24f, 0.53f)
                reflectiveCurveToRelative(4.16f, -0.51f, 4.24f, -0.53f)
                curveToRelative(0.18f, -0.04f, 0.34f, -0.14f, 0.46f, -0.26f)
                lineToRelative(5.5f, -5.5f)
                curveToRelative(0.13f, -0.13f, 0.22f, -0.29f, 0.26f, -0.47f)
                curveToRelative(0.02f, -0.09f, 0.53f, -2.14f, 0.53f, -4.24f)
                reflectiveCurveToRelative(-0.51f, -4.16f, -0.53f, -4.24f)
                close()
                moveTo(15.71f, 14.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2.29f, 2.29f)
                close()
            }
        }.also { _OctagonXmark = it}
