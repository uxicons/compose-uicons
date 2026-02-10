package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flatbread: ImageVector? = null

val Icons.Ts.Flatbread: ImageVector
    get() = _Flatbread ?: UXIcon(name = "Flatbread") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(18.1f, 6.6f)
                lineToRelative(-11.5f, 11.5f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(11.5f, -11.5f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(18.44f, 12.17f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-6.27f, 6.27f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(6.27f, -6.27f)
                close()
                moveTo(11.83f, 5.56f)
                lineToRelative(-6.27f, 6.27f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(6.27f, -6.27f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _Flatbread = it}
