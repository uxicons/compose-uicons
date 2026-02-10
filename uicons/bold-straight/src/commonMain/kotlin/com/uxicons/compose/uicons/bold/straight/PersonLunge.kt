package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonLunge: ImageVector? = null

val Icons.Bs.PersonLunge: ImageVector
    get() = _PersonLunge ?: UXIcon(name = "PersonLunge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-4.78f)
                lineToRelative(-1.8f, 1.27f)
                lineToRelative(1.19f, 2.94f)
                lineToRelative(-2.78f, 1.13f)
                lineToRelative(-1.61f, -3.96f)
                verticalLineToRelative(-1.52f)
                lineToRelative(3.83f, -2.71f)
                curveToRelative(0.74f, -0.56f, 1.7f, -0.88f, 2.67f, -0.88f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(6f)
                close()
                moveTo(12.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.45f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7.55f)
                lineToRelative(1.52f, -4.19f)
                curveToRelative(-1.02f, -0.27f, -1.92f, -0.83f, -2.62f, -1.59f)
                lineToRelative(-1.01f, 2.78f)
                close()
            }
        }.also { _PersonLunge = it}
