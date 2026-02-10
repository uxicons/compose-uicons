package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointLeft: ImageVector? = null

val Icons.Bs.HandBackPointLeft: ImageVector
    get() = _HandBackPointLeft ?: UXIcon(name = "HandBackPointLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.86f, 2.02f)
                curveToRelative(-1.36f, -1.36f, -3.58f, -1.36f, -4.95f, 0f)
                lineToRelative(-3.98f, 3.98f)
                lineTo(4f, 6f)
                curveTo(1.79f, 6f, 0f, 7.79f, 0f, 10f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(3.83f)
                lineToRelative(2f, 8f)
                horizontalLineToRelative(14.17f)
                lineToRelative(0.02f, -14.6f)
                lineToRelative(-5.15f, -5.37f)
                close()
                moveTo(21.0f, 19f)
                lineTo(12.17f, 19f)
                lineToRelative(-2f, -8f)
                lineTo(4f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.82f)
                lineToRelative(1.85f, -1.85f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.69f, -0.02f)
                lineToRelative(4.3f, 4.48f)
                lineToRelative(-0.01f, 10.4f)
                close()
            }
        }.also { _HandBackPointLeft = it}
