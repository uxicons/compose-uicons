package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SendBackward: ImageVector? = null

val Icons.Sc.SendBackward: ImageVector
    get() = _SendBackward ?: UXIcon(name = "SendBackward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 15.5f)
                curveToRelative(0f, -2.96f, 0.65f, -5.94f, 0.67f, -6.06f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.12f, -0.03f, 3.1f, -0.67f, 6.06f, -0.67f)
                reflectiveCurveToRelative(5.94f, 0.65f, 6.06f, 0.67f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.03f, 0.12f, 0.67f, 3.1f, 0.67f, 6.06f)
                reflectiveCurveToRelative(-0.65f, 5.94f, -0.67f, 6.06f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.12f, 0.03f, -3.1f, 0.67f, -6.06f, 0.67f)
                reflectiveCurveToRelative(-5.94f, -0.65f, -6.06f, -0.67f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.03f, -0.13f, -0.67f, -3.1f, -0.67f, -6.06f)
                close()
                moveTo(6f, 15.5f)
                curveToRelative(0f, -3.22f, 0.69f, -6.37f, 0.72f, -6.5f)
                curveToRelative(0.25f, -1.13f, 1.15f, -2.03f, 2.29f, -2.28f)
                curveToRelative(0.0f, -0.02f, 3.91f, -0.81f, 6.86f, -0.71f)
                curveToRelative(-0.19f, -1.95f, -0.52f, -3.48f, -0.54f, -3.57f)
                curveToRelative(-0.08f, -0.38f, -0.38f, -0.68f, -0.76f, -0.76f)
                curveToRelative(-0.12f, -0.03f, -3.1f, -0.67f, -6.06f, -0.67f)
                reflectiveCurveToRelative(-5.94f, 0.65f, -6.07f, 0.67f)
                curveToRelative(-0.38f, 0.08f, -0.68f, 0.38f, -0.76f, 0.76f)
                curveToRelative(-0.03f, 0.12f, -0.67f, 3.1f, -0.67f, 6.06f)
                reflectiveCurveToRelative(0.65f, 5.94f, 0.67f, 6.06f)
                curveToRelative(0.08f, 0.38f, 0.38f, 0.68f, 0.76f, 0.76f)
                curveToRelative(0.09f, 0.02f, 1.62f, 0.35f, 3.57f, 0.54f)
                curveToRelative(-0.0f, -0.12f, -0.01f, -0.24f, -0.01f, -0.37f)
                close()
            }
        }.also { _SendBackward = it}
