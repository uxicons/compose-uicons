package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lift: ImageVector? = null

val Icons.Ss.Lift: ImageVector
    get() = _Lift ?: UXIcon(name = "Lift") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 16f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(6f)
                close()
                moveTo(21f, 8f)
                lineTo(18f, 11f)
                horizontalLineToRelative(6f)
                close()
                moveTo(9f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(9f)
                close()
                moveTo(20f, 6.17f)
                verticalLineToRelative(-3.17f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-6.17f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(-3.66f)
                lineToRelative(4f, -4f)
                close()
            }
        }.also { _Lift = it}
