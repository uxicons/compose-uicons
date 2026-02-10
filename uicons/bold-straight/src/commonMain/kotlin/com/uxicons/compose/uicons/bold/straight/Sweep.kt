package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sweep: ImageVector? = null

val Icons.Bs.Sweep: ImageVector
    get() = _Sweep ?: UXIcon(name = "Sweep") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.33f, 4.67f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(-1.17f, 2.33f)
                close()
                moveTo(21f, 13.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-15.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(18f, 19.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.53f, -0.09f, 1.03f, -0.26f, 1.5f)
                horizontalLineToRelative(10.76f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(21.5f, 4.5f)
                lineTo(20.5f, 2.5f)
                lineTo(19.5f, 4.5f)
                lineTo(17.5f, 5.5f)
                lineTo(19.5f, 6.5f)
                lineTo(20.5f, 8.5f)
                lineTo(21.5f, 6.5f)
                lineTo(23.5f, 5.5f)
                close()
            }
        }.also { _Sweep = it}
