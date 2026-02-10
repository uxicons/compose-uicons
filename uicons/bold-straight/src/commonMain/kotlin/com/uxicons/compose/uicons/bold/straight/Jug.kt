package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Jug: ImageVector? = null

val Icons.Bs.Jug: ImageVector
    get() = _Jug ?: UXIcon(name = "Jug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 11.06f)
                curveToRelative(0.67f, -0.76f, 1.06f, -1.75f, 1.06f, -2.81f)
                curveToRelative(0f, -2.34f, -1.91f, -4.25f, -4.25f, -4.25f)
                curveToRelative(-0.62f, 0f, -1.22f, 0.14f, -1.75f, 0.38f)
                verticalLineToRelative(-1.38f)
                horizontalLineToRelative(1f)
                lineTo(17f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 3f)
                horizontalLineToRelative(1f)
                lineTo(8f, 7.7f)
                lineToRelative(-4.44f, 2.96f)
                curveToRelative(-0.98f, 0.65f, -1.56f, 1.74f, -1.56f, 2.91f)
                verticalLineToRelative(10.43f)
                lineTo(22f, 24f)
                lineTo(22f, 13.57f)
                curveToRelative(0f, -0.96f, -0.39f, -1.86f, -1.06f, -2.51f)
                close()
                moveTo(17.75f, 7f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                curveToRelative(0f, 0.44f, -0.23f, 0.83f, -0.58f, 1.06f)
                lineToRelative(-1.9f, -1.27f)
                curveToRelative(0.1f, -0.59f, 0.61f, -1.04f, 1.23f, -1.04f)
                close()
                moveTo(19f, 21f)
                lineTo(5f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                lineTo(5f, 14f)
                verticalLineToRelative(-0.43f)
                curveToRelative(0f, -0.17f, 0.08f, -0.32f, 0.22f, -0.42f)
                lineToRelative(5.78f, -3.85f)
                lineTo(11f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.3f)
                lineToRelative(5.78f, 3.85f)
                curveToRelative(0.14f, 0.09f, 0.22f, 0.25f, 0.22f, 0.42f)
                verticalLineToRelative(7.43f)
                close()
            }
        }.also { _Jug = it}
