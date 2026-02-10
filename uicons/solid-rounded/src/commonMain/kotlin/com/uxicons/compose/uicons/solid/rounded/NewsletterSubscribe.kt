package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NewsletterSubscribe: ImageVector? = null

val Icons.Sr.NewsletterSubscribe: ImageVector
    get() = _NewsletterSubscribe ?: UXIcon(name = "NewsletterSubscribe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.12f, 17.12f)
                lineToRelative(6.88f, -6.88f)
                verticalLineToRelative(-6.24f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(7f, 0.0f)
                curveTo(4.79f, 0f, 3f, 1.79f, 3f, 4f)
                verticalLineToRelative(6.24f)
                lineToRelative(6.88f, 6.88f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                close()
                moveTo(7.32f, 8.54f)
                curveToRelative(-0.4f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.38f, -0.41f, 1.01f, -0.43f, 1.41f, -0.05f)
                lineToRelative(1.85f, 1.72f)
                curveToRelative(0.27f, 0.27f, 0.67f, 0.27f, 0.91f, 0.02f)
                lineToRelative(3.86f, -3.72f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                lineToRelative(-3.85f, 3.71f)
                curveToRelative(-0.5f, 0.5f, -1.17f, 0.76f, -1.84f, 0.76f)
                curveToRelative(-0.67f, 0f, -1.35f, -0.26f, -1.86f, -0.77f)
                lineToRelative(-1.82f, -1.7f)
                close()
                moveTo(24f, 12.71f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6.29f)
                curveToRelative(0f, -0.75f, 0.18f, -1.47f, 0.5f, -2.14f)
                lineToRelative(7.96f, 7.97f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(7.96f, -7.97f)
                curveToRelative(0.32f, 0.67f, 0.5f, 1.39f, 0.5f, 2.14f)
                close()
            }
        }.also { _NewsletterSubscribe = it}
