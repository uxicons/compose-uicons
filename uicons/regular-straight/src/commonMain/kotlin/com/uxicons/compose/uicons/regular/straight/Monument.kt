package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Rs.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(24f, 22f)
                close()
                moveTo(22f, 20f)
                lineTo(2f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.11f)
                lineToRelative(1.53f, -12.97f)
                curveToRelative(0.08f, -0.67f, 0.38f, -1.3f, 0.86f, -1.77f)
                lineTo(9.88f, 0.88f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0f)
                lineToRelative(2.38f, 2.38f)
                curveToRelative(0.47f, 0.47f, 0.78f, 1.1f, 0.86f, 1.77f)
                lineToRelative(1.53f, 12.97f)
                horizontalLineToRelative(3.11f)
                verticalLineToRelative(2f)
                close()
                moveTo(15.58f, 7f)
                horizontalLineToRelative(-2.58f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3.87f)
                lineToRelative(-1.29f, -11f)
                close()
                moveTo(8.91f, 4.67f)
                curveToRelative(-0.09f, 0.09f, -0.17f, 0.2f, -0.22f, 0.33f)
                horizontalLineToRelative(6.61f)
                curveToRelative(-0.05f, -0.12f, -0.12f, -0.23f, -0.22f, -0.33f)
                lineToRelative(-2.38f, -2.38f)
                curveToRelative(-0.38f, -0.38f, -1.04f, -0.38f, -1.41f, 0f)
                lineToRelative(-2.38f, 2.38f)
                close()
                moveTo(7.13f, 18f)
                horizontalLineToRelative(3.87f)
                lineTo(11f, 7f)
                horizontalLineToRelative(-2.58f)
                lineToRelative(-1.29f, 11f)
                close()
            }
        }.also { _Monument = it}
