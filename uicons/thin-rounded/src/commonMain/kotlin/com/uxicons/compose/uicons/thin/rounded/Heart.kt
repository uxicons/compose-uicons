package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Tr.Heart: ImageVector
    get() = _Heart ?: UXIcon(name = "Heart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.95f, 2.01f)
                curveToRelative(-1.88f, -1.22f, -3.94f, -1.34f, -5.79f, -0.33f)
                curveToRelative(-1.43f, 0.78f, -2.55f, 2.13f, -3.16f, 3.7f)
                curveToRelative(-0.61f, -1.57f, -1.73f, -2.92f, -3.16f, -3.7f)
                curveToRelative(-1.85f, -1.01f, -3.91f, -0.89f, -5.79f, 0.33f)
                curveTo(1.13f, 3.25f, -0.04f, 5.31f, 0f, 7.38f)
                curveToRelative(0.09f, 4.56f, 4.81f, 10.5f, 9.16f, 14.1f)
                curveToRelative(0.82f, 0.68f, 1.83f, 1.02f, 2.84f, 1.02f)
                curveToRelative(1.01f, 0f, 2.02f, -0.34f, 2.84f, -1.02f)
                curveToRelative(4.35f, -3.59f, 9.07f, -9.54f, 9.16f, -14.1f)
                curveToRelative(0.04f, -2.07f, -1.13f, -4.13f, -3.05f, -5.38f)
                close()
                moveTo(14.21f, 20.71f)
                curveToRelative(-1.28f, 1.06f, -3.13f, 1.05f, -4.41f, 0f)
                curveTo(5.62f, 17.26f, 1.08f, 11.61f, 1.0f, 7.36f)
                curveToRelative(-0.03f, -1.73f, 0.96f, -3.46f, 2.59f, -4.52f)
                curveToRelative(0.86f, -0.56f, 1.77f, -0.84f, 2.66f, -0.84f)
                curveToRelative(0.72f, 0f, 1.43f, 0.18f, 2.11f, 0.55f)
                curveToRelative(1.85f, 1.0f, 3.13f, 3.24f, 3.13f, 5.45f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -2.2f, 1.29f, -4.44f, 3.13f, -5.45f)
                curveToRelative(1.52f, -0.82f, 3.21f, -0.72f, 4.77f, 0.29f)
                curveToRelative(1.63f, 1.06f, 2.63f, 2.79f, 2.59f, 4.52f)
                curveToRelative(-0.08f, 4.24f, -4.61f, 9.89f, -8.79f, 13.35f)
                close()
            }
        }.also { _Heart = it}
