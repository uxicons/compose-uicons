package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeCompare: ImageVector? = null

val Icons.Ss.CodeCompare: ImageVector
    get() = _CodeCompare ?: UXIcon(name = "CodeCompare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineToRelative(8.14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(2.2f, -2.2f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.26f, 3.26f)
                curveToRelative(-0.77f, 0.78f, -0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(3.26f, 3.26f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.3f, -2.29f)
                horizontalLineToRelative(5.1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(21f, 8.86f)
                curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
                close()
                moveTo(10.16f, 9.66f)
                lineToRelative(3.26f, -3.25f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.04f, 0f, -2.81f)
                lineTo(10.16f, 0.34f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.26f, 2.25f)
                lineTo(6f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(3f, 15.14f)
                curveToRelative(-1.72f, 0.45f, -3f, 2f, -3f, 3.86f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                lineTo(5f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _CodeCompare = it}
