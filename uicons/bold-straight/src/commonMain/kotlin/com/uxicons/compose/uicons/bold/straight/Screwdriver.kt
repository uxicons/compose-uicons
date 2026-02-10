package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screwdriver: ImageVector? = null

val Icons.Bs.Screwdriver: ImageVector
    get() = _Screwdriver ?: UXIcon(name = "Screwdriver") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.96f, 8f)
                lineToRelative(3.02f, -5.24f)
                lineTo(21.23f, 0.02f)
                lineToRelative(-5.23f, 3.02f)
                verticalLineToRelative(2.83f)
                lineToRelative(-5.75f, 5.75f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-7.31f, 7.31f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.1f, 0f, 5.66f)
                curveToRelative(0.76f, 0.76f, 1.76f, 1.17f, 2.83f, 1.17f)
                reflectiveCurveToRelative(2.07f, -0.42f, 2.83f, -1.17f)
                lineToRelative(7.31f, -7.31f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(5.75f, -5.75f)
                horizontalLineToRelative(2.83f)
                close()
                moveTo(4.71f, 20.71f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(5.19f, -5.19f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-5.19f, 5.19f)
                close()
            }
        }.also { _Screwdriver = it}
