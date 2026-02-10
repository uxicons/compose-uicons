package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ad: ImageVector? = null

val Icons.Bs.Ad: ImageVector
    get() = _Ad ?: UXIcon(name = "Ad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 12.46f)
                lineToRelative(0.97f, 2.54f)
                horizontalLineToRelative(-1.94f)
                lineToRelative(0.97f, -2.54f)
                close()
                moveTo(17f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 5.5f)
                lineTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(20.5f, 2f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(13.19f, 19f)
                lineTo(8f, 5f)
                horizontalLineToRelative(-1f)
                lineTo(1.81f, 19f)
                horizontalLineToRelative(3.19f)
                lineToRelative(0.38f, -1f)
                horizontalLineToRelative(4.24f)
                lineToRelative(0.38f, 1f)
                horizontalLineToRelative(3.19f)
                close()
                moveTo(21f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6.14f)
                curveToRelative(-0.32f, -0.08f, -0.65f, -0.14f, -1f, -0.14f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                lineTo(21f, 5f)
                close()
            }
        }.also { _Ad = it}
