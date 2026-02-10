package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeafHeart: ImageVector? = null

val Icons.Sc.LeafHeart: ImageVector
    get() = _LeafHeart ?: UXIcon(name = "LeafHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.0f, 11.16f)
                curveToRelative(0f, 2.08f, -2.06f, 3.6f, -3.0f, 4.19f)
                curveToRelative(-0.93f, -0.59f, -3.0f, -2.12f, -3.0f, -4.19f)
                curveToRelative(0f, -0.64f, 0.45f, -1.16f, 1f, -1.16f)
                curveToRelative(0.5f, 0f, 1f, 0.31f, 1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.69f, 0.5f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.52f, 1f, 1.16f)
                close()
                moveTo(18.92f, 18.24f)
                curveToRelative(-2.19f, 2.46f, -4.31f, 3.75f, -6.48f, 3.75f)
                curveToRelative(-1.89f, 0f, -3.77f, -0.78f, -5.8f, -2.5f)
                lineToRelative(-3.07f, 3.07f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                reflectiveCurveToRelative(-0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(3.07f, -3.07f)
                curveToRelative(-1.73f, -2.02f, -2.56f, -3.93f, -2.5f, -5.8f)
                curveToRelative(0.06f, -2.17f, 1.29f, -4.29f, 3.75f, -6.48f)
                curveToRelative(4.54f, -4.04f, 14.88f, -4.94f, 16.49f, -3.33f)
                curveToRelative(1.6f, 1.6f, 0.71f, 11.94f, -3.33f, 16.49f)
                close()
                moveTo(17.0f, 11.16f)
                curveToRelative(0f, -1.74f, -1.35f, -3.16f, -3f, -3.16f)
                curveToRelative(-0.78f, 0f, -1.48f, 0.27f, -2f, 0.73f)
                curveToRelative(-0.52f, -0.46f, -1.22f, -0.73f, -2f, -0.73f)
                curveToRelative(-1.66f, 0f, -3f, 1.42f, -3f, 3.16f)
                curveToRelative(0f, 3.91f, 4.37f, 6.14f, 4.55f, 6.24f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                reflectiveCurveToRelative(0.31f, -0.04f, 0.45f, -0.1f)
                curveToRelative(0.19f, -0.09f, 4.55f, -2.32f, 4.55f, -6.24f)
                close()
            }
        }.also { _LeafHeart = it}
