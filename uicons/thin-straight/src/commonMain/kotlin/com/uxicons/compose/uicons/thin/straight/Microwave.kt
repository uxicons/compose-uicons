package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microwave: ImageVector? = null

val Icons.Ts.Microwave: ImageVector
    get() = _Microwave ?: UXIcon(name = "Microwave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                lineTo(24f, 4.5f)
                close()
                moveTo(23f, 20f)
                lineTo(1f, 20f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(3f, 18f)
                horizontalLineToRelative(15f)
                lineTo(18f, 5f)
                lineTo(3f, 5f)
                verticalLineToRelative(13f)
                close()
                moveTo(4f, 6f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(11f)
                lineTo(4f, 17f)
                lineTo(4f, 6f)
                close()
                moveTo(20f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-1f)
                lineTo(20f, 5f)
                close()
            }
        }.also { _Microwave = it}
