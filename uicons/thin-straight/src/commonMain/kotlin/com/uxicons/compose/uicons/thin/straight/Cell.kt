package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cell: ImageVector? = null

val Icons.Ts.Cell: ImageVector
    get() = _Cell ?: UXIcon(name = "Cell") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 2.72f)
                lineToRelative(-4.25f, -2.45f)
                curveToRelative(-0.61f, -0.35f, -1.38f, -0.35f, -2.0f, 0f)
                lineToRelative(-4.75f, 2.74f)
                lineToRelative(-4.75f, -2.74f)
                curveToRelative(-0.61f, -0.35f, -1.38f, -0.35f, -2.0f, 0f)
                lineToRelative(-4.25f, 2.45f)
                curveToRelative(-0.62f, 0.35f, -1.0f, 1.02f, -1.0f, 1.73f)
                verticalLineToRelative(5.09f)
                curveToRelative(0f, 0.71f, 0.38f, 1.38f, 1.0f, 1.73f)
                lineToRelative(4.75f, 2.74f)
                verticalLineToRelative(5.55f)
                curveToRelative(0f, 0.71f, 0.38f, 1.38f, 1.0f, 1.73f)
                lineToRelative(4.25f, 2.45f)
                curveToRelative(0.31f, 0.18f, 0.65f, 0.27f, 1.0f, 0.27f)
                reflectiveCurveToRelative(0.69f, -0.09f, 1.0f, -0.27f)
                lineToRelative(4.25f, -2.45f)
                curveToRelative(0.62f, -0.36f, 1.0f, -1.02f, 1.0f, -1.73f)
                verticalLineToRelative(-5.55f)
                lineToRelative(4.75f, -2.74f)
                curveToRelative(0.62f, -0.35f, 1.0f, -1.02f, 1.0f, -1.73f)
                verticalLineToRelative(-5.09f)
                curveToRelative(0f, -0.71f, -0.38f, -1.38f, -1.0f, -1.73f)
                close()
                moveTo(1f, 9.54f)
                verticalLineToRelative(-5.09f)
                curveToRelative(0f, -0.36f, 0.19f, -0.69f, 0.5f, -0.87f)
                lineToRelative(4.25f, -2.45f)
                curveToRelative(0.15f, -0.09f, 0.33f, -0.13f, 0.5f, -0.13f)
                reflectiveCurveToRelative(0.35f, 0.04f, 0.5f, 0.13f)
                lineToRelative(4.75f, 2.74f)
                verticalLineToRelative(6.24f)
                lineToRelative(-5.25f, 3.02f)
                lineToRelative(-4.75f, -2.74f)
                curveToRelative(-0.31f, -0.18f, -0.5f, -0.51f, -0.5f, -0.87f)
                close()
                moveTo(17.25f, 19.55f)
                curveToRelative(0f, 0.36f, -0.19f, 0.69f, -0.5f, 0.87f)
                lineToRelative(-4.25f, 2.45f)
                curveToRelative(-0.31f, 0.18f, -0.69f, 0.18f, -1.0f, 0f)
                lineToRelative(-4.25f, -2.45f)
                curveToRelative(-0.31f, -0.18f, -0.5f, -0.51f, -0.5f, -0.87f)
                verticalLineToRelative(-5.55f)
                lineToRelative(5.25f, -3.02f)
                lineToRelative(5.25f, 3.02f)
                close()
                moveTo(23f, 9.54f)
                curveToRelative(0f, 0.36f, -0.19f, 0.69f, -0.5f, 0.87f)
                lineToRelative(-4.75f, 2.74f)
                lineToRelative(-5.25f, -3.02f)
                verticalLineToRelative(-6.24f)
                lineToRelative(4.75f, -2.74f)
                curveToRelative(0.31f, -0.18f, 0.69f, -0.18f, 1.0f, 0f)
                lineToRelative(4.25f, 2.45f)
                curveToRelative(0.31f, 0.18f, 0.5f, 0.51f, 0.5f, 0.87f)
                verticalLineToRelative(5.09f)
                close()
            }
        }.also { _Cell = it}
