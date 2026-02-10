package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayPause: ImageVector? = null

val Icons.Rs.PlayPause: ImageVector
    get() = _PlayPause ?: UXIcon(name = "PlayPause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 3f)
                horizontalLineToRelative(2f)
                lineTo(22f, 21f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 3f)
                horizontalLineToRelative(2f)
                lineTo(18f, 21f)
                close()
                moveTo(2f, 21.0f)
                lineTo(2f, 3.0f)
                lineToRelative(10.88f, 6.95f)
                curveToRelative(0.7f, 0.44f, 1.12f, 1.2f, 1.12f, 2.04f)
                reflectiveCurveToRelative(-0.42f, 1.6f, -1.14f, 2.05f)
                lineTo(2f, 21.0f)
                close()
                moveTo(4f, 6.65f)
                verticalLineToRelative(10.69f)
                lineToRelative(7.79f, -5.0f)
                curveToRelative(0.13f, -0.08f, 0.21f, -0.21f, 0.21f, -0.36f)
                reflectiveCurveToRelative(-0.07f, -0.27f, -0.19f, -0.35f)
                lineTo(4f, 6.65f)
                close()
            }
        }.also { _PlayPause = it}
