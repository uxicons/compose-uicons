package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintMagnifyingGlass: ImageVector? = null

val Icons.Rs.PrintMagnifyingGlass: ImageVector
    get() = _PrintMagnifyingGlass ?: UXIcon(name = "PrintMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(3.79f, 3.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.79f, -3.79f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                close()
                moveTo(16f, 19f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(21f, 6f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 6f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12f)
                lineTo(5f, 21f)
                verticalLineToRelative(3f)
                lineTo(13f, 24f)
                verticalLineToRelative(-2f)
                lineTo(7f, 22f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.7f, 0.1f, -1.37f, 0.29f, -2f)
                lineTo(5f, 14f)
                verticalLineToRelative(5f)
                lineTo(2f, 19f)
                lineTo(2f, 9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7f, 2f)
                horizontalLineToRelative(10f)
                lineTo(17f, 6f)
                lineTo(7f, 6f)
                lineTo(7f, 2f)
                close()
            }
        }.also { _PrintMagnifyingGlass = it}
