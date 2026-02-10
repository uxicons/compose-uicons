package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UiUx: ImageVector? = null

val Icons.Bs.UiUx: ImageVector
    get() = _UiUx ?: UXIcon(name = "UiUx") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(0f, 13.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(24f)
                close()
                moveTo(8.5f, 9f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(12f, 0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(5.33f)
                curveToRelative(0f, 0.64f, -0.36f, 1.17f, -1f, 1.17f)
                reflectiveCurveToRelative(-1f, -0.52f, -1f, -1.17f)
                lineTo(7.5f, 0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(10.5f, 20.33f)
                curveToRelative(0f, 0.64f, -0.36f, 1.17f, -1f, 1.17f)
                reflectiveCurveToRelative(-1f, -0.52f, -1f, -1.17f)
                verticalLineToRelative(-5.33f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(5.33f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(9f)
                close()
                moveTo(15.45f, 9f)
                lineToRelative(0.81f, -1.59f)
                lineToRelative(0.81f, 1.59f)
                horizontalLineToRelative(2.94f)
                lineToRelative(-2.27f, -4.5f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(2.27f, -4.49f)
                horizontalLineToRelative(-2.94f)
                lineToRelative(-0.8f, 1.58f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(-0.8f, -1.58f)
                horizontalLineToRelative(-2.94f)
                lineToRelative(2.27f, 4.49f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(-2.27f, 4.5f)
                horizontalLineToRelative(2.94f)
                close()
            }
        }.also { _UiUx = it}
