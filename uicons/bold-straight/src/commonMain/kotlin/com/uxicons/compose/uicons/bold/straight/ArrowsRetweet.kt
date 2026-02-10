package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRetweet: ImageVector? = null

val Icons.Bs.ArrowsRetweet: ImageVector
    get() = _ArrowsRetweet ?: UXIcon(name = "ArrowsRetweet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.85f, 15.72f)
                lineToRelative(-3.51f, 3.51f)
                curveToRelative(-0.49f, 0.49f, -1.14f, 0.76f, -1.84f, 0.76f)
                reflectiveCurveToRelative(-1.35f, -0.27f, -1.84f, -0.76f)
                lineToRelative(-3.48f, -3.48f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.7f, 1.7f)
                lineTo(17f, 7.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(7.84f)
                lineToRelative(1.73f, -1.73f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(7.5f, 17f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-7.84f)
                lineToRelative(1.7f, 1.7f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.48f, -3.48f)
                curveToRelative(-0.98f, -0.98f, -2.7f, -0.98f, -3.68f, 0f)
                lineTo(0.15f, 8.28f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.73f, -1.73f)
                verticalLineToRelative(7.84f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7f)
                lineToRelative(-3f, -3f)
                lineTo(7.5f, 17.01f)
                close()
            }
        }.also { _ArrowsRetweet = it}
