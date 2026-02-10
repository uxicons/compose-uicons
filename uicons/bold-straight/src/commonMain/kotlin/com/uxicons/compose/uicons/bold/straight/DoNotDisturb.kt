package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoNotDisturb: ImageVector? = null

val Icons.Bs.DoNotDisturb: ImageVector
    get() = _DoNotDisturb ?: UXIcon(name = "DoNotDisturb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.72f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 11.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.5f, 0f, 1.5f, -0.25f, 1.5f, -1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.86f, 0f, -3.41f, 1.28f, -3.86f, 3f)
                lineTo(0.08f, 6f)
                curveTo(0.57f, 2.61f, 3.48f, 0f, 7f, 0f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                verticalLineToRelative(4.08f)
                curveToRelative(-1.25f, 0.73f, -2.3f, 1.78f, -3f, 3.05f)
                verticalLineToRelative(-3.28f)
                curveToRelative(-0.44f, 0.09f, -0.93f, 0.15f, -1.5f, 0.15f)
                lineTo(3.5f, 11f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(7.59f)
                curveToRelative(0.47f, 1.16f, 1.21f, 2.19f, 2.13f, 3f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(18f, 15f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.05f, -0.77f, 0.11f)
                lineToRelative(3.66f, 3.65f)
                curveToRelative(0.07f, -0.25f, 0.11f, -0.5f, 0.11f, -0.77f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18f, 21f)
                curveToRelative(0.27f, 0f, 0.52f, -0.05f, 0.77f, -0.11f)
                lineToRelative(-3.66f, -3.65f)
                curveToRelative(-0.07f, 0.25f, -0.11f, 0.5f, -0.11f, 0.77f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
            }
        }.also { _DoNotDisturb = it}
