package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meteor: ImageVector? = null

val Icons.Sc.Meteor: ImageVector
    get() = _Meteor ?: UXIcon(name = "Meteor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.93f, 12.28f)
                curveToRelative(-0.39f, 0f, -0.83f, 0.37f, -1.14f, 0.68f)
                curveToRelative(-0.97f, 0.97f, -0.84f, 1.45f, 0f, 2.29f)
                curveToRelative(0.45f, 0.46f, 0.82f, 0.68f, 1.12f, 0.68f)
                curveToRelative(0.39f, 0f, 0.83f, -0.37f, 1.14f, -0.68f)
                curveToRelative(0.97f, -0.97f, 0.84f, -1.45f, 0f, -2.29f)
                curveToRelative(-0.45f, -0.46f, -0.82f, -0.68f, -1.12f, -0.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.81f, 10.45f)
                curveToRelative(-0.19f, -0.32f, -0.56f, -0.51f, -0.93f, -0.48f)
                lineToRelative(-2.93f, 0.21f)
                curveToRelative(0.93f, -2.54f, 1.9f, -5.72f, 1.95f, -5.88f)
                curveToRelative(0.11f, -0.35f, 0.01f, -0.74f, -0.25f, -1.0f)
                curveToRelative(-0.26f, -0.26f, -0.65f, -0.36f, -1.0f, -0.25f)
                curveToRelative(-0.16f, 0.05f, -3.31f, 1.03f, -5.84f, 1.96f)
                lineToRelative(0.21f, -2.95f)
                curveToRelative(0.03f, -0.38f, -0.16f, -0.73f, -0.48f, -0.93f)
                curveToRelative(-0.32f, -0.19f, -0.73f, -0.19f, -1.05f, 0.01f)
                curveToRelative(-1.34f, 0.84f, -8.08f, 5.09f, -9.12f, 6.14f)
                curveToRelative(-3.82f, 3.84f, -2.46f, 9.21f, 0.84f, 12.53f)
                curveToRelative(1.98f, 1.99f, 4.61f, 3.18f, 7.05f, 3.18f)
                curveToRelative(2.04f, 0f, 3.92f, -0.81f, 5.44f, -2.33f)
                curveToRelative(1.04f, -1.04f, 5.27f, -7.82f, 6.1f, -9.17f)
                curveToRelative(0.2f, -0.32f, 0.2f, -0.72f, 0.01f, -1.04f)
                close()
                moveTo(12.47f, 16.66f)
                curveToRelative(-0.85f, 0.85f, -1.69f, 1.27f, -2.56f, 1.27f)
                curveToRelative(-1.15f, 0f, -2.0f, -0.72f, -2.54f, -1.27f)
                curveToRelative(-1.69f, -1.7f, -1.69f, -3.42f, 0f, -5.11f)
                curveToRelative(0.85f, -0.85f, 1.69f, -1.27f, 2.56f, -1.27f)
                curveToRelative(1.15f, 0f, 2.0f, 0.72f, 2.54f, 1.27f)
                curveToRelative(1.69f, 1.7f, 1.69f, 3.41f, 0f, 5.11f)
                close()
            }
        }.also { _Meteor = it}
