package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Ts.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.82f, 12f)
                lineTo(6.13f, 12f)
                lineToRelative(-3.85f, 8.22f)
                curveToRelative(-0.41f, 0.81f, -0.36f, 1.76f, 0.11f, 2.54f)
                curveToRelative(0.48f, 0.78f, 1.31f, 1.24f, 2.22f, 1.24f)
                horizontalLineToRelative(14.77f)
                curveToRelative(0.91f, 0f, 1.74f, -0.46f, 2.22f, -1.24f)
                curveToRelative(0.48f, -0.78f, 0.52f, -1.73f, 0.12f, -2.53f)
                lineToRelative(-3.91f, -8.23f)
                close()
                moveTo(20.76f, 22.23f)
                curveToRelative(-0.3f, 0.48f, -0.81f, 0.77f, -1.37f, 0.77f)
                lineTo(4.61f, 23f)
                curveToRelative(-0.56f, 0f, -1.07f, -0.29f, -1.37f, -0.77f)
                curveToRelative(-0.3f, -0.48f, -0.32f, -1.06f, -0.06f, -1.58f)
                lineToRelative(3.59f, -7.66f)
                horizontalLineToRelative(10.41f)
                lineToRelative(3.64f, 7.67f)
                curveToRelative(0.25f, 0.5f, 0.23f, 1.09f, -0.07f, 1.57f)
                close()
                moveTo(22.0f, 2.5f)
                verticalLineToRelative(13.65f)
                lineToRelative(-1f, -2.11f)
                lineTo(21.0f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(3f, 13.97f)
                lineToRelative(-1f, 2.13f)
                lineTo(2f, 2.5f)
                curveTo(2f, 1.12f, 3.12f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _RampLoading = it}
