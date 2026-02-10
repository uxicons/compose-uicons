package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildAlt: ImageVector? = null

val Icons.Ss.BuildAlt: ImageVector
    get() = _BuildAlt ?: UXIcon(name = "BuildAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                horizontalLineToRelative(-11f)
                lineTo(13f, 0f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                close()
                moveTo(7f, 8f)
                lineTo(7f, 2f)
                lineTo(2f, 2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(7f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6f)
                close()
                moveTo(18f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(6f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(11f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-6f)
                close()
                moveTo(13f, 10f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-11f)
                close()
            }
        }.also { _BuildAlt = it}
