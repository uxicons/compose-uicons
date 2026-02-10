package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarRatingCall: ImageVector? = null

val Icons.Rs.StarRatingCall: ImageVector
    get() = _StarRatingCall ?: UXIcon(name = "StarRatingCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(0.76f)
                lineToRelative(-2.75f, 1.59f)
                lineToRelative(1.1f, 3.36f)
                lineToRelative(-0.62f, 0.44f)
                lineToRelative(-2.72f, -2.1f)
                lineToRelative(-2.73f, 2.11f)
                lineToRelative(-0.6f, -0.45f)
                lineToRelative(1.09f, -3.4f)
                lineToRelative(-2.77f, -1.54f)
                verticalLineToRelative(-0.77f)
                horizontalLineToRelative(3.62f)
                lineToRelative(0.98f, -3.75f)
                horizontalLineToRelative(0.81f)
                lineToRelative(0.98f, 3.75f)
                horizontalLineToRelative(3.6f)
                close()
                moveTo(17.61f, 12.85f)
                lineToRelative(6.27f, 6.26f)
                lineToRelative(-3.17f, 3.17f)
                curveToRelative(-1.1f, 1.11f, -2.6f, 1.72f, -4.21f, 1.72f)
                curveTo(9.25f, 24f, 0f, 14.75f, 0f, 7.5f)
                curveTo(0f, 5.89f, 0.61f, 4.4f, 1.72f, 3.29f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-3.41f, 3.41f)
                curveToRelative(1.37f, 3.06f, 3.49f, 5.19f, 6.45f, 6.47f)
                lineToRelative(3.41f, -3.41f)
                close()
                moveTo(21.05f, 19.11f)
                lineToRelative(-3.44f, -3.44f)
                lineToRelative(-2.93f, 2.93f)
                lineToRelative(-0.6f, -0.23f)
                curveToRelative(-3.96f, -1.51f, -6.81f, -4.35f, -8.45f, -8.44f)
                lineToRelative(-0.25f, -0.61f)
                lineToRelative(2.94f, -2.94f)
                lineToRelative(-3.44f, -3.44f)
                lineToRelative(-1.76f, 1.76f)
                curveToRelative(-0.73f, 0.73f, -1.13f, 1.72f, -1.13f, 2.79f)
                curveToRelative(0f, 6.23f, 8.27f, 14.5f, 14.5f, 14.5f)
                curveToRelative(1.07f, 0f, 2.07f, -0.4f, 2.79f, -1.13f)
                lineToRelative(1.76f, -1.76f)
                close()
            }
        }.also { _StarRatingCall = it}
