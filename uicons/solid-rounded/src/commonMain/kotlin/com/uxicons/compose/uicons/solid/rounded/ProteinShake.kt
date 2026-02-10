package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProteinShake: ImageVector? = null

val Icons.Sr.ProteinShake: ImageVector
    get() = _ProteinShake ?: UXIcon(name = "ProteinShake") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.23f, 6f)
                curveToRelative(0.12f, -0.53f, 0.35f, -1.08f, 0.57f, -1.57f)
                curveToRelative(0.57f, -1.32f, 1.79f, -2.22f, 3.2f, -2.39f)
                verticalLineToRelative(-1.04f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.52f)
                curveToRelative(1.6f, 0f, 3.05f, 0.95f, 3.68f, 2.42f)
                curveToRelative(0.22f, 0.5f, 0.45f, 1.05f, 0.57f, 1.57f)
                close()
                moveTo(4.01f, 8f)
                curveToRelative(0.0f, 0.09f, 0.19f, 3f, 0.19f, 3f)
                horizontalLineToRelative(3.8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.67f)
                lineToRelative(0.13f, 2f)
                horizontalLineToRelative(3.54f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.4f)
                lineToRelative(0.13f, 2f)
                horizontalLineToRelative(3.27f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.82f)
                curveToRelative(0.78f, 1.77f, 2.54f, 3f, 4.57f, 3f)
                horizontalLineToRelative(4.52f)
                curveToRelative(2.62f, 0f, 4.81f, -2.05f, 4.99f, -4.67f)
                curveToRelative(0.01f, -0.32f, 0.75f, -11.02f, 0.75f, -11.33f)
                horizontalLineToRelative(-15.98f)
                close()
            }
        }.also { _ProteinShake = it}
