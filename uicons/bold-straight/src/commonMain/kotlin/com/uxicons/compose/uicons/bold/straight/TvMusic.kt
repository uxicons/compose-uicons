package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TvMusic: ImageVector? = null

val Icons.Bs.TvMusic: ImageVector
    get() = _TvMusic ?: UXIcon(name = "TvMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                lineTo(7f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2f)
                lineTo(0f, 18f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(3f)
                lineTo(3.5f, 4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 15f)
                lineTo(21f, 15f)
                lineTo(21f, 4.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(18f, 1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13.5f)
                lineTo(13.5f, 18f)
                close()
                moveTo(8f, 9f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                lineTo(14f, 4f)
                horizontalLineToRelative(2f)
                lineTo(16f, 1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
            }
        }.also { _TvMusic = it}
