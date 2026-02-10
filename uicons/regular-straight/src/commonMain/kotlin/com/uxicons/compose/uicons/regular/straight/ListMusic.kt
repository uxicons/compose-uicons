package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListMusic: ImageVector? = null

val Icons.Rs.ListMusic: ImageVector
    get() = _ListMusic ?: UXIcon(name = "ListMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                curveToRelative(1.33f, 0f, 2.55f, 0.47f, 3.5f, 1.26f)
                lineTo(17f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(17f, 18.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(9.76f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.61f, -0.81f, 1.38f, -1.49f, 2.26f, -2f)
                close()
            }
        }.also { _ListMusic = it}
