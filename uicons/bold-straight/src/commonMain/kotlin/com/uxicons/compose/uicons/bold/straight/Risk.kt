package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Risk: ImageVector? = null

val Icons.Bs.Risk: ImageVector
    get() = _Risk ?: UXIcon(name = "Risk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 12f)
                curveToRelative(0f, -1.28f, -0.25f, -2.51f, -0.7f, -3.64f)
                lineToRelative(1.84f, -1.06f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(-1.84f, 1.06f)
                curveToRelative(-1.54f, -1.92f, -3.77f, -3.25f, -6.3f, -3.64f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.12f)
                curveToRelative(-2.54f, 0.39f, -4.77f, 1.72f, -6.3f, 3.64f)
                lineToRelative(-1.84f, -1.06f)
                lineToRelative(-1.5f, 2.6f)
                lineToRelative(1.84f, 1.06f)
                curveToRelative(-0.44f, 1.13f, -0.7f, 2.35f, -0.7f, 3.64f)
                reflectiveCurveToRelative(0.25f, 2.51f, 0.7f, 3.64f)
                lineToRelative(-1.84f, 1.06f)
                lineToRelative(1.5f, 2.6f)
                lineToRelative(1.84f, -1.06f)
                curveToRelative(1.54f, 1.92f, 3.77f, 3.25f, 6.3f, 3.64f)
                verticalLineToRelative(2.12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.12f)
                curveToRelative(2.54f, -0.39f, 4.77f, -1.72f, 6.3f, -3.64f)
                lineToRelative(1.84f, 1.06f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(-1.84f, -1.06f)
                curveToRelative(0.44f, -1.13f, 0.7f, -2.35f, 0.7f, -3.64f)
                close()
                moveTo(12f, 5f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 1.4f, -0.42f, 2.7f, -1.12f, 3.79f)
                lineToRelative(-5.88f, -10.07f)
                lineToRelative(-5.88f, 10.07f)
                curveToRelative(-0.71f, -1.09f, -1.12f, -2.39f, -1.12f, -3.79f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                close()
                moveTo(11f, 12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-2.37f, 0f, -4.47f, -1.19f, -5.74f, -3f)
                horizontalLineToRelative(11.47f)
                curveToRelative(-1.27f, 1.81f, -3.36f, 3f, -5.74f, 3f)
                close()
            }
        }.also { _Risk = it}
