package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeftFromCircle: ImageVector? = null

val Icons.Rs.ArrowUpLeftFromCircle: ImageVector
    get() = _ArrowUpLeftFromCircle ?: UXIcon(name = "ArrowUpLeftFromCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3.41f)
                verticalLineToRelative(6.59f)
                lineTo(0f, 10f)
                lineTo(0f, 2f)
                curveTo(0f, 0.9f, 0.9f, 0f, 2f, 0f)
                lineTo(10f, 0f)
                lineTo(10f, 2f)
                lineTo(3.41f, 2f)
                lineToRelative(12.79f, 12.79f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(2f, 3.41f)
                close()
                moveTo(14f, 4f)
                curveToRelative(-1.67f, 0f, -3.23f, 0.41f, -4.62f, 1.14f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.96f, -0.41f, 2.02f, -0.64f, 3.12f, -0.64f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -1.11f, 0.23f, -2.16f, 0.64f, -3.12f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(-0.72f, 1.38f, -1.14f, 2.95f, -1.14f, 4.62f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(19.51f, 4f, 14f, 4f)
                close()
            }
        }.also { _ArrowUpLeftFromCircle = it}
