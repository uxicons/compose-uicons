package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandshakeAngle: ImageVector? = null

val Icons.Ts.HandshakeAngle: ImageVector
    get() = _HandshakeAngle ?: UXIcon(name = "HandshakeAngle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.94f, 9.88f)
                lineToRelative(-0.69f, -0.73f)
                lineToRelative(-2.03f, 1.84f)
                horizontalLineTo(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(7.1f)
                curveToRelative(0f, -1.6f, 1.08f, -2.99f, 2.62f, -3.39f)
                lineToRelative(4.88f, -1.26f)
                lineToRelative(1.69f, -1.69f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-4.61f, 1.19f)
                curveToRelative(-1.96f, 0.5f, -3.33f, 2.25f, -3.37f, 4.26f)
                horizontalLineToRelative(-0.9f)
                curveToRelative(-2.05f, 0f, -3.84f, 1.39f, -4.36f, 3.38f)
                lineToRelative(-1.19f, 4.61f)
                lineTo(0.04f, 16.5f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(1.71f, -1.71f)
                lineToRelative(1.26f, -4.88f)
                curveToRelative(0.4f, -1.55f, 1.79f, -2.62f, 3.39f, -2.62f)
                horizontalLineToRelative(0.9f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(7.58f)
                lineToRelative(-1.82f, 6.46f)
                curveToRelative(-0.42f, 1.49f, -1.8f, 2.54f, -3.35f, 2.55f)
                horizontalLineToRelative(-5.13f)
                reflectiveCurveToRelative(-2.15f, 2.22f, -2.15f, 2.22f)
                lineToRelative(0.72f, 0.69f)
                lineToRelative(1.85f, -1.92f)
                horizontalLineToRelative(4.71f)
                curveToRelative(2f, 0f, 3.77f, -1.35f, 4.31f, -3.27f)
                lineToRelative(1.89f, -6.73f)
                lineToRelative(2.32f, -2.12f)
                close()
            }
        }.also { _HandshakeAngle = it}
