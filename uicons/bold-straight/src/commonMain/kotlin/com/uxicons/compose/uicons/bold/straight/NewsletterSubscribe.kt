package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NewsletterSubscribe: ImageVector? = null

val Icons.Bs.NewsletterSubscribe: ImageVector
    get() = _NewsletterSubscribe ?: UXIcon(name = "NewsletterSubscribe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.61f, 8.98f)
                lineToRelative(-1.61f, -1.55f)
                verticalLineToRelative(-3.94f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.5f, -0.0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.94f)
                lineToRelative(-1.61f, 1.54f)
                curveTo(0.51f, 9.83f, 0.0f, 11.01f, 0.0f, 12.23f)
                lineToRelative(-0.0f, 11.77f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11.77f)
                curveToRelative(0f, -1.22f, -0.51f, -2.41f, -1.39f, -3.25f)
                close()
                moveTo(6f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(7.54f)
                lineToRelative(-4.23f, 4.23f)
                curveToRelative(-0.94f, 0.94f, -2.59f, 0.94f, -3.54f, 0f)
                lineToRelative(-4.23f, -4.23f)
                lineTo(6.0f, 3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineToRelative(0.0f, -8.72f)
                lineToRelative(5.11f, 5.11f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                reflectiveCurveToRelative(2.85f, -0.57f, 3.89f, -1.61f)
                lineToRelative(5.11f, -5.11f)
                verticalLineToRelative(8.72f)
                close()
                moveTo(11.16f, 12f)
                curveToRelative(-0.67f, 0f, -1.3f, -0.26f, -1.77f, -0.73f)
                lineToRelative(-2.28f, -2.2f)
                lineToRelative(2.08f, -2.16f)
                lineToRelative(1.97f, 1.9f)
                lineToRelative(3.61f, -3.53f)
                lineToRelative(2.1f, 2.15f)
                lineToRelative(-3.95f, 3.86f)
                curveToRelative(-0.46f, 0.46f, -1.09f, 0.72f, -1.76f, 0.72f)
                horizontalLineToRelative(-0.0f)
                close()
            }
        }.also { _NewsletterSubscribe = it}
