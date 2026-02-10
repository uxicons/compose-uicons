package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hacker: ImageVector? = null

val Icons.Bs.Hacker: ImageVector
    get() = _Hacker ?: UXIcon(name = "Hacker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                lineToRelative(-7f, -12f)
                horizontalLineToRelative(2.88f)
                lineToRelative(-0.07f, 0.84f)
                lineToRelative(2.65f, 4.54f)
                lineToRelative(0.67f, -8.38f)
                horizontalLineToRelative(-5.44f)
                curveToRelative(0.21f, -1.25f, 0.33f, -2.32f, 0.33f, -3f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6.0f)
                curveToRelative(0f, 0.68f, 0.12f, 1.75f, 0.33f, 3f)
                horizontalLineToRelative(-5.47f)
                lineToRelative(0.8f, 10f)
                horizontalLineToRelative(-1.68f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(4.68f)
                lineToRelative(1.75f, -3f)
                horizontalLineToRelative(-4.59f)
                lineToRelative(-0.72f, -9f)
                horizontalLineToRelative(12.88f)
                lineToRelative(-7f, 12f)
                close()
                moveTo(9f, 7f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                curveToRelative(0f, 0.45f, -0.1f, 1.17f, -0.27f, 2f)
                horizontalLineToRelative(-5.46f)
                curveToRelative(-0.17f, -0.83f, -0.27f, -1.55f, -0.27f, -2f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(18f, 21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Hacker = it}
