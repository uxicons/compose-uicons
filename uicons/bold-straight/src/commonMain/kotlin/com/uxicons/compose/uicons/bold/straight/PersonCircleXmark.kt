package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCircleXmark: ImageVector? = null

val Icons.Bs.PersonCircleXmark: ImageVector
    get() = _PersonCircleXmark ?: UXIcon(name = "PersonCircleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(19.41f, 18f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(12f, 12.72f)
                curveToRelative(-1.24f, 1.41f, -2f, 3.25f, -2f, 5.28f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                lineTo(1f, 18f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.22f)
                close()
                moveTo(4f, 15f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }.also { _PersonCircleXmark = it}
