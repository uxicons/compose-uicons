package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarRatingCall: ImageVector? = null

val Icons.Ss.StarRatingCall: ImageVector
    get() = _StarRatingCall ?: UXIcon(name = "StarRatingCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.28f, 10.16f)
                lineToRelative(-0.6f, -0.45f)
                lineToRelative(1.09f, -3.4f)
                lineToRelative(-2.77f, -1.54f)
                verticalLineToRelative(-0.77f)
                horizontalLineToRelative(3.62f)
                lineToRelative(0.98f, -3.75f)
                horizontalLineToRelative(0.81f)
                lineToRelative(0.98f, 3.75f)
                horizontalLineToRelative(3.6f)
                verticalLineToRelative(0.76f)
                lineToRelative(-2.75f, 1.59f)
                lineToRelative(1.1f, 3.36f)
                lineToRelative(-0.62f, 0.44f)
                lineToRelative(-2.72f, -2.1f)
                lineToRelative(-2.73f, 2.11f)
                close()
                moveTo(13.48f, 16.98f)
                curveToRelative(-2.96f, -1.28f, -5.08f, -3.41f, -6.45f, -6.47f)
                lineToRelative(4.12f, -4.12f)
                lineTo(4.89f, 0.12f)
                lineTo(1.72f, 3.29f)
                curveToRelative(-1.11f, 1.1f, -1.72f, 2.6f, -1.72f, 4.21f)
                curveToRelative(0f, 7.25f, 9.25f, 16.5f, 16.5f, 16.5f)
                curveToRelative(1.61f, 0f, 3.1f, -0.61f, 4.21f, -1.72f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(-6.26f, -6.27f)
                lineToRelative(-4.13f, 4.13f)
                close()
            }
        }.also { _StarRatingCall = it}
