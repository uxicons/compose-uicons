package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonRays: ImageVector? = null

val Icons.Bs.PersonRays: ImageVector
    get() = _PersonRays ?: UXIcon(name = "PersonRays") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(17f, 9.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.5f)
                lineTo(7f, 9.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(10f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(0.04f, 21.84f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.9f, -3.9f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(0.04f, 21.84f)
                close()
                moveTo(23.96f, 2.16f)
                lineTo(21.84f, 0.04f)
                lineToRelative(-3.9f, 3.9f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.9f, -3.9f)
                close()
                moveTo(17.94f, 20.06f)
                lineToRelative(3.9f, 3.9f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.9f, -3.9f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(0.04f, 2.16f)
                lineToRelative(3.9f, 3.9f)
                lineToRelative(2.12f, -2.12f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                close()
            }
        }.also { _PersonRays = it}
