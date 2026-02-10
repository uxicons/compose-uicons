package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenCover: ImageVector? = null

val Icons.Rs.BookOpenCover: ImageVector
    get() = _BookOpenCover ?: UXIcon(name = "BookOpenCover") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 17.75f)
                lineTo(20f, 3.0f)
                curveToRelative(0f, -0.95f, -0.43f, -1.82f, -1.19f, -2.4f)
                curveToRelative(-0.76f, -0.57f, -1.72f, -0.75f, -2.63f, -0.49f)
                lineToRelative(-3f, 0.86f)
                curveToRelative(-0.45f, 0.13f, -0.84f, 0.35f, -1.18f, 0.65f)
                curveToRelative(-0.33f, -0.3f, -0.73f, -0.52f, -1.18f, -0.65f)
                lineTo(7.82f, 0.12f)
                curveToRelative(-0.92f, -0.26f, -1.87f, -0.08f, -2.63f, 0.49f)
                curveToRelative(-0.76f, 0.57f, -1.19f, 1.45f, -1.19f, 2.4f)
                verticalLineToRelative(14.75f)
                lineToRelative(8f, 2.29f)
                lineToRelative(8f, -2.29f)
                close()
                moveTo(13f, 3.86f)
                curveToRelative(0f, -0.44f, 0.3f, -0.84f, 0.73f, -0.96f)
                lineToRelative(3f, -0.86f)
                curveToRelative(0.09f, -0.03f, 0.18f, -0.04f, 0.28f, -0.04f)
                curveToRelative(0.21f, 0f, 0.42f, 0.07f, 0.6f, 0.2f)
                curveToRelative(0.25f, 0.19f, 0.4f, 0.48f, 0.4f, 0.8f)
                verticalLineToRelative(13.24f)
                lineToRelative(-5f, 1.43f)
                lineTo(13f, 3.86f)
                close()
                moveTo(11f, 17.67f)
                lineToRelative(-5f, -1.43f)
                lineTo(6f, 3.0f)
                curveToRelative(0f, -0.32f, 0.14f, -0.61f, 0.4f, -0.8f)
                curveToRelative(0.25f, -0.19f, 0.57f, -0.25f, 0.88f, -0.16f)
                lineToRelative(3f, 0.86f)
                curveToRelative(0.43f, 0.12f, 0.72f, 0.52f, 0.72f, 0.96f)
                verticalLineToRelative(13.82f)
                close()
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
            }
        }.also { _BookOpenCover = it}
