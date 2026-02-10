package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terminal: ImageVector? = null

val Icons.Rr.Terminal: ImageVector
    get() = _Terminal ?: UXIcon(name = "Terminal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.13f, 9.89f)
                curveToRelative(1.16f, 1.16f, 1.16f, 3.06f, 0f, 4.23f)
                lineTo(1.72f, 21.7f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.3f, -0.72f, 0.3f)
                reflectiveCurveToRelative(-0.5f, -0.09f, -0.7f, -0.29f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.02f, -1.41f)
                lineToRelative(7.41f, -7.59f)
                curveToRelative(0.4f, -0.4f, 0.4f, -1.03f, 0f, -1.42f)
                lineTo(0.28f, 3.7f)
                curveToRelative(-0.39f, -0.4f, -0.38f, -1.03f, 0.02f, -1.41f)
                reflectiveCurveToRelative(1.03f, -0.38f, 1.41f, 0.02f)
                lineToRelative(7.41f, 7.59f)
                close()
                moveTo(23f, 20f)
                lineTo(11f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Terminal = it}
