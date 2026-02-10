package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartUpsideDown: ImageVector? = null

val Icons.Tr.HeartUpsideDown: ImageVector
    get() = _HeartUpsideDown ?: UXIcon(name = "HeartUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.84f, 2.52f)
                curveToRelative(-1.65f, -1.36f, -4.04f, -1.36f, -5.69f, 0f)
                curveTo(4.81f, 6.11f, 0.09f, 12.06f, 0f, 16.62f)
                curveToRelative(-0.04f, 2.07f, 1.13f, 4.13f, 3.05f, 5.38f)
                curveToRelative(1.88f, 1.22f, 3.94f, 1.34f, 5.79f, 0.33f)
                curveToRelative(1.43f, -0.78f, 2.55f, -2.13f, 3.16f, -3.7f)
                curveToRelative(0.61f, 1.57f, 1.73f, 2.92f, 3.16f, 3.7f)
                curveToRelative(0.83f, 0.45f, 1.71f, 0.68f, 2.59f, 0.68f)
                curveToRelative(1.08f, 0f, 2.17f, -0.34f, 3.2f, -1.01f)
                curveToRelative(1.92f, -1.25f, 3.09f, -3.31f, 3.05f, -5.38f)
                curveToRelative(-0.09f, -4.56f, -4.81f, -10.5f, -9.16f, -14.1f)
                close()
                moveTo(20.41f, 21.15f)
                curveToRelative(-1.56f, 1.01f, -3.25f, 1.12f, -4.77f, 0.29f)
                curveToRelative(-1.85f, -1.0f, -3.14f, -3.24f, -3.14f, -5.45f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 2.2f, -1.29f, 4.44f, -3.14f, 5.45f)
                curveToRelative(-1.52f, 0.82f, -3.21f, 0.72f, -4.77f, -0.29f)
                curveToRelative(-1.63f, -1.06f, -2.63f, -2.79f, -2.6f, -4.52f)
                curveToRelative(0.08f, -4.24f, 4.61f, -9.89f, 8.79f, -13.35f)
                curveToRelative(1.28f, -1.06f, 3.13f, -1.06f, 4.41f, 0f)
                curveToRelative(4.18f, 3.45f, 8.71f, 9.1f, 8.79f, 13.34f)
                curveToRelative(0.03f, 1.73f, -0.96f, 3.46f, -2.6f, 4.52f)
                close()
            }
        }.also { _HeartUpsideDown = it}
