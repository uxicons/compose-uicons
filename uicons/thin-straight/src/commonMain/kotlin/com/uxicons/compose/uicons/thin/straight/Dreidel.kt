package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dreidel: ImageVector? = null

val Icons.Ts.Dreidel: ImageVector
    get() = _Dreidel ?: UXIcon(name = "Dreidel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.86f, 0.85f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(15.12f, 8.18f)
                lineTo(10.12f, 3.18f)
                lineTo(0f, 13.29f)
                verticalLineToRelative(7.21f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7.21f)
                lineToRelative(10.12f, -10.12f)
                lineToRelative(-5f, -5f)
                lineTo(23.86f, 0.85f)
                close()
                moveTo(1f, 20.5f)
                verticalLineToRelative(-5.39f)
                curveToRelative(1.09f, 1.09f, 2.75f, 1.89f, 3.94f, 1.89f)
                curveToRelative(1.01f, 0f, 1.82f, -0.18f, 2.47f, -0.42f)
                curveToRelative(-0.24f, 0.65f, -0.42f, 1.44f, -0.42f, 2.42f)
                curveToRelative(0f, 1.22f, 0.61f, 2.81f, 1.91f, 4f)
                lineTo(3.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(10.42f, 22.87f)
                curveToRelative(-1.58f, -0.94f, -2.42f, -2.62f, -2.42f, -3.87f)
                curveToRelative(0f, -2.0f, 0.8f, -3.09f, 1.27f, -3.57f)
                lineToRelative(2.95f, -2.95f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-2.95f, 2.95f)
                curveToRelative(-0.3f, 0.3f, -1.44f, 1.27f, -3.62f, 1.27f)
                curveToRelative(-1.19f, 0f, -3.22f, -1.2f, -3.84f, -2.4f)
                lineTo(10.12f, 4.59f)
                lineToRelative(9.29f, 9.29f)
                lineToRelative(-8.99f, 8.99f)
                close()
            }
        }.also { _Dreidel = it}
