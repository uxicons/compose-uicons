package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Answer: ImageVector? = null

val Icons.Ss.Answer: ImageVector
    get() = _Answer ?: UXIcon(name = "Answer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.11f, 6.09f)
                lineToRelative(1.16f, 4.91f)
                horizontalLineToRelative(-2.54f)
                lineToRelative(1.16f, -4.91f)
                curveToRelative(0.01f, -0.05f, 0.06f, -0.09f, 0.11f, -0.09f)
                reflectiveCurveToRelative(0.1f, 0.04f, 0.11f, 0.09f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.82f, 0.48f, -1.29f, 0.48f)
                curveToRelative(-0.48f, 0f, -0.95f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                lineTo(0f, 20f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(16.5f, 16f)
                lineToRelative(-2.42f, -10.29f)
                curveToRelative(-0.15f, -0.66f, -0.57f, -1.27f, -1.2f, -1.53f)
                curveToRelative(-1.31f, -0.55f, -2.65f, 0.22f, -2.94f, 1.46f)
                lineToRelative(-2.44f, 10.36f)
                horizontalLineToRelative(2.05f)
                lineToRelative(0.71f, -3f)
                horizontalLineToRelative(3.48f)
                lineToRelative(0.71f, 3f)
                horizontalLineToRelative(2.05f)
                close()
            }
        }.also { _Answer = it}
