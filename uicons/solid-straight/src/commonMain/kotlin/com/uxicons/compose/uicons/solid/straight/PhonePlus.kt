package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhonePlus: ImageVector? = null

val Icons.Ss.PhonePlus: ImageVector
    get() = _PhonePlus ?: UXIcon(name = "PhonePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 4f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(23.88f, 19.11f)
                lineToRelative(-3.17f, 3.17f)
                curveToRelative(-1.1f, 1.11f, -2.6f, 1.72f, -4.21f, 1.72f)
                curveTo(9.25f, 24f, 0f, 14.75f, 0f, 7.5f)
                curveToRelative(0f, -1.61f, 0.61f, -3.1f, 1.72f, -4.21f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.27f)
                lineToRelative(-4.12f, 4.12f)
                curveToRelative(1.37f, 3.06f, 3.49f, 5.19f, 6.45f, 6.47f)
                lineToRelative(4.13f, -4.13f)
                lineToRelative(6.26f, 6.26f)
                close()
            }
        }.also { _PhonePlus = it}
