package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Tr.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 22f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(0.39f, 17.09f)
                curveToRelative(-0.26f, -0.51f, -0.39f, -1.04f, -0.39f, -1.59f)
                curveToRelative(0f, -0.74f, 0.24f, -1.45f, 0.69f, -2.06f)
                lineTo(9.2f, 3.4f)
                curveToRelative(0.64f, -0.88f, 1.67f, -1.4f, 2.8f, -1.4f)
                curveToRelative(1.12f, 0f, 2.15f, 0.52f, 2.81f, 1.42f)
                lineToRelative(8.48f, 9.99f)
                curveToRelative(0.82f, 1.11f, 0.93f, 2.48f, 0.32f, 3.68f)
                curveToRelative(-0.61f, 1.2f, -1.77f, 1.92f, -3.12f, 1.92f)
                lineToRelative(-16.98f, 0.01f)
                curveToRelative(-1.35f, 0f, -2.51f, -0.72f, -3.12f, -1.92f)
                close()
                moveTo(1f, 15.5f)
                curveToRelative(0f, 0.39f, 0.09f, 0.78f, 0.28f, 1.14f)
                curveToRelative(0.43f, 0.86f, 1.27f, 1.37f, 2.23f, 1.37f)
                lineToRelative(16.98f, -0.01f)
                curveToRelative(0.96f, 0f, 1.79f, -0.51f, 2.23f, -1.37f)
                curveToRelative(0.43f, -0.86f, 0.35f, -1.83f, -0.21f, -2.61f)
                lineTo(14.02f, 4.02f)
                curveToRelative(-0.47f, -0.65f, -1.21f, -1.02f, -2.02f, -1.02f)
                reflectiveCurveToRelative(-1.54f, 0.37f, -2.02f, 1.02f)
                lineTo(1.47f, 14.06f)
                curveToRelative(-0.3f, 0.41f, -0.47f, 0.92f, -0.47f, 1.44f)
                close()
            }
        }.also { _Eject = it}
