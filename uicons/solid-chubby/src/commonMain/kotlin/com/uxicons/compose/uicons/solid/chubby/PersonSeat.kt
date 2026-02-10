package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSeat: ImageVector? = null

val Icons.Sc.PersonSeat: ImageVector
    get() = _PersonSeat ?: UXIcon(name = "PersonSeat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 3.5f)
                curveToRelative(0.03f, -1.85f, 1.09f, -2.49f, 2.5f, -2.5f)
                curveToRelative(1.4f, 0.01f, 2.47f, 0.68f, 2.5f, 2.5f)
                curveToRelative(-0.04f, 1.89f, -1.09f, 2.49f, -2.5f, 2.5f)
                curveToRelative(-1.4f, -0.01f, -2.47f, -0.61f, -2.5f, -2.5f)
                close()
                moveTo(14.5f, 19f)
                curveToRelative(-0.03f, -0.02f, -0.05f, 0f, -0.07f, 0f)
                curveToRelative(-4.64f, 0f, -7.49f, -0.54f, -8.74f, -0.85f)
                curveToRelative(-0.25f, -1.38f, -0.69f, -4.4f, -0.69f, -8.56f)
                curveToRelative(0f, -0.71f, 0.01f, -1.39f, 0.03f, -2.03f)
                curveToRelative(0.03f, -0.83f, -0.62f, -1.52f, -1.45f, -1.55f)
                curveToRelative(-0.83f, -0.05f, -1.52f, 0.62f, -1.55f, 1.45f)
                curveToRelative(-0.02f, 0.67f, -0.04f, 1.38f, -0.04f, 2.13f)
                curveToRelative(0f, 6.14f, 0.9f, 9.94f, 0.94f, 10.1f)
                curveToRelative(0.12f, 0.48f, 0.46f, 0.88f, 0.93f, 1.05f)
                curveToRelative(0.14f, 0.05f, 3.42f, 1.26f, 10.56f, 1.26f)
                curveToRelative(0.86f, -0.01f, 1.57f, -0.65f, 1.57f, -1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21.98f, 21.28f)
                curveToRelative(-0.02f, -0.14f, -0.54f, -3.49f, -2.38f, -6.78f)
                curveToRelative(-0.29f, -0.51f, -0.84f, -0.82f, -1.42f, -0.76f)
                curveToRelative(-0.03f, 0.0f, -3.23f, 0.25f, -4.96f, 0.26f)
                curveToRelative(-0.11f, -1.19f, -0.2f, -2.75f, -0.23f, -4.32f)
                curveToRelative(-0.02f, -1.48f, -1.24f, -2.68f, -2.71f, -2.68f)
                horizontalLineToRelative(-0.57f)
                curveToRelative(-1.47f, -0.03f, -2.77f, 1.27f, -2.71f, 2.74f)
                curveToRelative(0.02f, 1.4f, 0.1f, 2.92f, 0.22f, 4.29f)
                curveToRelative(0.12f, 1.41f, 1.23f, 2.55f, 2.62f, 2.72f)
                curveToRelative(1.03f, 0.14f, 2.0f, 0.21f, 3.25f, 0.24f)
                curveToRelative(1.22f, 0f, 3.15f, -0.12f, 4.32f, -0.2f)
                curveToRelative(1.22f, 2.51f, 1.6f, 4.9f, 1.6f, 4.93f)
                curveToRelative(0.12f, 0.82f, 0.91f, 1.39f, 1.71f, 1.26f)
                curveToRelative(0.82f, -0.12f, 1.38f, -0.89f, 1.26f, -1.71f)
                close()
            }
        }.also { _PersonSeat = it}
