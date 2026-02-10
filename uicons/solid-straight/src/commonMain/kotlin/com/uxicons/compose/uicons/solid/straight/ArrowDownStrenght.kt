package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownStrenght: ImageVector? = null

val Icons.Ss.ArrowDownStrenght: ImageVector
    get() = _ArrowDownStrenght ?: UXIcon(name = "ArrowDownStrenght") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 22f)
                lineTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11.96f, 18.11f)
                curveToRelative(-6.86f, 0f, -11.02f, -2.0f, -11.06f, -2.02f)
                lineTo(0.01f, 17.88f)
                curveToRelative(0.18f, 0.09f, 4.58f, 2.23f, 11.94f, 2.23f)
                reflectiveQuadToRelative(0.0f, 0f)
                curveToRelative(7.36f, 0f, 11.76f, -2.14f, 11.94f, -2.23f)
                lineToRelative(-0.89f, -1.79f)
                curveToRelative(-0.04f, 0.02f, -4.2f, 2.02f, -11.06f, 2.02f)
                close()
                moveTo(12.0f, 11.5f)
                curveToRelative(0.49f, 0f, 0.99f, -0.19f, 1.36f, -0.56f)
                lineToRelative(3.09f, -3.09f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.04f, 2.04f)
                lineToRelative(-0.0f, -8.47f)
                horizontalLineToRelative(-2f)
                lineToRelative(0.0f, 8.47f)
                lineToRelative(-2.04f, -2.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.1f, 3.1f)
                curveToRelative(0.38f, 0.38f, 0.87f, 0.56f, 1.36f, 0.56f)
                close()
                moveTo(11.99f, 16.0f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                curveToRelative(7.31f, -0.0f, 11.82f, -5.25f, 12.01f, -5.47f)
                lineToRelative(-1.53f, -1.29f)
                curveToRelative(-0.04f, 0.05f, -4.09f, 4.76f, -10.48f, 4.76f)
                curveToRelative(-6.36f, 0f, -10.45f, -4.71f, -10.49f, -4.76f)
                lineTo(-0.02f, 10.53f)
                curveToRelative(0.19f, 0.22f, 4.7f, 5.47f, 12.01f, 5.47f)
                close()
            }
        }.also { _ArrowDownStrenght = it}
