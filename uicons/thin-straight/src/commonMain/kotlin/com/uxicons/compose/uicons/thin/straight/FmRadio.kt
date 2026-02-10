package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FmRadio: ImageVector? = null

val Icons.Ts.FmRadio: ImageVector
    get() = _FmRadio ?: UXIcon(name = "FmRadio") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 7f)
                lineTo(4.93f, 7f)
                lineTo(21.2f, 0.96f)
                lineToRelative(-0.35f, -0.94f)
                lineTo(1.59f, 7.17f)
                verticalLineToRelative(0.0f)
                curveToRelative(-0.93f, 0.36f, -1.59f, 1.26f, -1.59f, 2.32f)
                verticalLineToRelative(14.5f)
                lineTo(24f, 24f)
                lineTo(24f, 9.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 8f)
                lineTo(21.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(1f, 10f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                lineTo(1f, 11f)
                lineTo(23f, 11f)
                verticalLineToRelative(12f)
                lineTo(1f, 23f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                lineTo(6f, 13f)
                close()
                moveTo(17.99f, 14f)
                lineToRelative(0.51f, 7f)
                horizontalLineToRelative(-1.04f)
                lineToRelative(-0.45f, -6.79f)
                lineToRelative(-1.09f, 2.41f)
                lineToRelative(-0.91f, 2.0f)
                lineToRelative(-0.91f, -2.0f)
                lineToRelative(-1.09f, -2.41f)
                lineToRelative(-0.53f, 6.79f)
                horizontalLineToRelative(-0.96f)
                lineToRelative(0.51f, -7f)
                curveToRelative(0.04f, -0.7f, 0.47f, -1f, 0.99f, -1f)
                curveToRelative(0.34f, 0f, 0.66f, 0.24f, 0.84f, 0.64f)
                lineToRelative(1.16f, 2.56f)
                lineToRelative(1.16f, -2.56f)
                curveToRelative(0.18f, -0.4f, 0.5f, -0.64f, 0.84f, -0.64f)
                curveToRelative(0.52f, 0f, 0.94f, 0.29f, 0.99f, 1f)
                close()
            }
        }.also { _FmRadio = it}
