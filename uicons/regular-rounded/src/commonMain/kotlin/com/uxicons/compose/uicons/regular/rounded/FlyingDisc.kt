package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlyingDisc: ImageVector? = null

val Icons.Rr.FlyingDisc: ImageVector
    get() = _FlyingDisc ?: UXIcon(name = "FlyingDisc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.95f, 2.05f)
                curveTo(20.67f, 0.76f, 18.91f, 0.08f, 16.88f, 0.02f)
                curveToRelative(-0.04f, -0.01f, -1.84f, 0.06f, -2.76f, 0.26f)
                curveToRelative(-3.06f, 0.66f, -6.17f, 2.46f, -8.78f, 5.06f)
                curveTo(-0.15f, 10.82f, -1.63f, 18.28f, 2.05f, 21.95f)
                curveToRelative(1.35f, 1.35f, 3.21f, 2.05f, 5.38f, 2.05f)
                curveToRelative(0.78f, 0f, 1.6f, -0.09f, 2.46f, -0.28f)
                curveToRelative(3.06f, -0.66f, 6.17f, -2.46f, 8.78f, -5.06f)
                curveToRelative(5.49f, -5.49f, 6.96f, -12.94f, 3.29f, -16.62f)
                close()
                moveTo(6.75f, 6.75f)
                curveToRelative(2.34f, -2.33f, 5.1f, -3.94f, 7.79f, -4.52f)
                curveToRelative(0.68f, -0.15f, 1.34f, -0.22f, 1.95f, -0.23f)
                curveToRelative(0.2f, 0.12f, 0.4f, 0.26f, 0.56f, 0.42f)
                curveToRelative(0.97f, 0.97f, 1.21f, 2.63f, 0.67f, 4.66f)
                curveToRelative(-0.59f, 2.22f, -2.04f, 4.56f, -4.05f, 6.58f)
                curveToRelative(-3.96f, 3.96f, -9.11f, 5.51f, -11.24f, 3.38f)
                curveToRelative(-0.17f, -0.17f, -0.31f, -0.37f, -0.43f, -0.58f)
                curveToRelative(0.02f, -3.0f, 1.71f, -6.67f, 4.76f, -9.72f)
                close()
                moveTo(17.25f, 17.25f)
                curveToRelative(-2.34f, 2.33f, -5.1f, 3.94f, -7.79f, 4.52f)
                curveToRelative(-2.53f, 0.55f, -4.66f, 0.11f, -6.0f, -1.24f)
                curveToRelative(-0.29f, -0.29f, -0.52f, -0.61f, -0.72f, -0.96f)
                curveToRelative(0.72f, 0.28f, 1.52f, 0.43f, 2.37f, 0.43f)
                curveToRelative(3.04f, 0f, 6.78f, -1.74f, 9.96f, -4.93f)
                curveToRelative(2.27f, -2.26f, 3.89f, -4.92f, 4.57f, -7.48f)
                curveToRelative(0.5f, -1.85f, 0.45f, -3.51f, -0.07f, -4.86f)
                curveToRelative(0.35f, 0.2f, 0.68f, 0.43f, 0.96f, 0.72f)
                curveToRelative(2.9f, 2.9f, 1.42f, 9.08f, -3.29f, 13.79f)
                close()
            }
        }.also { _FlyingDisc = it}
