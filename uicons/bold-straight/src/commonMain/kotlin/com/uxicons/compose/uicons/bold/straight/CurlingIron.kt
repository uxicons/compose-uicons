package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurlingIron: ImageVector? = null

val Icons.Bs.CurlingIron: ImageVector
    get() = _CurlingIron ?: UXIcon(name = "CurlingIron") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.99f, 4.02f)
                curveToRelative(0f, -1.07f, -0.42f, -2.07f, -1.17f, -2.83f)
                curveToRelative(-1.49f, -1.55f, -4.17f, -1.55f, -5.66f, 0f)
                lineToRelative(-6.16f, 6.16f)
                verticalLineToRelative(-7.35f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.17f)
                lineToRelative(-1.49f, -0.68f)
                curveToRelative(-1.7f, -0.77f, -3.73f, -0.41f, -5.05f, 0.92f)
                lineToRelative(-1.03f, 1.03f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.03f, -1.03f)
                curveToRelative(0.44f, -0.44f, 1.12f, -0.56f, 1.68f, -0.3f)
                lineToRelative(0.51f, 0.23f)
                lineToRelative(-4.38f, 4.38f)
                curveToRelative(-1.86f, 1.86f, -1.86f, 4.9f, 0f, 6.76f)
                curveToRelative(1.86f, 1.86f, 4.9f, 1.86f, 6.76f, 0f)
                lineToRelative(4.83f, -4.83f)
                lineToRelative(1.12f, 1.12f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.67f, -1.67f)
                lineToRelative(8.25f, -8.25f)
                curveToRelative(0.76f, -0.76f, 1.17f, -1.76f, 1.17f, -2.83f)
                close()
                moveTo(6.05f, 20.48f)
                curveToRelative(-0.7f, 0.7f, -1.82f, 0.69f, -2.52f, 0f)
                reflectiveCurveToRelative(-0.69f, -1.82f, 0f, -2.52f)
                lineToRelative(4.83f, -4.83f)
                lineToRelative(2.52f, 2.52f)
                lineToRelative(-4.83f, 4.83f)
                close()
                moveTo(20.7f, 4.72f)
                lineTo(12.52f, 12.9f)
                lineTo(11.11f, 11.49f)
                lineTo(19.29f, 3.31f)
                curveToRelative(0.38f, -0.38f, 1.03f, -0.38f, 1.41f, 0f)
                curveToRelative(0.39f, 0.37f, 0.39f, 1.04f, 0f, 1.42f)
                close()
            }
        }.also { _CurlingIron = it}
