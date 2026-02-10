package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsStaggered: ImageVector? = null

val Icons.Sc.BarsStaggered: ImageVector
    get() = _BarsStaggered ?: UXIcon(name = "BarsStaggered") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.01f, 4.21f)
                curveToRelative(-0.12f, -0.82f, 0.45f, -1.58f, 1.27f, -1.7f)
                curveToRelative(0.15f, -0.02f, 3.66f, -0.52f, 8.21f, -0.52f)
                reflectiveCurveToRelative(8.06f, 0.49f, 8.21f, 0.52f)
                curveToRelative(0.82f, 0.12f, 1.39f, 0.88f, 1.27f, 1.7f)
                curveToRelative(-0.11f, 0.82f, -0.89f, 1.39f, -1.7f, 1.27f)
                curveToRelative(-0.03f, -0.01f, -3.46f, -0.48f, -7.79f, -0.48f)
                reflectiveCurveToRelative(-7.75f, 0.48f, -7.79f, 0.48f)
                curveToRelative(-0.82f, 0.11f, -1.58f, -0.45f, -1.7f, -1.27f)
                close()
                moveTo(21.71f, 10.52f)
                curveToRelative(-0.15f, -0.02f, -3.66f, -0.52f, -8.21f, -0.52f)
                reflectiveCurveToRelative(-8.06f, 0.49f, -8.21f, 0.52f)
                curveToRelative(-0.82f, 0.12f, -1.39f, 0.88f, -1.27f, 1.7f)
                curveToRelative(0.12f, 0.82f, 0.88f, 1.38f, 1.7f, 1.27f)
                curveToRelative(0.03f, -0.01f, 3.46f, -0.48f, 7.79f, -0.48f)
                reflectiveCurveToRelative(7.75f, 0.48f, 7.79f, 0.48f)
                curveToRelative(0.8f, 0.12f, 1.58f, -0.45f, 1.7f, -1.27f)
                curveToRelative(0.12f, -0.82f, -0.45f, -1.58f, -1.27f, -1.7f)
                close()
                moveTo(18.71f, 19.52f)
                curveToRelative(-0.15f, -0.02f, -3.66f, -0.52f, -8.21f, -0.52f)
                reflectiveCurveToRelative(-8.06f, 0.49f, -8.21f, 0.52f)
                curveToRelative(-0.82f, 0.12f, -1.39f, 0.88f, -1.27f, 1.7f)
                curveToRelative(0.12f, 0.82f, 0.87f, 1.38f, 1.7f, 1.27f)
                curveToRelative(0.03f, -0.01f, 3.46f, -0.48f, 7.79f, -0.48f)
                reflectiveCurveToRelative(7.75f, 0.48f, 7.79f, 0.48f)
                curveToRelative(0.8f, 0.12f, 1.58f, -0.45f, 1.7f, -1.27f)
                curveToRelative(0.12f, -0.82f, -0.45f, -1.58f, -1.27f, -1.7f)
                close()
            }
        }.also { _BarsStaggered = it}
