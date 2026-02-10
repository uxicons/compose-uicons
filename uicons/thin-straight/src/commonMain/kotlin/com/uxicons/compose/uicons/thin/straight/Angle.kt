package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angle: ImageVector? = null

val Icons.Ts.Angle: ImageVector
    get() = _Angle ?: UXIcon(name = "Angle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.44f, 16.2f)
                lineToRelative(0.95f, -0.35f)
                curveToRelative(0.4f, 1.65f, 0.61f, 3.38f, 0.61f, 5.15f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -0.2f, -3.25f, -0.56f, -4.79f)
                close()
                moveTo(20.82f, 13.93f)
                curveToRelative(-0.63f, -1.86f, -1.5f, -3.6f, -2.58f, -5.2f)
                lineToRelative(-0.76f, 0.68f)
                curveToRelative(1.0f, 1.5f, 1.81f, 3.13f, 2.4f, 4.87f)
                lineToRelative(0.94f, -0.35f)
                close()
                moveTo(2.08f, 23f)
                curveToRelative(-0.38f, 0f, -0.73f, -0.2f, -0.92f, -0.53f)
                curveToRelative(-0.2f, -0.33f, -0.2f, -0.73f, -0.02f, -1.06f)
                lineTo(12.52f, 0.52f)
                lineToRelative(-0.88f, -0.48f)
                lineTo(0.26f, 20.93f)
                curveToRelative(-0.35f, 0.65f, -0.34f, 1.42f, 0.04f, 2.05f)
                curveToRelative(0.38f, 0.64f, 1.04f, 1.01f, 1.78f, 1.01f)
                horizontalLineToRelative(21.92f)
                verticalLineToRelative(-1f)
                lineTo(2.08f, 23.0f)
                close()
                moveTo(16.29f, 7.8f)
                lineToRelative(0.76f, -0.68f)
                curveToRelative(-1.12f, -1.38f, -2.41f, -2.62f, -3.83f, -3.69f)
                lineToRelative(-0.49f, 0.91f)
                curveToRelative(1.32f, 1.01f, 2.52f, 2.18f, 3.57f, 3.47f)
                close()
            }
        }.also { _Angle = it}
