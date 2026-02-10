package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PooBolt: ImageVector? = null

val Icons.Ss.PooBolt: ImageVector
    get() = _PooBolt ?: UXIcon(name = "PooBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.11f, 14.48f)
                curveToRelative(0.55f, -0.68f, 0.89f, -1.54f, 0.89f, -2.48f)
                curveToRelative(0f, -1.62f, -0.96f, -3.0f, -2.34f, -3.63f)
                curveToRelative(0.21f, -0.41f, 0.34f, -0.87f, 0.34f, -1.37f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.15f)
                curveToRelative(-0.49f, -1.87f, -2.17f, -4f, -3.85f, -4f)
                curveToRelative(0f, 2f, -0.75f, 3.25f, -1.5f, 4f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.5f, 0.13f, 0.96f, 0.34f, 1.37f)
                curveToRelative(-1.38f, 0.63f, -2.34f, 2.02f, -2.34f, 3.63f)
                curveToRelative(0f, 0.94f, 0.34f, 1.8f, 0.89f, 2.48f)
                curveToRelative(-1.7f, 0.8f, -2.89f, 2.51f, -2.89f, 4.52f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.0f, -1.19f, -3.72f, -2.89f, -4.52f)
                close()
                moveTo(16.45f, 15.41f)
                lineToRelative(-4.79f, 6.59f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(0.97f, -4f)
                horizontalLineToRelative(-3.2f)
                curveToRelative(-0.62f, 0f, -1.06f, -0.6f, -0.88f, -1.19f)
                lineToRelative(2.35f, -6.81f)
                horizontalLineToRelative(4.3f)
                lineToRelative(-1.54f, 4f)
                horizontalLineToRelative(3.23f)
                curveToRelative(0.72f, 0f, 1.15f, 0.8f, 0.75f, 1.41f)
                close()
            }
        }.also { _PooBolt = it}
