package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandshakeSimpleSlash: ImageVector? = null

val Icons.Ss.HandshakeSimpleSlash: ImageVector
    get() = _HandshakeSimpleSlash ?: UXIcon(name = "HandshakeSimpleSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.42f, 7.95f)
                lineToRelative(0.82f, -0.79f)
                lineToRelative(-1.38f, -1.45f)
                lineToRelative(-3.44f, 3.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.13f, -1.08f)
                lineToRelative(7.21f, 7.13f)
                lineToRelative(-1.28f, 1.02f)
                lineToRelative(5.06f, 5.06f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineTo(3.7f, 2.29f)
                lineToRelative(1.01f, -0.76f)
                curveToRelative(0.69f, -0.34f, 1.46f, -0.53f, 2.23f, -0.53f)
                curveToRelative(1.28f, 0f, 2.47f, 0.46f, 3.39f, 1.3f)
                lineToRelative(0.62f, 0.59f)
                lineToRelative(-3.36f, 3.28f)
                lineToRelative(1.41f, 1.41f)
                lineTo(14.65f, 2.07f)
                curveToRelative(1.51f, -1.17f, 3.62f, -1.39f, 5.31f, -0.55f)
                lineToRelative(3.05f, 1.52f)
                lineToRelative(1f, -0.05f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-1.36f)
                lineTo(14.42f, 7.95f)
                close()
                moveTo(0f, 16f)
                horizontalLineTo(3.08f)
                lineToRelative(8.92f, 7f)
                lineToRelative(3.73f, -2.98f)
                lineTo(0f, 4.3f)
                verticalLineToRelative(11.7f)
                close()
            }
        }.also { _HandshakeSimpleSlash = it}
