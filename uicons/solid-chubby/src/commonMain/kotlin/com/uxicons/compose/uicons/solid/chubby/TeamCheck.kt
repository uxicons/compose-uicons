package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TeamCheck: ImageVector? = null

val Icons.Sc.TeamCheck: ImageVector
    get() = _TeamCheck ?: UXIcon(name = "TeamCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 7f)
                curveToRelative(-1.99f, 0f, -3f, -1.01f, -3f, -3f)
                reflectiveCurveToRelative(1.01f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.01f, 3f, 3f)
                reflectiveCurveToRelative(-1.01f, 3f, -3f, 3f)
                close()
                moveTo(6f, 10f)
                curveToRelative(-1.99f, 0f, -3f, -1.01f, -3f, -3f)
                reflectiveCurveToRelative(1.01f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.01f, 3f, 3f)
                reflectiveCurveToRelative(-1.01f, 3f, -3f, 3f)
                close()
                moveTo(17f, 11f)
                curveToRelative(-4.15f, 0f, -6f, 1.85f, -6f, 6f)
                reflectiveCurveToRelative(1.85f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -1.85f, 6f, -6f)
                reflectiveCurveToRelative(-1.85f, -6f, -6f, -6f)
                close()
                moveTo(19.77f, 16.77f)
                curveToRelative(-0.79f, 0.94f, -1.69f, 1.79f, -2.67f, 2.53f)
                curveToRelative(-0.36f, 0.27f, -0.84f, 0.27f, -1.2f, 0f)
                curveToRelative(-0.56f, -0.42f, -1.1f, -0.88f, -1.6f, -1.37f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.02f, -1.41f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.02f)
                curveToRelative(0.26f, 0.25f, 0.53f, 0.49f, 0.8f, 0.73f)
                curveToRelative(0.63f, -0.53f, 1.21f, -1.11f, 1.73f, -1.74f)
                curveToRelative(0.35f, -0.42f, 0.98f, -0.48f, 1.41f, -0.12f)
                curveToRelative(0.42f, 0.35f, 0.48f, 0.98f, 0.12f, 1.41f)
                close()
                moveTo(17f, 9f)
                curveToRelative(0.57f, 0f, 1.11f, 0.04f, 1.63f, 0.11f)
                curveToRelative(-0.82f, -0.74f, -2.02f, -1.11f, -3.63f, -1.11f)
                curveToRelative(-2.3f, 0f, -3.75f, 0.74f, -4.47f, 2.26f)
                curveToRelative(0.25f, 0.18f, 0.48f, 0.39f, 0.69f, 0.61f)
                curveToRelative(1.34f, -1.23f, 3.27f, -1.87f, 5.78f, -1.87f)
                close()
                moveTo(6f, 11f)
                curveToRelative(-3.41f, 0f, -5f, 1.59f, -5f, 5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7f)
                curveToRelative(0f, -1.8f, 0.34f, -3.31f, 0.98f, -4.51f)
                curveToRelative(-0.81f, -0.99f, -2.12f, -1.49f, -3.98f, -1.49f)
                close()
            }
        }.also { _TeamCheck = it}
