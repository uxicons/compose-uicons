package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cell: ImageVector? = null

val Icons.Tr.Cell: ImageVector
    get() = _Cell ?: UXIcon(name = "Cell") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.0f, 1.83f)
                lineToRelative(-2.25f, -1.3f)
                curveToRelative(-1.23f, -0.71f, -2.76f, -0.71f, -3.99f, 0f)
                lineToRelative(-3.75f, 2.16f)
                lineToRelative(-3.75f, -2.16f)
                curveToRelative(-1.23f, -0.71f, -2.76f, -0.71f, -3.99f, 0f)
                lineToRelative(-2.25f, 1.3f)
                curveToRelative(-1.24f, 0.71f, -2.0f, 2.04f, -2.0f, 3.46f)
                verticalLineToRelative(3.21f)
                curveToRelative(0f, 1.43f, 0.77f, 2.75f, 2.0f, 3.47f)
                lineToRelative(3.75f, 2.16f)
                verticalLineToRelative(4.57f)
                curveToRelative(0f, 1.43f, 0.77f, 2.75f, 2.0f, 3.47f)
                lineToRelative(2.25f, 1.29f)
                curveToRelative(0.62f, 0.36f, 1.31f, 0.53f, 2.0f, 0.53f)
                reflectiveCurveToRelative(1.38f, -0.18f, 2.0f, -0.53f)
                lineToRelative(2.25f, -1.3f)
                curveToRelative(1.24f, -0.71f, 2.0f, -2.04f, 2.0f, -3.47f)
                verticalLineToRelative(-4.57f)
                lineToRelative(3.75f, -2.16f)
                curveToRelative(1.24f, -0.71f, 2.0f, -2.04f, 2.0f, -3.47f)
                verticalLineToRelative(-3.21f)
                curveToRelative(0f, -1.43f, -0.77f, -2.75f, -2.0f, -3.46f)
                close()
                moveTo(1f, 8.51f)
                verticalLineToRelative(-3.21f)
                curveToRelative(0f, -1.07f, 0.57f, -2.06f, 1.5f, -2.6f)
                lineToRelative(2.25f, -1.3f)
                curveToRelative(0.46f, -0.27f, 0.98f, -0.4f, 1.5f, -0.4f)
                reflectiveCurveToRelative(1.03f, 0.13f, 1.5f, 0.4f)
                lineToRelative(3.75f, 2.16f)
                verticalLineToRelative(6.68f)
                lineToRelative(-5.25f, 3.02f)
                lineToRelative(-3.75f, -2.16f)
                curveToRelative(-0.93f, -0.53f, -1.5f, -1.53f, -1.5f, -2.6f)
                close()
                moveTo(15.75f, 21.3f)
                lineTo(13.5f, 22.6f)
                curveToRelative(-0.92f, 0.53f, -2.07f, 0.53f, -2.99f, 0f)
                lineToRelative(-2.25f, -1.3f)
                curveToRelative(-0.93f, -0.53f, -1.5f, -1.53f, -1.5f, -2.6f)
                verticalLineToRelative(-4.57f)
                lineToRelative(5.25f, -3.02f)
                lineToRelative(5.25f, 3.02f)
                verticalLineToRelative(4.57f)
                curveToRelative(0f, 1.07f, -0.58f, 2.07f, -1.5f, 2.6f)
                close()
                moveTo(23f, 8.51f)
                curveToRelative(0f, 1.07f, -0.58f, 2.06f, -1.5f, 2.6f)
                lineToRelative(-3.75f, 2.16f)
                lineToRelative(-5.25f, -3.02f)
                verticalLineToRelative(-6.68f)
                lineToRelative(3.75f, -2.16f)
                curveToRelative(0.92f, -0.53f, 2.07f, -0.53f, 2.99f, 0f)
                lineToRelative(2.25f, 1.3f)
                curveToRelative(0.93f, 0.53f, 1.5f, 1.53f, 1.5f, 2.6f)
                verticalLineToRelative(3.21f)
                close()
            }
        }.also { _Cell = it}
