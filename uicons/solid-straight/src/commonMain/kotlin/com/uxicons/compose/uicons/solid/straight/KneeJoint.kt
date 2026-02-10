package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KneeJoint: ImageVector? = null

val Icons.Ss.KneeJoint: ImageVector
    get() = _KneeJoint ?: UXIcon(name = "KneeJoint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 11f)
                curveToRelative(0f, 0.51f, -0.05f, 1.01f, -0.14f, 1.5f)
                curveToRelative(-1.04f, -1.44f, -2.69f, -2.39f, -4.57f, -2.48f)
                curveToRelative(0.25f, -0.16f, 0.48f, -0.34f, 0.7f, -0.53f)
                curveToRelative(1.2f, -1.07f, 1.85f, -2.51f, 1.97f, -3.99f)
                curveToRelative(1.27f, 1.48f, 2.04f, 3.41f, 2.04f, 5.51f)
                close()
                moveTo(16f, 12f)
                curveToRelative(-1.2f, 0f, -2.27f, 0.54f, -3f, 1.38f)
                curveToRelative(-0.53f, -0.6f, -1.23f, -1.04f, -2.02f, -1.25f)
                curveToRelative(0.07f, -0.05f, 0.14f, -0.09f, 0.21f, -0.15f)
                curveToRelative(0.9f, -0.8f, 1.33f, -1.91f, 1.32f, -3.03f)
                curveToRelative(1.11f, 0.14f, 2.26f, -0.17f, 3.16f, -0.97f)
                curveToRelative(1.65f, -1.47f, 1.79f, -4.0f, 0.32f, -5.65f)
                curveToRelative(-1.47f, -1.65f, -4.0f, -1.79f, -5.65f, -0.32f)
                lineToRelative(-2.21f, -2.02f)
                horizontalLineToRelative(-8.08f)
                lineToRelative(5.81f, 6.02f)
                curveToRelative(-1.65f, 1.47f, -1.79f, 4.0f, -0.32f, 5.65f)
                curveToRelative(0.55f, 0.62f, 1.25f, 1.02f, 1.99f, 1.21f)
                curveToRelative(-0.93f, 0.73f, -1.53f, 1.85f, -1.53f, 3.12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _KneeJoint = it}
