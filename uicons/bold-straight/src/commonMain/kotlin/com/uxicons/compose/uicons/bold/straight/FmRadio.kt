package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FmRadio: ImageVector? = null

val Icons.Bs.FmRadio: ImageVector
    get() = _FmRadio ?: UXIcon(name = "FmRadio") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 6f)
                lineTo(12.13f, 6f)
                lineToRelative(8.95f, -3.08f)
                lineTo(20.11f, 0.08f)
                lineTo(2.28f, 6.22f)
                lineToRelative(0.0f, 0.01f)
                curveToRelative(-1.33f, 0.5f, -2.28f, 1.77f, -2.28f, 3.27f)
                verticalLineToRelative(14.5f)
                lineTo(24f, 24.0f)
                lineTo(24f, 9.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 9.5f)
                curveToRelative(-0.0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                lineTo(6f, 11f)
                close()
                moveTo(17.49f, 12f)
                lineToRelative(0.51f, 7f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-0.32f, -4.4f)
                lineToRelative(-1.58f, 3.47f)
                lineToRelative(-1.58f, -3.47f)
                lineToRelative(-0.32f, 4.4f)
                horizontalLineToRelative(-1.6f)
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
