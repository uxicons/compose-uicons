package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoNotDisturb: ImageVector? = null

val Icons.Rr.DoNotDisturb: ImageVector
    get() = _DoNotDisturb ?: UXIcon(name = "DoNotDisturb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.5f, 0f, 1.5f, -0.53f, 1.5f, -1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-2.12f, 0f, -4.01f, 1.34f, -4.72f, 3.33f)
                curveToRelative(-0.18f, 0.52f, -0.76f, 0.79f, -1.28f, 0.61f)
                curveToRelative(-0.52f, -0.18f, -0.79f, -0.76f, -0.61f, -1.28f)
                curveTo(1.39f, 1.88f, 4.04f, 0f, 7f, 0f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.7f)
                curveToRelative(-0.41f, 0.12f, -0.91f, 0.2f, -1.5f, 0.2f)
                lineTo(5f, 10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(20.02f, 21.43f)
                lineToRelative(-5.45f, -5.45f)
                curveToRelative(-0.35f, 0.59f, -0.57f, 1.28f, -0.57f, 2.02f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                curveToRelative(0.74f, 0f, 1.42f, -0.22f, 2.02f, -0.57f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-0.74f, 0f, -1.42f, 0.22f, -2.02f, 0.57f)
                lineToRelative(5.45f, 5.45f)
                curveToRelative(0.35f, -0.59f, 0.57f, -1.28f, 0.57f, -2.02f)
                close()
            }
        }.also { _DoNotDisturb = it}
