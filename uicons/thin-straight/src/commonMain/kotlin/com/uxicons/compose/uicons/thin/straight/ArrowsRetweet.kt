package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRetweet: ImageVector? = null

val Icons.Ts.ArrowsRetweet: ImageVector
    get() = _ArrowsRetweet ?: UXIcon(name = "ArrowsRetweet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.98f, 16.18f)
                lineToRelative(-3.35f, 3.35f)
                curveToRelative(-0.3f, 0.3f, -0.7f, 0.47f, -1.13f, 0.47f)
                reflectiveCurveToRelative(-0.83f, -0.17f, -1.13f, -0.47f)
                lineToRelative(-3.35f, -3.35f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.28f, 3.28f)
                lineTo(19.01f, 6.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(8.5f, 5f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(12.25f)
                lineToRelative(3.28f, -3.28f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(6.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(5f, 5.75f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.37f, -3.37f)
                curveToRelative(-0.6f, -0.61f, -1.66f, -0.61f, -2.27f, 0f)
                lineTo(0f, 8.33f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.29f, -3.29f)
                verticalLineToRelative(11.75f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9.5f)
                lineToRelative(-1f, -1f)
                lineTo(6.5f, 19f)
                close()
            }
        }.also { _ArrowsRetweet = it}
