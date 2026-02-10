package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flatbread: ImageVector? = null

val Icons.Ss.Flatbread: ImageVector
    get() = _Flatbread ?: UXIcon(name = "Flatbread") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(10.79f, 4.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-6f, 6f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(6f, -6f)
                close()
                moveTo(5.79f, 16.79f)
                lineToRelative(11f, -11f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-11f, 11f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(13.21f, 19.21f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(6f, -6f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-6f, 6f)
                close()
            }
        }.also { _Flatbread = it}
