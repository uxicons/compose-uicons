package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PolishBrush: ImageVector? = null

val Icons.Rs.PolishBrush: ImageVector
    get() = _PolishBrush ?: UXIcon(name = "PolishBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.48f, 10.43f)
                lineToRelative(1.77f, -1.77f)
                lineToRelative(2.33f, 2.33f)
                lineToRelative(2.42f, 4.11f)
                lineToRelative(3.1f, -3.1f)
                lineToRelative(-4.08f, -2.4f)
                lineToRelative(-2.36f, -2.35f)
                lineToRelative(1.77f, -1.77f)
                lineTo(6.68f, 0.73f)
                curveTo(5.71f, -0.24f, 4.12f, -0.24f, 3.15f, 0.73f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.56f, 0f, 3.54f)
                lineToRelative(4.75f, 4.75f)
                close()
                moveTo(3.15f, 3.56f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(3.33f, 3.34f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-3.34f, -3.33f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                curveToRelative(-3.03f, 0f, -6.42f, -1.24f, -9.41f, -2.33f)
                curveToRelative(-2.36f, -0.86f, -4.59f, -1.67f, -6.09f, -1.67f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(1.85f, 0f, 4.24f, 0.87f, 6.77f, 1.79f)
                curveToRelative(2.84f, 1.03f, 6.05f, 2.21f, 8.73f, 2.21f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.57f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(1.57f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
            }
        }.also { _PolishBrush = it}
