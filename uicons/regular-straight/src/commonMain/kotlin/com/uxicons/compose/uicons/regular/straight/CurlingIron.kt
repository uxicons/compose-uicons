package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurlingIron: ImageVector? = null

val Icons.Rs.CurlingIron: ImageVector
    get() = _CurlingIron ?: UXIcon(name = "CurlingIron") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.03f, -2.48f)
                curveToRelative(-1.37f, -1.36f, -3.58f, -1.36f, -4.95f, 0f)
                lineToRelative(-8.03f, 8.03f)
                verticalLineToRelative(-9.05f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.88f)
                lineToRelative(-1.01f, -0.5f)
                curveToRelative(-1.31f, -0.66f, -2.89f, -0.4f, -3.93f, 0.64f)
                lineToRelative(-1.28f, 1.28f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(1.28f, -1.28f)
                curveToRelative(0.43f, -0.43f, 1.08f, -0.53f, 1.62f, -0.26f)
                lineToRelative(1.12f, 0.56f)
                lineToRelative(-5.97f, 5.97f)
                curveToRelative(-1.66f, 1.59f, -1.66f, 4.46f, 0f, 6.05f)
                curveToRelative(1.59f, 1.66f, 4.46f, 1.66f, 6.05f, 0f)
                lineToRelative(6.2f, -6.2f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-2.03f, -2.03f)
                lineToRelative(8.62f, -8.62f)
                curveToRelative(0.66f, -0.66f, 1.03f, -1.54f, 1.03f, -2.48f)
                close()
                moveTo(5.88f, 21.34f)
                curveToRelative(-0.86f, 0.86f, -2.36f, 0.86f, -3.23f, 0f)
                curveToRelative(-0.89f, -0.85f, -0.88f, -2.38f, 0f, -3.23f)
                lineToRelative(6.2f, -6.2f)
                lineToRelative(3.23f, 3.23f)
                lineToRelative(-6.2f, 6.2f)
                close()
                moveTo(21.56f, 4.56f)
                lineTo(12.95f, 13.18f)
                lineTo(10.82f, 11.05f)
                lineTo(19.44f, 2.44f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                curveToRelative(0.58f, 0.56f, 0.58f, 1.56f, 0f, 2.12f)
                close()
            }
        }.also { _CurlingIron = it}
