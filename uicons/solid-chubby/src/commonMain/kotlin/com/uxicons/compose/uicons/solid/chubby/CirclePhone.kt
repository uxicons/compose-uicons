package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhone: ImageVector? = null

val Icons.Sc.CirclePhone: ImageVector
    get() = _CirclePhone ?: UXIcon(name = "CirclePhone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveToRelative(-5.88f, -11f, -11f, -11f)
                close()
                moveTo(16.97f, 16.51f)
                curveToRelative(-0.15f, 0.17f, -1.33f, 1.41f, -3.16f, 1.08f)
                curveToRelative(-1.76f, -0.31f, -3.67f, -1.57f, -4.79f, -2.63f)
                curveToRelative(-1.09f, -1.12f, -2.33f, -3.01f, -2.67f, -4.75f)
                curveToRelative(-0.35f, -1.92f, 1.06f, -3.11f, 1.12f, -3.16f)
                curveToRelative(0.61f, -0.62f, 1.57f, -0.86f, 2.45f, -0.58f)
                curveToRelative(0.77f, 0.24f, 1.36f, 0.85f, 1.61f, 1.62f)
                curveToRelative(0.28f, 0.89f, 0.04f, 1.84f, -0.6f, 2.5f)
                lineToRelative(-0.1f, 0.1f)
                curveToRelative(0.17f, 0.47f, 0.61f, 1.12f, 0.98f, 1.5f)
                curveToRelative(0.37f, 0.36f, 1.03f, 0.8f, 1.51f, 0.96f)
                lineToRelative(0.1f, -0.1f)
                curveToRelative(0.66f, -0.64f, 1.63f, -0.87f, 2.52f, -0.6f)
                curveToRelative(0.78f, 0.24f, 1.39f, 0.83f, 1.64f, 1.59f)
                curveToRelative(0.28f, 0.87f, 0.05f, 1.81f, -0.61f, 2.46f)
                close()
            }
        }.also { _CirclePhone = it}
