package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RollerCoaster: ImageVector? = null

val Icons.Ss.RollerCoaster: ImageVector
    get() = _RollerCoaster ?: UXIcon(name = "RollerCoaster") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13f)
                curveToRelative(-1.14f, 0f, -2.22f, -0.24f, -3.2f, -0.67f)
                curveToRelative(1.97f, -1.83f, 3.2f, -4.44f, 3.2f, -7.33f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 2.89f, 1.23f, 5.5f, 3.2f, 7.33f)
                curveToRelative(-0.98f, 0.43f, -2.06f, 0.67f, -3.2f, 0.67f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                lineTo(1f, 5f)
                lineTo(1f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 10.97f)
                curveToRelative(0.58f, 0.77f, 1.26f, 1.45f, 2.03f, 2.03f)
                horizontalLineToRelative(-0.03f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                lineTo(7f, 14.16f)
                curveToRelative(0.64f, 0.28f, 1.3f, 0.5f, 2f, 0.64f)
                verticalLineToRelative(9.2f)
                horizontalLineToRelative(2f)
                lineTo(11f, 15f)
                curveToRelative(0.69f, 0f, 1.35f, -0.09f, 2f, -0.22f)
                verticalLineToRelative(9.22f)
                horizontalLineToRelative(2f)
                lineTo(15f, 14.15f)
                curveToRelative(0.34f, -0.15f, 0.68f, -0.31f, 1f, -0.5f)
                curveToRelative(0.32f, 0.19f, 0.66f, 0.35f, 1f, 0.5f)
                verticalLineToRelative(9.85f)
                horizontalLineToRelative(2f)
                lineTo(19f, 14.78f)
                curveToRelative(0.65f, 0.13f, 1.31f, 0.22f, 2f, 0.22f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                lineTo(23f, 13f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(16f, 11.24f)
                curveToRelative(-1.83f, -1.47f, -3f, -3.72f, -3f, -6.24f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 2.52f, -1.17f, 4.77f, -3f, 6.24f)
                close()
            }
        }.also { _RollerCoaster = it}
