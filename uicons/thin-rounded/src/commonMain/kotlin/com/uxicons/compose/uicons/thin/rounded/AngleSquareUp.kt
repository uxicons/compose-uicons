package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareUp: ImageVector? = null

val Icons.Tr.AngleSquareUp: ImageVector
    get() = _AngleSquareUp ?: UXIcon(name = "AngleSquareUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.47f, 9.34f)
                curveToRelative(-0.2f, -0.2f, -0.5f, -0.47f, -0.82f, -0.76f)
                curveToRelative(-0.94f, -0.84f, -2.37f, -0.84f, -3.31f, 0f)
                curveToRelative(-0.32f, 0.28f, -0.62f, 0.56f, -0.81f, 0.75f)
                lineToRelative(-2.88f, 2.83f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0.01f)
                lineToRelative(2.88f, -2.83f)
                curveToRelative(0.19f, -0.19f, 0.47f, -0.45f, 0.77f, -0.71f)
                curveToRelative(0.57f, -0.5f, 1.42f, -0.5f, 1.99f, 0f)
                curveToRelative(0.3f, 0.27f, 0.59f, 0.53f, 0.78f, 0.72f)
                lineToRelative(2.88f, 2.83f)
                curveToRelative(0.1f, 0.1f, 0.22f, 0.14f, 0.35f, 0.14f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.36f, -0.15f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                lineToRelative(-2.88f, -2.83f)
                close()
            }
        }.also { _AngleSquareUp = it}
