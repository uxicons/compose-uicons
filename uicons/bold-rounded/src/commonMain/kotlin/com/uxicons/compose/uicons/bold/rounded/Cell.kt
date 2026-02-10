package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cell: ImageVector? = null

val Icons.Br.Cell: ImageVector
    get() = _Cell ?: UXIcon(name = "Cell") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.75f, 1.9f)
            lineToRelative(-2.25f, -1.3f)
            curveToRelative(-1.39f, -0.8f, -3.11f, -0.8f, -4.5f, 0f)
            lineToRelative(-3f, 1.73f)
            lineToRelative(-3f, -1.73f)
            curveToRelative(-1.39f, -0.8f, -3.11f, -0.8f, -4.5f, 0f)
            lineToRelative(-2.25f, 1.3f)
            curveToRelative(-1.39f, 0.8f, -2.25f, 2.29f, -2.25f, 3.9f)
            verticalLineToRelative(3.01f)
            curveToRelative(0f, 1.6f, 0.86f, 3.1f, 2.25f, 3.9f)
            lineToRelative(3f, 1.73f)
            verticalLineToRelative(3.77f)
            curveToRelative(0f, 1.6f, 0.86f, 3.1f, 2.25f, 3.9f)
            lineToRelative(2.25f, 1.3f)
            curveToRelative(0.69f, 0.4f, 1.47f, 0.6f, 2.25f, 0.6f)
            reflectiveCurveToRelative(1.56f, -0.2f, 2.25f, -0.6f)
            lineToRelative(2.25f, -1.3f)
            curveToRelative(1.39f, -0.8f, 2.25f, -2.29f, 2.25f, -3.9f)
            verticalLineToRelative(-3.77f)
            lineToRelative(3f, -1.73f)
            curveToRelative(1.39f, -0.8f, 2.25f, -2.29f, 2.25f, -3.9f)
            verticalLineToRelative(-3.01f)
            curveToRelative(0f, -1.6f, -0.86f, -3.1f, -2.25f, -3.9f)
            close()
            moveTo(3f, 8.81f)
            verticalLineToRelative(-3.01f)
            curveToRelative(0f, -0.53f, 0.29f, -1.03f, 0.75f, -1.3f)
            lineToRelative(2.25f, -1.3f)
            curveToRelative(0.23f, -0.13f, 0.49f, -0.2f, 0.75f, -0.2f)
            reflectiveCurveToRelative(0.52f, 0.07f, 0.75f, 0.2f)
            lineToRelative(3f, 1.73f)
            verticalLineToRelative(4.74f)
            lineToRelative(-3.75f, 2.17f)
            lineToRelative(-3f, -1.73f)
            curveToRelative(-0.46f, -0.27f, -0.75f, -0.77f, -0.75f, -1.3f)
            close()
            moveTo(15.75f, 18.2f)
            curveToRelative(0f, 0.53f, -0.29f, 1.03f, -0.75f, 1.3f)
            lineToRelative(-2.25f, 1.3f)
            curveToRelative(-0.46f, 0.27f, -1.03f, 0.27f, -1.5f, 0f)
            lineToRelative(-2.25f, -1.3f)
            curveToRelative(-0.46f, -0.27f, -0.75f, -0.77f, -0.75f, -1.3f)
            verticalLineToRelative(-3.77f)
            lineToRelative(3.75f, -2.17f)
            lineToRelative(3.75f, 2.17f)
            close()
            moveTo(21f, 8.81f)
            curveToRelative(0f, 0.53f, -0.29f, 1.03f, -0.75f, 1.3f)
            lineToRelative(-3f, 1.73f)
            lineToRelative(-3.75f, -2.17f)
            verticalLineToRelative(-4.74f)
            lineToRelative(3f, -1.73f)
            curveToRelative(0.46f, -0.27f, 1.04f, -0.27f, 1.5f, 0f)
            lineToRelative(2.25f, 1.3f)
            curveToRelative(0.46f, 0.27f, 0.75f, 0.77f, 0.75f, 1.3f)
            close()
        }
    }.also { _Cell = it }
