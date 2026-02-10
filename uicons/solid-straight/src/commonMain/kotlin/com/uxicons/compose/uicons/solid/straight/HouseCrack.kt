package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCrack: ImageVector? = null

val Icons.Ss.HouseCrack: ImageVector
    get() = _HouseCrack ?: UXIcon(name = "HouseCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 7.68f)
                lineTo(13.85f, 0.64f)
                curveToRelative(-1.09f, -0.85f, -2.61f, -0.85f, -3.7f, 0f)
                lineTo(1.15f, 7.68f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.44f, -1.15f, 2.36f)
                verticalLineToRelative(13.96f)
                horizontalLineTo(9.18f)
                lineToRelative(1.96f, -5f)
                horizontalLineToRelative(-3.23f)
                curveToRelative(-0.72f, 0f, -1.15f, -0.8f, -0.75f, -1.41f)
                lineToRelative(5.65f, -8.59f)
                horizontalLineToRelative(1.2f)
                lineToRelative(-1.83f, 6f)
                horizontalLineToRelative(3.9f)
                curveToRelative(0.62f, 0f, 1.06f, 0.6f, 0.88f, 1.19f)
                lineToRelative(-2.62f, 7.81f)
                horizontalLineToRelative(9.66f)
                verticalLineTo(10.04f)
                curveToRelative(0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
            }
        }.also { _HouseCrack = it}
