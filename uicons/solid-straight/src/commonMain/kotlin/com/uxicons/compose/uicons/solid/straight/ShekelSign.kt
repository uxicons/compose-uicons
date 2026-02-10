package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShekelSign: ImageVector? = null

val Icons.Ss.ShekelSign: ImageVector
    get() = _ShekelSign ?: UXIcon(name = "ShekelSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                horizontalLineToRelative(-6f)
                lineTo(8f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(4f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                lineTo(20f, 0f)
                horizontalLineToRelative(2f)
                lineTo(22f, 16f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                close()
                moveTo(4f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 0f)
                horizontalLineToRelative(6f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 8f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                lineTo(4f, 2f)
                lineTo(4f, 24f)
                close()
            }
        }.also { _ShekelSign = it}
