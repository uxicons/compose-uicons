package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microwave: ImageVector? = null

val Icons.Ss.Microwave: ImageVector
    get() = _Microwave ?: UXIcon(name = "Microwave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 16f)
                lineTo(5f, 16f)
                lineTo(5f, 7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(9f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                lineTo(5f, 21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                lineTo(0f, 21f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(17f, 5f)
                lineTo(3f, 5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(14f)
                lineTo(17f, 5f)
                close()
                moveTo(21f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                lineTo(21f, 5f)
                close()
            }
        }.also { _Microwave = it}
