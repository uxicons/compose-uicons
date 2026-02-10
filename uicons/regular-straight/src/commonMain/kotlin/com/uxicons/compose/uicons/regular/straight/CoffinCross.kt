package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffinCross: ImageVector? = null

val Icons.Rs.CoffinCross: ImageVector
    get() = _CoffinCross ?: UXIcon(name = "CoffinCross") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.93f, 1.89f)
                curveToRelative(-0.46f, -1.15f, -1.55f, -1.89f, -2.79f, -1.89f)
                lineTo(7.85f, 0f)
                curveToRelative(-1.23f, 0f, -2.33f, 0.74f, -2.79f, 1.89f)
                lineToRelative(-2.61f, 6.52f)
                lineToRelative(3.23f, 15.59f)
                horizontalLineToRelative(12.63f)
                lineToRelative(3.23f, -15.59f)
                lineToRelative(-2.61f, -6.52f)
                close()
                moveTo(16.69f, 22f)
                lineTo(7.31f, 22f)
                lineToRelative(-2.77f, -13.41f)
                lineToRelative(2.39f, -5.96f)
                curveToRelative(0.15f, -0.38f, 0.52f, -0.63f, 0.93f, -0.63f)
                horizontalLineToRelative(8.29f)
                curveToRelative(0.41f, 0f, 0.78f, 0.25f, 0.93f, 0.63f)
                lineToRelative(2.39f, 5.96f)
                lineToRelative(-2.77f, 13.41f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _CoffinCross = it}
