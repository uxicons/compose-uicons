package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoNotDisturb: ImageVector? = null

val Icons.Sr.DoNotDisturb: ImageVector
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
                moveTo(10f, 18f)
                curveToRelative(0f, 1.94f, 0.69f, 3.72f, 1.84f, 5.11f)
                curveToRelative(-0.81f, 0.56f, -1.78f, 0.9f, -2.84f, 0.9f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.38f, 0f, 1.49f, -0.45f, 1.5f, -0.89f)
                curveToRelative(-0.04f, -2.61f, -1.92f, -4.79f, -4.39f, -5.08f)
                curveToRelative(-2.36f, -0.28f, -4.54f, 1.08f, -5.32f, 3.3f)
                curveToRelative(-0.18f, 0.52f, -0.76f, 0.79f, -1.28f, 0.61f)
                curveToRelative(-0.52f, -0.18f, -0.79f, -0.76f, -0.61f, -1.28f)
                curveTo(1.5f, 1.56f, 4.55f, -0.34f, 7.84f, 0.05f)
                curveToRelative(3.41f, 0.4f, 6.0f, 3.31f, 6.15f, 6.83f)
                curveToRelative(0.0f, 0.01f, 0.0f, 1.91f, 0.0f, 4.2f)
                curveToRelative(-2.39f, 1.38f, -4.0f, 3.96f, -4.0f, 6.92f)
                close()
            }
        }.also { _DoNotDisturb = it}
