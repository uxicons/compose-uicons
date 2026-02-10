package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotFoundAlt: ImageVector? = null

val Icons.Bs.NotFoundAlt: ImageVector
    get() = _NotFoundAlt ?: UXIcon(name = "NotFoundAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.99f, 21.87f)
                lineToRelative(-5.95f, -5.95f)
                curveToRelative(1.23f, -1.66f, 1.96f, -3.7f, 1.96f, -5.92f)
                curveTo(20.01f, 4.49f, 15.52f, 0.01f, 10.01f, 0.01f)
                reflectiveCurveTo(0.01f, 4.49f, 0.01f, 10.01f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.22f, 0f, 4.26f, -0.73f, 5.92f, -1.96f)
                lineToRelative(5.95f, 5.95f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(10.01f, 17.01f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(14.31f, 7.81f)
                lineToRelative(-2.19f, 2.19f)
                lineToRelative(2.19f, 2.19f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.19f, -2.19f)
                lineToRelative(-2.19f, 2.19f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.19f, -2.19f)
                lineToRelative(-2.19f, -2.19f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.19f, 2.19f)
                lineToRelative(2.19f, -2.19f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _NotFoundAlt = it}
