package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromArc: ImageVector? = null

val Icons.Sr.ArrowLeftFromArc: ImageVector
    get() = _ArrowLeftFromArc ?: UXIcon(name = "ArrowLeftFromArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(2.46f, 13.12f)
                curveToRelative(-0.04f, -0.04f, -0.06f, -0.08f, -0.1f, -0.12f)
                horizontalLineToRelative(13.63f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(2.37f, 11f)
                curveToRelative(0.03f, -0.04f, 0.06f, -0.08f, 0.1f, -0.12f)
                lineToRelative(5.13f, -5.18f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.41f, 0.01f)
                lineTo(1.05f, 9.47f)
                curveToRelative(-0.68f, 0.68f, -1.05f, 1.57f, -1.05f, 2.53f)
                reflectiveCurveToRelative(0.37f, 1.85f, 1.04f, 2.53f)
                lineToRelative(5.13f, 5.18f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.3f, 0.71f, 0.3f)
                curveToRelative(0.25f, 0f, 0.51f, -0.1f, 0.7f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                lineToRelative(-5.14f, -5.18f)
                close()
            }
        }.also { _ArrowLeftFromArc = it}
