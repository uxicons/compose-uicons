package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glucose: ImageVector? = null

val Icons.Ts.Glucose: ImageVector
    get() = _Glucose ?: UXIcon(name = "Glucose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.82f, 11.23f)
                curveToRelative(-0.51f, -0.3f, -1.14f, -0.3f, -1.65f, 0f)
                lineToRelative(-5.18f, 3.11f)
                verticalLineToRelative(6.45f)
                lineToRelative(5.18f, 3.1f)
                curveToRelative(0.51f, 0.3f, 1.14f, 0.31f, 1.65f, 0f)
                lineToRelative(5.18f, -3.1f)
                verticalLineToRelative(-6.45f)
                close()
                moveTo(17.69f, 12.09f)
                curveToRelative(0.19f, -0.12f, 0.43f, -0.11f, 0.62f, 0f)
                lineToRelative(4.22f, 2.53f)
                lineToRelative(-4.53f, 2.72f)
                lineToRelative(-4.53f, -2.72f)
                lineToRelative(4.22f, -2.53f)
                close()
                moveTo(13f, 20.22f)
                verticalLineToRelative(-4.72f)
                lineToRelative(4.5f, 2.7f)
                verticalLineToRelative(4.72f)
                close()
                moveTo(18.5f, 22.92f)
                verticalLineToRelative(-4.72f)
                lineToRelative(4.5f, -2.7f)
                verticalLineToRelative(4.72f)
                lineToRelative(-4.5f, 2.7f)
                close()
                moveTo(11.56f, 22.85f)
                lineTo(12.79f, 23.59f)
                curveToRelative(-0.9f, 0.26f, -1.84f, 0.41f, -2.79f, 0.41f)
                curveToRelative(-5.51f, 0.0f, -10.0f, -4.48f, -10.0f, -10.0f)
                curveToRelative(0.04f, -4.99f, 6.23f, -10.77f, 9.94f, -13.86f)
                curveToRelative(3.11f, 2.31f, 6.31f, 5.67f, 8.34f, 8.88f)
                curveToRelative(-0.38f, -0.03f, -0.76f, -0.0f, -1.13f, 0.09f)
                curveToRelative(-1.92f, -2.96f, -4.95f, -5.83f, -7.15f, -7.71f)
                curveToRelative(-2.99f, 2.55f, -9.0f, 8.2f, -9.0f, 12.61f)
                curveToRelative(0f, 4.96f, 4.04f, 9.0f, 9.0f, 9.0f)
                curveToRelative(0.53f, 0f, 1.05f, -0.06f, 1.56f, -0.15f)
                close()
            }
        }.also { _Glucose = it}
