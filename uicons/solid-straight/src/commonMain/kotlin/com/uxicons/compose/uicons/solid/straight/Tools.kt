package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tools: ImageVector? = null

val Icons.Ss.Tools: ImageVector
    get() = _Tools ?: UXIcon(name = "Tools") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 18.88f)
                lineToRelative(-7.68f, -7.68f)
                lineToRelative(-1.41f, 1.4f)
                lineToRelative(-5.01f, -5.01f)
                lineTo(9.02f, 3.42f)
                lineTo(3.13f, 0.03f)
                lineTo(0.04f, 3.11f)
                lineToRelative(3.4f, 5.89f)
                horizontalLineToRelative(4.16f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(-1.43f, 1.42f)
                lineToRelative(7.7f, 7.7f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                close()
                moveTo(8.35f, 15.42f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-2.01f, -2.01f)
                lineTo(0.88f, 18.88f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(5.46f, -5.46f)
                lineToRelative(-2.23f, -2.23f)
                close()
                moveTo(23.12f, 4.06f)
                curveToRelative(0.56f, 1.08f, 0.84f, 2.23f, 0.84f, 3.44f)
                curveToRelative(0f, 2.55f, -1.28f, 4.8f, -3.23f, 6.16f)
                lineToRelative(-5.28f, -5.28f)
                lineToRelative(-1.41f, 1.4f)
                lineToRelative(-3.02f, -3.02f)
                lineTo(11.02f, 2.35f)
                curveToRelative(1.37f, -1.45f, 3.3f, -2.35f, 5.44f, -2.35f)
                curveToRelative(1.18f, 0f, 2.32f, 0.27f, 3.38f, 0.81f)
                lineToRelative(0.32f, 0.16f)
                lineToRelative(-3.57f, 3.61f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                lineToRelative(3.57f, -3.61f)
                lineToRelative(0.13f, 0.26f)
                close()
            }
        }.also { _Tools = it}
