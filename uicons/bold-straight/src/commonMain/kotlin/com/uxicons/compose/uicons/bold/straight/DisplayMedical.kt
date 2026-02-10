package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayMedical: ImageVector? = null

val Icons.Bs.DisplayMedical: ImageVector
    get() = _DisplayMedical ?: UXIcon(name = "DisplayMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18f)
                lineTo(24f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(3f, 4f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(11f)
                lineTo(3f, 15f)
                lineTo(3f, 4f)
                close()
                moveTo(13.5f, 8f)
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
            }
        }.also { _DisplayMedical = it}
