package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notdef: ImageVector? = null

val Icons.Ss.Notdef: ImageVector
    get() = _Notdef ?: UXIcon(name = "Notdef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.72f, 0.3f)
                curveToRelative(0.39f, -0.18f, 0.82f, -0.3f, 1.28f, -0.3f)
                horizontalLineToRelative(12f)
                curveToRelative(0.46f, 0f, 0.89f, 0.11f, 1.28f, 0.3f)
                lineToRelative(-7.28f, 10f)
                lineTo(4.72f, 0.3f)
                close()
                moveTo(10.76f, 12f)
                lineTo(3.29f, 1.73f)
                curveToRelative(-0.18f, 0.39f, -0.29f, 0.82f, -0.29f, 1.27f)
                lineTo(3f, 22.68f)
                lineToRelative(7.76f, -10.67f)
                close()
                moveTo(21f, 22.67f)
                lineTo(21f, 3f)
                curveToRelative(0f, -0.46f, -0.11f, -0.88f, -0.29f, -1.27f)
                lineToRelative(-7.47f, 10.27f)
                lineToRelative(7.76f, 10.67f)
                close()
                moveTo(12f, 13.7f)
                lineToRelative(-7.49f, 10.3f)
                horizontalLineToRelative(14.98f)
                lineToRelative(-7.49f, -10.3f)
                close()
            }
        }.also { _Notdef = it}
