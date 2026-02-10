package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mound: ImageVector? = null

val Icons.Bs.Mound: ImageVector
    get() = _Mound ?: UXIcon(name = "Mound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.79f, 10.43f)
                curveToRelative(-1.18f, -2.14f, -3.35f, -3.42f, -5.79f, -3.42f)
                reflectiveCurveToRelative(-4.61f, 1.28f, -5.79f, 3.42f)
                lineTo(0f, 21.66f)
                verticalLineToRelative(2.39f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2.39f)
                lineToRelative(-6.21f, -11.24f)
                close()
                moveTo(3.77f, 21.05f)
                lineToRelative(5.07f, -9.17f)
                curveToRelative(0.65f, -1.17f, 1.83f, -1.87f, 3.16f, -1.87f)
                reflectiveCurveToRelative(2.52f, 0.7f, 3.16f, 1.87f)
                lineToRelative(5.07f, 9.17f)
                horizontalLineTo(3.77f)
                close()
            }
        }.also { _Mound = it}
