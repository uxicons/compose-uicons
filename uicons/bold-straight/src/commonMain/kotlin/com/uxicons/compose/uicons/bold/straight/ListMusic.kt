package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListMusic: ImageVector? = null

val Icons.Bs.ListMusic: ImageVector
    get() = _ListMusic ?: UXIcon(name = "ListMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10.6f)
                curveToRelative(-0.75f, -0.39f, -1.6f, -0.6f, -2.5f, -0.6f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(19f, 3f)
                horizontalLineToRelative(5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(13.5f, 21f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(13f, 3f)
                lineTo(0f, 3f)
                lineTo(0f, 0f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(3f)
                close()
                moveTo(13f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(3f)
                close()
                moveTo(6.87f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9.76f)
                curveToRelative(-1.22f, 0.71f, -2.23f, 1.75f, -2.89f, 3f)
                close()
            }
        }.also { _ListMusic = it}
