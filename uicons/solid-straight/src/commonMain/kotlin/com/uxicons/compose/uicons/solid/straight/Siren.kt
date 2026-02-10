package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Siren: ImageVector? = null

val Icons.Ss.Siren: ImageVector
    get() = _Siren ?: UXIcon(name = "Siren") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                close()
                moveTo(21.22f, 18f)
                lineToRelative(-1.4f, -14.5f)
                curveToRelative(-0.25f, -2.0f, -1.96f, -3.5f, -3.97f, -3.5f)
                horizontalLineToRelative(-7.7f)
                curveToRelative(-2.01f, 0f, -3.72f, 1.51f, -3.97f, 3.53f)
                lineToRelative(-1.39f, 14.47f)
                horizontalLineToRelative(18.43f)
                close()
                moveTo(8.15f, 4f)
                horizontalLineToRelative(3.85f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-0.19f, 2f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(0.39f, -4f)
                close()
            }
        }.also { _Siren = it}
