package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hexagon: ImageVector? = null

val Icons.Bs.Hexagon: ImageVector
    get() = _Hexagon ?: UXIcon(name = "Hexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12.02f)
                curveTo(0f, 11.45f, 0.14f, 10.89f, 0.42f, 10.37f)
                lineTo(4.49f, 2.8f)
                curveToRelative(0.59f, -1.1f, 1.75f, -1.79f, 3f, -1.79f)
                horizontalLineToRelative(9.03f)
                curveToRelative(1.26f, 0f, 2.41f, 0.69f, 3.01f, 1.8f)
                lineToRelative(4.06f, 7.56f)
                curveToRelative(0.55f, 1.03f, 0.55f, 2.25f, 0f, 3.28f)
                lineToRelative(-4.06f, 7.57f)
                curveToRelative(-0.59f, 1.11f, -1.75f, 1.8f, -3.01f, 1.8f)
                lineTo(7.5f, 23.02f)
                curveToRelative(-1.26f, 0f, -2.41f, -0.69f, -3f, -1.79f)
                lineTo(0.42f, 13.66f)
                curveTo(0.14f, 13.15f, 0f, 12.58f, 0f, 12.02f)
                close()
                moveTo(21f, 12.02f)
                curveToRelative(0f, -0.08f, -0.02f, -0.15f, -0.06f, -0.22f)
                lineToRelative(-4.06f, -7.56f)
                curveToRelative(-0.07f, -0.13f, -0.21f, -0.21f, -0.36f, -0.21f)
                lineTo(7.5f, 4.03f)
                curveToRelative(-0.15f, 0f, -0.29f, 0.08f, -0.36f, 0.21f)
                lineTo(3.06f, 11.79f)
                curveToRelative(-0.07f, 0.14f, -0.07f, 0.31f, 0f, 0.44f)
                lineToRelative(4.08f, 7.56f)
                curveToRelative(0.07f, 0.13f, 0.21f, 0.21f, 0.36f, 0.21f)
                horizontalLineToRelative(9.03f)
                curveToRelative(0.15f, 0f, 0.29f, -0.08f, 0.36f, -0.21f)
                lineToRelative(4.06f, -7.56f)
                curveToRelative(0.04f, -0.07f, 0.06f, -0.15f, 0.06f, -0.22f)
                close()
            }
        }.also { _Hexagon = it}
