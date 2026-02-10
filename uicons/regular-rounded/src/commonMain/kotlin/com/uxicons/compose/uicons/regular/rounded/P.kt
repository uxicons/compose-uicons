package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _P: ImageVector? = null

val Icons.Rr.P: ImageVector
    get() = _P ?: UXIcon(name = "P") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(9.93f, 0.35f, 9.92f, 14.65f, 0f, 15f)
                lineTo(4f, 15f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(4f, 13f)
                lineTo(14.5f, 13f)
                curveToRelative(7.27f, -0.23f, 7.26f, -10.77f, 0f, -11f)
                lineTo(7f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(4f, 13f)
                close()
            }
        }.also { _P = it}
