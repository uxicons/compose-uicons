package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallIncoming: ImageVector? = null

val Icons.Ts.CallIncoming: ImageVector
    get() = _CallIncoming ?: UXIcon(name = "CallIncoming") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 0.85f)
                curveToRelative(-0.6f, 0.6f, -2.18f, 2.19f, -3.76f, 3.78f)
                curveToRelative(-1.27f, 1.28f, -2.55f, 2.56f, -3.33f, 3.34f)
                curveToRelative(0.08f, 0.02f, 0.15f, 0.03f, 0.23f, 0.03f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -2f, -0.88f, -2f, -1.97f)
                lineTo(15f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.03f)
                curveToRelative(0f, 0.09f, 0.01f, 0.17f, 0.04f, 0.26f)
                curveToRelative(0.77f, -0.77f, 2.06f, -2.07f, 3.34f, -3.36f)
                curveToRelative(1.58f, -1.59f, 3.16f, -3.18f, 3.77f, -3.78f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(17.53f, 13.84f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-2.88f, 2.88f)
                curveToRelative(-1.03f, 1.03f, -2.43f, 1.6f, -3.94f, 1.6f)
                curveTo(9.19f, 24f, 0f, 14.81f, 0f, 7.61f)
                curveTo(0f, 6.1f, 0.57f, 4.71f, 1.6f, 3.67f)
                lineTo(4.48f, 0.79f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-3.37f, 3.37f)
                curveToRelative(1.49f, 3.51f, 3.96f, 5.99f, 7.36f, 7.37f)
                lineToRelative(3.38f, -3.38f)
                close()
                moveTo(21.79f, 19.52f)
                lineToRelative(-4.26f, -4.26f)
                lineToRelative(-3.13f, 3.13f)
                lineToRelative(-0.3f, -0.12f)
                curveToRelative(-3.92f, -1.5f, -6.73f, -4.31f, -8.36f, -8.35f)
                lineToRelative(-0.12f, -0.31f)
                lineToRelative(3.13f, -3.13f)
                lineTo(4.48f, 2.21f)
                lineToRelative(-2.17f, 2.17f)
                curveToRelative(-0.85f, 0.84f, -1.31f, 1.99f, -1.31f, 3.23f)
                curveToRelative(0f, 6.62f, 8.77f, 15.39f, 15.39f, 15.39f)
                curveToRelative(1.24f, 0f, 2.39f, -0.47f, 3.23f, -1.31f)
                lineToRelative(2.17f, -2.17f)
                close()
            }
        }.also { _CallIncoming = it}
