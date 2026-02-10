package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlorinSign: ImageVector? = null

val Icons.Rc.FlorinSign: ImageVector
    get() = _FlorinSign ?: UXIcon(name = "FlorinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-3.56f, 0f, -4.52f, 1.2f, -4.99f, 2.37f)
                lineToRelative(-1.59f, 5.35f)
                curveToRelative(1.48f, 0.09f, 2.67f, 0.28f, 2.74f, 0.29f)
                curveToRelative(0.55f, 0.09f, 0.92f, 0.6f, 0.82f, 1.15f)
                curveToRelative(-0.09f, 0.55f, -0.6f, 0.91f, -1.15f, 0.83f)
                curveToRelative(-0.02f, -0.0f, -1.42f, -0.23f, -3.0f, -0.29f)
                lineToRelative(-1.96f, 6.59f)
                curveToRelative(-1.32f, 3.34f, -4.55f, 3.71f, -6.87f, 3.71f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(3.56f, 0f, 4.52f, -1.2f, 4.99f, -2.37f)
                lineToRelative(1.76f, -5.92f)
                curveToRelative(-1.62f, 0.1f, -2.46f, 0.28f, -2.75f, 0.29f)
                curveToRelative(-0.48f, 0f, -0.91f, -0.35f, -0.99f, -0.84f)
                curveToRelative(-0.09f, -0.55f, 0.28f, -1.06f, 0.83f, -1.15f)
                curveToRelative(0.08f, -0.01f, 1.7f, -0.27f, 3.51f, -0.33f)
                lineToRelative(1.78f, -5.97f)
                curveToRelative(1.32f, -3.34f, 4.55f, -3.71f, 6.87f, -3.71f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _FlorinSign = it}
