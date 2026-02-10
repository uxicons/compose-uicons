package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonChalkboard: ImageVector? = null

val Icons.Bs.PersonChalkboard: ImageVector
    get() = _PersonChalkboard ?: UXIcon(name = "PersonChalkboard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.5f)
                lineTo(24f, 15f)
                lineTo(11f, 15f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(9.95f, 3f)
                curveToRelative(0.02f, -0.17f, 0.05f, -0.33f, 0.05f, -0.5f)
                curveToRelative(0f, -0.93f, -0.28f, -1.78f, -0.76f, -2.5f)
                horizontalLineToRelative(11.26f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(6f, 15f)
                lineTo(3f, 15f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(15f, 9f)
                verticalLineToRelative(-3f)
                lineTo(3.5f, 6f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                lineTo(2f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                lineTo(9f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                close()
                moveTo(5.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(6.88f, 0f, 5.5f, 0f)
                reflectiveCurveTo(3f, 1.12f, 3f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _PersonChalkboard = it}
