package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Columns3: ImageVector? = null

val Icons.Ts.Columns3: ImageVector
    get() = _Columns3 ?: UXIcon(name = "Columns3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7f, 21f)
                lineTo(1f, 21f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(18f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(18f)
                close()
                moveTo(23f, 21f)
                horizontalLineToRelative(-6f)
                lineTo(17f, 3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
            }
        }.also { _Columns3 = it}
