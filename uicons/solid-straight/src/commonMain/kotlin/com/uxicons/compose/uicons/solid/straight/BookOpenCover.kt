package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenCover: ImageVector? = null

val Icons.Ss.BookOpenCover: ImageVector
    get() = _BookOpenCover ?: UXIcon(name = "BookOpenCover") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                lineTo(24f, 20.61f)
                lineToRelative(-12f, 3.43f)
                lineTo(0f, 20.61f)
                lineTo(0f, 4f)
                curveToRelative(0f, -0.95f, 0.43f, -1.82f, 1.19f, -2.4f)
                curveToRelative(0.25f, -0.19f, 0.52f, -0.32f, 0.81f, -0.42f)
                lineTo(2f, 19.1f)
                lineToRelative(10f, 2.86f)
                lineToRelative(10f, -2.86f)
                lineTo(22f, 0.19f)
                curveToRelative(0.28f, 0.1f, 0.56f, 0.23f, 0.81f, 0.42f)
                curveToRelative(0.76f, 0.57f, 1.19f, 1.45f, 1.19f, 2.4f)
                close()
                moveTo(13f, 3.37f)
                verticalLineToRelative(14.26f)
                lineToRelative(-1f, 0.29f)
                lineToRelative(-1f, -0.29f)
                lineTo(11f, 3.37f)
                curveToRelative(0f, -1.33f, -0.9f, -2.52f, -2.25f, -2.9f)
                lineTo(7.08f, 0.07f)
                curveToRelative(-1.57f, -0.38f, -3.08f, 0.82f, -3.08f, 2.43f)
                verticalLineToRelative(15.21f)
                lineToRelative(8f, 2.29f)
                lineToRelative(8f, -2.29f)
                lineTo(20f, 2.54f)
                curveToRelative(0f, -1.6f, -1.48f, -2.79f, -3.04f, -2.44f)
                lineToRelative(-1.79f, 0.39f)
                curveToRelative(-1.28f, 0.37f, -2.18f, 1.55f, -2.18f, 2.88f)
                close()
            }
        }.also { _BookOpenCover = it}
