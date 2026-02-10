package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Siren: ImageVector? = null

val Icons.Sr.Siren: ImageVector
    get() = _Siren ?: UXIcon(name = "Siren") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.19f, 16.9f)
                lineToRelative(-1.26f, -12.6f)
                curveToRelative(-0.24f, -2.45f, -2.29f, -4.3f, -4.75f, -4.3f)
                horizontalLineToRelative(-6.36f)
                curveToRelative(-2.46f, 0f, -4.51f, 1.85f, -4.75f, 4.3f)
                lineToRelative(-1.26f, 12.6f)
                curveToRelative(-0.03f, 0.28f, 0.06f, 0.56f, 0.25f, 0.77f)
                curveToRelative(0.19f, 0.21f, 0.46f, 0.33f, 0.74f, 0.33f)
                horizontalLineToRelative(16.4f)
                curveToRelative(0.28f, 0f, 0.55f, -0.12f, 0.74f, -0.33f)
                curveToRelative(0.19f, -0.21f, 0.28f, -0.49f, 0.25f, -0.77f)
                close()
                moveTo(11f, 6f)
                horizontalLineToRelative(-1.07f)
                lineToRelative(-0.11f, 1.1f)
                curveToRelative(-0.05f, 0.52f, -0.49f, 0.9f, -0.99f, 0.9f)
                curveToRelative(-0.03f, 0f, -0.07f, -0.0f, -0.1f, -0.01f)
                curveToRelative(-0.55f, -0.06f, -0.95f, -0.55f, -0.9f, -1.09f)
                lineToRelative(0.2f, -2f)
                curveToRelative(0.05f, -0.51f, 0.48f, -0.9f, 0.99f, -0.9f)
                horizontalLineToRelative(1.98f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(21f, 20f)
                lineTo(3f, 20f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _Siren = it}
