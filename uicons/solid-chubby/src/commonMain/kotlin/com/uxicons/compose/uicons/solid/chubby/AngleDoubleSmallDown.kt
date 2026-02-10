package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallDown: ImageVector? = null

val Icons.Sc.AngleDoubleSmallDown: ImageVector
    get() = _AngleDoubleSmallDown ?: UXIcon(name = "AngleDoubleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.01f, 11.8f)
                curveToRelative(-0.76f, -0.34f, -1.64f, 0f, -1.98f, 0.76f)
                curveToRelative(-0.5f, 1.11f, -1.4f, 1.91f, -2.02f, 2.36f)
                curveToRelative(-0.63f, -0.45f, -1.53f, -1.25f, -2.02f, -2.36f)
                curveToRelative(-0.34f, -0.76f, -1.23f, -1.1f, -1.98f, -0.76f)
                curveToRelative(-0.76f, 0.34f, -1.09f, 1.23f, -0.76f, 1.98f)
                curveToRelative(1.25f, 2.79f, 3.97f, 4.19f, 4.09f, 4.25f)
                curveToRelative(0.21f, 0.11f, 0.44f, 0.16f, 0.68f, 0.16f)
                reflectiveCurveToRelative(0.46f, -0.05f, 0.68f, -0.16f)
                curveToRelative(0.12f, -0.06f, 2.84f, -1.46f, 4.09f, -4.25f)
                curveToRelative(0.34f, -0.76f, 0f, -1.64f, -0.76f, -1.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.18f, 12.08f)
                curveToRelative(0.25f, 0.17f, 0.54f, 0.25f, 0.82f, 0.25f)
                reflectiveCurveToRelative(0.57f, -0.08f, 0.82f, -0.25f)
                curveToRelative(0.09f, -0.06f, 2.18f, -1.46f, 3.39f, -4.16f)
                curveToRelative(0.34f, -0.76f, 0f, -1.64f, -0.76f, -1.98f)
                curveToRelative(-0.76f, -0.34f, -1.64f, 0f, -1.98f, 0.76f)
                curveToRelative(-0.42f, 0.95f, -1.0f, 1.67f, -1.48f, 2.16f)
                curveToRelative(-0.47f, -0.48f, -1.05f, -1.21f, -1.47f, -2.16f)
                curveToRelative(-0.34f, -0.76f, -1.23f, -1.1f, -1.98f, -0.76f)
                curveToRelative(-0.76f, 0.34f, -1.09f, 1.23f, -0.76f, 1.98f)
                curveToRelative(1.21f, 2.71f, 3.3f, 4.1f, 3.39f, 4.16f)
                close()
            }
        }.also { _AngleDoubleSmallDown = it}
