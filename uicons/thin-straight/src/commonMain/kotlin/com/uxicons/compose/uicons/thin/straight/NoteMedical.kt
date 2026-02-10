package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteMedical: ImageVector? = null

val Icons.Ts.NoteMedical: ImageVector
    get() = _NoteMedical ?: UXIcon(name = "NoteMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(16.71f)
                lineToRelative(7.29f, -7.29f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                close()
                moveTo(22.29f, 17f)
                lineToRelative(-5.29f, 5.29f)
                verticalLineToRelative(-5.29f)
                horizontalLineToRelative(5.29f)
                close()
                moveTo(11.5f, 17f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _NoteMedical = it}
