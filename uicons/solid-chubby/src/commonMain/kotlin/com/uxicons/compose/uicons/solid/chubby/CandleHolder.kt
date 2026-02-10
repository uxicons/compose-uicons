package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandleHolder: ImageVector? = null

val Icons.Sc.CandleHolder: ImageVector
    get() = _CandleHolder ?: UXIcon(name = "CandleHolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.87f, 1.23f, -2.6f)
                curveToRelative(0.39f, -0.5f, 1.15f, -0.5f, 1.53f, 0f)
                curveToRelative(0.56f, 0.73f, 1.23f, 1.77f, 1.23f, 2.6f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(18.5f, 14f)
                curveToRelative(-1.25f, 0f, -2.21f, 0.26f, -2.95f, 0.78f)
                curveToRelative(-0.67f, 0.48f, -0.83f, 1.42f, -0.34f, 2.09f)
                curveToRelative(0.48f, 0.67f, 1.42f, 0.83f, 2.09f, 0.34f)
                curveToRelative(0.11f, -0.08f, 0.42f, -0.22f, 1.2f, -0.22f)
                curveToRelative(1.32f, 0f, 1.5f, 0.18f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.18f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.74f)
                curveToRelative(0.12f, -1.34f, 0.24f, -3.16f, 0.24f, -5f)
                curveToRelative(0f, -3.53f, -0.44f, -6.52f, -0.46f, -6.65f)
                curveToRelative(-0.06f, -0.4f, -0.35f, -0.72f, -0.74f, -0.82f)
                curveToRelative(-0.08f, -0.02f, -2.1f, -0.53f, -3.8f, -0.53f)
                reflectiveCurveToRelative(-3.72f, 0.51f, -3.8f, 0.53f)
                curveToRelative(-0.39f, 0.1f, -0.68f, 0.42f, -0.74f, 0.82f)
                curveToRelative(-0.02f, 0.12f, -0.46f, 3.11f, -0.46f, 6.65f)
                curveToRelative(0f, 1.84f, 0.12f, 3.66f, 0.24f, 5f)
                horizontalLineToRelative(-0.74f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(16f)
                curveToRelative(2.99f, 0f, 4.5f, -1.51f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-1.51f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _CandleHolder = it}
