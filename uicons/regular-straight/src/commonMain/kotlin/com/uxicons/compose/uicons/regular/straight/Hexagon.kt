package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hexagon: ImageVector? = null

val Icons.Rs.Hexagon: ImageVector
    get() = _Hexagon ?: UXIcon(name = "Hexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-0.5f, 0f, -1f, -0.12f, -1.46f, -0.37f)
                lineToRelative(-7.97f, -4.27f)
                curveToRelative(-0.98f, -0.52f, -1.58f, -1.54f, -1.58f, -2.64f)
                lineTo(0.99f, 7.26f)
                curveToRelative(0f, -1.11f, 0.61f, -2.12f, 1.59f, -2.65f)
                lineTo(10.55f, 0.36f)
                curveToRelative(0.91f, -0.49f, 1.99f, -0.49f, 2.9f, 0f)
                lineToRelative(7.96f, 4.25f)
                curveToRelative(0.98f, 0.52f, 1.59f, 1.54f, 1.59f, 2.65f)
                verticalLineToRelative(9.46f)
                curveToRelative(0f, 1.11f, -0.61f, 2.12f, -1.58f, 2.64f)
                lineToRelative(-7.96f, 4.27f)
                curveToRelative(-0.46f, 0.24f, -0.96f, 0.37f, -1.46f, 0.37f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-0.17f, 0f, -0.35f, 0.04f, -0.51f, 0.13f)
                lineTo(3.53f, 6.38f)
                curveToRelative(-0.33f, 0.17f, -0.53f, 0.51f, -0.53f, 0.88f)
                verticalLineToRelative(9.46f)
                curveToRelative(0f, 0.37f, 0.2f, 0.71f, 0.53f, 0.88f)
                lineToRelative(7.97f, 4.27f)
                curveToRelative(0.32f, 0.17f, 0.7f, 0.17f, 1.02f, 0f)
                lineToRelative(7.96f, -4.27f)
                curveToRelative(0.33f, -0.17f, 0.53f, -0.51f, 0.53f, -0.88f)
                lineTo(21.01f, 7.26f)
                curveToRelative(0f, -0.37f, -0.2f, -0.71f, -0.53f, -0.88f)
                horizontalLineToRelative(0f)
                lineTo(12.51f, 2.13f)
                curveToRelative(-0.16f, -0.08f, -0.33f, -0.13f, -0.51f, -0.13f)
                close()
            }
        }.also { _Hexagon = it}
