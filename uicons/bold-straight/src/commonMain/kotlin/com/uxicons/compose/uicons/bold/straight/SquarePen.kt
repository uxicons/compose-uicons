package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePen: ImageVector? = null

val Icons.Bs.SquarePen: ImageVector
    get() = _SquarePen ?: UXIcon(name = "SquarePen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(17.86f, 6.14f)
                curveToRelative(0.85f, 0.85f, 0.85f, 2.23f, 0f, 3.09f)
                lineToRelative(-1.01f, 1.01f)
                lineToRelative(-3.09f, -3.09f)
                lineToRelative(1.01f, -1.01f)
                curveToRelative(0.85f, -0.85f, 2.23f, -0.85f, 3.09f, 0f)
                close()
                moveTo(11.73f, 9.19f)
                lineTo(14.81f, 12.27f)
                lineTo(9.09f, 18f)
                horizontalLineToRelative(-3.09f)
                verticalLineToRelative(-3.09f)
                close()
            }
        }.also { _SquarePen = it}
