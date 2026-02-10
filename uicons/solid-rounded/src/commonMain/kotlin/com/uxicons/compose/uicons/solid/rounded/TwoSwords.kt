package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TwoSwords: ImageVector? = null

val Icons.Sr.TwoSwords: ImageVector
    get() = _TwoSwords ?: UXIcon(name = "TwoSwords") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1.0f, -0.99f, 1f)
                curveToRelative(-0.4f, 0.01f, -2.56f, 0.44f, -4.55f, 2.04f)
                lineToRelative(4.25f, 4.25f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-4.25f, -4.25f)
                curveToRelative(-1.6f, 1.99f, -2.03f, 4.16f, -2.04f, 4.55f)
                curveToRelative(-0.02f, 0.54f, -0.46f, 0.98f, -1f, 0.98f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.55f, -0.01f, -0.98f, -0.44f, -0.98f, -0.99f)
                curveToRelative(0f, -0.49f, 0.31f, -2.34f, 1.48f, -4.34f)
                lineToRelative(-1.07f, -1.07f)
                lineToRelative(4.17f, -4.16f)
                lineToRelative(1.07f, 1.07f)
                curveToRelative(2.01f, -1.18f, 3.87f, -1.49f, 4.36f, -1.49f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(19.84f, 8.33f)
                curveToRelative(1.93f, -1.92f, 3.34f, -4.3f, 4.13f, -6.89f)
                curveToRelative(0.18f, -0.84f, -0.56f, -1.59f, -1.41f, -1.41f)
                curveToRelative(-2.6f, 0.8f, -4.97f, 2.2f, -6.89f, 4.13f)
                lineTo(5.34f, 14.48f)
                curveToRelative(-2.01f, -1.17f, -3.86f, -1.48f, -4.34f, -1.48f)
                curveToRelative(-0.55f, 0f, -0.98f, 0.44f, -0.99f, 0.98f)
                curveToRelative(-0.01f, 0.55f, 0.43f, 1.0f, 0.98f, 1.02f)
                curveToRelative(0.39f, 0.01f, 2.55f, 0.44f, 4.55f, 2.04f)
                lineTo(1.29f, 21.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, -0.0f)
                lineToRelative(4.25f, -4.25f)
                curveToRelative(1.6f, 1.99f, 2.03f, 4.16f, 2.05f, 4.55f)
                curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 1f, 0.99f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.49f, -0.31f, -2.35f, -1.49f, -4.36f)
                lineToRelative(10.32f, -10.31f)
                close()
                moveTo(0.15f, 1.81f)
                curveToRelative(0.81f, 2.46f, 2.18f, 4.69f, 4.01f, 6.52f)
                lineToRelative(2.26f, 2.26f)
                lineToRelative(4.17f, -4.16f)
                lineToRelative(-2.25f, -2.25f)
                curveTo(6.41f, 2.24f, 4.03f, 0.83f, 1.43f, 0.03f)
                curveTo(0.4f, -0.2f, -0.32f, 0.91f, 0.15f, 1.81f)
                close()
            }
        }.also { _TwoSwords = it}
