package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleF: ImageVector? = null

val Icons.Sc.CircleF: ImageVector
    get() = _CircleF ?: UXIcon(name = "CircleF") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(14.85f, 8.17f)
                curveToRelative(-0.74f, -0.11f, -1.45f, -0.17f, -2.1f, -0.17f)
                curveToRelative(-0.97f, 0f, -1.9f, 0.12f, -2.49f, 0.22f)
                curveToRelative(-0.09f, 0.65f, -0.2f, 1.71f, -0.24f, 2.91f)
                curveToRelative(1.02f, -0.09f, 2.57f, -0.18f, 4.06f, -0.06f)
                curveToRelative(0.55f, 0.04f, 0.96f, 0.53f, 0.92f, 1.08f)
                curveToRelative(-0.04f, 0.55f, -0.51f, 0.96f, -1.08f, 0.92f)
                curveToRelative(-1.45f, -0.12f, -2.97f, -0.02f, -3.89f, 0.07f)
                curveToRelative(0.08f, 1.97f, 0.33f, 3.69f, 0.34f, 3.71f)
                curveToRelative(0.08f, 0.55f, -0.29f, 1.05f, -0.84f, 1.14f)
                curveToRelative(-0.53f, 0.08f, -1.06f, -0.29f, -1.14f, -0.84f)
                curveToRelative(-0.02f, -0.1f, -0.39f, -2.6f, -0.39f, -5.15f)
                reflectiveCurveToRelative(0.38f, -4.71f, 0.39f, -4.8f)
                curveToRelative(0.07f, -0.39f, 0.37f, -0.71f, 0.76f, -0.8f)
                curveToRelative(0.07f, -0.02f, 1.73f, -0.4f, 3.6f, -0.4f)
                curveToRelative(0.75f, 0f, 1.56f, 0.06f, 2.4f, 0.19f)
                curveToRelative(0.55f, 0.08f, 0.92f, 0.59f, 0.84f, 1.14f)
                curveToRelative(-0.08f, 0.55f, -0.59f, 0.92f, -1.14f, 0.84f)
                close()
            }
        }.also { _CircleF = it}
