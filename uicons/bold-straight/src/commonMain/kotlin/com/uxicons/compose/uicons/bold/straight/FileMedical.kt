package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileMedical: ImageVector? = null

val Icons.Bs.FileMedical: ImageVector
    get() = _FileMedical ?: UXIcon(name = "FileMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 12.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(22f, 5.67f)
                verticalLineToRelative(18.34f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.67f)
                close()
                moveTo(19f, 21f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _FileMedical = it}
