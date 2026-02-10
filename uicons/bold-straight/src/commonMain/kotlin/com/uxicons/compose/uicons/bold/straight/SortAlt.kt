package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlt: ImageVector? = null

val Icons.Bs.SortAlt: ImageVector
    get() = _SortAlt ?: UXIcon(name = "SortAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.02f, 18.52f)
                lineToRelative(-4.75f, 4.75f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                lineTo(-0.02f, 18.52f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.9f, 2.9f)
                lineTo(5.0f, 0f)
                horizontalLineToRelative(3f)
                lineTo(8.0f, 19.29f)
                lineToRelative(2.9f, -2.9f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(13.1f, 7.6f)
                lineToRelative(2.9f, -2.9f)
                lineTo(16f, 24f)
                horizontalLineToRelative(3f)
                lineTo(19f, 4.71f)
                lineToRelative(2.9f, 2.9f)
                lineToRelative(2.12f, -2.12f)
                lineTo(19.27f, 0.73f)
                curveTo(18.78f, 0.24f, 18.14f, 0f, 17.5f, 0f)
                reflectiveCurveToRelative(-1.28f, 0.24f, -1.77f, 0.73f)
                lineToRelative(-4.75f, 4.75f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _SortAlt = it}
