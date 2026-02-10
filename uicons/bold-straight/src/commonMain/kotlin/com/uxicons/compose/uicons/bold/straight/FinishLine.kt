package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FinishLine: ImageVector? = null

val Icons.Bs.FinishLine: ImageVector
    get() = _FinishLine ?: UXIcon(name = "FinishLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(7.39f, 17.03f)
                lineTo(6.99f, 18f)
                horizontalLineToRelative(-3.99f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                lineToRelative(0.89f, -2.16f)
                lineToRelative(-1.22f, -0.69f)
                curveToRelative(-0.5f, -0.31f, -0.92f, -0.7f, -1.28f, -1.12f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-1.0f, 0f, -1.99f, -0.04f, -2.95f, -0.09f)
                curveToRelative(0.19f, 0.18f, 0.39f, 0.35f, 0.62f, 0.5f)
                lineToRelative(4.33f, 2.47f)
                verticalLineToRelative(5.13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.87f)
                lineToRelative(-2.14f, -1.22f)
                curveToRelative(-0.92f, 0.06f, -1.88f, 0.09f, -2.86f, 0.09f)
                close()
                moveTo(14.09f, 10.95f)
                lineTo(14.9f, 9f)
                horizontalLineToRelative(5.71f)
                lineToRelative(1.82f, -6.07f)
                lineToRelative(-2.87f, -0.86f)
                lineToRelative(-1.18f, 3.93f)
                horizontalLineToRelative(-11.27f)
                lineToRelative(-1.18f, -3.93f)
                lineToRelative(-2.87f, 0.86f)
                lineToRelative(1.82f, 6.07f)
                horizontalLineToRelative(4.62f)
                lineToRelative(-0.77f, 1.87f)
                curveToRelative(-3.87f, -0.28f, -7.21f, -0.98f, -8.73f, -1.33f)
                verticalLineToRelative(3.08f)
                curveToRelative(2.39f, 0.53f, 7.02f, 1.38f, 12f, 1.38f)
                curveToRelative(5.32f, 0f, 9.94f, -0.98f, 12f, -1.49f)
                verticalLineToRelative(-3.1f)
                curveToRelative(-1.06f, 0.29f, -5.05f, 1.29f, -9.91f, 1.54f)
                close()
            }
        }.also { _FinishLine = it}
