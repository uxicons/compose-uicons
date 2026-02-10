package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Siren: ImageVector? = null

val Icons.Rs.Siren: ImageVector
    get() = _Siren ?: UXIcon(name = "Siren") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.12f, 17.0f)
                lineToRelative(-1.3f, -13.5f)
                curveToRelative(-0.25f, -2.0f, -1.96f, -3.5f, -3.97f, -3.5f)
                horizontalLineToRelative(-7.7f)
                curveToRelative(-2.01f, 0f, -3.72f, 1.51f, -3.97f, 3.53f)
                lineToRelative(-1.3f, 13.47f)
                curveToRelative(-1.6f, 0.06f, -2.88f, 1.38f, -2.88f, 3.0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.61f, -1.28f, -2.93f, -2.88f, -3.0f)
                close()
                moveTo(6.16f, 3.75f)
                curveToRelative(0.12f, -1.0f, 0.98f, -1.75f, 1.99f, -1.75f)
                horizontalLineToRelative(7.7f)
                curveToRelative(1.01f, 0f, 1.86f, 0.75f, 1.98f, 1.72f)
                lineToRelative(1.28f, 13.28f)
                lineTo(4.89f, 17f)
                lineToRelative(1.27f, -13.25f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(9.77f, 8f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(0.39f, -4f)
                horizontalLineToRelative(3.85f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-0.19f, 2f)
                close()
            }
        }.also { _Siren = it}
