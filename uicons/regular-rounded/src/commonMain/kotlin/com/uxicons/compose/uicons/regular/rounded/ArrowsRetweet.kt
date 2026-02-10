package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRetweet: ImageVector? = null

val Icons.Rr.ArrowsRetweet: ImageVector
    get() = _ArrowsRetweet ?: UXIcon(name = "ArrowsRetweet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.68f, 16.73f)
                lineToRelative(-2.59f, 2.41f)
                curveToRelative(-0.54f, 0.54f, -1.3f, 0.85f, -2.1f, 0.85f)
                reflectiveCurveToRelative(-1.55f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-2.56f, -2.39f)
                curveToRelative(-0.4f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.42f, 1.41f, -0.05f)
                lineToRelative(2.32f, 2.16f)
                lineTo(17.99f, 9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(8.43f)
                lineToRelative(2.32f, -2.16f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.35f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.4f, 0.35f, 1.04f, -0.05f, 1.41f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(6f, 6.57f)
                lineToRelative(2.32f, 2.16f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0f, 0.53f, -0.11f, 0.73f, -0.32f)
                curveToRelative(0.38f, -0.4f, 0.35f, -1.04f, -0.05f, -1.41f)
                lineToRelative(-2.56f, -2.39f)
                curveToRelative(-1.13f, -1.13f, -3.13f, -1.11f, -4.22f, -0.02f)
                lineTo(0.32f, 7.27f)
                curveToRelative(-0.4f, 0.38f, -0.43f, 1.01f, -0.05f, 1.41f)
                curveToRelative(0.38f, 0.41f, 1.01f, 0.43f, 1.41f, 0.05f)
                lineToRelative(2.32f, -2.16f)
                lineTo(4f, 15f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowsRetweet = it}
