package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fork: ImageVector? = null

val Icons.Ts.Fork: ImageVector
    get() = _Fork ?: UXIcon(name = "Fork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.29f, 6.65f)
                lineToRelative(-5.91f, 5.91f)
                curveToRelative(-0.56f, 0.57f, -1.55f, 0.57f, -2.12f, 0f)
                lineToRelative(-1.56f, -1.56f)
                lineToRelative(6.96f, -6.96f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-6.96f, 6.96f)
                lineToRelative(-1.56f, -1.57f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.54f, 0f, -2.12f)
                lineTo(17.35f, 0.69f)
                lineTo(16.64f, -0.01f)
                lineToRelative(-5.91f, 5.91f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.56f, 0f, 3.54f)
                lineToRelative(1.56f, 1.57f)
                lineTo(0.03f, 23.26f)
                lineToRelative(0.71f, 0.71f)
                lineTo(13.0f, 11.71f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(5.91f, -5.91f)
                lineToRelative(-0.71f, -0.71f)
                close()
            }
        }.also { _Fork = it}
