package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownFromArc: ImageVector? = null

val Icons.Rr.ArrowDownFromArc: ImageVector
    get() = _ArrowDownFromArc ?: UXIcon(name = "ArrowDownFromArc") {
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
                moveTo(18.3f, 16.4f)
                lineToRelative(-5.18f, 5.14f)
                curveToRelative(-0.03f, 0.03f, -0.08f, 0.05f, -0.12f, 0.08f)
                verticalLineToRelative(-13.61f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(13.61f)
                curveToRelative(-0.04f, -0.03f, -0.09f, -0.04f, -0.12f, -0.08f)
                lineToRelative(-5.18f, -5.13f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.01f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.01f, 1.41f)
                lineToRelative(5.17f, 5.13f)
                curveToRelative(0.68f, 0.68f, 1.57f, 1.05f, 2.53f, 1.05f)
                reflectiveCurveToRelative(1.85f, -0.37f, 2.53f, -1.04f)
                lineToRelative(5.18f, -5.13f)
                curveToRelative(0.39f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.4f, -1.41f, -0.01f)
                close()
            }
        }.also { _ArrowDownFromArc = it}
