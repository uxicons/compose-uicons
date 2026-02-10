package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microwave: ImageVector? = null

val Icons.Bs.Microwave: ImageVector
    get() = _Microwave ?: UXIcon(name = "Microwave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                lineTo(24f, 5.5f)
                close()
                moveTo(21f, 18f)
                lineTo(3f, 18f)
                lineTo(3f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(5f, 7f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                lineTo(5f, 16f)
                lineTo(5f, 7f)
                close()
                moveTo(16f, 7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 7f)
                close()
            }
        }.also { _Microwave = it}
