package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayCode: ImageVector? = null

val Icons.Ts.DisplayCode: ImageVector
    get() = _DisplayCode ?: UXIcon(name = "DisplayCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 1f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(11.5f, 19f)
                verticalLineToRelative(3f)
                lineTo(6f, 22f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(1f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                lineTo(1f, 18f)
                lineTo(1f, 3.5f)
                close()
                moveTo(6.15f, 9.65f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.75f, 3.75f)
                close()
                moveTo(18.56f, 8.94f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.54f, 0f, 2.12f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.75f, -3.75f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.75f, 3.75f)
                close()
            }
        }.also { _DisplayCode = it}
