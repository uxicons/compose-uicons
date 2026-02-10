package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRetweet: ImageVector? = null

val Icons.Rs.ArrowsRetweet: ImageVector
    get() = _ArrowsRetweet ?: UXIcon(name = "ArrowsRetweet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15.87f)
                lineToRelative(-3.51f, 3.51f)
                curveToRelative(-0.4f, 0.4f, -0.92f, 0.62f, -1.49f, 0.62f)
                reflectiveCurveToRelative(-1.09f, -0.22f, -1.49f, -0.62f)
                lineToRelative(-3.48f, -3.48f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.55f, 2.55f)
                lineTo(17.99f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6.3f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(8.3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(10.04f)
                lineToRelative(2.59f, -2.59f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(7f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(6f, 6.96f)
                lineToRelative(2.55f, 2.55f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.48f, -3.48f)
                curveToRelative(-0.79f, -0.79f, -2.18f, -0.79f, -2.97f, 0f)
                lineTo(0f, 8.13f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(10.04f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(15.3f, 19.99f)
                lineToRelative(-2f, -2f)
                lineTo(7f, 17.99f)
                close()
            }
        }.also { _ArrowsRetweet = it}
