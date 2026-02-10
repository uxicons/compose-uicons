package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlphaDown: ImageVector? = null

val Icons.Bs.SortAlphaDown: ImageVector
    get() = _SortAlphaDown ?: UXIcon(name = "SortAlphaDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 16f)
                horizontalLineToRelative(4.13f)
                lineToRelative(-4.13f, 4.96f)
                verticalLineToRelative(3.04f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.13f)
                lineToRelative(4.13f, -4.96f)
                verticalLineToRelative(-3.04f)
                lineTo(15f, 13f)
                verticalLineToRelative(3f)
                close()
                moveTo(23f, 4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 4f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(20.33f, 6.5f)
                lineTo(20.33f, 3.83f)
                curveToRelative(0f, -0.74f, -0.6f, -1.33f, -1.33f, -1.33f)
                reflectiveCurveToRelative(-1.33f, 0.6f, -1.33f, 1.33f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(2.67f)
                close()
                moveTo(13.02f, 18.52f)
                lineToRelative(-4.75f, 4.75f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                lineTo(-0.02f, 18.52f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.9f, 2.9f)
                lineTo(5.0f, 0f)
                horizontalLineToRelative(3f)
                lineTo(8.0f, 19.29f)
                lineToRelative(2.9f, -2.9f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _SortAlphaDown = it}
