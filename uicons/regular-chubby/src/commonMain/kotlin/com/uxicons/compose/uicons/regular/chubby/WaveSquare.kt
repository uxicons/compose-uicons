package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveSquare: ImageVector? = null

val Icons.Rc.WaveSquare: ImageVector
    get() = _WaveSquare ?: UXIcon(name = "WaveSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 22f)
                curveToRelative(-1.74f, 0f, -3.78f, -0.66f, -3.87f, -0.69f)
                curveToRelative(-0.37f, -0.12f, -0.64f, -0.45f, -0.68f, -0.84f)
                curveToRelative(-0.02f, -0.16f, -0.45f, -3.97f, -0.45f, -8.47f)
                curveToRelative(0f, -3.32f, -0.25f, -6.31f, -0.37f, -7.58f)
                curveToRelative(-0.66f, -0.17f, -1.72f, -0.41f, -2.63f, -0.41f)
                reflectiveCurveToRelative(-1.98f, 0.24f, -2.64f, 0.42f)
                curveToRelative(-0.12f, 1.17f, -0.36f, 3.84f, -0.36f, 7.08f)
                curveToRelative(0f, 0.38f, -0.21f, 0.72f, -0.55f, 0.9f)
                curveToRelative(-0.12f, 0.06f, -1.25f, 0.6f, -2.45f, 0.6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(0.34f, 0f, 0.7f, -0.09f, 1.0f, -0.18f)
                curveToRelative(0.04f, -4.17f, 0.43f, -7.18f, 0.45f, -7.31f)
                curveToRelative(0.05f, -0.38f, 0.31f, -0.7f, 0.68f, -0.82f)
                curveToRelative(0.09f, -0.03f, 2.13f, -0.69f, 3.87f, -0.69f)
                reflectiveCurveToRelative(3.78f, 0.66f, 3.87f, 0.69f)
                curveToRelative(0.37f, 0.12f, 0.64f, 0.45f, 0.68f, 0.84f)
                curveToRelative(0.02f, 0.16f, 0.45f, 3.97f, 0.45f, 8.47f)
                curveToRelative(0f, 3.32f, 0.25f, 6.31f, 0.37f, 7.58f)
                curveToRelative(0.66f, 0.17f, 1.72f, 0.41f, 2.63f, 0.41f)
                reflectiveCurveToRelative(1.98f, -0.24f, 2.64f, -0.42f)
                curveToRelative(0.12f, -1.17f, 0.36f, -3.84f, 0.36f, -7.08f)
                curveToRelative(0f, -0.38f, 0.21f, -0.72f, 0.55f, -0.9f)
                curveToRelative(0.12f, -0.06f, 1.25f, -0.6f, 2.45f, -0.6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-0.34f, 0f, -0.7f, 0.09f, -1.0f, 0.18f)
                curveToRelative(-0.04f, 4.17f, -0.43f, 7.18f, -0.45f, 7.31f)
                curveToRelative(-0.05f, 0.38f, -0.31f, 0.7f, -0.68f, 0.82f)
                curveToRelative(-0.09f, 0.03f, -2.13f, 0.69f, -3.87f, 0.69f)
                close()
            }
        }.also { _WaveSquare = it}
