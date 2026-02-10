package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusinessValue: ImageVector? = null

val Icons.Ss.BusinessValue: ImageVector
    get() = _BusinessValue ?: UXIcon(name = "BusinessValue") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 17f)
                lineToRelative(-6f, 7f)
                lineToRelative(2.06f, -6f)
                horizontalLineToRelative(-4.12f)
                lineToRelative(2.06f, 6f)
                lineToRelative(-6.0f, -7.0f)
                lineToRelative(3f, -4f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-1.13f, 3f)
                horizontalLineToRelative(4f)
                lineToRelative(-1.13f, -3f)
                horizontalLineToRelative(2.13f)
                lineToRelative(3f, 4f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(9.44f, 17.08f)
                lineTo(12.5f, 13f)
                horizontalLineToRelative(-12.5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(15.36f)
                close()
            }
        }.also { _BusinessValue = it}
