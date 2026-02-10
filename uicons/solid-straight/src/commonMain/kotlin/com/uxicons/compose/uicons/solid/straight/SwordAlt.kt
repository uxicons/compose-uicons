package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwordAlt: ImageVector? = null

val Icons.Ss.SwordAlt: ImageVector
    get() = _SwordAlt ?: UXIcon(name = "SwordAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.55f, 0.45f)
                curveToRelative(-2.66f, -1.24f, -6.09f, 1.57f, -8.29f, 2.72f)
                curveToRelative(-1.34f, 0.94f, -4.43f, 3.84f, -6.09f, 5.5f)
                lineToRelative(-3.68f, 3.68f)
                curveToRelative(-0.96f, -1.24f, -1.49f, -2.75f, -1.49f, -4.35f)
                horizontalLineTo(2f)
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
                curveToRelative(1.12f, -2.16f, 3.9f, -5.59f, 2.67f, -8.23f)
                close()
            }
        }.also { _SwordAlt = it}
