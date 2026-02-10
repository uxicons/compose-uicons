package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Display: ImageVector? = null

val Icons.Tr.Display: ImageVector
    get() = _Display ?: UXIcon(name = "Display") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 1f)
                lineTo(4.5f, 1f)
                curveTo(2.02f, 1f, 0f, 3.02f, 0f, 5.5f)
                lineTo(0f, 14.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                lineTo(6.5f, 22f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 14.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 18f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(23f, 14.5f)
                close()
                moveTo(20f, 6.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.79f)
                lineToRelative(-5.36f, 5.36f)
                curveToRelative(-0.71f, 0.71f, -1.88f, 0.71f, -2.59f, 0f)
                lineToRelative(-1.78f, -1.78f)
                curveToRelative(-0.37f, -0.37f, -0.97f, -0.37f, -1.33f, 0f)
                lineToRelative(-3.08f, 3.08f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.08f, -3.08f)
                curveToRelative(0.76f, -0.76f, 1.99f, -0.76f, 2.75f, 0f)
                lineToRelative(1.78f, 1.78f)
                curveToRelative(0.31f, 0.31f, 0.86f, 0.31f, 1.18f, 0f)
                lineToRelative(5.36f, -5.36f)
                horizontalLineToRelative(-3.79f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Display = it}
