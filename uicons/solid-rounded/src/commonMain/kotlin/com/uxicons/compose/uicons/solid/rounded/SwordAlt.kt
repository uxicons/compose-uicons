package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwordAlt: ImageVector? = null

val Icons.Sr.SwordAlt: ImageVector
    get() = _SwordAlt ?: UXIcon(name = "SwordAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.55f, 0.45f)
                curveToRelative(-0.39f, -0.39f, -0.95f, -0.54f, -1.48f, -0.4f)
                curveToRelative(-2.54f, 0.69f, -4.83f, 1.74f, -6.81f, 3.11f)
                curveToRelative(-1.34f, 0.94f, -4.43f, 3.84f, -6.09f, 5.5f)
                lineToRelative(-3.68f, 3.68f)
                curveToRelative(-0.81f, -1.03f, -1.34f, -2.23f, -1.5f, -3.47f)
                curveToRelative(-0.07f, -0.55f, -0.56f, -0.95f, -1.11f, -0.87f)
                curveToRelative(-0.55f, 0.07f, -0.94f, 0.57f, -0.87f, 1.11f)
                curveToRelative(0.24f, 1.96f, 1.19f, 3.86f, 2.67f, 5.34f)
                lineToRelative(1.72f, 1.72f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-1.54f, -1.54f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1.54f, -1.54f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(1.73f, 1.73f)
                curveToRelative(1.51f, 1.5f, 3.45f, 2.48f, 5.46f, 2.68f)
                curveToRelative(0.5f, 0f, 0.93f, -0.37f, 0.99f, -0.88f)
                curveToRelative(0.07f, -0.55f, -0.32f, -1.05f, -0.87f, -1.11f)
                curveToRelative(-1.24f, -0.15f, -2.44f, -0.69f, -3.48f, -1.51f)
                lineToRelative(3.68f, -3.68f)
                curveToRelative(1.7f, -1.7f, 4.64f, -4.83f, 5.56f, -6.15f)
                curveToRelative(1.35f, -1.94f, 2.38f, -4.21f, 3.06f, -6.75f)
                curveToRelative(0.14f, -0.53f, -0.01f, -1.1f, -0.39f, -1.48f)
                close()
            }
        }.also { _SwordAlt = it}
