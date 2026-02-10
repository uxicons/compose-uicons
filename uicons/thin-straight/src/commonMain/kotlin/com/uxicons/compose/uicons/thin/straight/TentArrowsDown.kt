package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowsDown: ImageVector? = null

val Icons.Ts.TentArrowsDown: ImageVector
    get() = _TentArrowsDown ?: UXIcon(name = "TentArrowsDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.45f, 8.57f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.14f, 3.15f)
                lineTo(19f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7.7f)
                lineToRelative(3.14f, -3.14f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.29f, 0.29f, -0.67f, 0.43f, -1.05f, 0.43f)
                reflectiveCurveToRelative(-0.76f, -0.14f, -1.05f, -0.43f)
                close()
                moveTo(4.5f, 9f)
                curveToRelative(0.38f, 0f, 0.76f, -0.15f, 1.05f, -0.44f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.14f, 3.15f)
                lineTo(5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(7.7f)
                lineTo(0.86f, 4.56f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.44f, 1.05f, 0.44f)
                close()
                moveTo(21.68f, 20.81f)
                curveToRelative(0.4f, 0.66f, 0.42f, 1.44f, 0.05f, 2.1f)
                curveToRelative(-0.38f, 0.68f, -1.09f, 1.09f, -1.89f, 1.09f)
                lineTo(4.16f, 24.0f)
                curveToRelative(-0.8f, 0f, -1.5f, -0.41f, -1.89f, -1.09f)
                curveToRelative(-0.37f, -0.66f, -0.36f, -1.44f, 0.04f, -2.09f)
                lineTo(12f, 6.14f)
                lineToRelative(9.69f, 14.66f)
                close()
                moveTo(15.03f, 23f)
                lineToRelative(-3.03f, -4.59f)
                lineToRelative(-3.03f, 4.59f)
                horizontalLineToRelative(6.07f)
                close()
                moveTo(20.84f, 21.34f)
                lineTo(12f, 7.96f)
                lineTo(3.15f, 21.35f)
                curveToRelative(-0.2f, 0.34f, -0.21f, 0.73f, -0.02f, 1.07f)
                curveToRelative(0.2f, 0.36f, 0.58f, 0.58f, 1.01f, 0.58f)
                horizontalLineToRelative(3.61f)
                lineToRelative(4.23f, -6.41f)
                lineToRelative(4.23f, 6.41f)
                horizontalLineToRelative(3.61f)
                curveToRelative(0.43f, 0f, 0.81f, -0.22f, 1.01f, -0.58f)
                curveToRelative(0.19f, -0.35f, 0.19f, -0.74f, -0.02f, -1.08f)
                close()
            }
        }.also { _TentArrowsDown = it}
