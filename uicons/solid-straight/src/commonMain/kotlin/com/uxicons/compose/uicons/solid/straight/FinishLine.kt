package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FinishLine: ImageVector? = null

val Icons.Ss.FinishLine: ImageVector
    get() = _FinishLine ?: UXIcon(name = "FinishLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(7.83f, 20f)
                horizontalLineToRelative(-4.83f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.17f)
                lineToRelative(1.14f, -2.8f)
                lineToRelative(-1.73f, -1.04f)
                close()
                moveTo(22.86f, 11.1f)
                curveToRelative(-1.49f, 0.21f, -6.68f, 0.9f, -10.86f, 0.9f)
                curveToRelative(-5.15f, -0.06f, -9.33f, -0.7f, -12f, -1.06f)
                verticalLineToRelative(4.08f)
                curveToRelative(2.62f, 0.36f, 5.5f, 0.68f, 8.66f, 0.86f)
                lineToRelative(5.34f, 3.19f)
                verticalLineToRelative(4.92f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.08f)
                lineToRelative(-3.17f, -1.93f)
                curveToRelative(3.79f, -0.08f, 7.89f, -0.51f, 11.16f, -0.96f)
                verticalLineToRelative(-4.08f)
                lineToRelative(-1.14f, 0.16f)
                close()
                moveTo(9.5f, 8f)
                lineTo(8.73f, 9.87f)
                curveToRelative(1.2f, 0.08f, 2.13f, 0.14f, 3.27f, 0.14f)
                curveToRelative(0.81f, 0f, 1.67f, -0.03f, 2.52f, -0.07f)
                lineToRelative(0.81f, -1.93f)
                horizontalLineToRelative(4.91f)
                lineToRelative(1.71f, -5.71f)
                lineToRelative(-1.92f, -0.57f)
                lineToRelative(-1.29f, 4.29f)
                horizontalLineToRelative(-12.01f)
                lineToRelative(-1.29f, -4.29f)
                lineToRelative(-1.92f, 0.57f)
                lineToRelative(1.71f, 5.71f)
                close()
            }
        }.also { _FinishLine = it}
