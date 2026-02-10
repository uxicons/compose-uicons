package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CitrusSlice: ImageVector? = null

val Icons.Bs.CitrusSlice: ImageVector
    get() = _CitrusSlice ?: UXIcon(name = "CitrusSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.08f, 1.14f)
                lineToRelative(-1.06f, -1.06f)
                lineTo(0.08f, 19.02f)
                lineToRelative(1.06f, 1.06f)
                curveToRelative(2.53f, 2.53f, 5.89f, 3.92f, 9.47f, 3.92f)
                reflectiveCurveToRelative(6.94f, -1.39f, 9.47f, -3.92f)
                reflectiveCurveToRelative(3.92f, -5.89f, 3.92f, -9.47f)
                reflectiveCurveToRelative(-1.39f, -6.94f, -3.92f, -9.47f)
                close()
                moveTo(12f, 14.12f)
                lineToRelative(4.82f, 4.82f)
                curveToRelative(-1.42f, 1.06f, -3.07f, 1.73f, -4.82f, 1.97f)
                verticalLineToRelative(-6.79f)
                close()
                moveTo(14.12f, 12.0f)
                horizontalLineToRelative(6.79f)
                curveToRelative(-0.23f, 1.75f, -0.91f, 3.4f, -1.97f, 4.82f)
                lineToRelative(-4.82f, -4.82f)
                close()
                moveTo(20.88f, 9.0f)
                horizontalLineToRelative(-6.54f)
                lineToRelative(4.6f, -4.6f)
                curveToRelative(1.02f, 1.36f, 1.68f, 2.93f, 1.94f, 4.6f)
                close()
                moveTo(9f, 14.34f)
                verticalLineToRelative(6.54f)
                curveToRelative(-1.67f, -0.26f, -3.25f, -0.92f, -4.6f, -1.94f)
                lineToRelative(4.6f, -4.6f)
                close()
            }
        }.also { _CitrusSlice = it}
