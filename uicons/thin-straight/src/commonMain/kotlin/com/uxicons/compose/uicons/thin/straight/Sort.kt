package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sort: ImageVector? = null

val Icons.Ts.Sort: ImageVector
    get() = _Sort ?: UXIcon(name = "Sort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.39f, 0.72f)
                lineTo(1.9f, 10f)
                lineTo(22.1f, 10f)
                lineTo(13.61f, 0.72f)
                curveToRelative(-0.82f, -0.91f, -2.41f, -0.91f, -3.22f, -0.0f)
                close()
                moveTo(4.17f, 9f)
                lineTo(11.13f, 1.39f)
                curveToRelative(0.45f, -0.5f, 1.29f, -0.5f, 1.74f, 0.0f)
                lineToRelative(6.96f, 7.61f)
                lineTo(4.17f, 9f)
                close()
                moveTo(10.39f, 23.28f)
                curveToRelative(0.41f, 0.46f, 1.0f, 0.72f, 1.61f, 0.72f)
                reflectiveCurveToRelative(1.2f, -0.26f, 1.61f, -0.72f)
                lineToRelative(8.49f, -9.28f)
                lineTo(1.9f, 14f)
                lineToRelative(8.49f, 9.28f)
                close()
                moveTo(12.87f, 22.61f)
                curveToRelative(-0.45f, 0.5f, -1.29f, 0.5f, -1.74f, -0.0f)
                lineToRelative(-6.96f, -7.61f)
                horizontalLineToRelative(15.67f)
                lineToRelative(-6.97f, 7.61f)
                close()
            }
        }.also { _Sort = it}
