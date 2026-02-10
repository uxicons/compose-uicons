package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tools: ImageVector? = null

val Icons.Bs.Tools: ImageVector
    get() = _Tools ?: UXIcon(name = "Tools") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.6f, 10.65f)
                lineToRelative(-5.36f, -5.36f)
                curveToRelative(0.77f, -3.04f, 3.51f, -5.29f, 6.78f, -5.29f)
                curveToRelative(1.02f, 0f, 1.98f, 0.22f, 2.85f, 0.61f)
                lineToRelative(-3.12f, 3.12f)
                curveToRelative(-0.98f, 0.98f, -0.98f, 2.56f, 0f, 3.54f)
                curveToRelative(0.98f, 0.98f, 2.56f, 0.98f, 3.54f, 0f)
                lineToRelative(3.12f, -3.12f)
                curveToRelative(0.39f, 0.87f, 0.61f, 1.84f, 0.61f, 2.85f)
                curveToRelative(0f, 2.7f, -1.55f, 5.03f, -3.79f, 6.19f)
                lineToRelative(-3.58f, -3.59f)
                lineToRelative(-1.05f, 1.05f)
                close()
                moveTo(0.86f, 18.99f)
                curveToRelative(-1.15f, 1.15f, -1.15f, 3.02f, 0f, 4.17f)
                curveToRelative(1.15f, 1.15f, 3.02f, 1.15f, 4.17f, 0f)
                lineToRelative(6.59f, -6.59f)
                lineToRelative(-4.17f, -4.17f)
                lineTo(0.86f, 18.99f)
                close()
                moveTo(16.64f, 12.43f)
                lineToRelative(-1.05f, 1.05f)
                lineToRelative(-7.6f, -7.6f)
                verticalLineToRelative(-2.85f)
                lineTo(2.75f, 0f)
                lineTo(0f, 2.75f)
                lineToRelative(3.03f, 5.25f)
                horizontalLineToRelative(2.85f)
                lineToRelative(7.6f, 7.6f)
                lineToRelative(-0.99f, 0.99f)
                lineToRelative(6.55f, 6.55f)
                curveToRelative(1.15f, 1.15f, 3.01f, 1.15f, 4.16f, 0f)
                reflectiveCurveToRelative(1.0f, -2.87f, 0f, -4.16f)
                lineToRelative(-6.55f, -6.55f)
                close()
            }
        }.also { _Tools = it}
