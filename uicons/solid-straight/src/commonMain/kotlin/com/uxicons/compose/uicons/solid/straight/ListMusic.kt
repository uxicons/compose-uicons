package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListMusic: ImageVector? = null

val Icons.Ss.ListMusic: ImageVector
    get() = _ListMusic ?: UXIcon(name = "ListMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(11.76f)
                curveToRelative(-0.95f, -0.79f, -2.17f, -1.26f, -3.5f, -1.26f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(13f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2f)
                close()
                moveTo(9.77f, 12f)
                curveToRelative(-0.88f, 0.51f, -1.65f, 1.19f, -2.26f, 2f)
                lineTo(0f, 14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9.77f)
                close()
            }
        }.also { _ListMusic = it}
