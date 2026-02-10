package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwordAlt: ImageVector? = null

val Icons.Rs.SwordAlt: ImageVector
    get() = _SwordAlt ?: UXIcon(name = "SwordAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.55f, 0.45f)
                curveToRelative(-0.39f, -0.39f, -0.95f, -0.54f, -1.48f, -0.4f)
                curveToRelative(-2.54f, 0.69f, -4.83f, 1.74f, -6.81f, 3.11f)
                curveToRelative(-1.34f, 0.94f, -4.43f, 3.84f, -6.09f, 5.5f)
                lineToRelative(-3.68f, 3.68f)
                curveToRelative(-0.96f, -1.24f, -1.49f, -2.75f, -1.49f, -4.35f)
                lineTo(2f, 8f)
                curveToRelative(0f, 2.44f, 0.95f, 4.73f, 2.68f, 6.46f)
                lineToRelative(1.72f, 1.72f)
                lineToRelative(-3.21f, 3.21f)
                lineToRelative(-1.79f, -1.79f)
                lineTo(-0.01f, 19.02f)
                lineToRelative(5f, 5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(3.21f, -3.21f)
                lineToRelative(1.73f, 1.73f)
                curveToRelative(1.73f, 1.73f, 4.02f, 2.68f, 6.46f, 2.68f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.6f, 0f, -3.12f, -0.53f, -4.36f, -1.49f)
                lineToRelative(3.68f, -3.68f)
                curveToRelative(1.7f, -1.7f, 4.64f, -4.83f, 5.56f, -6.15f)
                curveToRelative(1.35f, -1.94f, 2.38f, -4.21f, 3.06f, -6.75f)
                curveToRelative(0.14f, -0.53f, -0.01f, -1.1f, -0.39f, -1.48f)
                close()
                moveTo(19.24f, 7.54f)
                curveToRelative(-0.8f, 1.15f, -3.65f, 4.2f, -5.33f, 5.87f)
                lineToRelative(-3.73f, 3.73f)
                lineToRelative(-3.33f, -3.33f)
                lineToRelative(3.73f, -3.73f)
                curveToRelative(1.64f, -1.64f, 4.65f, -4.45f, 5.82f, -5.27f)
                curveToRelative(1.57f, -1.1f, 3.38f, -1.97f, 5.37f, -2.59f)
                curveToRelative(-0.61f, 1.99f, -1.47f, 3.77f, -2.54f, 5.32f)
                close()
            }
        }.also { _SwordAlt = it}
