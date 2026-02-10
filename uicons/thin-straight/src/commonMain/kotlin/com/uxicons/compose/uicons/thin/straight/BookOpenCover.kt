package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenCover: ImageVector? = null

val Icons.Ts.BookOpenCover: ImageVector
    get() = _BookOpenCover ?: UXIcon(name = "BookOpenCover") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4.59f)
                lineTo(24f, 20.69f)
                lineToRelative(-12f, 3.33f)
                lineTo(0f, 20.69f)
                lineTo(0f, 4.59f)
                curveToRelative(0f, -0.77f, 0.34f, -1.5f, 0.93f, -1.99f)
                curveToRelative(0.02f, -0.02f, 0.05f, -0.03f, 0.07f, -0.05f)
                lineTo(1f, 19.93f)
                lineToRelative(11f, 3.05f)
                lineToRelative(11f, -3.05f)
                lineTo(23f, 2.56f)
                curveToRelative(0.02f, 0.02f, 0.05f, 0.03f, 0.07f, 0.05f)
                curveToRelative(0.59f, 0.49f, 0.93f, 1.22f, 0.93f, 1.99f)
                close()
                moveTo(12f, 21.02f)
                lineToRelative(-9f, -2.57f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.79f, 0.36f, -1.52f, 0.99f, -2.0f)
                curveToRelative(0.63f, -0.48f, 1.43f, -0.62f, 2.19f, -0.41f)
                lineToRelative(4.19f, 1.2f)
                curveToRelative(0.68f, 0.19f, 1.25f, 0.62f, 1.62f, 1.19f)
                curveToRelative(0.38f, -0.56f, 0.94f, -0.99f, 1.62f, -1.19f)
                lineToRelative(4.19f, -1.2f)
                curveToRelative(0.76f, -0.22f, 1.56f, -0.07f, 2.19f, 0.41f)
                curveToRelative(0.63f, 0.48f, 0.99f, 1.21f, 0.99f, 2.0f)
                verticalLineToRelative(14.95f)
                lineToRelative(-9f, 2.57f)
                close()
                moveTo(12.5f, 19.84f)
                lineToRelative(7.5f, -2.14f)
                lineTo(20f, 3.5f)
                curveToRelative(0f, -0.47f, -0.22f, -0.91f, -0.6f, -1.2f)
                curveToRelative(-0.27f, -0.2f, -0.58f, -0.3f, -0.9f, -0.3f)
                curveToRelative(-0.14f, 0f, -0.28f, 0.02f, -0.42f, 0.06f)
                lineToRelative(-4.19f, 1.2f)
                curveToRelative(-0.82f, 0.23f, -1.4f, 1.0f, -1.4f, 1.85f)
                verticalLineToRelative(14.73f)
                close()
                moveTo(11.5f, 5.11f)
                curveToRelative(0f, -0.86f, -0.57f, -1.62f, -1.4f, -1.85f)
                lineToRelative(-4.19f, -1.2f)
                curveToRelative(-0.46f, -0.13f, -0.94f, -0.04f, -1.31f, 0.24f)
                curveToRelative(-0.38f, 0.29f, -0.6f, 0.72f, -0.6f, 1.2f)
                verticalLineToRelative(14.19f)
                lineToRelative(7.5f, 2.14f)
                lineTo(11.5f, 5.11f)
                close()
            }
        }.also { _BookOpenCover = it}
