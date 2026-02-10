package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZoomOut: ImageVector? = null

val Icons.Rs.ZoomOut: ImageVector
    get() = _ZoomOut ?: UXIcon(name = "ZoomOut", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(511.89f, 481.79f)
                lineToRelative(-133.3f, -133.3f)
                curveToRelative(74.54f, -91.16f, 61.06f, -225.49f, -30.1f, -300.02f)
                reflectiveCurveToRelative(-225.49f, -61.06f, -300.02f, 30.1f)
                reflectiveCurveToRelative(-61.06f, 225.49f, 30.1f, 300.02f)
                curveToRelative(78.52f, 64.2f, 191.4f, 64.2f, 269.92f, 0f)
                lineToRelative(133.3f, 133.3f)
                lineTo(511.89f, 481.79f)
                close()
                moveTo(213.87f, 384.17f)
                curveToRelative(-94.05f, 0f, -170.3f, -76.25f, -170.3f, -170.3f)
                reflectiveCurveTo(119.82f, 43.57f, 213.87f, 43.57f)
                reflectiveCurveToRelative(170.3f, 76.25f, 170.3f, 170.3f)
                curveTo(384.06f, 307.88f, 307.88f, 384.06f, 213.87f, 384.17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128.72f, 192.58f)
                horizontalLineToRelative(170.3f)
                verticalLineToRelative(42.57f)
                horizontalLineToRelative(-170.3f)
                close()
            }
        }.also { _ZoomOut = it}
