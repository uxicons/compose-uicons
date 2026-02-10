package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhonePlus: ImageVector? = null

val Icons.Ts.PhonePlus: ImageVector
    get() = _PhonePlus ?: UXIcon(name = "PhonePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                lineTo(19f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                close()
                moveTo(17.53f, 13.84f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-2.88f, 2.88f)
                curveToRelative(-1.03f, 1.03f, -2.43f, 1.6f, -3.94f, 1.6f)
                curveTo(9.19f, 24f, 0f, 14.81f, 0f, 7.61f)
                curveToRelative(0f, -1.51f, 0.57f, -2.91f, 1.6f, -3.94f)
                lineTo(4.48f, 0.79f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-3.37f, 3.37f)
                curveToRelative(1.49f, 3.51f, 3.96f, 5.99f, 7.36f, 7.37f)
                lineToRelative(3.38f, -3.38f)
                close()
                moveTo(21.79f, 19.52f)
                lineToRelative(-4.27f, -4.26f)
                lineToRelative(-3.13f, 3.13f)
                curveToRelative(-3.9f, -1.38f, -7.05f, -4.25f, -8.78f, -8.77f)
                lineToRelative(3.13f, -3.13f)
                lineTo(4.48f, 2.21f)
                lineToRelative(-2.17f, 2.17f)
                curveToRelative(-0.85f, 0.84f, -1.31f, 1.99f, -1.31f, 3.23f)
                curveToRelative(0f, 6.62f, 8.77f, 15.39f, 15.39f, 15.39f)
                curveToRelative(1.24f, 0f, 2.39f, -0.47f, 3.23f, -1.31f)
                lineToRelative(2.17f, -2.17f)
                close()
            }
        }.also { _PhonePlus = it}
