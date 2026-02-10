package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EndlessLoop: ImageVector? = null

val Icons.Bs.EndlessLoop: ImageVector
    get() = _EndlessLoop ?: UXIcon(name = "EndlessLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.36f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(3.85f)
                lineToRelative(-3.91f, -3.94f)
                lineToRelative(2.13f, -2.11f)
                lineToRelative(5.68f, 5.72f)
                curveToRelative(1.01f, 1.01f, 1.01f, 2.66f, -0.0f, 3.68f)
                lineToRelative(-5.67f, 5.72f)
                lineToRelative(-2.13f, -2.11f)
                lineToRelative(3.91f, -3.94f)
                horizontalLineToRelative(-3.85f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -1.95f, -1.26f, -3.6f, -3f, -4.22f)
                verticalLineToRelative(-3.12f)
                curveToRelative(3.42f, 0.7f, 6f, 3.73f, 6f, 7.35f)
                close()
            }
        }.also { _EndlessLoop = it}
