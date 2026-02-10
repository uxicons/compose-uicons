package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scalpel: ImageVector? = null

val Icons.Bs.Scalpel: ImageVector
    get() = _Scalpel ?: UXIcon(name = "Scalpel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.83f, 2.17f)
                curveToRelative(-1.56f, -1.56f, -4.1f, -1.56f, -5.66f, 0f)
                lineTo(0f, 19.33f)
                verticalLineToRelative(3.65f)
                reflectiveCurveToRelative(3.56f, 0.03f, 3.56f, 0.03f)
                curveToRelative(4.0f, -0.16f, 7.44f, -1.56f, 9.94f, -4.07f)
                lineToRelative(0.33f, -0.33f)
                lineToRelative(0.41f, -2.18f)
                lineToRelative(8.6f, -8.6f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.1f, 0f, -5.66f)
                close()
                moveTo(11.05f, 17.12f)
                curveToRelative(-2.37f, 2.17f, -5.33f, 2.77f, -7.47f, 2.87f)
                lineToRelative(6.18f, -6.17f)
                lineToRelative(1.63f, 1.52f)
                lineToRelative(-0.33f, 1.78f)
                close()
                moveTo(20.71f, 5.71f)
                lineToRelative(-7.36f, 7.36f)
                lineToRelative(-1.47f, -1.37f)
                lineToRelative(7.42f, -7.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _Scalpel = it}
