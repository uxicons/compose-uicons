package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screw: ImageVector? = null

val Icons.Rs.Screw: ImageVector
    get() = _Screw ?: UXIcon(name = "Screw") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(3.91f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(14.06f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                lineTo(15f, 6.91f)
                lineToRelative(3f, -3f)
                lineTo(18f, 0f)
                close()
                moveTo(11f, 13.41f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(2.68f)
                lineToRelative(-2f, 2.07f)
                verticalLineToRelative(-2.75f)
                close()
                moveTo(13f, 8.59f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-3.59f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.59f)
                close()
                moveTo(12f, 21.14f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-1.09f)
                lineToRelative(2f, -2.07f)
                verticalLineToRelative(3.17f)
                lineToRelative(-1f, 1f)
                close()
                moveTo(16f, 3.09f)
                lineToRelative(-1.91f, 1.91f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(-1.91f, -1.91f)
                verticalLineToRelative(-1.09f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1.09f)
                close()
            }
        }.also { _Screw = it}
