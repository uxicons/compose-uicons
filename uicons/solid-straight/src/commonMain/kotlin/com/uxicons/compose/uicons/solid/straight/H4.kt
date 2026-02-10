package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H4: ImageVector? = null

val Icons.Ss.H4: ImageVector
    get() = _H4 ?: UXIcon(name = "H4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                lineTo(2f, 13f)
                verticalLineToRelative(7f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-7f)
                close()
                moveTo(22f, 4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(16f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(24f, 4f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _H4 = it}
