package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoNotDisturb: ImageVector? = null

val Icons.Ts.DoNotDisturb: ImageVector
    get() = _DoNotDisturb ?: UXIcon(name = "DoNotDisturb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(23f, 18f)
                curveToRelative(0f, 1.2f, -0.44f, 2.28f, -1.15f, 3.15f)
                lineToRelative(-7f, -7f)
                curveToRelative(0.86f, -0.71f, 1.95f, -1.15f, 3.15f, -1.15f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(13f, 18f)
                curveToRelative(0f, -1.2f, 0.44f, -2.28f, 1.15f, -3.15f)
                lineToRelative(7f, 7f)
                curveToRelative(-0.86f, 0.71f, -1.95f, 1.15f, -3.15f, 1.15f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                close()
                moveTo(11.78f, 23f)
                curveToRelative(0.29f, 0.36f, 0.6f, 0.7f, 0.94f, 1f)
                lineTo(0f, 24f)
                lineTo(0f, 11.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.22f, 0f, 2f, -0.79f, 2f, -2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-2.06f, 0f, -3.78f, 1.53f, -4.0f, 3.56f)
                lineToRelative(-0.05f, 0.45f)
                lineTo(-0.02f, 7f)
                lineToRelative(0.04f, -0.54f)
                curveTo(0.3f, 2.84f, 3.36f, 0f, 7f, 0f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                verticalLineToRelative(4.08f)
                curveToRelative(-0.35f, 0.21f, -0.69f, 0.45f, -1f, 0.7f)
                lineTo(13f, 7f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                curveTo(4.06f, 1f, 1.56f, 3.16f, 1.08f, 6f)
                horizontalLineToRelative(0.99f)
                curveToRelative(0.47f, -2.31f, 2.51f, -4f, 4.93f, -4f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.77f, -1.23f, 3f, -3f, 3f)
                lineTo(2.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                lineTo(11.78f, 23f)
                close()
            }
        }.also { _DoNotDisturb = it}
