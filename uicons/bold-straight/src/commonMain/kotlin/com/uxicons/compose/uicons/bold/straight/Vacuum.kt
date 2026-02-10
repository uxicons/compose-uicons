package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vacuum: ImageVector? = null

val Icons.Bs.Vacuum: ImageVector
    get() = _Vacuum ?: UXIcon(name = "Vacuum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(20f, 7.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-4.4f)
                curveToRelative(-2.23f, 0f, -4.14f, 1.66f, -4.46f, 3.86f)
                lineToRelative(-2.45f, 17.14f)
                lineToRelative(-4.2f, 0.02f)
                lineToRelative(0.01f, 3f)
                lineToRelative(6.8f, -0.03f)
                lineToRelative(2.81f, -19.71f)
                curveToRelative(0.1f, -0.73f, 0.74f, -1.29f, 1.48f, -1.29f)
                horizontalLineToRelative(4.4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(4.02f)
                curveToRelative(-0.63f, -0.84f, -1.02f, -1.87f, -1.02f, -3f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(1.13f, 0f, 2.16f, 0.39f, 3f, 1.02f)
                verticalLineToRelative(-3.52f)
                curveToRelative(0f, -2.7f, -1.65f, -5.02f, -4f, -6.0f)
                close()
            }
        }.also { _Vacuum = it}
