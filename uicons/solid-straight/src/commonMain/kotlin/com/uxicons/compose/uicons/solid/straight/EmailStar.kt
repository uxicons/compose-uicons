package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailStar: ImageVector? = null

val Icons.Ss.EmailStar: ImageVector
    get() = _EmailStar ?: UXIcon(name = "EmailStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.83f, 4.36f)
                horizontalLineToRelative(4.17f)
                verticalLineToRelative(1f)
                lineToRelative(-3.05f, 2.08f)
                lineToRelative(1.27f, 3.98f)
                lineToRelative(-0.82f, 0.57f)
                lineToRelative(-3.38f, -2.34f)
                lineToRelative(-3.33f, 2.34f)
                lineToRelative(-0.79f, -0.59f)
                lineToRelative(1.18f, -4.02f)
                lineToRelative(-3.08f, -2.02f)
                verticalLineToRelative(-1.01f)
                horizontalLineToRelative(4.2f)
                lineToRelative(1.28f, -4.36f)
                horizontalLineToRelative(1.06f)
                lineToRelative(1.28f, 4.36f)
                close()
                moveTo(21.41f, 14.44f)
                lineTo(18.59f, 12.49f)
                lineTo(15.54f, 15.54f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineToRelative(-8.46f, -8.46f)
                verticalLineToRelative(16.93f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11.38f)
                close()
                moveTo(14.12f, 14.12f)
                lineTo(14.15f, 14.1f)
                lineTo(11.59f, 12.17f)
                lineTo(12.74f, 8.24f)
                lineTo(10.0f, 6.45f)
                verticalLineToRelative(-3.45f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.15f, 0f, -2.13f, 0.66f, -2.64f, 1.6f)
                lineToRelative(9.52f, 9.52f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                close()
            }
        }.also { _EmailStar = it}
