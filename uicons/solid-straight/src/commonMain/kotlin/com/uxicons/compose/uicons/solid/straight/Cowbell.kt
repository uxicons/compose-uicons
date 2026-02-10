package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cowbell: ImageVector? = null

val Icons.Ss.Cowbell: ImageVector
    get() = _Cowbell ?: UXIcon(name = "Cowbell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.93f, 7.3f)
                curveToRelative(-0.34f, -1.91f, -2f, -3.3f, -3.94f, -3.3f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(0.11f, -0.31f, 0.18f, -0.65f, 0.18f, -1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.35f, 0.07f, 0.69f, 0.18f, 1f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-1.94f, 0f, -3.6f, 1.39f, -3.94f, 3.3f)
                lineTo(0.81f, 19f)
                lineTo(23.19f, 19f)
                lineToRelative(-2.27f, -11.7f)
                close()
                moveTo(9f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(8.14f, 21f)
                horizontalLineToRelative(7.72f)
                curveToRelative(-0.45f, 1.72f, -2f, 3f, -3.86f, 3f)
                reflectiveCurveToRelative(-3.41f, -1.28f, -3.86f, -3f)
                close()
            }
        }.also { _Cowbell = it}
