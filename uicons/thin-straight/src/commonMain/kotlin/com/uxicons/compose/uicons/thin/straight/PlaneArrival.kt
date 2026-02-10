package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneArrival: ImageVector? = null

val Icons.Ts.PlaneArrival: ImageVector
    get() = _PlaneArrival ?: UXIcon(name = "PlaneArrival") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.68f, 11.55f)
                lineToRelative(18.05f, 8.61f)
                lineToRelative(1.05f, -2.41f)
                curveToRelative(0.28f, -0.64f, 0.29f, -1.35f, 0.04f, -2.0f)
                curveToRelative(-0.25f, -0.65f, -0.74f, -1.16f, -1.38f, -1.44f)
                lineToRelative(-3.38f, -1.65f)
                lineToRelative(-1.5f, -8.96f)
                curveToRelative(-0.08f, -0.95f, -0.68f, -1.78f, -1.56f, -2.17f)
                lineTo(11f, 0.24f)
                verticalLineTo(9.7f)
                lineToRelative(-3.83f, -1.87f)
                lineToRelative(-1.34f, -3.57f)
                curveToRelative(-0.19f, -0.48f, -0.57f, -0.88f, -1.05f, -1.09f)
                curveToRelative(-0.66f, -0.29f, -1.39f, -0.2f, -1.97f, 0.22f)
                curveToRelative(-0.58f, 0.42f, -0.88f, 1.1f, -0.8f, 1.81f)
                lineToRelative(0.67f, 6.35f)
                close()
                moveTo(12f, 1.76f)
                lineToRelative(1.61f, 0.69f)
                curveToRelative(0.54f, 0.24f, 0.91f, 0.75f, 0.96f, 1.38f)
                lineToRelative(1.39f, 8.29f)
                lineToRelative(-3.96f, -1.94f)
                verticalLineTo(1.76f)
                close()
                moveTo(3.4f, 4.19f)
                curveToRelative(0.29f, -0.21f, 0.65f, -0.25f, 0.97f, -0.11f)
                curveToRelative(0.24f, 0.1f, 0.43f, 0.3f, 0.52f, 0.54f)
                lineToRelative(1.48f, 3.94f)
                lineToRelative(13.66f, 6.67f)
                curveToRelative(0.4f, 0.17f, 0.7f, 0.49f, 0.85f, 0.89f)
                curveToRelative(0.16f, 0.4f, 0.15f, 0.84f, -0.03f, 1.23f)
                lineToRelative(-0.64f, 1.46f)
                lineTo(3.61f, 10.88f)
                lineToRelative(-0.61f, -5.8f)
                curveToRelative(-0.04f, -0.35f, 0.11f, -0.69f, 0.4f, -0.9f)
                close()
                moveTo(24f, 23.01f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineTo(24f)
                close()
            }
        }.also { _PlaneArrival = it}
