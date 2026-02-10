package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NightMode: ImageVector? = null

val Icons.Rs.NightMode: ImageVector
    get() = _NightMode ?: UXIcon(name = "NightMode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.0f, 9.08f)
                verticalLineToRelative(-6.08f)
                horizontalLineToRelative(-6.08f)
                lineToRelative(-2.92f, -2.92f)
                lineToRelative(-2.92f, 2.92f)
                horizontalLineToRelative(-6.08f)
                verticalLineToRelative(6.08f)
                lineToRelative(-2.92f, 2.92f)
                lineToRelative(2.92f, 2.92f)
                verticalLineToRelative(6.08f)
                horizontalLineToRelative(6.08f)
                lineToRelative(2.92f, 2.92f)
                lineToRelative(2.92f, -2.92f)
                horizontalLineToRelative(6.08f)
                verticalLineToRelative(-6.08f)
                lineToRelative(2.92f, -2.92f)
                close()
                moveTo(19.0f, 14.09f)
                verticalLineToRelative(4.91f)
                horizontalLineToRelative(-4.91f)
                lineToRelative(-2.09f, 2.09f)
                lineToRelative(-2.09f, -2.09f)
                horizontalLineToRelative(-4.91f)
                verticalLineToRelative(-4.91f)
                lineToRelative(-2.09f, -2.09f)
                lineToRelative(2.09f, -2.09f)
                verticalLineToRelative(-4.91f)
                horizontalLineToRelative(4.91f)
                lineToRelative(2.09f, -2.09f)
                lineToRelative(2.09f, 2.09f)
                horizontalLineToRelative(4.91f)
                verticalLineToRelative(4.91f)
                lineToRelative(2.09f, 2.09f)
                close()
                moveTo(16.13f, 6.56f)
                reflectiveCurveToRelative(-1.13f, -0.56f, -3.13f, -0.56f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(1.5f, 0f, 3.13f, -0.56f, 3.13f, -0.56f)
                curveToRelative(-1.62f, -1.39f, -3.24f, -3.15f, -3.13f, -5.44f)
                curveToRelative(-0.11f, -2.29f, 1.51f, -4.06f, 3.13f, -5.44f)
                close()
                moveTo(12.05f, 15.88f)
                curveToRelative(-1.75f, -0.43f, -3.05f, -2.01f, -3.05f, -3.88f)
                reflectiveCurveToRelative(1.3f, -3.46f, 3.05f, -3.88f)
                curveToRelative(-0.68f, 1.17f, -1.05f, 2.51f, -1.05f, 3.88f)
                reflectiveCurveToRelative(0.37f, 2.71f, 1.05f, 3.88f)
                close()
            }
        }.also { _NightMode = it}
