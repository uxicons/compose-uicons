package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowLeftRight: ImageVector? = null

val Icons.Ts.TentArrowLeftRight: ImageVector
    get() = _TentArrowLeftRight ?: UXIcon(name = "TentArrowLeftRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6.14f)
                lineTo(2.31f, 20.82f)
                curveToRelative(-0.4f, 0.65f, -0.41f, 1.43f, -0.04f, 2.09f)
                curveToRelative(0.38f, 0.68f, 1.09f, 1.09f, 1.89f, 1.09f)
                horizontalLineToRelative(15.69f)
                curveToRelative(0.8f, 0f, 1.5f, -0.41f, 1.89f, -1.09f)
                curveToRelative(0.37f, -0.66f, 0.36f, -1.44f, -0.05f, -2.1f)
                lineTo(12f, 6.14f)
                close()
                moveTo(8.97f, 23f)
                lineToRelative(3.03f, -4.59f)
                lineToRelative(3.03f, 4.59f)
                horizontalLineToRelative(-6.07f)
                close()
                moveTo(20.86f, 22.42f)
                curveToRelative(-0.2f, 0.36f, -0.58f, 0.58f, -1.02f, 0.58f)
                horizontalLineToRelative(-3.61f)
                lineToRelative(-4.23f, -6.41f)
                lineToRelative(-4.23f, 6.41f)
                horizontalLineToRelative(-3.61f)
                curveToRelative(-0.43f, 0f, -0.81f, -0.22f, -1.02f, -0.58f)
                curveToRelative(-0.19f, -0.34f, -0.19f, -0.73f, 0.02f, -1.07f)
                lineTo(12f, 7.96f)
                lineToRelative(8.84f, 13.38f)
                curveToRelative(0.21f, 0.34f, 0.21f, 0.73f, 0.02f, 1.07f)
                close()
                moveTo(23.57f, 5.55f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.15f, -3.14f)
                lineTo(1.3f, 5f)
                lineToRelative(3.15f, 3.14f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(0.44f, 5.55f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.52f, 0f, -2.1f)
                lineTo(3.73f, 0.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.15f, 3.14f)
                horizontalLineToRelative(21.41f)
                lineToRelative(-3.15f, -3.14f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.52f, 0f, 2.1f)
                close()
            }
        }.also { _TentArrowLeftRight = it}
