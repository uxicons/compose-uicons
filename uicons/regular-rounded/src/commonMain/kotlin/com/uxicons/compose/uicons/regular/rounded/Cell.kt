package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cell: ImageVector? = null

val Icons.Rr.Cell: ImageVector
    get() = _Cell ?: UXIcon(name = "Cell") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.75f, 1.75f)
                lineToRelative(-2f, -1.15f)
                curveToRelative(-1.39f, -0.8f, -3.11f, -0.8f, -4.5f, 0f)
                lineToRelative(-3.25f, 1.88f)
                lineToRelative(-3.25f, -1.88f)
                curveToRelative(-1.39f, -0.8f, -3.11f, -0.8f, -4.5f, 0f)
                lineToRelative(-2f, 1.15f)
                curveToRelative(-1.39f, 0.8f, -2.25f, 2.29f, -2.25f, 3.9f)
                verticalLineToRelative(2.79f)
                curveToRelative(0f, 1.6f, 0.86f, 3.1f, 2.25f, 3.9f)
                lineToRelative(3.25f, 1.87f)
                verticalLineToRelative(4.13f)
                curveToRelative(0f, 1.6f, 0.86f, 3.1f, 2.25f, 3.9f)
                lineToRelative(2.0f, 1.15f)
                curveToRelative(0.69f, 0.4f, 1.47f, 0.6f, 2.25f, 0.6f)
                reflectiveCurveToRelative(1.56f, -0.2f, 2.25f, -0.6f)
                lineToRelative(2f, -1.15f)
                curveToRelative(1.39f, -0.8f, 2.25f, -2.29f, 2.25f, -3.9f)
                verticalLineToRelative(-4.13f)
                lineToRelative(3.25f, -1.87f)
                curveToRelative(1.39f, -0.8f, 2.25f, -2.29f, 2.25f, -3.9f)
                verticalLineToRelative(-2.79f)
                curveToRelative(0f, -1.6f, -0.86f, -3.1f, -2.25f, -3.9f)
                close()
                moveTo(2f, 8.45f)
                verticalLineToRelative(-2.79f)
                curveToRelative(0f, -0.89f, 0.48f, -1.72f, 1.25f, -2.17f)
                lineToRelative(2f, -1.15f)
                curveToRelative(0.39f, -0.22f, 0.82f, -0.33f, 1.25f, -0.33f)
                reflectiveCurveToRelative(0.86f, 0.11f, 1.25f, 0.33f)
                lineToRelative(3.25f, 1.88f)
                verticalLineToRelative(5.68f)
                lineToRelative(-4.5f, 2.6f)
                lineToRelative(-3.25f, -1.87f)
                curveToRelative(-0.77f, -0.45f, -1.25f, -1.27f, -1.25f, -2.17f)
                close()
                moveTo(15.25f, 20.51f)
                lineTo(13.25f, 21.67f)
                curveToRelative(-0.77f, 0.44f, -1.73f, 0.44f, -2.5f, 0f)
                lineToRelative(-2f, -1.15f)
                curveToRelative(-0.77f, -0.45f, -1.25f, -1.27f, -1.25f, -2.17f)
                verticalLineToRelative(-4.13f)
                lineToRelative(4.5f, -2.6f)
                lineToRelative(4.5f, 2.6f)
                verticalLineToRelative(4.13f)
                curveToRelative(0f, 0.89f, -0.48f, 1.72f, -1.25f, 2.17f)
                close()
                moveTo(22f, 8.45f)
                curveToRelative(0f, 0.89f, -0.48f, 1.72f, -1.25f, 2.17f)
                lineToRelative(-3.25f, 1.87f)
                lineToRelative(-4.5f, -2.6f)
                verticalLineToRelative(-5.68f)
                lineToRelative(3.25f, -1.88f)
                curveToRelative(0.77f, -0.44f, 1.73f, -0.44f, 2.5f, 0f)
                lineToRelative(2f, 1.15f)
                curveToRelative(0.77f, 0.45f, 1.25f, 1.27f, 1.25f, 2.17f)
                verticalLineToRelative(2.79f)
                close()
            }
        }.also { _Cell = it}
