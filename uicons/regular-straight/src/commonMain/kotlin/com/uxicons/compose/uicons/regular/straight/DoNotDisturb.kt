package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoNotDisturb: ImageVector? = null

val Icons.Rs.DoNotDisturb: ImageVector
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
                moveTo(11.09f, 22f)
                curveToRelative(0.44f, 0.75f, 0.98f, 1.43f, 1.63f, 2f)
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
                curveToRelative(-0.76f, 0.44f, -1.43f, 1.01f, -2f, 1.66f)
                verticalLineToRelative(-2.94f)
                curveToRelative(-0.41f, 0.12f, -0.91f, 0.2f, -1.5f, 0.2f)
                lineTo(3f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(11f)
                lineTo(11.09f, 22f)
                close()
            }
        }.also { _DoNotDisturb = it}
