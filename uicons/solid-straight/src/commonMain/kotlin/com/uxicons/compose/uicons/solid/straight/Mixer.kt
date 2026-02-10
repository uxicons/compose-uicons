package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mixer: ImageVector? = null

val Icons.Ss.Mixer: ImageVector
    get() = _Mixer ?: UXIcon(name = "Mixer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 1f)
                horizontalLineToRelative(-6f)
                curveTo(4.04f, 1f, 0f, 5.04f, 0f, 10f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2.07f)
                curveToRelative(-2.68f, 0.37f, -3f, 2.22f, -3f, 3.07f)
                verticalLineToRelative(2.71f)
                curveToRelative(0f, 0.94f, 0.39f, 3.14f, 4f, 3.14f)
                reflectiveCurveToRelative(4f, -2.2f, 4f, -3.14f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0f, -0.85f, -0.32f, -2.7f, -3f, -3.07f)
                verticalLineToRelative(-2.07f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
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
                moveTo(17.5f, 3.0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _Mixer = it}
