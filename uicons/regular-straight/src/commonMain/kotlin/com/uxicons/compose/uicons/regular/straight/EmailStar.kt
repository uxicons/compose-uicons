package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailStar: ImageVector? = null

val Icons.Rs.EmailStar: ImageVector
    get() = _EmailStar ?: UXIcon(name = "EmailStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14.02f)
                lineToRelative(2f, -1.4f)
                verticalLineToRelative(11.38f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-18f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                lineToRelative(0.12f, -0.12f)
                horizontalLineToRelative(2.83f)
                lineToRelative(-1.53f, 1.54f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineToRelative(-6.46f, -6.47f)
                verticalLineToRelative(12.93f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-7.98f)
                close()
                moveTo(19.83f, 4.36f)
                lineTo(18.54f, 0f)
                horizontalLineToRelative(-1.06f)
                lineToRelative(-1.28f, 4.36f)
                horizontalLineToRelative(-4.2f)
                verticalLineToRelative(1.01f)
                lineToRelative(3.08f, 2.02f)
                lineToRelative(-1.18f, 4.02f)
                lineToRelative(0.79f, 0.59f)
                lineToRelative(3.33f, -2.34f)
                lineToRelative(3.38f, 2.34f)
                lineToRelative(0.82f, -0.57f)
                lineToRelative(-1.27f, -3.98f)
                lineToRelative(3.05f, -2.08f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.17f)
                close()
            }
        }.also { _EmailStar = it}
