package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintMagnifyingGlass: ImageVector? = null

val Icons.Ss.PrintMagnifyingGlass: ImageVector
    get() = _PrintMagnifyingGlass ?: UXIcon(name = "PrintMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(19f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 0f)
                horizontalLineToRelative(14f)
                close()
                moveTo(24f, 22.59f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(0.44f, -0.69f, 0.7f, -1.51f, 0.7f, -2.39f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.88f, 0f, 1.69f, -0.26f, 2.39f, -0.7f)
                lineToRelative(2.66f, 2.66f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(21f, 7f)
                lineTo(3f, 7f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(10f)
                lineTo(4f, 20f)
                verticalLineToRelative(-7f)
                lineTo(12.82f, 13f)
                curveToRelative(1.18f, -1.23f, 2.84f, -2f, 4.68f, -2f)
                curveToRelative(3.59f, 0f, 6.5f, 2.91f, 6.5f, 6.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(11f, 17.5f)
                curveToRelative(0f, -0.89f, 0.18f, -1.73f, 0.5f, -2.5f)
                lineTo(6f, 15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(11.5f)
                curveToRelative(-3.59f, 0f, -6.5f, -2.91f, -6.5f, -6.5f)
                close()
            }
        }.also { _PrintMagnifyingGlass = it}
