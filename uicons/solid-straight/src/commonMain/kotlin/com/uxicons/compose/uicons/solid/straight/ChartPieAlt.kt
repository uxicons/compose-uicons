package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPieAlt: ImageVector? = null

val Icons.Ss.ChartPieAlt: ImageVector
    get() = _ChartPieAlt ?: UXIcon(name = "ChartPieAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(257.21f, 65.29f)
                lineToRelative(-0.28f, -21.26f)
                horizontalLineToRelative(-21.26f)
                curveToRelative(-1.49f, -0.01f, -2.97f, -0.01f, -4.45f, 0f)
                curveTo(102.43f, 45.26f, -0.98f, 150.66f, 0.25f, 279.45f)
                curveToRelative(1.23f, 128.79f, 106.63f, 232.2f, 235.42f, 230.97f)
                curveToRelative(128.73f, -0.14f, 233.05f, -104.46f, 233.21f, -233.18f)
                verticalLineToRelative(-21.26f)
                horizontalLineTo(256.93f)
                lineTo(257.21f, 65.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(299.85f, 1.57f)
                lineTo(299.85f, 1.57f)
                lineToRelative(0f, 211.93f)
                horizontalLineToRelative(211.9f)
                curveTo(511.21f, 96.69f, 416.66f, 2.13f, 299.85f, 1.57f)
                close()
            }
        }.also { _ChartPieAlt = it}
