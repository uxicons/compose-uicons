package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintMagnifyingGlass: ImageVector? = null

val Icons.Sr.PrintMagnifyingGlass: ImageVector
    get() = _PrintMagnifyingGlass ?: UXIcon(name = "PrintMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2.54f, -2.54f)
                curveToRelative(-0.79f, 0.52f, -1.74f, 0.83f, -2.75f, 0.83f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f)
                lineToRelative(2.54f, 2.54f)
                close()
                moveTo(19f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                close()
                moveTo(10f, 17f)
                curveToRelative(0f, -0.7f, 0.1f, -1.37f, 0.29f, -2f)
                horizontalLineToRelative(-2.29f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(0.11f, 0f, 0.22f, -0.02f, 0.33f, -0.03f)
                curveToRelative(-3.55f, -0.34f, -6.33f, -3.33f, -6.33f, -6.97f)
                close()
                moveTo(19f, 7f)
                lineTo(5f, 7f)
                curveTo(2.24f, 7f, 0f, 9.24f, 0f, 12f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.05f, 1.24f, 3.8f, 3f, 4.58f)
                verticalLineToRelative(-2.58f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(3.26f)
                curveToRelative(1.27f, -1.81f, 3.36f, -3f, 5.74f, -3f)
                curveToRelative(3.66f, 0f, 6.67f, 2.82f, 6.97f, 6.4f)
                curveToRelative(0.01f, -0.13f, 0.03f, -0.27f, 0.03f, -0.4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _PrintMagnifyingGlass = it}
