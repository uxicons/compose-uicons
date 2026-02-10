package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screw: ImageVector? = null

val Icons.Sr.Screw: ImageVector
    get() = _Screw ?: UXIcon(name = "Screw") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 2.12f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -1.17f, -0.95f, -2.12f, -2.12f, -2.12f)
                horizontalLineToRelative(-7.76f)
                curveToRelative(-1.17f, 0f, -2.12f, 0.95f, -2.12f, 2.12f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.56f, 0.22f, 1.1f, 0.62f, 1.5f)
                lineToRelative(2.38f, 2.38f)
                horizontalLineToRelative(6f)
                lineToRelative(2.38f, -2.38f)
                curveToRelative(0.4f, -0.4f, 0.62f, -0.94f, 0.62f, -1.5f)
                close()
                moveTo(12.22f, 8f)
                lineToRelative(-3.22f, 2.95f)
                verticalLineToRelative(-2.95f)
                horizontalLineToRelative(3.22f)
                close()
                moveTo(15f, 18.14f)
                verticalLineToRelative(1.2f)
                curveToRelative(0f, 1.33f, -0.53f, 2.6f, -1.46f, 3.54f)
                lineToRelative(-0.83f, 0.83f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-0.83f, -0.83f)
                curveToRelative(-0.1f, -0.1f, -0.18f, -0.22f, -0.27f, -0.33f)
                lineToRelative(4.8f, -4.41f)
                close()
                moveTo(9f, 18.79f)
                lineToRelative(6f, -5.51f)
                verticalLineToRelative(2.35f)
                lineToRelative(-5.73f, 5.26f)
                curveToRelative(-0.16f, -0.5f, -0.27f, -1.01f, -0.27f, -1.55f)
                verticalLineToRelative(-0.56f)
                close()
                moveTo(9f, 13.67f)
                lineToRelative(6f, -5.51f)
                verticalLineToRelative(2.4f)
                lineToRelative(-6f, 5.51f)
                verticalLineToRelative(-2.4f)
                close()
            }
        }.also { _Screw = it}
