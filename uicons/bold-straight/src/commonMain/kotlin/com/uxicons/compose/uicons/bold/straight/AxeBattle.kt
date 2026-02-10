package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AxeBattle: ImageVector? = null

val Icons.Bs.AxeBattle: ImageVector
    get() = _AxeBattle ?: UXIcon(name = "AxeBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.39f, 1.02f)
                lineTo(19.34f, -0.01f)
                lineToRelative(-1.05f, 1.03f)
                curveToRelative(-0.93f, 0.91f, -2.65f, 2.32f, -4.79f, 2.81f)
                lineTo(13.5f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.83f)
                curveToRelative(-2.14f, -0.49f, -3.87f, -1.9f, -4.79f, -2.81f)
                lineTo(4.66f, -0.01f)
                lineToRelative(-1.05f, 1.03f)
                curveTo(1.38f, 3.2f, 0f, 6.64f, 0f, 10f)
                curveToRelative(0f, 3.29f, 1.35f, 6.58f, 3.61f, 8.79f)
                lineToRelative(1.05f, 1.03f)
                lineToRelative(1.05f, -1.03f)
                curveToRelative(0.88f, -0.86f, 2.55f, -2.2f, 4.79f, -2.64f)
                verticalLineToRelative(7.85f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7.85f)
                curveToRelative(2.24f, 0.44f, 3.91f, 1.78f, 4.79f, 2.64f)
                lineToRelative(1.05f, 1.03f)
                lineToRelative(1.05f, -1.03f)
                curveToRelative(2.26f, -2.21f, 3.61f, -5.5f, 3.61f, -8.79f)
                curveToRelative(0f, -3.36f, -1.38f, -6.8f, -3.61f, -8.98f)
                close()
                moveTo(4.8f, 15.6f)
                curveToRelative(-1.15f, -1.57f, -1.8f, -3.58f, -1.8f, -5.6f)
                curveToRelative(0f, -2.04f, 0.69f, -4.17f, 1.81f, -5.77f)
                curveToRelative(1.79f, 1.43f, 3.74f, 2.34f, 5.69f, 2.65f)
                verticalLineToRelative(6.23f)
                curveToRelative(-2.01f, 0.29f, -3.96f, 1.14f, -5.7f, 2.49f)
                close()
                moveTo(19.2f, 15.6f)
                curveToRelative(-1.73f, -1.35f, -3.69f, -2.21f, -5.7f, -2.49f)
                verticalLineToRelative(-6.23f)
                curveToRelative(1.95f, -0.31f, 3.91f, -1.22f, 5.69f, -2.65f)
                curveToRelative(1.12f, 1.59f, 1.81f, 3.73f, 1.81f, 5.77f)
                curveToRelative(0f, 2.02f, -0.66f, 4.03f, -1.8f, 5.6f)
                close()
            }
        }.also { _AxeBattle = it}
