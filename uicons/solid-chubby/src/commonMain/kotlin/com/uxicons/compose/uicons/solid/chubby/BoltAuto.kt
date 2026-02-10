package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoltAuto: ImageVector? = null

val Icons.Sc.BoltAuto: ImageVector
    get() = _BoltAuto ?: UXIcon(name = "BoltAuto") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.9f, 16.82f)
                curveToRelative(-1.02f, -2.71f, -2.05f, -4.03f, -2.25f, -4.27f)
                curveToRelative(-0.57f, -0.69f, -1.74f, -0.69f, -2.31f, 0f)
                curveToRelative(-0.2f, 0.24f, -1.23f, 1.56f, -2.25f, 4.27f)
                curveToRelative(-1.07f, 2.85f, -1.1f, 4.51f, -1.1f, 4.69f)
                curveToRelative(0.0f, 0.82f, 0.67f, 1.48f, 1.49f, 1.49f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.82f, 0f, 1.49f, -0.66f, 1.5f, -1.48f)
                curveToRelative(0f, -0.01f, 0.01f, -0.18f, 0.05f, -0.51f)
                horizontalLineToRelative(2.9f)
                curveToRelative(0.04f, 0.32f, 0.05f, 0.49f, 0.05f, 0.49f)
                curveToRelative(-0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.18f, -0.03f, -1.84f, -1.1f, -4.69f)
                close()
                moveTo(17.86f, 18f)
                curveToRelative(0.2f, -0.56f, 0.44f, -1.11f, 0.64f, -1.55f)
                curveToRelative(0.2f, 0.43f, 0.44f, 0.99f, 0.64f, 1.55f)
                close()
                moveTo(15.96f, 10.29f)
                curveToRelative(-0.7f, 2.51f, -3.46f, 10.66f, -10.17f, 12.67f)
                curveToRelative(-0.66f, 0.22f, -1.39f, -0.39f, -1.28f, -1.08f)
                lineToRelative(0.86f, -6.88f)
                horizontalLineToRelative(-3.37f)
                curveToRelative(-0.65f, 0.02f, -1.16f, -0.67f, -0.96f, -1.29f)
                curveToRelative(0.7f, -2.51f, 3.46f, -10.66f, 10.17f, -12.67f)
                curveToRelative(0.66f, -0.22f, 1.39f, 0.39f, 1.28f, 1.08f)
                lineToRelative(-0.86f, 6.88f)
                horizontalLineToRelative(3.37f)
                curveToRelative(0.65f, -0.02f, 1.16f, 0.67f, 0.96f, 1.29f)
                close()
            }
        }.also { _BoltAuto = it}
