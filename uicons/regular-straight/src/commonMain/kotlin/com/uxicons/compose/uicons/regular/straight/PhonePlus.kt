package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhonePlus: ImageVector? = null

val Icons.Rs.PhonePlus: ImageVector
    get() = _PhonePlus ?: UXIcon(name = "PhonePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.2f, 16.26f)
                curveToRelative(-2.96f, -1.28f, -5.08f, -3.41f, -6.45f, -6.47f)
                lineToRelative(3.4f, -3.41f)
                lineTo(4.89f, 0.12f)
                lineTo(1.72f, 3.29f)
                curveToRelative(-1.11f, 1.1f, -1.72f, 2.6f, -1.72f, 4.21f)
                curveToRelative(0f, 7.25f, 9.25f, 16.5f, 16.5f, 16.5f)
                curveToRelative(1.61f, 0f, 3.1f, -0.61f, 4.21f, -1.72f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(-6.26f, -6.26f)
                lineToRelative(-3.41f, 3.41f)
                close()
                moveTo(19.29f, 20.87f)
                curveToRelative(-0.73f, 0.73f, -1.72f, 1.13f, -2.79f, 1.13f)
                curveToRelative(-6.23f, 0f, -14.5f, -8.27f, -14.5f, -14.5f)
                curveToRelative(0f, -1.07f, 0.4f, -2.07f, 1.13f, -2.79f)
                lineToRelative(1.76f, -1.76f)
                lineToRelative(3.44f, 3.44f)
                lineToRelative(-2.94f, 2.94f)
                lineToRelative(0.25f, 0.61f)
                curveToRelative(1.64f, 4.08f, 4.48f, 6.92f, 8.45f, 8.44f)
                lineToRelative(0.6f, 0.23f)
                lineToRelative(2.93f, -2.93f)
                lineToRelative(3.44f, 3.44f)
                lineToRelative(-1.76f, 1.76f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                lineTo(18f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _PhonePlus = it}
