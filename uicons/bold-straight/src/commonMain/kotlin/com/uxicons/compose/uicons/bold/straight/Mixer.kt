package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mixer: ImageVector? = null

val Icons.Bs.Mixer: ImageVector
    get() = _Mixer ?: UXIcon(name = "Mixer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(14f, 1f)
                horizontalLineToRelative(-4.5f)
                curveTo(4.26f, 1f, 0f, 5.26f, 0f, 10.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(1.07f)
                curveToRelative(-2.68f, 0.37f, -3f, 2.22f, -3f, 3.07f)
                verticalLineToRelative(2.71f)
                curveToRelative(0f, 0.94f, 0.39f, 3.14f, 4f, 3.14f)
                reflectiveCurveToRelative(4f, -2.2f, 4f, -3.14f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0f, -0.85f, -0.32f, -2.7f, -3f, -3.07f)
                verticalLineToRelative(-1.09f)
                curveToRelative(3.35f, -0.26f, 6f, -3.06f, 6f, -6.47f)
                close()
                moveTo(3f, 10.5f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                horizontalLineToRelative(8f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 11f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(15f, 20.86f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0f, -0.32f, 0.02f, -0.84f, 1f, -1.05f)
                verticalLineToRelative(4.81f)
                curveToRelative(-0.98f, -0.21f, -1f, -0.73f, -1f, -1.05f)
                close()
                moveTo(19f, 18.14f)
                verticalLineToRelative(2.71f)
                curveToRelative(0f, 0.32f, -0.02f, 0.84f, -1f, 1.05f)
                verticalLineToRelative(-4.81f)
                curveToRelative(0.98f, 0.21f, 1f, 0.73f, 1f, 1.05f)
                close()
                moveTo(17.5f, 8.0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Mixer = it}
