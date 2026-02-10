package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuickBox: ImageVector? = null

val Icons.Ss.QuickBox: ImageVector
    get() = _QuickBox ?: UXIcon(name = "QuickBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 14f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(6f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(14.73f, 2f)
                horizontalLineToRelative(-1.98f)
                lineToRelative(-1.09f, 7f)
                horizontalLineToRelative(1.98f)
                close()
                moveTo(23.6f, 8f)
                lineTo(21.6f, 22f)
                horizontalLineToRelative(-15.6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5.36f)
                lineToRelative(0.47f, -3f)
                close()
                moveTo(19.5f, 17f)
                horizontalLineToRelative(-4.4f)
                lineToRelative(-0.29f, 2f)
                horizontalLineToRelative(4.4f)
                close()
                moveTo(16.13f, 6f)
                horizontalLineToRelative(7.75f)
                lineToRelative(0.08f, -0.58f)
                curveToRelative(0.12f, -0.86f, -0.13f, -1.73f, -0.7f, -2.39f)
                reflectiveCurveToRelative(-1.4f, -1.03f, -2.27f, -1.03f)
                horizontalLineToRelative(-4.25f)
                lineToRelative(-0.62f, 4f)
                close()
                moveTo(10.11f, 6f)
                lineTo(10.73f, 2f)
                horizontalLineToRelative(-4.26f)
                curveToRelative(-1.73f, 0f, -3.22f, 1.29f, -3.46f, 3.0f)
                lineToRelative(-0.14f, 0.99f)
                close()
                moveTo(9.8f, 8f)
                horizontalLineToRelative(-7.24f)
                lineToRelative(-0.29f, 2f)
                horizontalLineToRelative(7.22f)
                lineToRelative(0.31f, -2f)
                close()
            }
        }.also { _QuickBox = it}
