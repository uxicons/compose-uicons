package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftToArc: ImageVector? = null

val Icons.Sr.ArrowLeftToArc: ImageVector
    get() = _ArrowLeftToArc ?: UXIcon(name = "ArrowLeftToArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-13.63f)
                curveToRelative(0.03f, 0.04f, 0.06f, 0.08f, 0.1f, 0.12f)
                lineToRelative(5.14f, 5.18f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, -0.01f, 1.41f)
                curveToRelative(-0.2f, 0.19f, -0.45f, 0.29f, -0.7f, 0.29f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.1f, -0.71f, -0.3f)
                lineToRelative(-5.13f, -5.18f)
                curveToRelative(-0.67f, -0.67f, -1.04f, -1.57f, -1.04f, -2.53f)
                reflectiveCurveToRelative(0.37f, -1.85f, 1.05f, -2.53f)
                lineToRelative(5.13f, -5.17f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.41f, -0.01f)
                curveToRelative(0.39f, 0.39f, 0.4f, 1.02f, 0.01f, 1.41f)
                lineToRelative(-5.13f, 5.18f)
                curveToRelative(-0.04f, 0.04f, -0.07f, 0.08f, -0.1f, 0.12f)
                horizontalLineToRelative(13.63f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowLeftToArc = it}
