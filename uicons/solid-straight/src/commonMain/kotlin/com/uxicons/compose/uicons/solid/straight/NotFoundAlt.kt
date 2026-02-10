package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotFoundAlt: ImageVector? = null

val Icons.Ss.NotFoundAlt: ImageVector
    get() = _NotFoundAlt ?: UXIcon(name = "NotFoundAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.74f, 16.33f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveTo(20.01f, 4.49f, 15.52f, 0.01f, 10.01f, 0.01f)
                reflectiveCurveTo(0.01f, 4.49f, 0.01f, 10.01f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(6.23f, 6.23f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.23f, -6.23f)
                close()
                moveTo(13.96f, 12.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.54f, -2.54f)
                lineToRelative(-2.54f, 2.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(-2.54f, -2.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.54f, 2.54f)
                lineToRelative(2.54f, 2.54f)
                close()
            }
        }.also { _NotFoundAlt = it}
