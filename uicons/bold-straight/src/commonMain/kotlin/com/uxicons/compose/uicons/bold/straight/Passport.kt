package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Passport: ImageVector? = null

val Icons.Bs.Passport: ImageVector
    get() = _Passport ?: UXIcon(name = "Passport") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                lineTo(7f, 19f)
                verticalLineToRelative(-3f)
                close()
                moveTo(23f, 3.5f)
                lineTo(23f, 24f)
                lineTo(1f, 24f)
                lineTo(1f, 3.5f)
                curveTo(1f, 1.57f, 2.57f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(4f, 21f)
                lineTo(20f, 21f)
                lineTo(20f, 3.5f)
                close()
                moveTo(14.79f, 4.76f)
                curveToRelative(0.34f, 0.96f, 0.55f, 2.08f, 0.65f, 3.24f)
                horizontalLineToRelative(-2.01f)
                curveToRelative(-0.25f, -2.5f, -1.06f, -3.94f, -1.43f, -4f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.36f, 0.06f, -1.18f, 1.5f, -1.43f, 4f)
                horizontalLineToRelative(-2.01f)
                curveToRelative(0.1f, -1.16f, 0.31f, -2.28f, 0.65f, -3.24f)
                curveToRelative(-1.62f, 0.96f, -2.71f, 2.72f, -2.71f, 4.74f)
                reflectiveCurveToRelative(1.09f, 3.78f, 2.71f, 4.74f)
                curveToRelative(-0.34f, -0.96f, -0.55f, -2.08f, -0.65f, -3.24f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.25f, 2.5f, 1.06f, 3.94f, 1.43f, 4f)
                horizontalLineToRelative(0f)
                curveToRelative(0.36f, -0.06f, 1.18f, -1.5f, 1.43f, -4f)
                horizontalLineToRelative(2.01f)
                curveToRelative(-0.1f, 1.16f, -0.31f, 2.28f, -0.65f, 3.24f)
                curveToRelative(1.62f, -0.96f, 2.71f, -2.72f, 2.71f, -4.74f)
                reflectiveCurveToRelative(-1.09f, -3.78f, -2.71f, -4.74f)
                close()
            }
        }.also { _Passport = it}
