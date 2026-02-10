package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TwoPaperclip: ImageVector? = null

val Icons.Ss.TwoPaperclip: ImageVector
    get() = _TwoPaperclip ?: UXIcon(name = "TwoPaperclip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.35f, 8.66f)
                lineToRelative(1.66f, 4.02f)
                verticalLineToRelative(6.32f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5.0f)
                verticalLineToRelative(-13.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-11.43f)
                curveToRelative(0.08f, 0.37f, 0.19f, 0.73f, 0.34f, 1.09f)
                close()
                moveTo(6.01f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.44f)
                curveToRelative(0.26f, -1.11f, 0.78f, -2.15f, 1.54f, -3.02f)
                curveToRelative(-0.53f, -0.85f, -1.47f, -1.41f, -2.54f, -1.41f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13.69f, 3.22f)
                curveToRelative(1.53f, -0.62f, 3.29f, 0.11f, 3.91f, 1.64f)
                lineToRelative(4.54f, 11.19f)
                lineToRelative(1.85f, -0.75f)
                lineToRelative(-4.54f, -11.19f)
                curveToRelative(-1.04f, -2.55f, -3.97f, -3.78f, -6.52f, -2.74f)
                curveToRelative(-2.55f, 1.04f, -3.78f, 3.97f, -2.74f, 6.52f)
                lineToRelative(5.89f, 14.24f)
                curveToRelative(0.58f, 1.51f, 2.43f, 2.28f, 3.91f, 1.64f)
                curveToRelative(1.53f, -0.62f, 2.27f, -2.38f, 1.64f, -3.92f)
                lineToRelative(-5.51f, -13.31f)
                lineToRelative(-1.85f, 0.77f)
                lineToRelative(5.51f, 13.31f)
                curveToRelative(0.21f, 0.51f, -0.04f, 1.1f, -0.55f, 1.3f)
                curveToRelative(-0.5f, 0.21f, -1.11f, -0.04f, -1.31f, -0.55f)
                lineToRelative(-5.89f, -14.24f)
                curveToRelative(-0.62f, -1.53f, 0.11f, -3.29f, 1.64f, -3.91f)
                close()
            }
        }.also { _TwoPaperclip = it}
