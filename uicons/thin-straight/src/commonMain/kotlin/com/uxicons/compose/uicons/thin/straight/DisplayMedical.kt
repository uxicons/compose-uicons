package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayMedical: ImageVector? = null

val Icons.Ts.DisplayMedical: ImageVector
    get() = _DisplayMedical ?: UXIcon(name = "DisplayMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                lineTo(1f, 18f)
                lineTo(1f, 4.5f)
                close()
                moveTo(12.5f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _DisplayMedical = it}
