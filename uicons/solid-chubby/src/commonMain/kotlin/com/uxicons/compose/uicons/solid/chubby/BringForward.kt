package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BringForward: ImageVector? = null

val Icons.Sc.BringForward: ImageVector
    get() = _BringForward ?: UXIcon(name = "BringForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 16f)
                curveToRelative(-2.96f, 0f, -5.94f, -0.65f, -6.06f, -0.67f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.03f, -0.13f, -0.67f, -3.1f, -0.67f, -6.06f)
                reflectiveCurveToRelative(0.65f, -5.94f, 0.67f, -6.06f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.12f, -0.03f, 3.1f, -0.67f, 6.06f, -0.67f)
                reflectiveCurveToRelative(5.94f, 0.65f, 6.06f, 0.67f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.03f, 0.12f, 0.67f, 3.1f, 0.67f, 6.06f)
                reflectiveCurveToRelative(-0.65f, 5.94f, -0.67f, 6.06f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.13f, 0.03f, -3.1f, 0.67f, -6.06f, 0.67f)
                close()
                moveTo(22.33f, 9.44f)
                curveToRelative(-0.08f, -0.38f, -0.38f, -0.68f, -0.76f, -0.76f)
                curveToRelative(-0.09f, -0.02f, -1.62f, -0.35f, -3.57f, -0.54f)
                curveToRelative(0.0f, 0.12f, 0.01f, 0.24f, 0.01f, 0.37f)
                curveToRelative(0f, 3.08f, -0.65f, 6.15f, -0.72f, 6.49f)
                curveToRelative(-0.25f, 1.14f, -1.15f, 2.04f, -2.29f, 2.29f)
                curveToRelative(-0.35f, 0.07f, -3.41f, 0.72f, -6.5f, 0.72f)
                curveToRelative(-0.12f, 0f, -0.25f, -0.0f, -0.37f, -0.01f)
                curveToRelative(0.19f, 1.94f, 0.52f, 3.48f, 0.54f, 3.57f)
                curveToRelative(0.08f, 0.38f, 0.38f, 0.68f, 0.76f, 0.76f)
                curveToRelative(0.12f, 0.03f, 3.1f, 0.67f, 6.06f, 0.67f)
                reflectiveCurveToRelative(5.94f, -0.65f, 6.06f, -0.67f)
                curveToRelative(0.38f, -0.08f, 0.68f, -0.38f, 0.76f, -0.76f)
                curveToRelative(0.03f, -0.13f, 0.67f, -3.1f, 0.67f, -6.06f)
                reflectiveCurveToRelative(-0.65f, -5.94f, -0.67f, -6.06f)
                close()
            }
        }.also { _BringForward = it}
