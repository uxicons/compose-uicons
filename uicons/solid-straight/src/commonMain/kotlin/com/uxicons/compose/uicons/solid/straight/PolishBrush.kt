package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PolishBrush: ImageVector? = null

val Icons.Ss.PolishBrush: ImageVector
    get() = _PolishBrush ?: UXIcon(name = "PolishBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.73f, 5.68f)
                curveToRelative(-0.97f, -0.97f, -0.97f, -2.56f, 0f, -3.54f)
                lineTo(3.15f, 0.73f)
                curveToRelative(0.97f, -0.97f, 2.56f, -0.97f, 3.54f, 0f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(-1.77f, 1.77f)
                lineToRelative(2.36f, 2.35f)
                lineToRelative(4.08f, 2.4f)
                lineToRelative(-3.1f, 3.1f)
                lineToRelative(-2.42f, -4.11f)
                lineToRelative(-2.33f, -2.33f)
                lineToRelative(-1.77f, 1.77f)
                lineTo(1.73f, 5.68f)
                close()
                moveTo(19.5f, 13f)
                horizontalLineToRelative(-1.57f)
                lineToRelative(-2f, 2f)
                horizontalLineToRelative(3.57f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-2.68f, 0f, -5.89f, -1.17f, -8.73f, -2.21f)
                curveToRelative(-2.53f, -0.92f, -4.92f, -1.79f, -6.77f, -1.79f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(1.49f, 0f, 3.73f, 0.81f, 6.09f, 1.67f)
                curveToRelative(2.99f, 1.09f, 6.38f, 2.33f, 9.41f, 2.33f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _PolishBrush = it}
