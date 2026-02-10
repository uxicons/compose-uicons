package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Answer: ImageVector? = null

val Icons.Rs.Answer: ImageVector
    get() = _Answer ?: UXIcon(name = "Answer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6.92f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                curveToRelative(0.47f, 0f, 0.93f, -0.16f, 1.29f, -0.48f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(6.85f)
                lineTo(24.0f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 18f)
                horizontalLineToRelative(-5.57f)
                lineToRelative(-4.45f, 3.65f)
                lineToRelative(-4.33f, -3.65f)
                lineTo(2f, 18f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(12.88f, 4.18f)
                curveToRelative(-1.31f, -0.55f, -2.65f, 0.22f, -2.94f, 1.46f)
                lineToRelative(-2.44f, 10.36f)
                horizontalLineToRelative(2.05f)
                lineToRelative(0.71f, -3f)
                horizontalLineToRelative(3.48f)
                lineToRelative(0.71f, 3f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-2.42f, -10.29f)
                curveToRelative(-0.15f, -0.66f, -0.57f, -1.27f, -1.2f, -1.53f)
                close()
                moveTo(10.73f, 11f)
                lineToRelative(1.16f, -4.91f)
                curveToRelative(0.01f, -0.05f, 0.06f, -0.09f, 0.11f, -0.09f)
                reflectiveCurveToRelative(0.1f, 0.04f, 0.11f, 0.09f)
                lineToRelative(1.16f, 4.91f)
                horizontalLineToRelative(-2.54f)
                close()
            }
        }.also { _Answer = it}
