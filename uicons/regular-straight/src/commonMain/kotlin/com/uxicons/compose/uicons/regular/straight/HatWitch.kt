package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWitch: ImageVector? = null

val Icons.Rs.HatWitch: ImageVector
    get() = _HatWitch ?: UXIcon(name = "HatWitch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.32f, 22f)
                lineToRelative(-5.1f, -14.85f)
                lineToRelative(0.8f, -1.16f)
                horizontalLineToRelative(4.39f)
                reflectiveCurveToRelative(1.35f, -1.45f, 1.35f, -1.45f)
                lineTo(18.89f, 0f)
                horizontalLineToRelative(-6.13f)
                curveToRelative(-2.14f, 0f, -4.04f, 1.36f, -4.73f, 3.38f)
                lineTo(1.68f, 22f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.68f)
                close()
                moveTo(10f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(8f, 18f)
                verticalLineToRelative(4f)
                lineTo(3.79f, 22f)
                lineTo(9.93f, 4.03f)
                curveToRelative(0.41f, -1.22f, 1.56f, -2.03f, 2.84f, -2.03f)
                horizontalLineToRelative(5.34f)
                lineToRelative(2.15f, 2f)
                horizontalLineToRelative(-3.27f)
                lineToRelative(-1.98f, 2.85f)
                lineToRelative(5.21f, 15.15f)
                horizontalLineToRelative(-4.21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _HatWitch = it}
