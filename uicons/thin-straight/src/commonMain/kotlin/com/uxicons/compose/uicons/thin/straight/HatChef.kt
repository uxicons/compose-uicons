package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatChef: ImageVector? = null

val Icons.Ts.HatChef: ImageVector
    get() = _HatChef ?: UXIcon(name = "HatChef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 1f)
                curveToRelative(-1.0f, 0f, -1.95f, 0.3f, -2.79f, 0.87f)
                curveToRelative(-1.09f, -1.19f, -2.6f, -1.87f, -4.21f, -1.87f)
                reflectiveCurveToRelative(-3.12f, 0.68f, -4.21f, 1.87f)
                curveToRelative(-0.83f, -0.57f, -1.79f, -0.87f, -2.79f, -0.87f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                curveToRelative(0f, 2.39f, 1.69f, 4.41f, 4f, 4.88f)
                verticalLineToRelative(13.12f)
                lineTo(20f, 24f)
                lineTo(20f, 10.88f)
                curveToRelative(2.31f, -0.47f, 4f, -2.49f, 4f, -4.88f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(5f, 23f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(4f)
                lineTo(5f, 23f)
                close()
                moveTo(19.44f, 9.95f)
                lineToRelative(-0.44f, 0.05f)
                verticalLineToRelative(8.0f)
                lineTo(5f, 18f)
                verticalLineToRelative(-8.0f)
                lineToRelative(-0.44f, -0.05f)
                curveToRelative(-2.03f, -0.23f, -3.56f, -1.93f, -3.56f, -3.95f)
                curveTo(1f, 3.79f, 2.79f, 2f, 5f, 2f)
                curveToRelative(0.93f, 0f, 1.8f, 0.32f, 2.54f, 0.94f)
                lineToRelative(0.4f, 0.33f)
                lineToRelative(0.32f, -0.41f)
                curveToRelative(0.92f, -1.18f, 2.28f, -1.86f, 3.74f, -1.86f)
                reflectiveCurveToRelative(2.83f, 0.68f, 3.74f, 1.86f)
                lineToRelative(0.32f, 0.41f)
                lineToRelative(0.4f, -0.33f)
                curveToRelative(0.74f, -0.61f, 1.62f, -0.94f, 2.54f, -0.94f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 2.03f, -1.53f, 3.73f, -3.56f, 3.95f)
                close()
            }
        }.also { _HatChef = it}
