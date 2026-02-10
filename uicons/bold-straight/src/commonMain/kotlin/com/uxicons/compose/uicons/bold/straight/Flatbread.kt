package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flatbread: ImageVector? = null

val Icons.Bs.Flatbread: ImageVector
    get() = _Flatbread ?: UXIcon(name = "Flatbread") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(18.06f, 8.06f)
                lineToRelative(-10f, 10f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(15.94f, 5.94f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(19.06f, 14.06f)
                lineToRelative(-5f, 5f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(5f, -5f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(7.06f, 12.06f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(5f, -5f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-5f, 5f)
                close()
            }
        }.also { _Flatbread = it}
