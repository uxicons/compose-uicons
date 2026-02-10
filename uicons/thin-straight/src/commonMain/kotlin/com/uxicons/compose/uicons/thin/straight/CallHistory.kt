package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallHistory: ImageVector? = null

val Icons.Ts.CallHistory: ImageVector
    get() = _CallHistory ?: UXIcon(name = "CallHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.84f, 4.32f)
                lineToRelative(-0.73f, -0.73f)
                curveToRelative(1.32f, -2.15f, 3.69f, -3.59f, 6.39f, -3.59f)
                curveToRelative(4.14f, 0f, 7.5f, 3.36f, 7.5f, 7.5f)
                curveToRelative(0f, 2.7f, -1.44f, 5.07f, -3.59f, 6.39f)
                lineToRelative(-0.73f, -0.73f)
                curveToRelative(1.98f, -1.12f, 3.32f, -3.23f, 3.32f, -5.66f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                curveToRelative(-2.43f, 0f, -4.55f, 1.34f, -5.66f, 3.32f)
                close()
                moveTo(17.53f, 13.84f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-2.88f, 2.88f)
                curveToRelative(-1.03f, 1.03f, -2.43f, 1.6f, -3.94f, 1.6f)
                curveTo(9.19f, 24f, 0f, 14.81f, 0f, 7.61f)
                curveToRelative(0f, -1.51f, 0.57f, -2.91f, 1.61f, -3.94f)
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
                moveTo(16f, 4f)
                verticalLineToRelative(3.71f)
                lineToRelative(2.15f, 2.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-1.85f, -1.85f)
                verticalLineToRelative(-3.29f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _CallHistory = it}
