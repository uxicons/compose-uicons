package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NightMode: ImageVector? = null

val Icons.Ss.NightMode: ImageVector
    get() = _NightMode ?: UXIcon(name = "NightMode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.05f, 8.12f)
                curveToRelative(-0.68f, 1.17f, -1.05f, 2.51f, -1.05f, 3.88f)
                reflectiveCurveToRelative(0.37f, 2.71f, 1.05f, 3.88f)
                curveToRelative(-1.75f, -0.43f, -3.05f, -2.01f, -3.05f, -3.88f)
                reflectiveCurveToRelative(1.3f, -3.46f, 3.05f, -3.88f)
                close()
                moveTo(23.91f, 12f)
                lineTo(21.0f, 14.92f)
                verticalLineToRelative(6.08f)
                horizontalLineToRelative(-6.08f)
                lineToRelative(-2.92f, 2.92f)
                lineToRelative(-2.92f, -2.92f)
                horizontalLineToRelative(-6.08f)
                verticalLineToRelative(-6.08f)
                lineToRelative(-2.92f, -2.92f)
                lineToRelative(2.92f, -2.92f)
                verticalLineToRelative(-6.08f)
                horizontalLineToRelative(6.08f)
                lineToRelative(2.92f, -2.92f)
                lineToRelative(2.92f, 2.92f)
                horizontalLineToRelative(6.08f)
                verticalLineToRelative(6.08f)
                close()
                moveTo(13f, 12f)
                curveToRelative(-0.11f, -2.29f, 1.51f, -4.06f, 3.13f, -5.44f)
                curveToRelative(0f, 0f, -1.13f, -0.56f, -3.13f, -0.56f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(2f, 0f, 3.13f, -0.56f, 3.13f, -0.56f)
                curveToRelative(-1.62f, -1.39f, -3.24f, -3.15f, -3.13f, -5.44f)
                close()
            }
        }.also { _NightMode = it}
