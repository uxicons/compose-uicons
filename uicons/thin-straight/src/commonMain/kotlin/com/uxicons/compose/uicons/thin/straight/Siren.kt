package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Siren: ImageVector? = null

val Icons.Ts.Siren: ImageVector
    get() = _Siren ?: UXIcon(name = "Siren") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.15f, 4f)
                horizontalLineToRelative(3.85f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.92f)
                lineToRelative(-0.29f, 3f)
                horizontalLineToRelative(-1.02f)
                lineToRelative(0.39f, -4f)
                close()
                moveTo(24f, 21.52f)
                verticalLineToRelative(2.48f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2.48f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.17f)
                lineToRelative(1.5f, -15.63f)
                curveToRelative(0.24f, -1.94f, 1.89f, -3.39f, 3.83f, -3.39f)
                horizontalLineToRelative(8f)
                curveToRelative(1.94f, 0f, 3.58f, 1.45f, 3.82f, 3.38f)
                lineToRelative(1.5f, 15.64f)
                horizontalLineToRelative(0.17f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(3.68f, 19.02f)
                horizontalLineToRelative(16.65f)
                lineToRelative(-1.49f, -15.53f)
                curveToRelative(-0.18f, -1.41f, -1.39f, -2.48f, -2.83f, -2.48f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.44f, 0f, -2.65f, 1.07f, -2.83f, 2.5f)
                lineToRelative(-1.49f, 15.52f)
                close()
                moveTo(23f, 21.52f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 20.02f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.48f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-1.48f)
                close()
            }
        }.also { _Siren = it}
