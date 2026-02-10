package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BinarySlash: ImageVector? = null

val Icons.Bs.BinarySlash: ImageVector
    get() = _BinarySlash ?: UXIcon(name = "BinarySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.78f, 13f)
                horizontalLineToRelative(2.22f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.44f)
                lineToRelative(-1.88f, -1.84f)
                lineToRelative(2.66f, -2.72f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(3f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(-2.66f, 2.72f)
                lineToRelative(1.88f, 1.84f)
                verticalLineToRelative(6.44f)
                close()
                moveTo(15.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.55f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.13f, 0.43f, -0.21f, 0.88f, -0.21f, 1.34f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(1f, 0f, 1.91f, -0.34f, 2.66f, -0.89f)
                lineToRelative(-2.19f, -2.19f)
                curveToRelative(-0.15f, 0.05f, -0.3f, 0.08f, -0.47f, 0.08f)
                close()
                moveTo(23.96f, 21.84f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(2.38f, 2.38f)
                curveToRelative(0.76f, -1.43f, 2.24f, -2.41f, 3.96f, -2.41f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.19f, -0.47f, 2.3f, -1.26f, 3.12f)
                lineToRelative(3.41f, 3.41f)
                curveToRelative(0.12f, 0f, 0.23f, -0.03f, 0.35f, -0.03f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(0.38f)
                lineToRelative(3.96f, 3.96f)
                close()
                moveTo(10f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.38f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(0.24f, -0.27f, 0.39f, -0.61f, 0.39f, -0.99f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BinarySlash = it}
