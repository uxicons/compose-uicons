package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Columns3: ImageVector? = null

val Icons.Ss.Columns3: ImageVector
    get() = _Columns3 ?: UXIcon(name = "Columns3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(20f)
                close()
                moveTo(9f, 22f)
                horizontalLineToRelative(6f)
                lineTo(15f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(20f)
                close()
                moveTo(21f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(7f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _Columns3 = it}
