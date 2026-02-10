package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffinCross: ImageVector? = null

val Icons.Bs.CoffinCross: ImageVector
    get() = _CoffinCross ?: UXIcon(name = "CoffinCross") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.15f, 0f)
                lineTo(7.85f, 0f)
                curveToRelative(-1.43f, 0f, -2.72f, 0.87f, -3.25f, 2.2f)
                lineToRelative(-2.67f, 6.67f)
                lineToRelative(3.36f, 15.13f)
                horizontalLineToRelative(13.41f)
                lineToRelative(3.36f, -15.13f)
                lineToRelative(-2.67f, -6.67f)
                curveToRelative(-0.53f, -1.33f, -1.82f, -2.2f, -3.25f, -2.2f)
                close()
                moveTo(16.3f, 21f)
                lineTo(7.7f, 21f)
                lineToRelative(-2.64f, -11.87f)
                lineToRelative(2.45f, -6.13f)
                horizontalLineToRelative(8.97f)
                lineToRelative(2.45f, 6.13f)
                lineToRelative(-2.64f, 11.87f)
                close()
                moveTo(13.5f, 8.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _CoffinCross = it}
