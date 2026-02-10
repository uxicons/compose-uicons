package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurlingIron: ImageVector? = null

val Icons.Ts.CurlingIron: ImageVector
    get() = _CurlingIron ?: UXIcon(name = "CurlingIron") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.0f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-9.88f, 9.88f)
                verticalLineToRelative(-10.76f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10.75f)
                lineToRelative(-0.82f, -0.42f)
                curveToRelative(-1.12f, -0.56f, -2.46f, -0.34f, -3.35f, 0.54f)
                lineToRelative(-1.88f, 1.88f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(1.88f, -1.88f)
                curveToRelative(0.58f, -0.58f, 1.46f, -0.72f, 2.19f, -0.36f)
                lineToRelative(0.47f, 0.24f)
                lineToRelative(-6.09f, 6.09f)
                curveToRelative(-1.47f, 1.41f, -1.47f, 3.94f, 0f, 5.35f)
                curveToRelative(1.41f, 1.47f, 3.94f, 1.47f, 5.35f, 0f)
                lineToRelative(6.31f, -6.31f)
                lineToRelative(1.83f, 1.83f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-2.38f, -2.38f)
                lineToRelative(10.21f, -10.21f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                close()
                moveTo(5.74f, 22.19f)
                curveToRelative(-1.05f, 1.05f, -2.88f, 1.05f, -3.93f, 0f)
                curveToRelative(-1.08f, -1.03f, -1.08f, -2.9f, 0f, -3.93f)
                lineToRelative(6.31f, -6.31f)
                lineToRelative(3.93f, 3.93f)
                close()
                moveTo(22.41f, 4.42f)
                lineTo(12.2f, 14.63f)
                lineTo(9.37f, 11.8f)
                lineTo(19.59f, 1.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                curveToRelative(0.78f, 0.74f, 0.78f, 2.08f, 0f, 2.83f)
                close()
            }
        }.also { _CurlingIron = it}
