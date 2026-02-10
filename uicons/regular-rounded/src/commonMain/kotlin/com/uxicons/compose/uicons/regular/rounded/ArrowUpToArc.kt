package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpToArc: ImageVector? = null

val Icons.Rr.ArrowUpToArc: ImageVector
    get() = _ArrowUpToArc ?: UXIcon(name = "ArrowUpToArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.49f, 2f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(14.53f, 8.05f)
                curveToRelative(-1.35f, -1.35f, -3.71f, -1.35f, -5.06f, -0.0f)
                lineToRelative(-5.18f, 5.13f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.02f, -0.01f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.4f, 1.41f, 0.01f)
                lineToRelative(5.18f, -5.14f)
                curveToRelative(0.03f, -0.03f, 0.08f, -0.05f, 0.12f, -0.07f)
                verticalLineToRelative(13.61f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-13.61f)
                curveToRelative(0.04f, 0.03f, 0.09f, 0.04f, 0.12f, 0.08f)
                lineToRelative(5.18f, 5.13f)
                curveToRelative(0.2f, 0.19f, 0.45f, 0.29f, 0.7f, 0.29f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.71f, -0.3f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.01f, -1.41f)
                lineToRelative(-5.17f, -5.13f)
                close()
            }
        }.also { _ArrowUpToArc = it}
