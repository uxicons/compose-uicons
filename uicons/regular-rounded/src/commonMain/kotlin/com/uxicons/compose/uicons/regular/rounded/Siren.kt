package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Siren: ImageVector? = null

val Icons.Rr.Siren: ImageVector
    get() = _Siren ?: UXIcon(name = "Siren") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.22f, 17.19f)
                lineToRelative(-1.29f, -12.89f)
                curveToRelative(-0.24f, -2.45f, -2.29f, -4.3f, -4.75f, -4.3f)
                horizontalLineToRelative(-6.36f)
                curveToRelative(-2.46f, 0f, -4.51f, 1.85f, -4.75f, 4.3f)
                lineToRelative(-1.29f, 12.89f)
                curveToRelative(-1.61f, 0.52f, -2.78f, 2.03f, -2.78f, 3.81f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.78f, -1.17f, -3.29f, -2.78f, -3.81f)
                close()
                moveTo(6.06f, 4.5f)
                curveToRelative(0.14f, -1.43f, 1.33f, -2.5f, 2.76f, -2.5f)
                horizontalLineToRelative(6.36f)
                curveToRelative(1.43f, 0f, 2.62f, 1.07f, 2.76f, 2.5f)
                lineToRelative(1.25f, 12.5f)
                lineTo(4.81f, 17f)
                lineToRelative(1.25f, -12.5f)
                close()
                moveTo(21f, 22f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(7.83f, 6.9f)
                lineToRelative(0.2f, -2f)
                curveToRelative(0.05f, -0.51f, 0.48f, -0.9f, 0.99f, -0.9f)
                horizontalLineToRelative(1.98f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.07f)
                lineToRelative(-0.11f, 1.1f)
                curveToRelative(-0.05f, 0.52f, -0.49f, 0.9f, -0.99f, 0.9f)
                curveToRelative(-0.03f, 0f, -0.07f, -0.0f, -0.1f, -0.01f)
                curveToRelative(-0.55f, -0.06f, -0.95f, -0.55f, -0.9f, -1.09f)
                close()
            }
        }.also { _Siren = it}
