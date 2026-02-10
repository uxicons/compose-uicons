package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoNotDisturb: ImageVector? = null

val Icons.Ss.DoNotDisturb: ImageVector
    get() = _DoNotDisturb ?: UXIcon(name = "DoNotDisturb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, 0.74f, -0.21f, 1.42f, -0.57f, 2.02f)
                lineToRelative(-5.45f, -5.45f)
                curveToRelative(0.59f, -0.35f, 1.28f, -0.57f, 2.02f, -0.57f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(14f, 18f)
                curveToRelative(0f, -0.74f, 0.21f, -1.42f, 0.57f, -2.02f)
                lineToRelative(5.45f, 5.45f)
                curveToRelative(-0.59f, 0.35f, -1.28f, 0.57f, -2.02f, 0.57f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
                moveTo(12.72f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 11f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.5f, 0f, 1.5f, -0.53f, 1.5f, -1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-2.42f, 0f, -4.44f, 1.72f, -4.9f, 4f)
                lineTo(0.08f, 6f)
                curveTo(0.57f, 2.61f, 3.48f, 0f, 7f, 0f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                verticalLineToRelative(4.08f)
                curveToRelative(-2.39f, 1.38f, -4f, 3.96f, -4f, 6.92f)
                curveToRelative(0f, 2.39f, 1.06f, 4.53f, 2.72f, 6f)
                close()
            }
        }.also { _DoNotDisturb = it}
