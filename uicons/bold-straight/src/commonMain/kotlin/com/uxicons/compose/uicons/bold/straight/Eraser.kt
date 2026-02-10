package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eraser: ImageVector? = null

val Icons.Bs.Eraser: ImageVector
    get() = _Eraser ?: UXIcon(name = "Eraser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 12.63f)
                curveToRelative(0.66f, -0.66f, 1.02f, -1.54f, 1.02f, -2.48f)
                reflectiveCurveToRelative(-0.36f, -1.81f, -1.02f, -2.48f)
                lineToRelative(-5.66f, -5.66f)
                curveToRelative(-1.36f, -1.36f, -3.58f, -1.37f, -4.95f, 0f)
                lineTo(1.05f, 13.34f)
                curveToRelative(-1.36f, 1.36f, -1.36f, 3.58f, 0f, 4.95f)
                lineToRelative(4.71f, 4.71f)
                horizontalLineToRelative(18.23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8.39f)
                lineToRelative(7.37f, -7.37f)
                close()
                moveTo(14.49f, 4.15f)
                curveToRelative(0.19f, -0.19f, 0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(5.66f, 5.66f)
                curveToRelative(0.13f, 0.13f, 0.15f, 0.28f, 0.15f, 0.35f)
                curveToRelative(0f, 0.08f, -0.02f, 0.23f, -0.15f, 0.35f)
                lineToRelative(-4.86f, 4.86f)
                lineToRelative(-6.36f, -6.36f)
                lineToRelative(4.86f, -4.86f)
                close()
                moveTo(7.01f, 20f)
                lineToRelative(-3.83f, -3.83f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(4.33f, -4.33f)
                lineToRelative(6.36f, 6.36f)
                lineToRelative(-2.51f, 2.51f)
                horizontalLineToRelative(-4.36f)
                close()
            }
        }.also { _Eraser = it}
