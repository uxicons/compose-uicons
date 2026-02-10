package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cell: ImageVector? = null

val Icons.Bs.Cell: ImageVector
    get() = _Cell ?: UXIcon(name = "Cell") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 2.57f)
                lineToRelative(-3.75f, -2.17f)
                curveToRelative(-0.93f, -0.54f, -2.08f, -0.54f, -3.0f, 0f)
                lineToRelative(-3.75f, 2.17f)
                lineToRelative(-3.75f, -2.17f)
                curveToRelative(-0.93f, -0.54f, -2.08f, -0.54f, -3.0f, 0f)
                lineToRelative(-3.75f, 2.17f)
                curveToRelative(-0.93f, 0.53f, -1.5f, 1.53f, -1.5f, 2.6f)
                verticalLineToRelative(4.51f)
                curveToRelative(0f, 1.07f, 0.57f, 2.06f, 1.5f, 2.6f)
                lineToRelative(3.75f, 2.17f)
                verticalLineToRelative(4.4f)
                curveToRelative(0f, 1.07f, 0.57f, 2.06f, 1.5f, 2.6f)
                lineToRelative(3.75f, 2.17f)
                curveToRelative(0.46f, 0.27f, 0.98f, 0.4f, 1.5f, 0.4f)
                reflectiveCurveToRelative(1.04f, -0.13f, 1.5f, -0.4f)
                lineToRelative(3.75f, -2.17f)
                curveToRelative(0.92f, -0.54f, 1.5f, -1.53f, 1.5f, -2.6f)
                verticalLineToRelative(-4.4f)
                lineToRelative(3.75f, -2.17f)
                curveToRelative(0.93f, -0.54f, 1.5f, -1.53f, 1.5f, -2.6f)
                verticalLineToRelative(-4.51f)
                curveToRelative(0f, -1.07f, -0.57f, -2.06f, -1.5f, -2.6f)
                close()
                moveTo(3f, 5.17f)
                lineTo(6.75f, 3f)
                lineTo(10.5f, 5.17f)
                verticalLineToRelative(4.51f)
                lineToRelative(-3.75f, 2.17f)
                lineToRelative(-3.75f, -2.17f)
                close()
                moveTo(12f, 21.0f)
                lineTo(8.25f, 18.84f)
                verticalLineToRelative(-4.4f)
                lineToRelative(3.75f, -2.17f)
                lineToRelative(3.75f, 2.17f)
                verticalLineToRelative(4.4f)
                close()
                moveTo(21f, 9.67f)
                lineTo(17.25f, 11.84f)
                lineTo(13.5f, 9.67f)
                verticalLineToRelative(-4.51f)
                lineToRelative(3.75f, -2.17f)
                lineToRelative(3.75f, 2.17f)
                close()
            }
        }.also { _Cell = it}
