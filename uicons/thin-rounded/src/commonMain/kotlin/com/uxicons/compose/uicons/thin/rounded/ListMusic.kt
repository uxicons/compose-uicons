package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListMusic: ImageVector? = null

val Icons.Tr.ListMusic: ImageVector
    get() = _ListMusic ?: UXIcon(name = "ListMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(10.84f)
                curveToRelative(-1.0f, -1.42f, -2.64f, -2.34f, -4.5f, -2.34f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(19f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(13.5f, 23f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(-0.01f, 0.5f)
                curveTo(-0.01f, 0.22f, 0.21f, 0f, 0.49f, 0f)
                horizontalLineToRelative(12.03f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.49f, 1f)
                curveTo(0.21f, 1f, -0.01f, 0.78f, -0.01f, 0.5f)
                close()
                moveTo(-0.01f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12.03f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.49f, 7f)
                curveTo(0.21f, 7f, -0.01f, 6.78f, -0.01f, 6.5f)
                close()
                moveTo(8.5f, 13f)
                lineTo(0.49f, 13f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.01f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }.also { _ListMusic = it}
