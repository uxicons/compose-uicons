package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeft: ImageVector? = null

val Icons.Bs.DownLeft: ImageVector
    get() = _DownLeft ?: UXIcon(name = "DownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.95f, 23f)
                lineTo(4.4f, 23f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.91f, 0f, -1.76f, -0.35f, -2.4f, -1f)
                curveToRelative(-0.64f, -0.64f, -1f, -1.5f, -0.99f, -2.41f)
                lineTo(1.01f, 5.06f)
                reflectiveCurveToRelative(5.48f, 5.33f, 5.48f, 5.33f)
                lineTo(16.17f, 0.7f)
                lineToRelative(7.12f, 7.12f)
                lineToRelative(-9.69f, 9.69f)
                lineToRelative(5.34f, 5.49f)
                close()
                moveTo(4.4f, 20f)
                horizontalLineToRelative(7.43f)
                reflectiveCurveToRelative(-2.45f, -2.51f, -2.45f, -2.51f)
                lineTo(19.05f, 7.82f)
                lineToRelative(-2.88f, -2.88f)
                lineTo(6.51f, 14.61f)
                lineToRelative(-2.51f, -2.44f)
                verticalLineToRelative(7.43f)
                curveToRelative(0f, 0.14f, 0.07f, 0.23f, 0.12f, 0.29f)
                curveToRelative(0.05f, 0.05f, 0.15f, 0.12f, 0.28f, 0.12f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _DownLeft = it}
