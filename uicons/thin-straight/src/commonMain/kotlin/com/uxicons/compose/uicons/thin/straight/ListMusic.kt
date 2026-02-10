package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListMusic: ImageVector? = null

val Icons.Ts.ListMusic: ImageVector
    get() = _ListMusic ?: UXIcon(name = "ListMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(13.34f)
                curveToRelative(-1.0f, -1.42f, -2.64f, -2.34f, -4.5f, -2.34f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(19f, 2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(13.5f, 23f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(13f, 1f)
                lineTo(0f, 1f)
                lineTo(0f, 0f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(1f)
                close()
                moveTo(13f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(1f)
                close()
                moveTo(8.41f, 13f)
                lineTo(0f, 13f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(9.77f)
                curveToRelative(-0.49f, 0.28f, -0.94f, 0.62f, -1.36f, 1f)
                close()
            }
        }.also { _ListMusic = it}
